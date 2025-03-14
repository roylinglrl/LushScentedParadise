package net.royling.LushScentedParadise.ModEntity;

import net.minecraft.client.model.CodModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.royling.LushScentedParadise.LushScentedParadise;

public class PhantomLotusKoiRenderer extends MobRenderer<PhantomLotusKoi, CodModel<PhantomLotusKoi>> {
    private static final ResourceLocation CUSTOM_FISH_TEXTURE =
            new ResourceLocation(LushScentedParadise.MODID, "textures/entity/fish/phantom_lotus_koi_fish.png");

    public PhantomLotusKoiRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new CodModel<>(pContext.bakeLayer(ModelLayers.COD)),0.3F);
    }


    @Override
    public ResourceLocation getTextureLocation(PhantomLotusKoi phantomLotusKoi) {
        return CUSTOM_FISH_TEXTURE;
    }
}
