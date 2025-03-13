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

public class colorful_flower_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LushScentedParadise.MODID, "colorful_flower_armor"), "main");
	public final ModelPart helmet;
	public final ModelPart body;
	public final ModelPart rightarm;
	public final ModelPart leftarm;
	public final ModelPart leftleg1;
	public final ModelPart rigthleg;
	public final ModelPart rightfoot;
	public final ModelPart leftfoot;

	public colorful_flower_armor(ModelPart root) {
		this.helmet = root.getChild("helmet");
		this.body = root.getChild("body");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
		this.leftleg1 = root.getChild("leftleg1");
		this.rigthleg = root.getChild("rigthleg");
		this.rightfoot = root.getChild("rightfoot");
		this.leftfoot = root.getChild("leftfoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition helmet = partdefinition.addOrReplaceChild("helmet", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(70, 25).addBox(3.0F, -10.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(22, 70).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 68).addBox(-4.0F, -1.0F, -4.75F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(100, 88).addBox(2.0F, -1.0F, -4.75F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(80, 14).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 66).addBox(-5.0F, -7.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 69).addBox(4.0F, -7.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(84, 95).addBox(-4.0F, -9.0F, -5.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 7).addBox(-3.0F, -9.0F, -5.3F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 7).addBox(-3.0F, -11.0F, -5.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 63).addBox(2.0F, -11.0F, -5.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(98, 28).addBox(-3.0F, -6.0F, -5.3F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 61).addBox(-1.0F, -6.5F, -5.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 99).addBox(3.0F, -9.0F, -5.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 18).addBox(-0.5F, -3.0F, -5.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 22).addBox(1.25F, -3.0F, -5.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 64).addBox(-2.25F, -3.0F, -5.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-5.0F, -9.0F, 4.0F, 10.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 37).addBox(-5.0F, -9.0F, -4.0F, 1.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(4.0F, -9.0F, -4.0F, 1.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 71).addBox(-4.0F, -10.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = helmet.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(70, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -10.0F, -4.0F, 0.3753F, -0.3678F, -0.1407F));

		PartDefinition cube_r2 = helmet.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 95).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(60, 95).addBox(-0.5F, 2.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -8.25F, 2.5F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r3 = helmet.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(90, 46).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(36, 89).addBox(-0.5F, -4.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, -5.0F, -1.5F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r4 = helmet.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(88, 92).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(48, 92).addBox(-0.5F, -4.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, -5.25F, 2.5F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r5 = helmet.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(92, 17).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(84, 0).addBox(-0.5F, -4.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, -5.0F, -1.5F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r6 = helmet.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(70, 43).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -10.0F, -4.0F, 0.3753F, 0.3678F, 0.1407F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 11).addBox(-4.5F, 1.0F, -2.5F, 9.0F, 11.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(10, 87).addBox(-1.5F, 7.0F, -2.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 59).addBox(-1.5F, 9.0F, -2.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 71).addBox(-0.5F, 6.0F, -2.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 27).addBox(-5.0F, 0.0F, -3.0F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(80, 73).addBox(-5.0F, -0.5F, 2.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(88, 38).addBox(2.5F, -0.25F, -3.25F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(28, 11).addBox(-5.0F, 9.75F, -2.75F, 10.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(22, 89).addBox(-3.5F, -0.25F, -3.25F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(48, 89).addBox(-0.5F, 3.35F, -3.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(100, 10).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 3.75F, -2.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(98, 79).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 3.75F, -2.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 99).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 4.75F, -2.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(60, 92).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.75F, -2.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(88, 25).addBox(0.0F, 0.0F, -2.5F, 0.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(68, 82).addBox(0.0F, 0.0F, -2.5F, 0.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 9.75F, -0.25F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 87).addBox(0.0F, 0.0F, -2.5F, 0.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(78, 82).addBox(0.0F, 0.0F, -2.5F, 0.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 9.75F, -0.25F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(54, 82).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.75F, -0.15F, 0.0F, 0.0F, 0.9163F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(18, 39).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.75F, -0.15F, 0.0F, 0.0F, -0.9163F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(100, 85).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 82).addBox(8.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.25F, 0.5F, 3.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(32, 18).addBox(-5.0F, 0.0F, 0.0F, 9.0F, 19.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 3.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(50, 40).addBox(-3.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(18, 49).addBox(-2.4F, 0.5F, -2.75F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(22, 97).addBox(-3.65F, 6.5F, -2.75F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(80, 66).addBox(-4.0F, 8.5F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(58, 10).addBox(-4.5F, -3.5F, -3.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(18, 54).addBox(-3.5F, 5.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r17 = rightarm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(36, 96).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -3.5F, 0.0F, 0.4682F, -0.5585F, -0.2618F));

		PartDefinition cube_r18 = rightarm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(70, 18).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.75F, 1.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r19 = rightarm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(38, 75).addBox(-2.5F, 0.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, 0.0F, 0.25F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r20 = rightarm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 64).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r21 = rightarm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(70, 52).addBox(-2.5F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r22 = rightarm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(90, 53).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -4.75F, 2.5F, 0.7421F, -0.0403F, -0.0167F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(50, 50).addBox(-1.5F, 5.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(80, 59).addBox(0.0F, 8.5F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(38, 60).addBox(-1.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(44, 70).addBox(-1.6F, 0.5F, -2.75F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(58, 60).addBox(-0.5F, -3.5F, -3.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(98, 24).addBox(-0.35F, 6.5F, -2.75F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r23 = leftarm.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(58, 75).addBox(-1.5F, 0.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r24 = leftarm.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(58, 68).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r25 = leftarm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(18, 75).addBox(-1.5F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r26 = leftarm.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(96, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -4.75F, 2.5F, 0.7421F, 0.0403F, 0.0167F));

		PartDefinition cube_r27 = leftarm.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(22, 64).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -3.5F, 0.0F, 0.4682F, 0.5585F, 0.2618F));

		PartDefinition cube_r28 = leftarm.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(62, 0).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.75F, 1.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition leftleg1 = partdefinition.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(88, 82).addBox(0.5F, -0.9F, -3.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 80).addBox(-1.75F, 5.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(50, 29).addBox(-2.5F, -1.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition rigthleg = partdefinition.addOrReplaceChild("rigthleg", CubeListBuilder.create().texOffs(50, 18).addBox(-2.5F, -1.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(10, 89).addBox(-1.5F, -0.9F, -3.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 56).addBox(-2.25F, 5.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition rightfoot = partdefinition.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(78, 75).addBox(-2.5F, 10.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(18, 82).addBox(-3.25F, 8.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition cube_r29 = rightfoot.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 100).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, 7.5F, 3.5F, 1.0004F, 0.0072F, -0.5853F));

		PartDefinition cube_r30 = rightfoot.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(98, 75).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 7.5F, 3.5F, 0.886F, -0.2748F, 0.218F));

		PartDefinition cube_r31 = rightfoot.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(88, 99).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 8.5F, 3.5F, 0.2189F, -0.4449F, 0.1509F));

		PartDefinition cube_r32 = rightfoot.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(98, 30).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5F, 3.5F, 0.2921F, 0.0905F, -0.2921F));

		PartDefinition leftfoot = partdefinition.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(80, 7).addBox(-2.5F, 10.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(36, 82).addBox(-0.75F, 8.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition cube_r33 = leftfoot.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(100, 6).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 7.5F, 3.5F, 0.886F, 0.2748F, -0.218F));

		PartDefinition cube_r34 = leftfoot.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(98, 99).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5F, 3.5F, 0.2921F, -0.0905F, 0.2921F));

		PartDefinition cube_r35 = leftfoot.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(48, 99).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 8.5F, 3.5F, 0.2189F, 0.4449F, -0.1509F));

		PartDefinition cube_r36 = leftfoot.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(98, 34).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, 7.5F, 3.5F, 1.0004F, -0.0072F, 0.5853F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rigthleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}