package net.royling.LushScentedParadise.Item.Flowertea;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.Registry.ModEffects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;


public class ModFoods {
    /**
     * 所有的茶的食物属性
     * 这破狗代码真的又臭又长
     * 看不下去了，虽然是我自己写的
     */
    //蒲公英茶 速度3分钟
    public static final FoodProperties DANDELION_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED,3600,0),1.0F)
            .alwaysEat().build();
    //虞美人茶 生命恢复15s
    public static final FoodProperties POPPY_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(()->new MobEffectInstance(MobEffects.REGENERATION,300,0),1.0F).build();
    //兰花茶 幸运3分钟
    public static final FoodProperties BLUE_OC_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(()->new MobEffectInstance(MobEffects.LUCK,3600,0),1.0F).build();
    //郁金香 生命提升3分钟
    public static final FoodProperties TULIP_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(()->new MobEffectInstance(MobEffects.HEALTH_BOOST,3600,0),1.0F).build();
    //滨菊 抗性提升3分钟
    public static final FoodProperties OXEYE_DAISY_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(()->new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,3600,0),1.0F).build();
    // 矢车菊 cornflower 抗性提升
    public static final FoodProperties CORNFLOWER_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0), 1.0F).build();

    // 铃兰 lily of the valley
    public static final FoodProperties LILY_OF_THE_VALLEY_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 200, 0), 0.4F).build();

    // 丁香 lilac
    public static final FoodProperties LILAC_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 1.0F).build();

    // 玫瑰 rose
    public static final FoodProperties ROSE_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 0), 1.0F).build();

    // 牡丹 peony
    public static final FoodProperties PEONY_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 6000, 0), 1.0F).build();

    // 凋零 wither rose
    public static final FoodProperties WITHER_ROSE_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.WITHER, 600, 0), 0.5F).build();

    // **火把花 torch flower
    public static final FoodProperties TORCH_FLOWER_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 6000, 0), 1.0F).build();

    // 发光浆果 glow berries
    public static final FoodProperties GLOW_BERRIES_TEA_P = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0), 1.0F).build();

    // 甜浆果 sweet berries
    public static final FoodProperties SWEET_BERRIES_TEA_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 160, 0), 1.0F).build();

    // 紫颂 chorus
    public static final FoodProperties CHORUS_TEA_P = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 0), 1.0F).build();

    // 蕨 fern
    public static final FoodProperties FERN_TEA_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 240, 0), 0.3F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.7F)
            .build();

    // 孢子花 spore blossom
    public static final FoodProperties SPORE_BLOSSOM_TEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 240, 0), 0.3F).build();

    // 仙人掌 cactus
    public static final FoodProperties CACTUS_TEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.HARM, 1, 0), 0.4F)
            .effect(() -> new MobEffectInstance(ModEffects.SAND_WALKER.get(), 3600, 0), 1F)
            .build();

    // 热可可 cocoa
    public static final FoodProperties COCOA_TEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.COLD_RESISTANCE.get(), 1200, 0), 1.0F).build();

    // **海带汤 kelp
    public static final FoodProperties KELP_TEA_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 2400, 0), 1.0F).build();

    // 绿茶 greentea
    public static final FoodProperties GREEN_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0), 1.0F)
            .build();

    // 红茶 black tea
    public static final FoodProperties BLACK_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0), 1.0F).build();

    // 白茶 white tea
    public static final FoodProperties WHITE_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 300, 0), 1.0F).build();

    // 乌龙茶 oolong
    public static final FoodProperties OOLONG_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 0), 1.0F).build();

    // 普洱 puer
    public static final FoodProperties PUER_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 2400, 0), 1.0F).build();

    // 薄荷 mint
    public static final FoodProperties MINT_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 0), 1.0F)
            .build();

    // 姜汤 ginger
    public static final FoodProperties GINGER_TEA_P = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(ModEffects.COLD_RESISTANCE.get(), 6000, 0), 1.0F).build();
    // **树叶茶 leaves
    public static final FoodProperties LEAVES_TEA_P = new FoodProperties.Builder()
            .nutrition(1).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 400, 0), 0.4F).build();

    // 金银花茶 honeysuckle
    public static final FoodProperties HONEYSUCKLE_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f).build();

    // 紫罗兰茶 violet
    public static final FoodProperties VIOLET_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 0), 1.0F).build();

    // 木槿茶 hibiscus
    public static final FoodProperties HIBISCUS_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 0), 1.0F).build();

    // 芍药茶 peony
    public static final FoodProperties HERBACEOUS_PEONY_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 6000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HARM, 1, 0), 1.0F)
            .build();

    // 茉莉花茶 jasmine
    public static final FoodProperties JASMINE_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 3600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 3600, 0), 1.0F)
            .build();

    // 薰衣草茶 lavender
    public static final FoodProperties LAVENDER_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 7200, 0), 1.0F)
            .build();

    // 百合花茶 lily
    public static final FoodProperties LILY_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 0), 1.0F).build();

    // 红花茶 safflower
    public static final FoodProperties SAFFLOWER_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 4800, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.SAND_WALKER.get(), 1200, 0), 1.0F)
            .build();

    // 雪莲茶 snow lotus
    public static final FoodProperties SNOW_LOTUS_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240, 1), 1.0F)
            .build();

    // 金盏花茶 marigold
    public static final FoodProperties MARIGOLD_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 1200, 0), 1.0F).build();

    // 玉蝴蝶茶 oenothera lindheimeri
    public static final FoodProperties OENOTHERA_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0), 1.0F).build();

    // 紫苏花茶 perilla
    public static final FoodProperties PERILLA_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 1), 1.0F).build();

    // 马鞭茶 verbena
    public static final FoodProperties VERBENA_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 4800, 0), 1.0F).build();

    // 甘草汤 licorice
    public static final FoodProperties LICORICE_SOUP_P = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120, 1), 1.0F).build();

    // 黄芪汤 astragalus
    public static final FoodProperties ASTRAGALUS_SOUP_P = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120, 1), 1.0F).build();

    // 牛蒡汤 burdock
    public static final FoodProperties BURDOCK_SOUP_P = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 4800, 0), 1.0F)
            .build();

    // 葛根汤 kudzu
    public static final FoodProperties KUDZU_SOUP_P = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1), 1.0F).build();

    // 茯苓根茶 poria
    public static final FoodProperties PORIA_TEA_P = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 4800, 0), 1.0F).build();

    // 亚麻籽茶 flax_tea
    public static final FoodProperties FLAX_TEA_P = new FoodProperties.Builder()
            .nutrition(1).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F).build();
    /**
     * 下面的是特殊的茶饮
     */
    // 闪耀抹茶 Sparkling Matcha
    public static final FoodProperties SPARKLING_MATCHA_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1200, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 4800, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0), 1.0F)
            .build();

    // 薄荷蜂蜜特饮 Mint honey special drink
    public static final FoodProperties MINT_HONEY_SPECIAL_DRINK_P = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0), 1.0F)
            .build();

    // 生姜蜂蜜红茶 Ginger Honey Black Tea
    public static final FoodProperties GINGER_HONEY_BLACK_TEA_P = new FoodProperties.Builder()
            .nutrition(5).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 4800, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 0), 1.0F)
            .build();

    // 乌龙苹果蜂蜜特饮 Oolong apple honey special drink
    public static final FoodProperties OOLONG_APPLE_HONEY_SPECIAL_DRINK_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(.3f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 2400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 0), 1.0F)
            .build();

    // 下界风味特饮 Nether flavor
    public static final FoodProperties NETHER_FLAVOR_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(.5f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 0), 1.0F)
            .build();

    // 末地风味特饮 Ender flavor
    public static final FoodProperties ENDER_FLAVOR_P = new FoodProperties.Builder()
            .nutrition(5).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 6000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 2400, 0), 1.0F)
            .build();

    // 尸山血海特饮 horror soup
    public static final FoodProperties HORROR_SOUP_P = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.WITHER, 900, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 1200, 3), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 1), 1.0F)
            .build();

    // 爆爆姜汤 Explosive Ginger Soup
    public static final FoodProperties EXPLOSIVE_GINGER_SOUP_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 2400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 4800, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.COLD_RESISTANCE.get(), 4800, 0), 1.0F)
            .build();

    // 巧克力百合茶 Chocolate Lily Tea
    public static final FoodProperties CHOCOLATE_LILY_TEA_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 2400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.COLD_RESISTANCE.get(), 3600, 0), 1.0F)
            .build();

    // 西瓜薄荷特饮 Watermelon mint special drink
    public static final FoodProperties WATERMELON_MINT_SPECIAL_DRINK_P = new FoodProperties.Builder()
            .nutrition(5).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 2400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 9600, 0), 1.0F)
            .build();

    // 玫瑰苹果茶 rose apple tea
    public static final FoodProperties ROSE_APPLE_TEA_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 4800, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 2400, 0), 1.0F)
            .build();

    // 火灼木槿花茶 Fire Hibiscus Tea
    public static final FoodProperties FIRE_HIBISCUS_TEA_P = new FoodProperties.Builder()
            .nutrition(5).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 3600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 0), 1.0F)
            .build();

    // 传奇中药汤 Legendary Chinese Medicine
    public static final FoodProperties LEGENDARY_CHINESE_MEDICINE_P = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 4800, 0), 1.0F)
            .build();

    // 肉骨茶 Bak Kut Teh
    public static final FoodProperties BAK_KUT_TEH_P = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 3600, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 4800, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 0), 1.0F)
            .build();

    // 绚丽紫晶特饮 Brilliant Amethyst Drink
    public static final FoodProperties BRILLIANT_AMETHYST_DRINK_P = new FoodProperties.Builder()
            .nutrition(5).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 2400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 6000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 6000, 0), 1.0F)
            .build();

    // 黄金汤 golden soup
    public static final FoodProperties GOLDEN_SOUP_P = new FoodProperties.Builder()
            .nutrition(5).saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 9600, 0), 1.0F).build();

    // 至尊黄金茶 Supreme golden tea
    public static final FoodProperties SUPREME_GOLDEN_TEA_P = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 4800, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 4800, 0), 1.0F)
            .build();

    // 附魔至尊黄金茶 Enchanted Supreme Golden Tea
    public static final FoodProperties ENCHANTED_SUPREME_GOLDEN_TEA_P = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 6000, 3), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 6000, 0), 1.0F)
            .build();

    // 海洋之旅 ocean journey
    public static final FoodProperties OCEAN_JOURNEY_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 0), 1.0F)
            .build();

    // 极寒炼乳花茶 Extremely Cold Condensed Milk Scented Tea
    public static final FoodProperties EXTREMELY_COLD_CONDENSED_MILK_SCENTED_TEA_P = new FoodProperties.Builder()
            .nutrition(5).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 2400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2400, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 2), 1.0F)
            .build();

    // 美西螈茶 axolotl tea
    public static final FoodProperties AXOLOTL_TEA_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1800, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 6000, 0), 1.0F)
            .build();

    // 鲜花聚会 flower party
    public static final FoodProperties FLOWER_PARTY_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 4800, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 4800, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 4800, 0), 1.0F)
            .build();

    // 猩红玛格丽特 scarlet margarita
    public static final FoodProperties SCARLET_MARGARITA_P = new FoodProperties.Builder()
            .nutrition(5).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 4800, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 4800, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 4800, 0), 1.0F)
            .build();

    // 烈口蘑菇茶饮 Strong mouth mushroom tea
    public static final FoodProperties STRONG_MOUTH_MUSHROOM_TEA_P = new FoodProperties.Builder()
            .nutrition(6).saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 600, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 12000, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 6000, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3000, 1), 1.0F)
            .build();

    // 岩浆特饮 Lava special drink
    public static final FoodProperties LAVA_SPECIAL_DRINK_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 9600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1200, 0), 1.0F)
            .build();

    // 珊瑚薄荷气泡水 coral mint sparkling water
    public static final FoodProperties CORAL_MINT_SPARKLING_WATER_P = new FoodProperties.Builder()
            .nutrition(5).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 1), 1.0F)
            .build();

    // 混合莓果冰沙 Mixed Berry Smoothie
    public static final FoodProperties MIXED_BERRY_SMOOTHIE_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 2400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 6000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0), 1.0F)
            .build();

    // 牛奶蘑菇浓汤 Milk mushroom soup
    public static final FoodProperties MILK_MUSHROOM_SOUP_P = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 4800, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1200, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2400, 0), 1.0F)
            .build();

    // 潮汐来袭 The tide is coming
    public static final FoodProperties THE_TIDE_IS_COMING_P = new FoodProperties.Builder()
            .nutrition(5).saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 0), 1.0F)
            .build();

    // 玉蝴蝶幻翼 Oenothera lindheimeri Phantom
    public static final FoodProperties OENOTHERA_LINDHEIMERI_PHANTOM_P = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 240, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 2400, 1), 1.0F)
            .build();

    // 鳞甲百合茶 Turtle Shell Lily Tea
    public static final FoodProperties TURTLE_SHELL_LILY_TEA_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 2400, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2400, 2), 1.0F)
            .build();

    // 唤魔者之怒 The Evoker's Wrath
    public static final FoodProperties THE_EVOKERS_WRATH_P = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 4800, 1), 1.0F)
            .build();

    // 恶魔唤声 The devil's call
    public static final FoodProperties THE_DEVILS_CALL_P = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0), 1.0F)
            .build();
    //


    /**
     * 下面是茶饮物品的注册
     */
    public static final DeferredRegister<Item> TEAS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LushScentedParadise.MODID);
    //蒲公英茶
    public static final RegistryObject<Item> DANDELION_TEA = TEAS.register("dandelion_tea", ()->new tea(new Item.Properties().food(ModFoods.DANDELION_TEA_P).stacksTo(16),25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.dandelion_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    public static final RegistryObject<Item> POPPY_TEA = TEAS.register("poppy_tea", ()->new tea(new Item.Properties().food(ModFoods.POPPY_TEA_P),25)
            {
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.poppy_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            }
    );
    // 兰花茶
    public static final RegistryObject<Item> BLUE_OC_TEA = TEAS.register("blue_oc_tea", () -> new tea(new Item.Properties().food(ModFoods.BLUE_OC_TEA_P).stacksTo(16), 25)
    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.blue_oc_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 郁金香茶
    public static final RegistryObject<Item> TULIP_TEA = TEAS.register("tulip_tea", () -> new tea(new Item.Properties().food(ModFoods.TULIP_TEA_P).stacksTo(16), 25)
    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.tulip_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 滨菊茶
    public static final RegistryObject<Item> OXEYE_DAISY_TEA = TEAS.register("oxeye_daisy_tea", () -> new tea(new Item.Properties().food(ModFoods.OXEYE_DAISY_TEA_P).stacksTo(16), 25)
    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.oxeye_daisy_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 矢车菊茶
    public static final RegistryObject<Item> CORNFLOWER_TEA = TEAS.register("cornflower_tea", () -> new tea(new Item.Properties().food(ModFoods.CORNFLOWER_TEA_P).stacksTo(16), 25)
    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.cornflower_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 铃兰茶
    public static final RegistryObject<Item> LILY_OF_THE_VALLEY_TEA = TEAS.register("lily_of_the_valley_tea", () -> new tea(new Item.Properties().food(ModFoods.LILY_OF_THE_VALLEY_TEA_P).stacksTo(16), 25)
    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.lily_of_the_valley_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 丁香茶
    public static final RegistryObject<Item> LILAC_TEA = TEAS.register("lilac_tea", () -> new tea(new Item.Properties().food(ModFoods.LILAC_TEA_P).stacksTo(16), 25)
    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.lilac_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 玫瑰茶
    public static final RegistryObject<Item> ROSE_TEA = TEAS.register("rose_tea", () -> new tea(new Item.Properties().food(ModFoods.ROSE_TEA_P).stacksTo(16), 25)
    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.rose_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 牡丹茶
    public static final RegistryObject<Item> PEONY_TEA = TEAS.register("peony_tea", () -> new tea(new Item.Properties().food(ModFoods.PEONY_TEA_P).stacksTo(16), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.peony_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 凋零玫瑰茶
    public static final RegistryObject<Item> WITHER_ROSE_TEA = TEAS.register("wither_rose_tea", () -> new tea(new Item.Properties().food(ModFoods.WITHER_ROSE_TEA_P).stacksTo(16), 25)
    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.wither_rose_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 火把花茶
    /*public static final RegistryObject<Item> TORCH_FLOWER_TEA = TEAS.register("torch_flower_tea", () -> new tea(new Item.Properties().food(ModFoods.TORCH_FLOWER_TEA_P), 25)
    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.torch_flower_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });*/
    // 发光浆果茶
    public static final RegistryObject<Item> GLOW_BERRIES_TEA = TEAS.register("glow_berries_tea", () -> new tea(new Item.Properties().food(ModFoods.GLOW_BERRIES_TEA_P).stacksTo(16), 25)
    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.glow_berries_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 甜浆果茶
    public static final RegistryObject<Item> SWEET_BERRIES_TEA = TEAS.register("sweet_berries_tea", () -> new tea(new Item.Properties().food(ModFoods.SWEET_BERRIES_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.sweet_berries_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 紫颂茶
    public static final RegistryObject<Item> CHORUS_TEA = TEAS.register("chorus_tea", () -> new tea(new Item.Properties().food(ModFoods.CHORUS_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.chorus_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 蕨类茶
    public static final RegistryObject<Item> FERN_TEA = TEAS.register("fern_tea", () -> new tea(new Item.Properties().food(ModFoods.FERN_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.fern_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 孢子花茶
    public static final RegistryObject<Item> SPORE_BLOSSOM_TEA = TEAS.register("spore_blossom_tea", () -> new tea(new Item.Properties().food(ModFoods.SPORE_BLOSSOM_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.spore_blossom_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 仙人掌茶
    public static final RegistryObject<Item> CACTUS_TEA = TEAS.register("cactus_tea", () -> new tea(new Item.Properties().food(ModFoods.CACTUS_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.cactus_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 热可可
    public static final RegistryObject<Item> HOT_COCOA = TEAS.register("hot_cocoa", () -> new tea(new Item.Properties().food(ModFoods.COCOA_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.hot_cocoa.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 海带汤
    /*public static final RegistryObject<Item> KELP_SOUP = TEAS.register("kelp_soup", () -> new tea(new Item.Properties().food(ModFoods.KELP_TEA_P), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.kelp_soup.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });*/
    // 绿茶
    public static final RegistryObject<Item> GREEN_TEA = TEAS.register("green_tea", () -> new tea(new Item.Properties().food(ModFoods.GREEN_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.green_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }

        @Override
        public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
            pLivingEntity.removeEffect(MobEffects.POISON);
            return super.finishUsingItem(pStack, pLevel, pLivingEntity);
        }
    });
    // 红茶
    public static final RegistryObject<Item> BLACK_TEA = TEAS.register("black_tea", () -> new tea(new Item.Properties().food(ModFoods.BLACK_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.black_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
        @Override
        public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
            pLivingEntity.removeEffect(MobEffects.POISON);
            return super.finishUsingItem(pStack, pLevel, pLivingEntity);
        }
    });
    // 白茶
    public static final RegistryObject<Item> WHITE_TEA = TEAS.register("white_tea", () -> new tea(new Item.Properties().food(ModFoods.WHITE_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.white_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
        @Override
        public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
            pLivingEntity.removeEffect(MobEffects.POISON);
            return super.finishUsingItem(pStack, pLevel, pLivingEntity);
        }
    });
    // 乌龙茶
    public static final RegistryObject<Item> OOLONG_TEA = TEAS.register("oolong_tea", () -> new tea(new Item.Properties().food(ModFoods.OOLONG_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.oolong_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
        @Override
        public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
            pLivingEntity.removeEffect(MobEffects.POISON);
            return super.finishUsingItem(pStack, pLevel, pLivingEntity);
        }
    });
    // 普洱茶
    public static final RegistryObject<Item> PUER_TEA = TEAS.register("puer_tea", () -> new tea(new Item.Properties().food(ModFoods.PUER_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.puer_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
        @Override
        public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
            pLivingEntity.removeEffect(MobEffects.POISON);
            return super.finishUsingItem(pStack, pLevel, pLivingEntity);
        }
    });
    // 薄荷茶
    public static final RegistryObject<Item> MINT_TEA = TEAS.register("mint_tea", () -> new tea(new Item.Properties().food(ModFoods.MINT_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.mint_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 姜汤
    public static final RegistryObject<Item> GINGER_SOUP = TEAS.register("ginger_soup", () -> new tea(new Item.Properties().food(ModFoods.GINGER_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.ginger_soup.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 树叶茶
    /*public static final RegistryObject<Item> LEAVES_TEA = TEAS.register("leaves_tea", () -> new tea(new Item.Properties().food(ModFoods.LEAVES_TEA_P), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.leaves_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });*/
    // 金银花茶
    public static final RegistryObject<Item> HONEYSUCKLE_TEA = TEAS.register("honeysuckle_tea", () -> new tea(new Item.Properties().food(ModFoods.HONEYSUCKLE_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.honeysuckle_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
        @Override
        public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
            Collection<MobEffectInstance> effects = pLivingEntity.getActiveEffects();
            for(MobEffectInstance effect : effects){
                if(effect.getEffect().isBeneficial()) continue;
                pLivingEntity.removeEffect(effect.getEffect());
            }
            return super.finishUsingItem(pStack, pLevel, pLivingEntity);
        }
    });
    // 紫罗兰茶
    public static final RegistryObject<Item> VIOLET_TEA = TEAS.register("violet_tea", () -> new tea(new Item.Properties().food(ModFoods.VIOLET_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.violet_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 木槿茶
    public static final RegistryObject<Item> HIBISCUS_TEA = TEAS.register("hibiscus_tea", () -> new tea(new Item.Properties().food(ModFoods.HIBISCUS_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.hibiscus_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 芍药茶
    public static final RegistryObject<Item> HERBACEOUS_PEONY_TEA = TEAS.register("herbaceous_peony_tea", () -> new tea(new Item.Properties().food(ModFoods.HERBACEOUS_PEONY_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.herbaceous_peony_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 茉莉茶
    public static final RegistryObject<Item> JASMINE_TEA = TEAS.register("jasmine_tea", () -> new tea(new Item.Properties().food(ModFoods.JASMINE_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.jasmine_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 薰衣草茶
    public static final RegistryObject<Item> LAVENDER_TEA = TEAS.register("lavender_tea", () -> new tea(new Item.Properties().food(ModFoods.LAVENDER_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.lavender_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 百合茶
    public static final RegistryObject<Item> LILY_TEA = TEAS.register("lily_tea", () -> new tea(new Item.Properties().food(ModFoods.LILY_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.lily_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 红花茶
    public static final RegistryObject<Item> SAFFLOWER_TEA = TEAS.register("safflower_tea", () -> new tea(new Item.Properties().food(ModFoods.SAFFLOWER_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.safflower_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 雪莲茶
    public static final RegistryObject<Item> SNOW_LOTUS_TEA = TEAS.register("snow_lotus_tea", () -> new tea(new Item.Properties().food(ModFoods.SNOW_LOTUS_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.snow_lotus_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
        @Override
        public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
            pLivingEntity.removeEffect(MobEffects.WITHER);
            return super.finishUsingItem(pStack, pLevel, pLivingEntity);
        }
    });
    // 金盏花茶
    public static final RegistryObject<Item> MARIGOLD_TEA = TEAS.register("marigold_tea", () -> new tea(new Item.Properties().food(ModFoods.MARIGOLD_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.marigold_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 玉蝴蝶茶
    public static final RegistryObject<Item> OENOTHERA_TEA = TEAS.register("oenothera_tea", () -> new tea(new Item.Properties().food(ModFoods.OENOTHERA_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.oenothera_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 紫苏花茶 perilla
    public static final RegistryObject<Item> PERILLA_TEA = TEAS.register("perilla_tea", () -> new tea(new Item.Properties().food(ModFoods.PERILLA_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.perilla_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 马鞭茶 verbena
    public static final RegistryObject<Item> VERBENA_TEA = TEAS.register("verbena_tea", () -> new tea(new Item.Properties().food(ModFoods.VERBENA_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.verbena_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 甘草汤 licorice
    public static final RegistryObject<Item> LICORICE_SOUP = TEAS.register("licorice_soup", () -> new tea(new Item.Properties().food(ModFoods.LICORICE_SOUP_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.licorice_soup.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
        @Override
        public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
            pLivingEntity.removeEffect(MobEffects.POISON);
            return super.finishUsingItem(pStack, pLevel, pLivingEntity);
        }
    });
    // 黄芪汤 astragalus
    public static final RegistryObject<Item> ASTRAGALUS_SOUP = TEAS.register("astragalus_soup", () -> new tea(new Item.Properties().food(ModFoods.ASTRAGALUS_SOUP_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.astragalus_soup.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
        @Override
        public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
            pLivingEntity.removeEffect(MobEffects.HUNGER);
            return super.finishUsingItem(pStack, pLevel, pLivingEntity);
        }
    });
    // 牛蒡汤 burdock
    public static final RegistryObject<Item> BURDOCK_SOUP = TEAS.register("burdock_soup", () -> new tea(new Item.Properties().food(ModFoods.BURDOCK_SOUP_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.burdock_soup.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
        @Override
        public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
            pLivingEntity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            return super.finishUsingItem(pStack, pLevel, pLivingEntity);
        }
    });
    // 葛根汤 kudzu
    public static final RegistryObject<Item> KUDZU_SOUP = TEAS.register("kudzu_soup", () -> new tea(new Item.Properties().food(ModFoods.KUDZU_SOUP_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.kudzu_soup.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
        @Override
        public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
            pLivingEntity.removeEffect(MobEffects.DIG_SLOWDOWN);
            return super.finishUsingItem(pStack, pLevel, pLivingEntity);
        }
    });
    // 茯苓根茶 poria
    public static final RegistryObject<Item> PORIA_TEA = TEAS.register("poria_tea", () -> new tea(new Item.Properties().food(ModFoods.PORIA_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.poria_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
        @Override
        public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
            pLivingEntity.removeEffect(MobEffects.WEAKNESS);
            return super.finishUsingItem(pStack, pLevel, pLivingEntity);
        }
    });
    // 亚麻籽茶 flax
    public static final RegistryObject<Item> FLAX_TEA = TEAS.register("flax_tea", () -> new tea(new Item.Properties().food(ModFoods.FLAX_TEA_P).stacksTo(16), 25)    {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.flax_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    /**
     * 特殊茶饮注册
     */
    // 闪耀抹茶 Sparkling Matcha
    public static final RegistryObject<Item> SPARKLING_MATCHA = TEAS.register("sparkling_matcha", () -> new tea(new Item.Properties().food(ModFoods.SPARKLING_MATCHA_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.sparkling_matcha.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 薄荷蜂蜜特饮 Mint honey special drink
    public static final RegistryObject<Item> MINT_HONEY_SPECIAL_DRINK = TEAS.register("mint_honey_special_drink", () -> new tea(new Item.Properties().food(ModFoods.MINT_HONEY_SPECIAL_DRINK_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.mint_honey_special_drink.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 生姜蜂蜜红茶 Ginger Honey Black Tea
    public static final RegistryObject<Item> GINGER_HONEY_BLACK_TEA = TEAS.register("ginger_honey_black_tea", () -> new tea(new Item.Properties().food(ModFoods.GINGER_HONEY_BLACK_TEA_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.ginger_honey_black_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 乌龙苹果蜂蜜特饮 Oolong apple honey special drink
    public static final RegistryObject<Item> OOLONG_APPLE_HONEY_SPECIAL_DRINK = TEAS.register("oolong_apple_honey_special_drink", () -> new tea(new Item.Properties().food(ModFoods.OOLONG_APPLE_HONEY_SPECIAL_DRINK_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.oolong_apple_honey_special_drink.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 下界风味特饮 Nether flavor
    public static final RegistryObject<Item> NETHER_FLAVOR = TEAS.register("nether_flavor", () -> new tea(new Item.Properties().food(ModFoods.NETHER_FLAVOR_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.nether_flavor.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 末地风味特饮 Ender flavor
    public static final RegistryObject<Item> ENDER_FLAVOR = TEAS.register("ender_flavor", () -> new tea(new Item.Properties().food(ModFoods.ENDER_FLAVOR_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.ender_flavor.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 尸山血海特饮 horror soup
    public static final RegistryObject<Item> HORROR_SOUP = TEAS.register("horror_soup", () -> new tea(new Item.Properties().food(ModFoods.HORROR_SOUP_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.horror_soup.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 爆爆姜汤 Explosive Ginger Soup
    public static final RegistryObject<Item> EXPLOSIVE_GINGER_SOUP = TEAS.register("explosive_ginger_soup", () -> new tea(new Item.Properties().food(ModFoods.EXPLOSIVE_GINGER_SOUP_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.explosive_ginger_soup.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 巧克力百合茶 Chocolate Lily Tea
    public static final RegistryObject<Item> CHOCOLATE_LILY_TEA = TEAS.register("chocolate_lily_tea", () -> new tea(new Item.Properties().food(ModFoods.CHOCOLATE_LILY_TEA_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.chocolate_lily_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 西瓜薄荷特饮 Watermelon mint special drink
    public static final RegistryObject<Item> WATERMELON_MINT_SPECIAL_DRINK = TEAS.register("watermelon_mint_special_drink", () -> new tea(new Item.Properties().food(ModFoods.WATERMELON_MINT_SPECIAL_DRINK_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.watermelon_mint_special_drink.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 玫瑰苹果茶 rose apple tea
    public static final RegistryObject<Item> ROSE_APPLE_TEA = TEAS.register("rose_apple_tea", () -> new tea(new Item.Properties().food(ModFoods.ROSE_APPLE_TEA_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.rose_apple_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 火灼木槿花茶 Fire Hibiscus Tea
    public static final RegistryObject<Item> FIRE_HIBISCUS_TEA = TEAS.register("fire_hibiscus_tea", () -> new tea(new Item.Properties().food(ModFoods.FIRE_HIBISCUS_TEA_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.fire_hibiscus_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 传奇中药汤 Legendary Chinese Medicine
    public static final RegistryObject<Item> LEGENDARY_CHINESE_MEDICINE = TEAS.register("legendary_chinese_medicine", () -> new tea(new Item.Properties().food(ModFoods.LEGENDARY_CHINESE_MEDICINE_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.legendary_chinese_medicine.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 肉骨茶 Bak Kut Teh
    public static final RegistryObject<Item> BAK_KUT_TEH = TEAS.register("bak_kut_geh", () -> new tea(new Item.Properties().food(ModFoods.BAK_KUT_TEH_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.bak_kut_geh.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 绚丽紫晶特饮 Brilliant Amethyst Drink
    public static final RegistryObject<Item> BRILLIANT_AMETHYST_DRINK = TEAS.register("brilliant_amethyst_drink", () -> new tea(new Item.Properties().food(ModFoods.BRILLIANT_AMETHYST_DRINK_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.brilliant_amethyst_drink.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 黄金汤 golden soup
    public static final RegistryObject<Item> GOLDEN_SOUP = TEAS.register("golden_soup", () -> new tea(new Item.Properties().food(ModFoods.GOLDEN_SOUP_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.golden_soup.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 至尊黄金茶 Supreme golden tea
    public static final RegistryObject<Item> SUPREME_GOLDEN_TEA = TEAS.register("supreme_golden_tea", () -> new tea(new Item.Properties().food(ModFoods.SUPREME_GOLDEN_TEA_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.supreme_golden_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 附魔至尊黄金茶 Enchanted Supreme Golden Tea
    public static final RegistryObject<Item> ENCHANTED_SUPREME_GOLDEN_TEA = TEAS.register("enchanted_supreme_golden_tea", () -> new tea(new Item.Properties().food(ModFoods.ENCHANTED_SUPREME_GOLDEN_TEA_P).stacksTo(16).rarity(Rarity.EPIC), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.enchanted_supreme_golden_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }

        @Override
        public boolean isFoil(ItemStack pStack) {
            return true;
        }
    });

    // 海洋之旅 ocean journey
    public static final RegistryObject<Item> OCEAN_JOURNEY = TEAS.register("ocean_journey", () -> new tea(new Item.Properties().food(ModFoods.OCEAN_JOURNEY_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.ocean_journey.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 极寒炼乳花茶 Extremely Cold Condensed Milk Scented Tea
    public static final RegistryObject<Item> EXTREMELY_COLD_CONDENSED_MILK_SCENTED_TEA = TEAS.register("extremely_cold_condensed_milk_scented_tea", () -> new tea(new Item.Properties().food(ModFoods.EXTREMELY_COLD_CONDENSED_MILK_SCENTED_TEA_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.extremely_cold_condensed_milk_scented_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 美西螈茶 axolotl tea
    public static final RegistryObject<Item> AXOLOTL_TEA = TEAS.register("axolotl_tea", () -> new tea(new Item.Properties().food(ModFoods.AXOLOTL_TEA_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.axolotl_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 鲜花聚会 flower party
    public static final RegistryObject<Item> FLOWER_PARTY = TEAS.register("flower_party", () -> new tea(new Item.Properties().food(ModFoods.FLOWER_PARTY_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.flower_party.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 猩红玛格丽特 scarlet margarita
    public static final RegistryObject<Item> SCARLET_MARGARITA = TEAS.register("scarlet_margarita", () -> new tea(new Item.Properties().food(ModFoods.SCARLET_MARGARITA_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.scarlet_margarita.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 烈口蘑菇茶饮 Strong mouth mushroom tea
    public static final RegistryObject<Item> STRONG_MOUTH_MUSHROOM_TEA = TEAS.register("strong_mouth_mushroom_tea", () -> new tea(new Item.Properties().food(ModFoods.STRONG_MOUTH_MUSHROOM_TEA_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.strong_mouth_mushroom_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 岩浆特饮 Lava special drink
    public static final RegistryObject<Item> LAVA_SPECIAL_DRINK = TEAS.register("lava_special_drink", () -> new tea(new Item.Properties().food(ModFoods.LAVA_SPECIAL_DRINK_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.lava_special_drink.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 珊瑚薄荷气泡水 coral mint sparkling water
    public static final RegistryObject<Item> CORAL_MINT_SPARKLING_WATER = TEAS.register("coral_mint_sparkling_water", () -> new tea(new Item.Properties().food(ModFoods.CORAL_MINT_SPARKLING_WATER_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.coral_mint_sparkling_water.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 混合莓果冰沙 Mixed Berry Smoothie
    public static final RegistryObject<Item> MIXED_BERRY_SMOOTHIE = TEAS.register("mixed_berry_smoothie", () -> new tea(new Item.Properties().food(ModFoods.MIXED_BERRY_SMOOTHIE_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.mixed_berry_smoothie.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 牛奶蘑菇浓汤 Milk mushroom soup
    public static final RegistryObject<Item> MILK_MUSHROOM_SOUP = TEAS.register("milk_mushroom_soup", () -> new tea(new Item.Properties().food(ModFoods.MILK_MUSHROOM_SOUP_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.milk_mushroom_soup.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 潮汐来袭 The tide is coming
    public static final RegistryObject<Item> THE_TIDE_IS_COMING = TEAS.register("the_tide_is_coming", () -> new tea(new Item.Properties().food(ModFoods.THE_TIDE_IS_COMING_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.the_tide_is_coming.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 玉蝴蝶幻翼 Oenothera lindheimeri Phantom
    public static final RegistryObject<Item> OENOTHERA_LINDHEIMERI_PHANTOM = TEAS.register("oenothera_lindheimeri_phantom", () -> new tea(new Item.Properties().food(ModFoods.OENOTHERA_LINDHEIMERI_PHANTOM_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.oenothera_lindheimeri_phantom.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 鳞甲百合茶 Turtle Shell Lily Tea
    public static final RegistryObject<Item> TURTLE_SHELL_LILY_TEA = TEAS.register("turtle_shell_lily_tea", () -> new tea(new Item.Properties().food(ModFoods.TURTLE_SHELL_LILY_TEA_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.turtle_shell_lily_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 唤魔者之怒 The Evoker's Wrath
    public static final RegistryObject<Item> THE_EVOKERS_WRATH = TEAS.register("the_evokers_wrath", () -> new tea(new Item.Properties().food(ModFoods.THE_EVOKERS_WRATH_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.the_evokers_wrath.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    // 恶魔唤声 The devil's call
    public static final RegistryObject<Item> THE_DEVILS_CALL = TEAS.register("the_devils_call", () -> new tea(new Item.Properties().food(ModFoods.THE_DEVILS_CALL_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.the_devils_call.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    // 冰红茶
    public static final FoodProperties ICE_BLACK_TEA_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(ModEffects.FAST_FALLING.get(), 3600, 0), 1.0F).build();
    public static final RegistryObject<Item> ICE_BLACK_TEA = TEAS.register("ice_black_tea", () -> new tea(new Item.Properties().food(ModFoods.ICE_BLACK_TEA_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.ice_black_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    //星银花茶
    public static final FoodProperties STAR_SILVER_POTION_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0), 1.0F)
            .build();
    public static final RegistryObject<Item> STAR_SILVER_POTION = TEAS.register("star_silver_potion", () -> new tea(new Item.Properties().food(ModFoods.STAR_SILVER_POTION_P).stacksTo(16).rarity(Rarity.UNCOMMON), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.star_silver_potion.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    //深渊沉影
    public static final FoodProperties ABYSSAL_BREW_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 6400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 0), 1.0F)
            .build();
    public static final RegistryObject<Item> ABYSSAL_BREW = TEAS.register("abyssal_brew", () -> new tea(new Item.Properties().food(ModFoods.ABYSSAL_BREW_P).stacksTo(16).rarity(Rarity.RARE), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.abyssal_brew.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.DARK_PURPLE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    //淬炼星尘
    public static final FoodProperties CELESTIAL_EXTRACT_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 2400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 4800, 0), 1.0F)
            .build();
    public static final RegistryObject<Item> CELESTIAL_EXTRACT = TEAS.register("celestial_extract", () -> new tea(new Item.Properties().food(ModFoods.CELESTIAL_EXTRACT_P).stacksTo(16).rarity(Rarity.EPIC), 25)
    {
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.celestial_extract.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.GOLD)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    public static void register(IEventBus E){
        TEAS.register(E);
    }
}
