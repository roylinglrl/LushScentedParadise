package net.royling.LushScentedParadise.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.royling.LushScentedParadise.LushScentedParadise;

@SuppressWarnings("removal")
public class ModTags {
    public static class Blocks{


        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(LushScentedParadise.MODID,name));
        }
    }
    public static class Items{

        public static final TagKey<Item> SWORD_FLOWER = tag("sword_flowers");
        public static final TagKey<Item> TEA = tag("tea");
        public static final TagKey<Item> SEEDS = tag("seeds");
        public static final TagKey<Item> TEA_LEAVES = tag("tea_leaves");
        public static final TagKey<Item> HONEY = tag("honey");
        public static final TagKey<Item> DRIED_MYSTERIOUS_PETALS = tag("dried_mysterious_petals");

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(LushScentedParadise.MODID,name));
        }
        private static TagKey<Item> vtag(String name){
            return ItemTags.create(new ResourceLocation("minecraft",name));
        }
    }
}
