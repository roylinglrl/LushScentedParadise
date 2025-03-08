package net.royling.LushScentedParadise.Registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.ModBlock.AbyssSilenceMushroom.AbyssSilenceMushroom;
import net.royling.LushScentedParadise.ModBlock.CoffeeTreeBlock;
import net.royling.LushScentedParadise.ModBlock.DryingRack.DryingRackBlock;
import net.royling.LushScentedParadise.ModBlock.TeapotBlock.TeapotBlock;
import net.royling.LushScentedParadise.ModBlock.VanillaCropBlock;
import net.royling.LushScentedParadise.ModBlock.starsilverore.StarSilverClusterBlock;
import net.royling.LushScentedParadise.ModBlock.starsilverore.StarSilverFlower;
import net.royling.LushScentedParadise.ModBlock.starsilverore.StarSilverFlowerBlock;
import net.royling.LushScentedParadise.ModBlock.starsilverore.starsilverOre;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LushScentedParadise.MODID);

    public static final RegistryObject<Block> TEAPOT = BLOCKS.register("teapot",
            () -> new TeapotBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2.0f)));
    public static final RegistryObject<Block> FLOWER_TABLE = BLOCKS.register("flower_table",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE).strength(3.0f)));
    public static final RegistryObject<Block> DRYING_RACK = BLOCKS.register("drying_rack",
            ()->new DryingRackBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(3.0f)));
    public static final RegistryObject<Block> COFFEE_TREE = BLOCKS.register("coffee_tree",
            CoffeeTreeBlock::new);
    public static final RegistryObject<Block> VANILLA_CROP = BLOCKS.register("vanilla_crop",
            VanillaCropBlock::new);
    public static final RegistryObject<Block> STAR_SILVER_ORE = BLOCKS.register("star_silver_ore", starsilverOre::new);
    public static final RegistryObject<Block> DEEPSLATE_STAR_SILVER_ORE = BLOCKS.register("deepslate_star_silver_ore",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE).strength(3.0f)));
    public static final RegistryObject<Block> STAR_SILVER_FLOWER = BLOCKS.register("star_silver_flower", StarSilverFlower::new);

    public static final RegistryObject<Block> ABYSS_SILENCE_MUSHROOM = BLOCKS.register("abyss_silence_mushroom",
            ()->new AbyssSilenceMushroom(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM).strength(3.0f)));

    public static final RegistryObject<Block> ABYSS_SILENCE_MUSHROOM_CAP = BLOCKS.register("abyss_silence_mushroom_cap",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK).strength(2.5F)));
    public static final RegistryObject<Block> ABYSS_SILENCE_MUSHROOM_BLOCK = BLOCKS.register("abyss_silence_mushroom_block",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK).strength(2.5F)));
    public static final RegistryObject<Block> STAR_SILVER_FLOWER_CROP = BLOCKS.register("star_silver_flower_crop",()->new StarSilverFlowerBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak()));
    public static final RegistryObject<Block> STAR_SILVER_CLUSTER = BLOCKS.register("star_silver_cluster",()->new StarSilverClusterBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak()));
    //星银块
    public static final RegistryObject<Block> STAR_SILVER_BLOCK = BLOCKS.register("star_silver_block",
            ()->new Block(BlockBehaviour.Properties.of().strength(3.5f)));
    public static final RegistryObject<Block> RAW_STAR_SILVER_BLOCK = BLOCKS.register("raw_star_silver_block",
            ()->new Block(BlockBehaviour.Properties.of().strength(3.5f)));
    public static final RegistryObject<Block> COLORFUL_FLOWER_BLOCK = BLOCKS.register("colorful_flower_block",
            ()->new Block(BlockBehaviour.Properties.of().strength(3.5f)));




    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
