package net.royling.LushScentedParadise.dataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.Registry.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, LushScentedParadise.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.TEAPOT.get(),
                ModBlocks.STAR_SILVER_ORE.get(),
                ModBlocks.DEEPSLATE_STAR_SILVER_ORE.get(),
                ModBlocks.STAR_SILVER_BLOCK.get(),
                ModBlocks.RAW_STAR_SILVER_BLOCK.get(),
                ModBlocks.COLORFUL_FLOWER_BLOCK.get()
        );
        this.tag(BlockTags.MINEABLE_WITH_AXE).add(
                ModBlocks.FLOWER_TABLE.get(),
                ModBlocks.DRYING_RACK.get(),
                ModBlocks.ABYSS_SILENCE_MUSHROOM_BLOCK.get(),
                ModBlocks.ABYSS_SILENCE_MUSHROOM_CAP.get()
        );
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlocks.STAR_SILVER_ORE.get(),
                ModBlocks.DEEPSLATE_STAR_SILVER_ORE.get(),
                ModBlocks.STAR_SILVER_BLOCK.get(),
                ModBlocks.RAW_STAR_SILVER_BLOCK.get(),
                ModBlocks.COLORFUL_FLOWER_BLOCK.get()
        );
        this.tag(BlockTags.BEACON_BASE_BLOCKS).add(
                ModBlocks.COLORFUL_FLOWER_BLOCK.get(),
                ModBlocks.STAR_SILVER_BLOCK.get()
        );
        this.tag(TagKey.create(ForgeRegistries.BLOCKS.getRegistryKey(),new ResourceLocation("forge","storage_blocks"))).add(
                ModBlocks.STAR_SILVER_BLOCK.get(),
                ModBlocks.COLORFUL_FLOWER_BLOCK.get(),
                ModBlocks.RAW_STAR_SILVER_BLOCK.get()

        );
        this.tag(TagKey.create(ForgeRegistries.BLOCKS.getRegistryKey(),new ResourceLocation("forge","ores"))).add(
                ModBlocks.STAR_SILVER_ORE.get(),
                ModBlocks.DEEPSLATE_STAR_SILVER_ORE.get()
        );
        this.tag(TagKey.create(ForgeRegistries.BLOCKS.getRegistryKey(),new ResourceLocation("forge","ores/star_silver"))).add(
                ModBlocks.STAR_SILVER_ORE.get(),
                ModBlocks.DEEPSLATE_STAR_SILVER_ORE.get()
        );


    }
}
