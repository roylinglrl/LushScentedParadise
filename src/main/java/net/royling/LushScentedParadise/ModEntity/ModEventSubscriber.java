package net.royling.LushScentedParadise.ModEntity;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.Registry.ModEntities;

@Mod.EventBusSubscriber(modid = LushScentedParadise.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModEventSubscriber {
    @SubscribeEvent
    public static void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
        ModEntities.registerAttributes(event);

    }
}
