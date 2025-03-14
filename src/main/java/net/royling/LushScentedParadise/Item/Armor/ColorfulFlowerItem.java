package net.royling.LushScentedParadise.Item.Armor;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.common.ForgeMod;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;

public class ColorfulFlowerItem extends ArmorItem {
    public ColorfulFlowerItem(Type pType, Properties pProperties) {
        super(ColorfulFlowerMaterials.COLORFUL_FLOWER_MATERIALS, pType, pProperties);
    }

    public static class Helmet extends ColorfulFlowerItem {
        private static final UUID SWIN_UUID = UUID.fromString("a2925266-0816-4ef6-a5ae-d0417d1d06d0");
        public Helmet() {
            super(Type.HELMET, new Properties());
        }

        @Override
        public void initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                @Override
                public @NotNull HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                    HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                            Map.of("head", new colorful_flower_armor(Minecraft.getInstance().getEntityModels().bakeLayer(colorful_flower_armor.LAYER_LOCATION)).helmet, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
                                    new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
                                    new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
                                    new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
                    armorModel.crouching = living.isShiftKeyDown();
                    armorModel.riding = defaultModel.riding;
                    armorModel.young = living.isBaby();
                    return armorModel;
                }
            });
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "lushscentedparadise:textures/entity/colorful_flower_armor.png";
        }

        @Override
        public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot pEquipmentSlot) {
            if(pEquipmentSlot==EquipmentSlot.HEAD){
                ImmutableMultimap.Builder<Attribute,AttributeModifier> builder = ImmutableMultimap.builder();
                builder.putAll(super.getDefaultAttributeModifiers(pEquipmentSlot));
                builder.put(ForgeMod.SWIM_SPEED.get(),new AttributeModifier(SWIN_UUID,"swin_speed",0.25,AttributeModifier.Operation.ADDITION));
                return builder.build();
            }
            return super.getDefaultAttributeModifiers(pEquipmentSlot);
        }
    }

    public static class Chestplate extends ColorfulFlowerItem {
        private static final UUID HEALTH_UUID = UUID.fromString("5076a8f4-40d9-484b-8ccc-4a668904ebd2");
        public Chestplate() {
            super(Type.CHESTPLATE, new Properties());
        }

        @Override
        public void initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                @Override
                @OnlyIn(Dist.CLIENT)
                public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                    HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("body", new colorful_flower_armor(Minecraft.getInstance().getEntityModels().bakeLayer(colorful_flower_armor.LAYER_LOCATION)).body, "left_arm",
                            new colorful_flower_armor(Minecraft.getInstance().getEntityModels().bakeLayer(colorful_flower_armor.LAYER_LOCATION)).leftarm, "right_arm",
                            new colorful_flower_armor(Minecraft.getInstance().getEntityModels().bakeLayer(colorful_flower_armor.LAYER_LOCATION)).rightarm, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
                            new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
                    armorModel.crouching = living.isShiftKeyDown();
                    armorModel.riding = defaultModel.riding;
                    armorModel.young = living.isBaby();
                    return armorModel;
                }
            });
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "lushscentedparadise:textures/entity/colorful_flower_armor.png";
        }
        @Override
        public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot pEquipmentSlot) {
            if(pEquipmentSlot==EquipmentSlot.CHEST){
                ImmutableMultimap.Builder<Attribute,AttributeModifier> builder = ImmutableMultimap.builder();
                builder.putAll(super.getDefaultAttributeModifiers(pEquipmentSlot));
                builder.put(Attributes.MAX_HEALTH,new AttributeModifier(HEALTH_UUID,"swin_speed",4,AttributeModifier.Operation.ADDITION));
                return builder.build();
            }
            return super.getDefaultAttributeModifiers(pEquipmentSlot);
        }
    }
    public static class Leggings extends ColorfulFlowerItem {
        private static final UUID SPEED_UUID = UUID.fromString("04ab7cd0-564b-4e42-b2a5-ddec794c3f14");
        public Leggings() {
            super(Type.LEGGINGS, new Properties());
        }

        @Override
        public void initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                @Override
                @OnlyIn(Dist.CLIENT)
                public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                    HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                            Map.of("left_leg", new colorful_flower_armor(Minecraft.getInstance().getEntityModels().bakeLayer(colorful_flower_armor.LAYER_LOCATION)).rigthleg, "right_leg",
                                    new colorful_flower_armor(Minecraft.getInstance().getEntityModels().bakeLayer(colorful_flower_armor.LAYER_LOCATION)).leftleg1, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
                                    new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
                    armorModel.crouching = living.isShiftKeyDown();
                    armorModel.riding = defaultModel.riding;
                    armorModel.young = living.isBaby();
                    return armorModel;
                }
            });
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "lushscentedparadise:textures/entity/colorful_flower_armor.png";
        }
        @Override
        public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot pEquipmentSlot) {
            if(pEquipmentSlot==EquipmentSlot.LEGS){
                ImmutableMultimap.Builder<Attribute,AttributeModifier> builder = ImmutableMultimap.builder();
                builder.putAll(super.getDefaultAttributeModifiers(pEquipmentSlot));
                builder.put(Attributes.MOVEMENT_SPEED,new AttributeModifier(SPEED_UUID,"swin_speed",0.03,AttributeModifier.Operation.ADDITION));
                return builder.build();
            }
            return super.getDefaultAttributeModifiers(pEquipmentSlot);
        }
    }
    public static class Boots extends ColorfulFlowerItem {
        private static final UUID STEP_UUID = UUID.fromString("2eadcd9f-811d-436a-b0ef-a3125cdc034b");
        public Boots() {
            super(Type.BOOTS, new Properties());
        }

        @Override
        public void initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                @Override
                @OnlyIn(Dist.CLIENT)
                public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                    HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                            Map.of("left_leg", new colorful_flower_armor<>(Minecraft.getInstance().getEntityModels().bakeLayer(colorful_flower_armor.LAYER_LOCATION)).leftfoot, "right_leg",
                                    new colorful_flower_armor(Minecraft.getInstance().getEntityModels().bakeLayer(colorful_flower_armor.LAYER_LOCATION)).rightfoot, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
                                    new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
                    armorModel.crouching = living.isShiftKeyDown();
                    armorModel.riding = defaultModel.riding;
                    armorModel.young = living.isBaby();
                    return armorModel;
                }
            });
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "lushscentedparadise:textures/entity/colorful_flower_armor.png";
        }
        @Override
        public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot pEquipmentSlot) {
            if(pEquipmentSlot==EquipmentSlot.FEET){
                ImmutableMultimap.Builder<Attribute,AttributeModifier> builder = ImmutableMultimap.builder();
                builder.putAll(super.getDefaultAttributeModifiers(pEquipmentSlot));
                builder.put(ForgeMod.STEP_HEIGHT_ADDITION.get(),new AttributeModifier(STEP_UUID,"swin_speed",0.5,AttributeModifier.Operation.ADDITION));
                return builder.build();
            }
            return super.getDefaultAttributeModifiers(pEquipmentSlot);
        }
    }




}
