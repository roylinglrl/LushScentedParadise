package net.royling.LushScentedParadise.Registry;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.LushScentedParadise.Item.Armor.CXKItem;
import net.royling.LushScentedParadise.Item.Armor.ColorfulFlowerItem;
import net.royling.LushScentedParadise.Item.Armor.ModArmorMaterials;
import net.royling.LushScentedParadise.Item.FlowerFertilizer;
import net.royling.LushScentedParadise.Item.FlowerSword;
import net.royling.LushScentedParadise.Item.Flowertea.tea;
import net.royling.LushScentedParadise.Item.MortarAndPestleItem;
import net.royling.LushScentedParadise.Item.StorageBagItem.FlowerBagItem;
import net.royling.LushScentedParadise.Item.StorageBagItem.SeedBagItem;
import net.royling.LushScentedParadise.Item.colorfulflower.ColorfulFlowerSword;
import net.royling.LushScentedParadise.LushScentedParadise;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LushScentedParadise.MODID);

    public static final RegistryObject<Item> CLEAN_WATER = ITEMS.register("clean_water",
            ()->new Item(new Item.Properties().stacksTo(64)));
    public static final FoodProperties DIRTY_WATER_P = new FoodProperties.Builder()
            .nutrition(0).saturationMod(0f)
            .effect(()->new MobEffectInstance(MobEffects.POISON,1200,0),1.0F)
            .effect(()->new MobEffectInstance(MobEffects.CONFUSION,600,0),1.0F)
            .effect(()->new MobEffectInstance(ModEffects.PARASITE_INFECTION.get(),80000,0),1F)
            .effect(()->new MobEffectInstance(ModEffects.DYSENTERY_INFECTION.get(),80000,0),1F)
            .alwaysEat().build();
    public static final RegistryObject<Item> DIRTY_WATER = ITEMS.register("dirty_water",
            ()->new Item(new Item.Properties().stacksTo(64).food(DIRTY_WATER_P)));
    public static final RegistryObject<BlockItem> TEAPOT = ITEMS.register("teapot",
            ()->new BlockItem(ModBlocks.TEAPOT.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> FLOWER_TABLE = ITEMS.register("flower_table",
            ()->new BlockItem(ModBlocks.FLOWER_TABLE.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> DRYING_RACK = ITEMS.register("drying_rack",
            ()->new BlockItem(ModBlocks.DRYING_RACK.get(),new Item.Properties()));


    public static final RegistryObject<Item> ORIGINAL_FLOWER_SWORD = ITEMS.register("original_flower_sword",
            ()->new SwordItem(Tiers.IRON,0,-3,new Item.Properties().stacksTo(1).durability(456)));
    public static final RegistryObject<Item> FLOWER_SWORD = ITEMS.register("flower_sword",
            ()->new FlowerSword(Tiers.IRON,2,-2.4f,new Item.Properties().stacksTo(1).durability(1208)));
    public static final RegistryObject<Item> FLOWER_BAG = ITEMS.register("flower_bag",
            ()->new FlowerBagItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SEED_BAG = ITEMS.register("seed_bag",
            ()->new SeedBagItem(new Item.Properties().stacksTo(1)));
    /*public static final RegistryObject<Item> FLOWER_BASKET = ITEMS.register("flower_basket",
            ()->new BlockItem(ModBlocks.FLOWER_BASKET.get(),new Item.Properties().stacksTo(16)));*/
    public static final RegistryObject<Item> DRIED_VIOLET = ITEMS.register("dried_violet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_HIBISCUS = ITEMS.register("dried_hibiscus",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_HERBACEOUS_PEONY = ITEMS.register("dried_herbaceous_peony",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_JASMINE = ITEMS.register("dried_jasmine",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_LAVENDER = ITEMS.register("dried_lavender",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_LILY = ITEMS.register("dried_lily",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_SAFFLOWER = ITEMS.register("dried_safflower",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_SNOW_LOTUS = ITEMS.register("dried_snow_lotus",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_MARIGOLD = ITEMS.register("dried_marigold",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_OENOTHERA_LINDHEIMERI = ITEMS.register("dried_oenothera_lindheimeri",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_PERILLA = ITEMS.register("dried_perilla",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_HONEYSUCKLE = ITEMS.register("dried_honeysuckle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_GREEN_TEA_LEAVE = ITEMS.register("dried_green_tea_leave",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_BLACK_TEA_LEAVE = ITEMS.register("dried_black_tea_leave",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_GINGER_ITEM = ITEMS.register("dried_ginger",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_WHITE_TEA_LEAVE = ITEMS.register("dried_white_tea_leave",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_OOLONG_TEA_LEAVE = ITEMS.register("dried_oolong_tea_leave",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_PUER_TEA_LEAVE = ITEMS.register("dried_puer_tea_leave",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_MINT_LEAVE = ITEMS.register("dried_mint_leave",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_LICORICE_ROOT = ITEMS.register("dried_licorice_root",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_ASTRAGALUS_ROOT = ITEMS.register("dried_astragalus_root",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_VERBENA_ITEM = ITEMS.register("dried_verbena",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_BURDOCK_ITEM = ITEMS.register("dried_burdock",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_KUDZU_ITEM = ITEMS.register("dried_kudzu",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_PORIA_ITEM = ITEMS.register("dried_poria",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_FLAX_ITEM = ITEMS.register("dried_flax",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRIED_DANDELION = ITEMS.register("dried_dandelion",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_POPPY = ITEMS.register("dried_poppy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRIED_ORCHID = ITEMS.register("dried_orchid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_TULIP = ITEMS.register("dried_tulip",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRIED_OXEYE_DAISY = ITEMS.register("dried_oxeye_daisy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRIED_CORNFLOWER = ITEMS.register("dried_cornflower",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_LILY_OF_THE_VALLEY = ITEMS.register("dried_lily_of_the_valley",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_LILAC = ITEMS.register("dried_lilac",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_ROSE = ITEMS.register("dried_rose",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_PEONY = ITEMS.register("dried_peony",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MILK = ITEMS.register("milk",
            ()->new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> MUSIC_DISC =
            ITEMS.register("music_disc",()->new RecordItem(6,ModSounds.MUSIC_DISC,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE),1020));
    public static final RegistryObject<Item> FLOWER_BOOK = ITEMS.register("flowerbook",()->new Item(new Item.Properties().stacksTo(1)){
        @Override
        public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
            if(!pLevel.isClientSide){
                return InteractionResultHolder.pass(pPlayer.getItemInHand(pUsedHand));
            }
            return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
        }
    });
    //1.1版本
    public static final RegistryObject<Item> MORTAR_AND_PESTLE = ITEMS.register("mortar_and_pestle", ()->new MortarAndPestleItem(new Item.Properties().stacksTo(1).durability(64)));
    public static final RegistryObject<Item> DRIED_WITHER_ROSE = ITEMS.register("dried_wither_rose",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_SPORE_BLOSSOM = ITEMS.register("dried_spore_blossom",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_CACTUS = ITEMS.register("dried_cactus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));

    public static final RegistryObject<Item> DRIED_COCOA_BEANS = ITEMS.register("dried_cocoa_beans",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COCOA_POWDER = ITEMS.register("cocoa_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRIED_GLOW_BERRIES = ITEMS.register("dried_glow_berries",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));

    public static final RegistryObject<Item> DRIED_SWEET_BERRIES = ITEMS.register("dried_sweet_berries",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));

    public static final RegistryObject<Item> FLOWER_FERTILIZER = ITEMS.register("flower_fertilizer",()->new FlowerFertilizer(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> COFFEE_FRUIT = ITEMS.register("coffee_fruit",
            () -> new BlockItem(ModBlocks.COFFEE_TREE.get(),
                    new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> COFFEE_BEANS = ITEMS.register("coffee_beans",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> COFFEE_POWDER = ITEMS.register("coffee_powder",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> DRIED_COFFEE_BEANS = ITEMS.register("dried_coffee_beans",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VANILLA_SEEDS = ITEMS.register("vanilla_seeds",
            () -> new ItemNameBlockItem(ModBlocks.VANILLA_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> VANILLA_POD = ITEMS.register("vanilla_pod",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(1).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> DRIED_VANILLA_POD = ITEMS.register("dried_vanilla_pod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MILK_FOAM = ITEMS.register("milk_foam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> VANILLA_SYRUP = ITEMS.register("vanilla_syrup",
            () -> new tea(new Item.Properties().stacksTo(16).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.3f).build()),60));
    public static final RegistryObject<Item> GINGER_POWDER = ITEMS.register("ginger_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> CREAM = ITEMS.register("cream",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> GINGERBREAD_MAN = ITEMS.register("gingerbread_man",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COOKED_GINGERBREAD_MAN = ITEMS.register("cooked_gingerbread_man",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(0.6f)
                    .effect(new MobEffectInstance(MobEffects.JUMP,1200,2),1f)
                    .effect(new MobEffectInstance(MobEffects.LUCK,4800,1),1F).build())));
    public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f)
                    .effect(new MobEffectInstance(MobEffects.REGENERATION,400,0),1f)
                    .effect(new MobEffectInstance(MobEffects.LUCK,2400,0),1F).build())));

    public static final RegistryObject<Item> STAR_SILVER_SEED = ITEMS.register("star_silver_seed",()-> new ItemNameBlockItem(ModBlocks.STAR_SILVER_FLOWER_CROP.get(),new Item.Properties()));
    public static final RegistryObject<Item> STAR_SILVER_FLOWER_CROP = ITEMS.register("star_silver_flower_crop",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_STAR_SILVER = ITEMS.register("raw_star_silver",()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STAR_SILVER_INGOT = ITEMS.register("star_silver_ingot",()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STAR_SILVER_ORE_ITEM = ITEMS.register("star_silver_ore",
            () -> new BlockItem(ModBlocks.STAR_SILVER_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_STAR_SILVER_ORE_ITEM = ITEMS.register("deepslate_star_silver_ore",
            () -> new BlockItem(ModBlocks.DEEPSLATE_STAR_SILVER_ORE.get(), new Item.Properties()));

    public static final RegistryObject<Item> STAR_SILVER_FLOWER_ITEM = ITEMS.register("star_silver_flower",
            () -> new BlockItem(ModBlocks.STAR_SILVER_FLOWER.get(), new Item.Properties()));

    public static final RegistryObject<Item> STAR_SILVER_SWORD = ITEMS.register("star_silver_sword", ()->new SwordItem(Tiers.IRON,3,-2.0f,new Item.Properties().stacksTo(1).durability(468)));
    public static final RegistryObject<Item> STAR_SILVER_PICKAXE = ITEMS.register("star_silver_pickaxe",
            () -> new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties().durability(468)));
    public static final RegistryObject<Item> STAR_SILVER_AXE = ITEMS.register("star_silver_axe",
            () -> new AxeItem(Tiers.IRON, 6.0F, -3.0F, new Item.Properties().durability(468)));
    public static final RegistryObject<Item> STAR_SILVER_SHOVEL = ITEMS.register("star_silver_shovel",
            () -> new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().durability(468)));
    public static final RegistryObject<Item> STAR_SILVER_HOE = ITEMS.register("star_silver_hoe",
            () -> new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties().durability(468)));
    public static final RegistryObject<Item> STAR_SILVER_HELMET = ITEMS.register("star_silver_helmet",
            () -> new ArmorItem(ModArmorMaterials.STAR_SILVER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> STAR_SILVER_CHESTPLATE = ITEMS.register("star_silver_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STAR_SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> STAR_SILVER_LEGGINGS = ITEMS.register("star_silver_leggings",
            () -> new ArmorItem(ModArmorMaterials.STAR_SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> STAR_SILVER_BOOTS = ITEMS.register("star_silver_boots",
            () -> new ArmorItem(ModArmorMaterials.STAR_SILVER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ABYSS_SILENCE_MUSHROOM = ITEMS.register("abyss_silence_mushroom",
            () -> new BlockItem(ModBlocks.ABYSS_SILENCE_MUSHROOM.get(), new Item.Properties()));

    public static final RegistryObject<Item> ABYSS_SILENCE_MUSHROOM_BLOCK = ITEMS.register("abyss_silence_mushroom_block",
            () -> new BlockItem(ModBlocks.ABYSS_SILENCE_MUSHROOM_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> ABYSS_SILENCE_MUSHROOM_CAP = ITEMS.register("abyss_silence_mushroom_cap",
            () -> new BlockItem(ModBlocks.ABYSS_SILENCE_MUSHROOM_CAP.get(), new Item.Properties()));

    public static final RegistryObject<Item> STAR_SILVER_SHEARS = ITEMS.register("star_silver_shears",
            ()->new ShearsItem(new Item.Properties().stacksTo(1).durability(438)));
    public static final RegistryObject<Item> DRIED_ABYSS_SILENCE_MUSHROOM = ITEMS.register("dried_star_silver_mushroom",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PHANTOM_LOTUS_KOI = ITEMS.register("phantom_lotus_koi",
            ()->new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> GLOWPETAL_PIGFISH = ITEMS.register("glowpetal_pigfish",
            ()->new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> STAR_SILVER_FLOWER_POWDER = ITEMS.register("star_silver_flower_powder",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> ABYSS_MUSHROOM_POWDER = ITEMS.register("abyss_mushroom_powder",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> STAR_SILVER_BLOCK_ITEM = ITEMS.register("star_silver_block",
            ()->new BlockItem(ModBlocks.STAR_SILVER_BLOCK.get(),new Item.Properties()));
    public static final RegistryObject<Item> RAW_STAR_SILVER_BLOCK_ITEM = ITEMS.register("raw_star_silver_block",
            ()->new BlockItem(ModBlocks.RAW_STAR_SILVER_BLOCK.get(),new Item.Properties()));
    public static final RegistryObject<Item> COLORFUL_FLOWER_BLOCK_ITEM = ITEMS.register("colorful_flower_block",
            ()->new BlockItem(ModBlocks.COLORFUL_FLOWER_BLOCK.get(),new Item.Properties()));
    public static final RegistryObject<Item> FLOWER_INGOT = ITEMS.register("colorful_flower_ingot",
            ()->new Item(new Item.Properties()));

    //CXK套装
    public static final RegistryObject<Item> CXKHELMET = ITEMS.register("cxkhelmet", CXKItem.Helmet::new);
    public static final RegistryObject<Item> CXKCHESTPLATE = ITEMS.register("cxkchestplate", CXKItem.Chestplate::new);
    public static final RegistryObject<Item> CXKLEGGINGS = ITEMS.register("cxkleggings", CXKItem.Leggings::new);
    public static final RegistryObject<Item> CXKBOOTS = ITEMS.register("cxkboots", CXKItem.Boots::new);

    public static final RegistryObject<Item> COLORFUL_FLOWER_HELMET = ITEMS.register("colorful_flower_helmet", ColorfulFlowerItem.Helmet::new);
    public static final RegistryObject<Item> COLORFUL_FLOWER_CHESTPLATE = ITEMS.register("colorful_flower_chestplate", ColorfulFlowerItem.Chestplate::new);
    public static final RegistryObject<Item> COLORFUL_FLOWER_LEGGINGS = ITEMS.register("colorful_flower_leggings", ColorfulFlowerItem.Leggings::new);
    public static final RegistryObject<Item> COLORFUL_FLOWER_BOOTS = ITEMS.register("colorful_flower_boots", ColorfulFlowerItem.Boots::new);

    //繁花炫彩工具
    public static final RegistryObject<Item> COLORFUL_FLOWER_SWORD = ITEMS.register("colorful_flower_sword",
            ()->new ColorfulFlowerSword(Tiers.NETHERITE,4,-2.1F,new Item.Properties().durability(2048).fireResistant()));
    public static final RegistryObject<Item> COLORFUL_FLOWER_PICKAXE = ITEMS.register("colorful_flower_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, 2, -3F,
                    new Item.Properties().durability(2048).fireResistant()));
    public static final RegistryObject<Item> COLORFUL_FLOWER_AXE = ITEMS.register("colorful_flower_axe",
            () -> new AxeItem(Tiers.NETHERITE, 6, -2.8F,
                    new Item.Properties().durability(2048).fireResistant()));
    public static final RegistryObject<Item> COLORFUL_FLOWER_SHOVEL = ITEMS.register("colorful_flower_shovel",
            () -> new ShovelItem(Tiers.NETHERITE, 1.0F, -2.8F,
                    new Item.Properties().durability(2048).fireResistant()));
    public static final RegistryObject<Item> COLORFUL_FLOWER_HOE = ITEMS.register("colorful_flower_hoe",
            () -> new HoeItem(Tiers.NETHERITE, -4, -1F,
                    new Item.Properties().durability(2048).fireResistant()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
