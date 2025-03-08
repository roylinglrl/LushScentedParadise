package net.royling.LushScentedParadise.Item.snack;

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

public class ModSnack {
    public static final FoodProperties MACARON_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.3f)
            .effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED,1800,0),1.0F)
            .alwaysEat().build();
    public static final FoodProperties VANILLA_WHIPPED_CREAM_P = new FoodProperties.Builder()
            .nutrition(8).saturationMod(0.6f)
            .effect(()->new MobEffectInstance(MobEffects.JUMP,1800,0),1.0F)
            .effect(()->new MobEffectInstance(MobEffects.REGENERATION,300,0),1.0F)
            .alwaysEat().build();
    public static final FoodProperties VANILLA_ICE_CREAM_P = new FoodProperties.Builder()
            .nutrition(8).saturationMod(0.6f)
            .effect(()->new MobEffectInstance(MobEffects.REGENERATION,600,0),1.0F)
            .effect(()->new MobEffectInstance(MobEffects.FIRE_RESISTANCE,2400,0),1.0F)
            .alwaysEat().build();
    public static final FoodProperties PUDDING_P = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.6f)
            .effect(()->new MobEffectInstance(MobEffects.REGENERATION,600,0),1.0F)
            .alwaysEat().build();

    public static final DeferredRegister<Item> SNACKS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LushScentedParadise.MODID);

    public static final RegistryObject<Item> MACARON = SNACKS.register("macaron", ()->new Item(new Item.Properties().food(ModSnack.MACARON_P).stacksTo(64)));
    public static final RegistryObject<Item> VANILLA_WHIPPED_CREAM = SNACKS.register("vanilla_whipped_cream", ()->new Item(new Item.Properties().food(ModSnack.VANILLA_WHIPPED_CREAM_P).stacksTo(64)));
    public static final RegistryObject<Item> VANILLA_ICE_CREAM = SNACKS.register("vanilla_ice_cream", ()->new Item(new Item.Properties().food(ModSnack.VANILLA_ICE_CREAM_P).stacksTo(64)));
    public static final RegistryObject<Item> PUDDING = SNACKS.register("pudding", ()->new Item(new Item.Properties().food(ModSnack.PUDDING_P).stacksTo(64)));
}
