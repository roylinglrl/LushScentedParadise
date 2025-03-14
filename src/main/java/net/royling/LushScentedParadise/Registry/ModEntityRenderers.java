package net.royling.LushScentedParadise.Registry;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.royling.LushScentedParadise.ModEntity.GlowpetalPigfishRenderer;
import net.royling.LushScentedParadise.ModEntity.PhantomLotusKoiRenderer;
import net.royling.LushScentedParadise.ModEntity.SpectralSteed.SpectralSteedRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

public class ModEntityRenderers {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.SPECTRAL_STEED.get(), SpectralSteedRenderer::new);
        event.registerEntityRenderer(ModEntities.PHANTOM_LOTUS_KOI.get(), PhantomLotusKoiRenderer::new);
        event.registerEntityRenderer(ModEntities.GLOWPETAL_PIGFISH.get(), GlowpetalPigfishRenderer::new);
    }
}
