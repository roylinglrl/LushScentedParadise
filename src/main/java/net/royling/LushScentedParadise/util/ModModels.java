package net.royling.LushScentedParadise.util;


import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.royling.LushScentedParadise.Item.Armor.colorful_flower_armor;
import net.royling.LushScentedParadise.Item.Armor.cxkk;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModModels {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event){
        event.enqueueWork(()->{
            EntityRenderersEvent.RegisterLayerDefinitions event2 = new EntityRenderersEvent.RegisterLayerDefinitions();
            event2.registerLayerDefinition(cxkk.LAYER_LOCATION,cxkk::createBodyLayer);
            event2.registerLayerDefinition(colorful_flower_armor.LAYER_LOCATION,colorful_flower_armor::createBodyLayer);
        });
    }
}
