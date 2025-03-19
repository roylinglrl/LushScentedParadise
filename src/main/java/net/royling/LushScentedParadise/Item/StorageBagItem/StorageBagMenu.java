package net.royling.LushScentedParadise.Item.StorageBagItem;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.royling.LushScentedParadise.Registry.ModMenuTypes;
import org.jetbrains.annotations.Nullable;

public class StorageBagMenu extends AbstractContainerMenu {

    private final ItemStackHandler inventory;
    private final ItemStack bagStack;

    public StorageBagMenu(int id, Inventory playerInventory, FriendlyByteBuf buf) {
        this(id,playerInventory,new ItemStackHandler(27),playerInventory.player.getItemInHand(playerInventory.player.getUsedItemHand()));
    }
    public StorageBagMenu(int id,Inventory playerInventory,ItemStackHandler inventory,ItemStack bagStack){
        super(ModMenuTypes.STORAGE_BAG_MENU.get(),id);
        this.inventory = inventory;
        this.bagStack=bagStack;
        for(int row = 0;row<3;++row){
            for(int col=0;col<9;++col){
                this.addSlot(new RestrictedSlotItemHandler(inventory,col+row*9,8+col*18,18+row*18,bagStack){
                    @Override
                    public void setChanged() {
                        super.setChanged();
                        StorageBagItem.saveInventory(bagStack,inventory);
                    }
                });
            }
        }
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18, 86 + row * 18));
            }
        }
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(playerInventory, col, 8 + col * 18, 144));
        }
    }

    @Override
    public ItemStack quickMoveStack(Player player, int i) {
        Slot slot = this.slots.get(i);
        if(slot!=null && slot.hasItem()){
            ItemStack stack = slot.getItem();
            ItemStack copy = stack.copy();
            if(i<27){
                if(!this.moveItemStackTo(stack,27,63,true))return ItemStack.EMPTY;
            }else {
                if(!this.moveItemStackTo(stack,0,27,false))return ItemStack.EMPTY;
            }
            if(stack.isEmpty()) slot.set(ItemStack.EMPTY);
            else slot.setChanged();

            return copy;
        }
        return ItemStack.EMPTY;
    }

    @Override
    public void removed(Player pPlayer) {
        super.removed(pPlayer);
        if(!pPlayer.getMainHandItem().isEmpty()&&pPlayer.getMainHandItem().getItem()instanceof StorageBagItem){
            StorageBagItem.saveInventory(pPlayer.getMainHandItem(),inventory);
        }
    }


    @Override
    public boolean stillValid(Player player) {
        return !bagStack.isEmpty() && player.containerMenu == this;
    }
}
