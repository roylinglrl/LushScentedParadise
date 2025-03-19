package net.royling.LushScentedParadise.ModBlock.newFlower;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.LushScentedParadise.LushScentedParadise;

public class ModFlowers {
    public static final DeferredRegister<Block> FLOWERS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LushScentedParadise.MODID);
    public static final DeferredRegister<Item> FLOWER_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LushScentedParadise.MODID);

    public static final RegistryObject<Block> VIOLET = FLOWERS.register("violet",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission().noOcclusion().isViewBlocking(((pState, pLevel, pPos) -> false))));

    public static final RegistryObject<Block> HIBISCUS = FLOWERS.register("hibiscus",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission().isViewBlocking(((pState, pLevel, pPos) -> false))));

    public static final RegistryObject<Block> PEONY = FLOWERS.register("herbaceous_peony",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 5, BlockBehaviour.Properties.copy(Blocks.PEONY).noCollission().isViewBlocking(((pState, pLevel, pPos) -> false))));

    public static final RegistryObject<Block> JASMINE = FLOWERS.register("jasmine",
            () -> new FlowerBlock(MobEffects.NIGHT_VISION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission().isViewBlocking(((pState, pLevel, pPos) -> false))));

    public static final RegistryObject<Block> LAVENDER = FLOWERS.register("lavender",
            () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission().isViewBlocking(((pState, pLevel, pPos) -> false))));

    public static final RegistryObject<Block> LILY = FLOWERS.register("lily",
            () -> new FlowerBlock(MobEffects.HEALTH_BOOST, 5, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission().isViewBlocking(((pState, pLevel, pPos) -> false))));

    public static final RegistryObject<Block> SAFFLOWER = FLOWERS.register("safflower",
            () -> new FlowerBlock(MobEffects.FIRE_RESISTANCE, 5, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission().isViewBlocking(((pState, pLevel, pPos) -> false))));

    public static final RegistryObject<Block> SNOW_LOTUS = FLOWERS.register("snow_lotus",
            () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission().isViewBlocking(((pState, pLevel, pPos) -> false))));

    public static final RegistryObject<Block> MARIGOLD = FLOWERS.register("marigold",
            () -> new FlowerBlock(MobEffects.LUCK, 5, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission().isViewBlocking(((pState, pLevel, pPos) -> false))));

    public static final RegistryObject<Block> OENOTHERA_LINDHEIMERI = FLOWERS.register("oenothera_lindheimeri",
            () -> new FlowerBlock(MobEffects.DOLPHINS_GRACE, 5, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission().isViewBlocking(((pState, pLevel, pPos) -> false))));

    public static final RegistryObject<Block> PERILLA = FLOWERS.register("perilla",
            () -> new FlowerBlock(MobEffects.HARM, 5, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission().isViewBlocking(((pState, pLevel, pPos) -> false))));

    public static final RegistryObject<Block> HONEYSUCKLE = FLOWERS.register("honeysuckle",
            () -> new FlowerBlock(MobEffects.HARM, 5, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission().isViewBlocking(((pState, pLevel, pPos) -> false))));

    public static final RegistryObject<Block> POTTED_VIOLET = FLOWERS.register("potted_violet",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModFlowers.VIOLET, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noCollission().noOcclusion()));

    public static final RegistryObject<Block> POTTED_HIBISCUS = FLOWERS.register("potted_hibiscus",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModFlowers.HIBISCUS, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noCollission().noOcclusion()));

    public static final RegistryObject<Block> POTTED_PEONY = FLOWERS.register("potted_peony",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModFlowers.PEONY, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noCollission().noOcclusion()));

    public static final RegistryObject<Block> POTTED_JASMINE = FLOWERS.register("potted_jasmine",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModFlowers.JASMINE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noCollission().noOcclusion()));

    public static final RegistryObject<Block> POTTED_LAVENDER = FLOWERS.register("potted_lavender",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModFlowers.LAVENDER, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noCollission().noOcclusion()));

    public static final RegistryObject<Block> POTTED_LILY = FLOWERS.register("potted_lily",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModFlowers.LILY, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noCollission().noOcclusion()));

    public static final RegistryObject<Block> POTTED_SAFFLOWER = FLOWERS.register("potted_safflower",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModFlowers.SAFFLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noCollission().noOcclusion()));

    public static final RegistryObject<Block> POTTED_SNOW_LOTUS = FLOWERS.register("potted_snow_lotus",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModFlowers.SNOW_LOTUS, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noCollission().noOcclusion()));

    public static final RegistryObject<Block> POTTED_MARIGOLD = FLOWERS.register("potted_marigold",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModFlowers.MARIGOLD, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noCollission().noOcclusion()));

    public static final RegistryObject<Block> POTTED_OENOTHERA_LINDHEIMERI = FLOWERS.register("potted_oenothera_lindheimeri",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModFlowers.OENOTHERA_LINDHEIMERI, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noCollission().noOcclusion()));

    public static final RegistryObject<Block> POTTED_PERILLA = FLOWERS.register("potted_perilla",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModFlowers.PERILLA, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noCollission().noOcclusion()));

    public static final RegistryObject<Block> POTTED_HONEYSUCKLE = FLOWERS.register("potted_honeysuckle",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModFlowers.HONEYSUCKLE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noCollission().noOcclusion()));
//物品
    public static final RegistryObject<Item> VIOLET_ITEM = FLOWER_ITEMS.register("violet",
            ()->new BlockItem(VIOLET.get(),new Item.Properties()));
    public static final RegistryObject<Item> HONEYSUCKLE_ITEM = FLOWER_ITEMS.register("honeysuckle",
            ()->new BlockItem(HONEYSUCKLE.get(),new Item.Properties()));

    public static final RegistryObject<Item> HIBISCUS_ITEM = FLOWER_ITEMS.register("hibiscus",
            () -> new BlockItem(HIBISCUS.get(), new Item.Properties()));

    public static final RegistryObject<Item> PEONY_ITEM = FLOWER_ITEMS.register("herbaceous_peony",
            () -> new BlockItem(PEONY.get(), new Item.Properties()));

    public static final RegistryObject<Item> JASMINE_ITEM = FLOWER_ITEMS.register("jasmine",
            () -> new BlockItem(JASMINE.get(), new Item.Properties()));

    public static final RegistryObject<Item> LAVENDER_ITEM = FLOWER_ITEMS.register("lavender",
            () -> new BlockItem(LAVENDER.get(), new Item.Properties()));

    public static final RegistryObject<Item> LILY_ITEM = FLOWER_ITEMS.register("lily",
            () -> new BlockItem(LILY.get(), new Item.Properties()));

    public static final RegistryObject<Item> SAFFLOWER_ITEM = FLOWER_ITEMS.register("safflower",
            () -> new BlockItem(SAFFLOWER.get(), new Item.Properties()));

    public static final RegistryObject<Item> SNOW_LOTUS_ITEM = FLOWER_ITEMS.register("snow_lotus",
            () -> new BlockItem(SNOW_LOTUS.get(), new Item.Properties()));

    public static final RegistryObject<Item> MARIGOLD_ITEM = FLOWER_ITEMS.register("marigold",
            () -> new BlockItem(MARIGOLD.get(), new Item.Properties()));

    public static final RegistryObject<Item> OENOTHERA_LINDHEIMERI_ITEM = FLOWER_ITEMS.register("oenothera_lindheimeri",
            () -> new BlockItem(OENOTHERA_LINDHEIMERI.get(), new Item.Properties()));

    public static final RegistryObject<Item> PERILLA_ITEM = FLOWER_ITEMS.register("perilla",
            () -> new BlockItem(PERILLA.get(), new Item.Properties()));

    //注册农作物 绿茶
    public static final RegistryObject<Block> GREEN_TEA = FLOWERS.register("green_tea",
            ()->new ModWildCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks(), ModFlowers.GREEN_TEA_SEED));
    public static final RegistryObject<Item> GREEN_TEA_SEED = FLOWER_ITEMS.register("green_tea_seeds",
            ()->new ItemNameBlockItem(ModFlowers.GREEN_TEA.get(),new Item.Properties()));
    public static final RegistryObject<Item> GREEN_TEA_LEAVE = FLOWER_ITEMS.register("green_tea_leave",
            ()->new Item(new Item.Properties()));
    //红茶
    public static final RegistryObject<Block> BLACK_TEA = FLOWERS.register("black_tea",
            ()->new ModWildCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks(),ModFlowers.BLACK_TEA_SEED));
    public static final RegistryObject<Item> BLACK_TEA_SEED = FLOWER_ITEMS.register("black_tea_seeds",
            ()->new ItemNameBlockItem(ModFlowers.BLACK_TEA.get(),new Item.Properties()));
    public static final RegistryObject<Item> BLACK_TEA_LEAVE = FLOWER_ITEMS.register("black_tea_leave",
            ()->new Item(new Item.Properties()));
    //姜
    public static final RegistryObject<Block> GINGER = FLOWERS.register("ginger",
            ()->new ModWildCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks(),ModFlowers.GINGER_ITEM));
    public static final RegistryObject<Item> GINGER_ITEM = FLOWER_ITEMS.register("ginger",
            ()->new ItemNameBlockItem(ModFlowers.GINGER.get(),new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    //白茶
    public static final RegistryObject<Block> WHITE_TEA = FLOWERS.register("white_tea",
        () -> new ModWildCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks(),ModFlowers.WHITE_TEA_SEED));
    public static final RegistryObject<Item> WHITE_TEA_SEED = FLOWER_ITEMS.register("white_tea_seeds",
            () -> new ItemNameBlockItem(ModFlowers.WHITE_TEA.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_TEA_LEAVE = FLOWER_ITEMS.register("white_tea_leave",
            () -> new Item(new Item.Properties()));
    //乌龙茶
    public static final RegistryObject<Block> OOLONG_TEA = FLOWERS.register("oolong_tea",
        () -> new ModWildCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks(),ModFlowers.OOLONG_TEA_SEED));
    public static final RegistryObject<Item> OOLONG_TEA_SEED = FLOWER_ITEMS.register("oolong_tea_seeds",
            () -> new ItemNameBlockItem(ModFlowers.OOLONG_TEA.get(), new Item.Properties()));
    public static final RegistryObject<Item> OOLONG_TEA_LEAVE = FLOWER_ITEMS.register("oolong_tea_leave",
            () -> new Item(new Item.Properties()));
    //普洱
    public static final RegistryObject<Block> PUER_TEA = FLOWERS.register("puer_tea",
          () -> new ModWildCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks(),ModFlowers.PUER_TEA_SEED));
    public static final RegistryObject<Item> PUER_TEA_SEED = FLOWER_ITEMS.register("puer_tea_seeds",
            () -> new ItemNameBlockItem(ModFlowers.PUER_TEA.get(), new Item.Properties()));
    public static final RegistryObject<Item> PUER_TEA_LEAVE = FLOWER_ITEMS.register("puer_tea_leave",
            () -> new Item(new Item.Properties()));
    //薄荷
    public static final RegistryObject<Block> MINT = FLOWERS.register("mint",
            () -> new ModWildCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks(),ModFlowers.MINT_SEED));
    public static final RegistryObject<Item> MINT_SEED = FLOWER_ITEMS.register("mint_seeds",
            () -> new ItemNameBlockItem(ModFlowers.MINT.get(), new Item.Properties()));
    public static final RegistryObject<Item> MINT_LEAVE = FLOWER_ITEMS.register("mint_leave",
            () -> new Item(new Item.Properties()));
    //甘草
    public static final RegistryObject<Block> LICORICE = FLOWERS.register("licorice",
            () -> new ModWildCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks(),ModFlowers.LICORICE_SEED));
    public static final RegistryObject<Item> LICORICE_SEED = FLOWER_ITEMS.register("licorice_seeds",
            () -> new ItemNameBlockItem(ModFlowers.LICORICE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LICORICE_ROOT = FLOWER_ITEMS.register("licorice_root",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    //黄芪
    public static final RegistryObject<Block> ASTRAGALUS = FLOWERS.register("astragalus",
            () -> new ModWildCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks(),ModFlowers.ASTRAGALUS_SEED));
    public static final RegistryObject<Item> ASTRAGALUS_SEED = FLOWER_ITEMS.register("astragalus_seeds",
            () -> new ItemNameBlockItem(ModFlowers.ASTRAGALUS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASTRAGALUS_ROOT = FLOWER_ITEMS.register("astragalus_root",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    //马鞭草
    public static final RegistryObject<Block> VERBENA = FLOWERS.register("verbena",
            () -> new ModWildCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks(),ModFlowers.VERBENA_SEED));
    public static final RegistryObject<Item> VERBENA_SEED = FLOWER_ITEMS.register("verbena_seeds",
            () -> new ItemNameBlockItem(ModFlowers.VERBENA.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERBENA_ITEM = FLOWER_ITEMS.register("verbena",
            () -> new Item(new Item.Properties()));
    //牛蒡
    public static final RegistryObject<Block> BURDOCK = FLOWERS.register("burdock",
            () -> new ModWildCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks(),ModFlowers.BURDOCK_ITEM));
    public static final RegistryObject<Item> BURDOCK_ITEM = FLOWER_ITEMS.register("burdock",
            () -> new ItemNameBlockItem(ModFlowers.BURDOCK.get(), new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    //葛根
    public static final RegistryObject<Block> KUDZU = FLOWERS.register("kudzu",
            () -> new ModWildCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks(),ModFlowers.KUDZU_ITEM));
    public static final RegistryObject<Item> KUDZU_ITEM = FLOWER_ITEMS.register("kudzu",
            () -> new ItemNameBlockItem(ModFlowers.KUDZU.get(), new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    //茯苓
    public static final RegistryObject<Block> PORIA = FLOWERS.register("poria",
            () -> new ModWildCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks(),ModFlowers.PORIA_ITEM));
    public static final RegistryObject<Item> PORIA_ITEM = FLOWER_ITEMS.register("poria",
            () -> new ItemNameBlockItem(ModFlowers.PORIA.get(), new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    //亚麻
    public static final RegistryObject<Block> FLAX = FLOWERS.register("flax",
            () -> new ModWildCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().randomTicks(),ModFlowers.FLAX_ITEM));
    public static final RegistryObject<Item> FLAX_ITEM = FLOWER_ITEMS.register("flax",
            () -> new ItemNameBlockItem(ModFlowers.FLAX.get(), new Item.Properties()));
    //野生作物 野茶
    public static final RegistryObject<Block> WILD_TEA = FLOWERS.register("wild_tea",
            ()->new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).noCollission().strength(0.1f)));
    public static final RegistryObject<Item> WILD_TEA_ITEM = FLOWER_ITEMS.register("wild_tea",
            ()->new ItemNameBlockItem(ModFlowers.WILD_TEA.get(),new Item.Properties()));

    public static final RegistryObject<Block> WILD_MINT = FLOWERS.register("wild_mint",
            ()->new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).noCollission().strength(0.1f)));
    public static final RegistryObject<Item> WILD_MINT_ITEM = FLOWER_ITEMS.register("wild_mint",
            ()->new ItemNameBlockItem(ModFlowers.WILD_MINT.get(),new Item.Properties()));

    public static final RegistryObject<Block> WILD_LICORICE = FLOWERS.register("wild_licorice",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).noCollission().strength(0.1f)));
    public static final RegistryObject<Item> WILD_LICORICE_ITEM = FLOWER_ITEMS.register("wild_licorice",
            () -> new ItemNameBlockItem(ModFlowers.WILD_LICORICE.get(), new Item.Properties()));

    public static final RegistryObject<Block> WILD_ASTRAGALUS = FLOWERS.register("wild_astragalus",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).noCollission().strength(0.1f)));
    public static final RegistryObject<Item> WILD_ASTRAGALUS_ITEM = FLOWER_ITEMS.register("wild_astragalus",
            () -> new ItemNameBlockItem(ModFlowers.WILD_ASTRAGALUS.get(), new Item.Properties()));

    public static final RegistryObject<Block> WILD_VERBENA = FLOWERS.register("wild_verbena",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).noCollission().strength(0.1f)));
    public static final RegistryObject<Item> WILD_VERBENA_ITEM = FLOWER_ITEMS.register("wild_verbena",
            () -> new ItemNameBlockItem(ModFlowers.WILD_VERBENA.get(), new Item.Properties()));

    public static final RegistryObject<Block> WILD_GINGER = FLOWERS.register("wild_ginger",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).noCollission().strength(0.1f)));
    public static final RegistryObject<Item> WILD_GINGER_ITEM = FLOWER_ITEMS.register("wild_ginger",
            () -> new ItemNameBlockItem(ModFlowers.WILD_GINGER.get(), new Item.Properties()));

    public static final RegistryObject<Block> WILD_BURDOCK = FLOWERS.register("wild_burdock",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).noCollission().strength(0.1f)));
    public static final RegistryObject<Item> WILD_BURDOCK_ITEM = FLOWER_ITEMS.register("wild_burdock",
            () -> new ItemNameBlockItem(ModFlowers.WILD_BURDOCK.get(), new Item.Properties()));

    public static final RegistryObject<Block> WILD_KUDZU = FLOWERS.register("wild_kudzu",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).noCollission().strength(0.1f)));
    public static final RegistryObject<Item> WILD_KUDZU_ITEM = FLOWER_ITEMS.register("wild_kudzu",
            () -> new ItemNameBlockItem(ModFlowers.WILD_KUDZU.get(), new Item.Properties()));

    public static final RegistryObject<Block> WILD_PORIA = FLOWERS.register("wild_poria",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).noCollission().strength(0.1f)));
    public static final RegistryObject<Item> WILD_PORIA_ITEM = FLOWER_ITEMS.register("wild_poria",
            () -> new ItemNameBlockItem(ModFlowers.WILD_PORIA.get(), new Item.Properties()));

    public static final RegistryObject<Block> WILD_FLAX = FLOWERS.register("wild_flax",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).noCollission().strength(0.1f)));
    public static final RegistryObject<Item> WILD_FLAX_ITEM = FLOWER_ITEMS.register("wild_flax",
            () -> new ItemNameBlockItem(ModFlowers.WILD_FLAX.get(), new Item.Properties()));

    public static final RegistryObject<Block> WILD_COFFEE = FLOWERS.register("wild_coffee",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).noCollission().strength(0.1f)));
    public static final RegistryObject<Item> WILD_COFFEE_ITEM = FLOWER_ITEMS.register("wild_coffee",
            () -> new ItemNameBlockItem(ModFlowers.WILD_COFFEE.get(), new Item.Properties()));

    public static final RegistryObject<Block> WILD_VANILLA = FLOWERS.register("wild_vanilla",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).noCollission().strength(0.1f)));
    public static final RegistryObject<Item> WILD_VANILLA_ITEM = FLOWER_ITEMS.register("wild_vanilla",
            () -> new ItemNameBlockItem(ModFlowers.WILD_VANILLA.get(), new Item.Properties()));


    public static void register(IEventBus eventBus){
        FLOWERS.register(eventBus);
        FLOWER_ITEMS.register(eventBus);
    }
}
