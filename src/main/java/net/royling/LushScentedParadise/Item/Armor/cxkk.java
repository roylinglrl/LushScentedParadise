package net.royling.LushScentedParadise.Item.Armor;// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.royling.LushScentedParadise.LushScentedParadise;

public class cxkk<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LushScentedParadise.MODID, "cxkk"), "main");
	public final ModelPart hair;
	public final ModelPart chest;
	public final ModelPart leftarm;
	public final ModelPart rightarm;
	public final ModelPart rightleg;
	public final ModelPart leftleg;
	public final ModelPart leftfoot;
	public final ModelPart rightfoot;

	public cxkk(ModelPart root) {
		this.hair = root.getChild("hair");
		this.chest = root.getChild("chest");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
		this.leftfoot = root.getChild("leftfoot");
		this.rightfoot = root.getChild("rightfoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hair = partdefinition.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 11).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(18, 50).addBox(4.0F, -8.0F, -1.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(49, 47).addBox(-5.0F, -8.0F, -1.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(24, 11).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(6, 0).addBox(-4.0F, -8.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.0F, -8.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 3).addBox(1.0F, -8.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 0).addBox(-3.0F, -8.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 8).addBox(-1.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.0F, -8.0F, -5.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 49).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest = partdefinition.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(40, 35).addBox(-5.0F, 3.5F, -2.5F, 10.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 53).addBox(-5.0F, -0.5F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(59, 26).addBox(-5.0F, 2.5F, -1.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(57, 45).addBox(-5.0F, 5.5F, -1.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(57, 15).addBox(-5.0F, 7.5F, -1.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(52, 0).addBox(1.0F, -0.5F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(57, 8).addBox(1.0F, 3.5F, -1.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(1.0F, 7.5F, -1.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(-1.0F, 1.5F, -2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 11).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-5.0F, -0.5F, 1.5F, 10.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(37, 6).addBox(-1.5F, -2.5F, -2.5F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(20, 35).addBox(-3.5F, -2.5F, -2.5F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(0, 34).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(22, 20).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition leftfoot = partdefinition.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(35, 45).addBox(-2.5F, 9.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition rightfoot = partdefinition.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(42, 21).addBox(-2.5F, 9.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}