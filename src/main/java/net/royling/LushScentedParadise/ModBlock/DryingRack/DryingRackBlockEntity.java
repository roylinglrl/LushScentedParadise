package net.royling.LushScentedParadise.ModBlock.DryingRack;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.royling.LushScentedParadise.Registry.ModBlockEntities;
import net.royling.LushScentedParadise.Registry.ModRecipeTypes;

import java.util.Arrays;


public class DryingRackBlockEntity extends BlockEntity implements Container{
    public static final int SLOT_COUNT=9;
    public final NonNullList<ItemStack> items = NonNullList.withSize(SLOT_COUNT,ItemStack.EMPTY);
    public int[] dryingProgress = new int[SLOT_COUNT];

    public DryingRackBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.DRYING_RACK.get(), pPos, pBlockState);
    }

    public boolean addItem(ItemStack stack){
        for(int i =0;i<items.size();i++){
            if(items.get(i).isEmpty()){
                ItemStack newstack = stack.copy();
                newstack.setCount(1);
                items.set(i,newstack);
                dryingProgress[i] =0;
                setChanged();
                return true;
            }
        }
        return false;
    }
    public void ejectAllItems(Level level, BlockPos pos){
        for(int i=0;i<items.size();i++){
            if(!items.get(i).isEmpty()){
                ItemEntity entity = new ItemEntity(level,
                        pos.getX()+0.5,
                        pos.getY()+0.7,
                        pos.getZ()+0.5
                        ,items.get(i));
                level.addFreshEntity(entity);
                items.set(i,ItemStack.EMPTY);
                dryingProgress[i]=0;
            }
        }
    }
    public void ejectLastItem(Level level,BlockPos pos){
        for (int i = items.size()-1;i>=0;i--){
            ItemStack stack = items.get(i);
            if(!stack.isEmpty()){
                ItemEntity entity = new ItemEntity(level,pos.getX()+0.5,
                        pos.getY()+0.7,
                        pos.getZ()+0.5,
                        stack.copy());
                level.addFreshEntity(entity);
                items.set(i,ItemStack.EMPTY);
                dryingProgress[i]=0;
                setChanged();
                return;
            }
        }
    }
    public void tick(){
        if(!level.isClientSide){
            if(level.isDay()&&level.canSeeSky(worldPosition.above())) {
                for (int i = 0; i < SLOT_COUNT; i++) {
                    ItemStack stack = items.get(i);
                    if (!stack.isEmpty()) {
                        SimpleContainer container = new SimpleContainer(stack);
                        int finalI = i;
                        level.getRecipeManager()
                                .getRecipeFor(ModRecipeTypes.DRYING_RECIPE.get(), new SimpleContainer(stack), level)
                                .ifPresent(recipe -> {
                                    if (dryingProgress[finalI] < recipe.getDryingTime()) {
                                        dryingProgress[finalI]++;
                                        sync();
                                    } else {
                                        items.set(finalI, recipe.assemble(container, level.registryAccess()));
                                        dryingProgress[finalI] = 0;
                                        sync();
                                    }
                                    setChanged();
                                });
                    }
                }
            }
        }
    }
    @Override
    public void onLoad() {
        super.onLoad();
        if (level != null && !level.isClientSide) {
            level.scheduleTick(worldPosition, getBlockState().getBlock(), 1);
        }
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        items.clear();
        Arrays.fill(dryingProgress,0);
        ListTag itemList = pTag.getList("Items",10);
        for(int i =0;i<itemList.size();i++){
            CompoundTag itemTag = itemList.getCompound(i);
            int slot = itemTag.getInt("Slot");
            if(slot>=0&&slot<SLOT_COUNT){
                items.set(slot,ItemStack.of(itemTag));
                dryingProgress[slot] = itemTag.getInt("DryingProgress");
            }
        }
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        super.saveAdditional(pTag);
        ListTag itemList = new ListTag();
        for(int i=0;i<items.size();i++){
            if(!items.get(i).isEmpty()){
                CompoundTag itemTag = new CompoundTag();
                itemTag.putInt("Slot",i);
                items.get(i).save(itemTag);
                itemTag.putInt("DryingProgress",dryingProgress[i]);
                itemList.add(itemTag);
            }
        }
        pTag.put("Items",itemList);
    }
    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag tag = new CompoundTag();
        saveAdditional(tag);
        return tag;
    }
    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        CompoundTag tag = new CompoundTag();
        saveAdditional(tag);
        return ClientboundBlockEntityDataPacket.create(this, (blockEntity) -> tag);
    }
    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
        handleUpdateTag(pkt.getTag());
    }

    @Override
    public void handleUpdateTag(CompoundTag tag) {
        load(tag);
    }
    public void sync() {
        if (this.level != null && !this.level.isClientSide) {
            this.setChanged();
            level.sendBlockUpdated(this.worldPosition, this.getBlockState(), this.getBlockState(), 3);
        }
    }
    private boolean isValidInput(ItemStack stack){
        return level.getRecipeManager()
                .getRecipeFor(ModRecipeTypes.DRYING_RECIPE.get(), new SimpleContainer(stack), level)
                .isPresent();
    }
    private boolean isValidOutput(ItemStack stack) {
        return level.getRecipeManager()
                .getAllRecipesFor(ModRecipeTypes.DRYING_RECIPE.get())
                .stream()
                .anyMatch(recipe -> ItemStack.isSameItem(recipe.getOutput(),stack));
    }

    @Override
    public int getContainerSize() {
        return SLOT_COUNT;
    }

    @Override
    public boolean isEmpty() {
        return items.stream().allMatch(ItemStack::isEmpty);
    }

    @Override
    public ItemStack getItem(int i) {
        return items.get(i);
    }

    @Override
    public ItemStack removeItem(int i, int i1) {
        ItemStack stack = items.get(i);
        if(!stack.isEmpty() && isValidOutput(stack)){
            items.set(i,ItemStack.EMPTY);
            dryingProgress[i]=0;
            setChanged();
            sync();
            return stack;
        }
        return ItemStack.EMPTY;
    }

    @Override
    public ItemStack removeItemNoUpdate(int i) {
        return items.set(1,ItemStack.EMPTY);
    }

    @Override
    public void setItem(int i, ItemStack itemStack) {
        if(isValidInput(itemStack)&&items.get(i).isEmpty()){
            ItemStack newstack =itemStack.copy();
            newstack.setCount(1);
            items.set(i,newstack);
            dryingProgress[i]=0;
            setChanged();
            sync();
        }
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public void clearContent() {
        items.clear();
        Arrays.fill(dryingProgress,0);
    }

    @Override
    public boolean canPlaceItem(int pIndex, ItemStack pStack) {
        return isValidInput(pStack)&&items.get(pIndex).isEmpty();
    }

    @Override
    public boolean canTakeItem(Container pTarget, int pIndex, ItemStack pStack) {
        return !items.get(pIndex).isEmpty()&&isValidOutput(items.get(pIndex));
    }
}
