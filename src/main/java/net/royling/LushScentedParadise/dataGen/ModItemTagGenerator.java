package net.royling.LushScentedParadise.dataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.royling.LushScentedParadise.ModBlock.newFlower.ModFlowers;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.Registry.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;
@SuppressWarnings("removal")
public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, LushScentedParadise.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC.get());

        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC.get());


        this.tag(ItemTags.PICKAXES).add(
                ModItems.STAR_SILVER_PICKAXE.get(),
                ModItems.COLORFUL_FLOWER_PICKAXE.get()
        );
        this.tag(ItemTags.AXES).add(
                ModItems.STAR_SILVER_AXE.get(),
                ModItems.COLORFUL_FLOWER_AXE.get()
        );
        this.tag(ItemTags.SWORDS).add(
                ModItems.FLOWER_SWORD.get(),
                ModItems.ORIGINAL_FLOWER_SWORD.get(),
                ModItems.STAR_SILVER_SWORD.get(),
                ModItems.COLORFUL_FLOWER_SWORD.get()
        );
        this.tag(ItemTags.SHOVELS).add(
                ModItems.STAR_SILVER_SHOVEL.get(),
                ModItems.COLORFUL_FLOWER_SHOVEL.get()
        );
        this.tag(ItemTags.HOES).add(
                ModItems.STAR_SILVER_HOE.get(),
                ModItems.COLORFUL_FLOWER_HOE.get()
        );
        this.tag(ItemTags.TOOLS).add(
                ModItems.STAR_SILVER_PICKAXE.get(),
                ModItems.STAR_SILVER_AXE.get(),
                ModItems.FLOWER_SWORD.get(),
                ModItems.ORIGINAL_FLOWER_SWORD.get(),
                ModItems.STAR_SILVER_SWORD.get(),
                ModItems.STAR_SILVER_SHOVEL.get(),
                ModItems.STAR_SILVER_HOE.get(),
                ModItems.COLORFUL_FLOWER_HOE.get(),
                ModItems.COLORFUL_FLOWER_SWORD.get(),
                ModItems.COLORFUL_FLOWER_SHOVEL.get(),
                ModItems.COLORFUL_FLOWER_PICKAXE.get(),
                ModItems.COLORFUL_FLOWER_AXE.get()
        );

        this.tag(ItemTags.CLUSTER_MAX_HARVESTABLES).add(
                ModItems.FLOWER_SWORD.get(),
                ModItems.ORIGINAL_FLOWER_SWORD.get(),
                ModItems.STAR_SILVER_SWORD.get(),
                ModItems.COLORFUL_FLOWER_SWORD.get()
        );
        this.tag(ItemTags.BREAKS_DECORATED_POTS).add(
                ModItems.FLOWER_SWORD.get(),
                ModItems.ORIGINAL_FLOWER_SWORD.get(),
                ModItems.STAR_SILVER_SWORD.get(),
                ModItems.STAR_SILVER_AXE.get(),
                ModItems.STAR_SILVER_PICKAXE.get(),
                ModItems.STAR_SILVER_HOE.get(),
                ModItems.STAR_SILVER_SHOVEL.get(),
                ModItems.COLORFUL_FLOWER_HOE.get(),
                ModItems.COLORFUL_FLOWER_SWORD.get(),
                ModItems.COLORFUL_FLOWER_SHOVEL.get(),
                ModItems.COLORFUL_FLOWER_PICKAXE.get(),
                ModItems.COLORFUL_FLOWER_AXE.get(),
                ModItems.COLORFUL_FLOWER_HOE.get(),
                ModItems.COLORFUL_FLOWER_SWORD.get(),
                ModItems.COLORFUL_FLOWER_SHOVEL.get(),
                ModItems.COLORFUL_FLOWER_PICKAXE.get(),
                ModItems.COLORFUL_FLOWER_AXE.get()
        );
        this.tag(ItemTags.FISHES).add(
                ModItems.PHANTOM_LOTUS_KOI.get(),
                ModItems.GLOWPETAL_PIGFISH.get()
        );
        this.tag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),new ResourceLocation("forge","tools"))).add(
                ModItems.STAR_SILVER_PICKAXE.get(),
                ModItems.STAR_SILVER_AXE.get(),
                ModItems.FLOWER_SWORD.get(),
                ModItems.ORIGINAL_FLOWER_SWORD.get(),
                ModItems.STAR_SILVER_SWORD.get(),
                ModItems.STAR_SILVER_SHOVEL.get(),
                ModItems.STAR_SILVER_HOE.get(),
                ModItems.COLORFUL_FLOWER_HOE.get(),
                ModItems.COLORFUL_FLOWER_SWORD.get(),
                ModItems.COLORFUL_FLOWER_SHOVEL.get(),
                ModItems.COLORFUL_FLOWER_PICKAXE.get(),
                ModItems.COLORFUL_FLOWER_AXE.get()
        );
        this.tag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),new ResourceLocation("forge","shears"))).add(
                ModItems.STAR_SILVER_SHEARS.get()
        );
        this.tag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),new ResourceLocation("forge","storage_blocks"))).add(
                ModItems.STAR_SILVER_BLOCK_ITEM.get(),
                ModItems.RAW_STAR_SILVER_BLOCK_ITEM.get(),
                ModItems.COLORFUL_FLOWER_BLOCK_ITEM.get()
        );
        this.tag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),new ResourceLocation("forge","ingots"))).add(
                ModItems.STAR_SILVER_INGOT.get(),
                ModItems.FLOWER_INGOT.get()
        );
        this.tag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),new ResourceLocation("forge","ingots/star_silver"))).add(
                ModItems.STAR_SILVER_INGOT.get()
        );
        this.tag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),new ResourceLocation("forge","ingots/colorful_flower"))).add(
                ModItems.FLOWER_INGOT.get()
        );
        this.tag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),new ResourceLocation("forge","raw_materials"))).add(
                ModItems.RAW_STAR_SILVER.get()
        );
        this.tag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),new ResourceLocation("forge","armors/boots"))).add(
                ModItems.STAR_SILVER_BOOTS.get(),
                ModItems.COLORFUL_FLOWER_BOOTS.get()
        );
        this.tag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),new ResourceLocation("forge","armors/leggings"))).add(
                ModItems.STAR_SILVER_LEGGINGS.get(),
                ModItems.COLORFUL_FLOWER_LEGGINGS.get()

        );
        this.tag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),new ResourceLocation("forge","armors/chestplates"))).add(
                ModItems.STAR_SILVER_CHESTPLATE.get(),
                ModItems.COLORFUL_FLOWER_CHESTPLATE.get()

        );
        this.tag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),new ResourceLocation("forge","armors/helmets"))).add(
                ModItems.STAR_SILVER_HELMET.get(),
                ModItems.COLORFUL_FLOWER_HELMET.get()

        );
        this.tag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),new ResourceLocation("forge","armors"))).add(
                ModItems.STAR_SILVER_HELMET.get(),
                ModItems.STAR_SILVER_CHESTPLATE.get(),
                ModItems.STAR_SILVER_LEGGINGS.get(),
                ModItems.STAR_SILVER_BOOTS.get(),
                ModItems.COLORFUL_FLOWER_HELMET.get(),
                ModItems.COLORFUL_FLOWER_CHESTPLATE.get(),
                ModItems.COLORFUL_FLOWER_LEGGINGS.get(),
                ModItems.COLORFUL_FLOWER_BOOTS.get()

        );
        this.tag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),new ResourceLocation("forge","seeds"))).add(
                ModFlowers.GREEN_TEA_SEED.get(),
                ModFlowers.BLACK_TEA_SEED.get(),
                ModFlowers.WHITE_TEA_SEED.get(),
                ModFlowers.OOLONG_TEA_SEED.get(),
                ModFlowers.PUER_TEA_SEED.get(),
                ModFlowers.MINT_SEED.get(),
                ModFlowers.LICORICE_SEED.get(),
                ModFlowers.ASTRAGALUS_SEED.get(),
                ModFlowers.VERBENA_SEED.get(),
                ModItems.VANILLA_SEEDS.get(),
                ModItems.COFFEE_FRUIT.get(),
                ModItems.STAR_SILVER_SEED.get()
        );
        this.tag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),new ResourceLocation("forge","crops"))).add(
                ModFlowers.GREEN_TEA_LEAVE.get(),
                ModFlowers.BLACK_TEA_LEAVE.get(),
                ModFlowers.WHITE_TEA_LEAVE.get(),
                ModFlowers.OOLONG_TEA_LEAVE.get(),
                ModFlowers.PUER_TEA_LEAVE.get(),
                ModFlowers.MINT_LEAVE.get(),
                ModFlowers.LICORICE_ROOT.get(),
                ModFlowers.ASTRAGALUS_ROOT.get(),
                ModFlowers.VERBENA_ITEM.get(),
                ModFlowers.GINGER_ITEM.get(),
                ModFlowers.BURDOCK_ITEM.get(),
                ModFlowers.KUDZU_ITEM.get(),
                ModFlowers.PORIA_ITEM.get(),
                ModFlowers.FLAX_ITEM.get(),
                ModItems.STAR_SILVER_FLOWER_CROP.get()
        );
        this.tag(ItemTags.FLOWERS).add(
                ModFlowers.HIBISCUS_ITEM.get(),
                ModFlowers.LAVENDER_ITEM.get(),
                ModFlowers.JASMINE_ITEM.get(),
                ModFlowers.LILY_ITEM.get(),
                ModFlowers.MARIGOLD_ITEM.get(),
                ModFlowers.OENOTHERA_LINDHEIMERI_ITEM.get(),
                ModFlowers.PEONY_ITEM.get(),
                ModFlowers.PERILLA_ITEM.get(),
                ModFlowers.SNOW_LOTUS_ITEM.get(),
                ModFlowers.VIOLET_ITEM.get(),
                ModFlowers.HONEYSUCKLE_ITEM.get(),
                ModItems.STAR_SILVER_FLOWER_ITEM.get(),
                ModItems.ABYSS_SILENCE_MUSHROOM.get(),
                ModFlowers.SAFFLOWER_ITEM.get()
        );
        this.tag(ItemTags.SMALL_FLOWERS).add(
                ModFlowers.HIBISCUS_ITEM.get(),
                ModFlowers.LAVENDER_ITEM.get(),
                ModFlowers.JASMINE_ITEM.get(),
                ModFlowers.LILY_ITEM.get(),
                ModFlowers.MARIGOLD_ITEM.get(),
                ModFlowers.OENOTHERA_LINDHEIMERI_ITEM.get(),
                ModFlowers.PEONY_ITEM.get(),
                ModFlowers.PERILLA_ITEM.get(),
                ModFlowers.SNOW_LOTUS_ITEM.get(),
                ModFlowers.VIOLET_ITEM.get(),
                ModFlowers.HONEYSUCKLE_ITEM.get(),
                ModItems.STAR_SILVER_FLOWER_ITEM.get(),
                ModItems.ABYSS_SILENCE_MUSHROOM.get(),
                ModFlowers.SAFFLOWER_ITEM.get()
        );

    }
}
