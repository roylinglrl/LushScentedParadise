package net.royling.LushScentedParadise.ModEntity;

import net.minecraft.client.model.CodModel;
import net.minecraft.client.model.TropicalFishModelB;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.royling.LushScentedParadise.LushScentedParadise;

public class GlowpetalPigfishRenderer extends MobRenderer<GlowpetalPigfish, TropicalFishModelB<GlowpetalPigfish>> {
    private static final ResourceLocation CUSTOM_FISH_TEXTURE =
            new ResourceLocation(LushScentedParadise.MODID, "textures/entity/fish/glowpetal_pigfish.png");

    public GlowpetalPigfishRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new TropicalFishModelB<>(pContext.bakeLayer(ModelLayers.TROPICAL_FISH_LARGE)),0.3F);
    }


    @Override
    public ResourceLocation getTextureLocation(GlowpetalPigfish glowpetalPigfish) {
        return CUSTOM_FISH_TEXTURE;
    }
}
