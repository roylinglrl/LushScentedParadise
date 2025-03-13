package net.royling.LushScentedParadise.Item.colorfulflower;

import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.royling.LushScentedParadise.LushScentedParadise;

public class MagicArrowRenderer extends ArrowRenderer<MagicArrowEntity> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LushScentedParadise.MODID, "textures/entity/magic_arrow.png");

    public MagicArrowRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(MagicArrowEntity magicArrowEntity) {
        return TEXTURE;
    }
}
