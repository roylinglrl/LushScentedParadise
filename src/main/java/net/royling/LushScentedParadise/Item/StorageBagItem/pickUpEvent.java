package net.royling.LushScentedParadise.Item.StorageBagItem;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class pickUpEvent {
    @SubscribeEvent
    public static void onItemPickup(EntityItemPickupEvent event){
        Player player = event.getEntity();
        if (player.containerMenu != null && player.containerMenu != player.inventoryMenu) {
            return;
        }
        ItemStack pickedItem = event.getItem().getItem();
        for(ItemStack slot : player.getInventory().items){
            if(slot.getItem()instanceof StorageBagItem bagItem){
                if(StorageBagItem.isAuto(slot)&&StorageBagItem.canStoreItem(slot,pickedItem)){
                    if(StorageBagItem.storeItem(slot,pickedItem)){
                        if(pickedItem.getCount()<=0){
                            event.getItem().discard();
                            event.setCanceled(true);
                        }
                        return;
                    }
                }
            }
        }
    }
}
