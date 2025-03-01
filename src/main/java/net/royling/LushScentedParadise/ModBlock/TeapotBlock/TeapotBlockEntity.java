package net.royling.LushScentedParadise.ModBlock.TeapotBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.ItemStackHandler;
import net.royling.LushScentedParadise.Registry.ModBlockEntities;
import net.royling.LushScentedParadise.Registry.ModItems;
import net.royling.LushScentedParadise.Registry.ModRecipeTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class TeapotBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(6) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return slot < 5 || stack.is(ModItems.CLEAN_WATER.get()); // 第五个格子只能放水
        }
    };

    private boolean isHeated = false;
    private int brewTime = 0;
    private final ContainerData data = new SimpleContainerData(2);

    public TeapotBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.TEAPOT.get(), pPos, pBlockState);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("container.lushscentedparadise.teapot");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new TeapotMenu(pContainerId,pPlayerInventory,this,data);
    }
    public void tick() {
        if (!level.isClientSide) {
            updateHeatingState();
            Optional<TeapotRecipe> recipe = getCurrentRecipe();
            if (recipe.isPresent()) {
                ItemStack outputSlotStack = itemHandler.getStackInSlot(5);
                ItemStack recipeOutput = recipe.get().getResultItem(level.registryAccess());
                int brewTimeMax = recipe.get().getBrewTime();
                data.set(1,brewTimeMax);
                data.set(0,brewTime);

                if (outputSlotStack.isEmpty() ||
                        (ItemStack.isSameItemSameTags(outputSlotStack, recipeOutput) &&
                                outputSlotStack.getCount() + recipeOutput.getCount() <= outputSlotStack.getMaxStackSize())) {

                    brewTime++;
                    if (brewTime >= recipe.get().getBrewTime()) {
                        if(craftItem(recipe.get())){
                            brewTime=0;
                            data.set(0,brewTime);
                        }
                    }
                } else {
                    brewTime = 0;
                    data.set(0,brewTime);
                }
            } else {
                brewTime = 0;
                data.set(0,brewTime);
            }
            setChanged();
        }
    }
    private Optional<TeapotRecipe> getCurrentRecipe() {
        SimpleContainer inventory = new SimpleContainer(5);
        for (int i = 0; i < 5; i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        return level.getRecipeManager().getRecipeFor(ModRecipeTypes.TEAPOT_RECIPE.get(), inventory, level);
    }
    private boolean craftItem(TeapotRecipe recipe) {
        ItemStack result = recipe.getResultItem(level.registryAccess());
        ItemStack outputSlotStack = itemHandler.getStackInSlot(5);
        if(outputSlotStack.isEmpty()){
            itemHandler.setStackInSlot(5,result.copy());
        }else if(ItemStack.isSameItemSameTags(outputSlotStack,result)&&outputSlotStack.getCount()+result.getCount()<=outputSlotStack.getMaxStackSize()){
            outputSlotStack.grow(result.getCount());
            itemHandler.setStackInSlot(5,outputSlotStack);
        }else {
            return false;
        }

        for (int i = 0; i < 5; i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if(!stack.isEmpty()){
                stack.shrink(1);
                itemHandler.setStackInSlot(i,stack.isEmpty()?ItemStack.EMPTY:stack);
            }
        }
        return true;
    }
    public void updateHeatingState() {
        BlockState below = level.getBlockState(worldPosition.below());
        isHeated = below.is(Blocks.CAMPFIRE) || below.is(Blocks.SMOKER);
    }
    public boolean isHeated() {
        return isHeated;
    }
    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        itemHandler.deserializeNBT(tag.getCompound("Inventory"));
        isHeated = tag.getBoolean("Heated");
        brewTime = tag.getInt("BrewTime");
    }
    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.put("Inventory", itemHandler.serializeNBT());
        tag.putBoolean("Heated", isHeated);
        tag.putInt("BrewTime", brewTime);
    }
    private final LazyOptional<ItemStackHandler> lazyItemHandler = LazyOptional.of(() -> itemHandler);
    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return lazyItemHandler.cast();
        }
        return super.getCapability(cap, side);
    }
    public ItemStackHandler getInventory() {
        return itemHandler;
    }

}
