package net.royling.LushScentedParadise.Item.milktea;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.LushScentedParadise.Item.Flowertea.tea;
import net.royling.LushScentedParadise.Item.coffee.ModCoffee;
import net.royling.LushScentedParadise.LushScentedParadise;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModMilktea {
    public static final FoodProperties TRADITION_MILKTEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f)
            .effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED,1800,0),1.0F)
            .alwaysEat().build();
    public static final FoodProperties HKSTYLE_SILKSTOCKING_MILKTEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f)
            .effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED,2400,0),1.0F)
            .alwaysEat().build();
    public static final FoodProperties MILK_CAP_MILKTEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1800, 0), 1.0F)
            .alwaysEat().build();

    public static final FoodProperties PUDDING_MILKTEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1800, 0), 1.0F)
            .alwaysEat().build();

    public static final FoodProperties BROWNSUGAR_MILKTEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 0), 1.0F)
            .alwaysEat().build();

    public static final FoodProperties CHOCOLATE_MILKTEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 0), 1.0F)
            .alwaysEat().build();

    public static final FoodProperties JASMINE_OOLONG_MILKTEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 1800, 0), 1.0F)
            .alwaysEat().build();

    public static final FoodProperties ROSE_BLACKTEA_MILKTEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 1800, 0), 1.0F)
            .alwaysEat().build();

    public static final FoodProperties VANILLA_MILKTEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 1800, 0), 1.0F)
            .alwaysEat().build();

    public static final FoodProperties GINGER_MILKTEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1800, 0), 1.0F)
            .alwaysEat().build();

    public static final FoodProperties LAVENDER_MILKTEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 1800, 0), 1.0F)
            .alwaysEat().build();

    public static final FoodProperties COFFEE_MILKTEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 0), 1.0F)
            .alwaysEat().build();

    public static final FoodProperties GLOW_BERRIES_MILKTEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 1200, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 1800, 0), 1.0F)
            .alwaysEat().build();

    public static final FoodProperties VIOLET_MILKTEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 900, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 900, 0), 1.0F)
            .alwaysEat().build();



    public static final DeferredRegister<Item> MILKTEAS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LushScentedParadise.MODID);

    public static final RegistryObject<Item> TRADITION_MILKTEA = MILKTEAS.register("tradition_milktea", ()->new tea(new Item.Properties().food(ModMilktea.TRADITION_MILKTEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.traditional_milktea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    public static final RegistryObject<Item> HKSTYLE_SILKSTOCKING_MILKTEA = MILKTEAS.register("hkstyle_silkstocking_milktea", ()->new tea(new Item.Properties().food(ModMilktea.HKSTYLE_SILKSTOCKING_MILKTEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.hkstyle_silkstocking.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    public static final RegistryObject<Item> MILK_CAP_MILKTEA = MILKTEAS.register("milk_cap_milktea", ()->new tea(new Item.Properties().food(ModMilktea.MILK_CAP_MILKTEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.milk_cap_milktea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    public static final RegistryObject<Item> PUDDING_MILKTEA = MILKTEAS.register("pudding_milktea", ()->new tea(new Item.Properties().food(ModMilktea.PUDDING_MILKTEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.pudding_milktea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    public static final RegistryObject<Item> BROWNSUGAR_MILKTEA = MILKTEAS.register("brownsugar_milktea", ()->new tea(new Item.Properties().food(ModMilktea.BROWNSUGAR_MILKTEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.brownsugar_milktea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    public static final RegistryObject<Item> CHOCOLATE_MILKTEA = MILKTEAS.register("chocolate_milktea", ()->new tea(new Item.Properties().food(ModMilktea.CHOCOLATE_MILKTEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.chocolate_milktea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    public static final RegistryObject<Item> JASMINE_OOLONG_MILKTEA = MILKTEAS.register("jasmine_oolong_milktea", ()->new tea(new Item.Properties().food(ModMilktea.JASMINE_OOLONG_MILKTEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.jasmine_oolong_milktea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    public static final RegistryObject<Item> ROSE_BLACKTEA_MILKTEA = MILKTEAS.register("rose_blacktea_milktea", ()->new tea(new Item.Properties().food(ModMilktea.ROSE_BLACKTEA_MILKTEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.rose_blacktea_milktea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    public static final RegistryObject<Item> VANILLA_MILKTEA = MILKTEAS.register("vanilla_milktea", ()->new tea(new Item.Properties().food(ModMilktea.VANILLA_MILKTEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.vanilla_milktea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    public static final RegistryObject<Item> GINGER_MILKTEA = MILKTEAS.register("ginger_milktea", ()->new tea(new Item.Properties().food(ModMilktea.GINGER_MILKTEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.ginger_milktea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    public static final RegistryObject<Item> LAVENDER_MILKTEA = MILKTEAS.register("lavender_milktea", ()->new tea(new Item.Properties().food(ModMilktea.LAVENDER_MILKTEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.lavender_milktea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    public static final RegistryObject<Item> COFFEE_MILKTEA = MILKTEAS.register("coffee_milktea", ()->new tea(new Item.Properties().food(ModMilktea.COFFEE_MILKTEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.coffee_milktea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    public static final RegistryObject<Item> GLOW_BERRIES_MILKTEA = MILKTEAS.register("glow_berries_milktea", ()->new tea(new Item.Properties().food(ModMilktea.GLOW_BERRIES_MILKTEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.glow_berries_milktea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    public static final RegistryObject<Item> VIOLET_MILKTEA = MILKTEAS.register("violet_milktea", ()->new tea(new Item.Properties().food(ModMilktea.VIOLET_MILKTEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.violet_milktea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

}
