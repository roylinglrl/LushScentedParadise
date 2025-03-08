package net.royling.LushScentedParadise.dataGen;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.ModBlock.newFlower.ModFlowers;
import net.royling.LushScentedParadise.Registry.ModBlocks;

import java.util.Objects;

@SuppressWarnings("removal")
public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, LushScentedParadise.MODID, exFileHelper);
    }

    @SuppressWarnings("removal")
    @Override
    protected void registerStatesAndModels() {
        logBlock(ModBlocks.DRYING_RACK.get());
        logBlockWithAxis(ModBlocks.ABYSS_SILENCE_MUSHROOM_BLOCK.get());


        blockWithItem(ModBlocks.STAR_SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_STAR_SILVER_ORE);
        blockWithItem(ModBlocks.ABYSS_SILENCE_MUSHROOM_CAP);
        blockWithItem(ModBlocks.STAR_SILVER_BLOCK);
        blockWithItem(ModBlocks.RAW_STAR_SILVER_BLOCK);
        blockWithItem(ModBlocks.COLORFUL_FLOWER_BLOCK);

        wildCropBlockItem(ModFlowers.WILD_TEA.get(),"wild_tea");
        wildCropBlockItem(ModFlowers.WILD_ASTRAGALUS.get(),"wild_astragalus");
        wildCropBlockItem(ModFlowers.WILD_MINT.get(),"wild_mint");
        wildCropBlockItem(ModFlowers.WILD_LICORICE.get(),"wild_licorice");
        wildCropBlockItem(ModFlowers.WILD_VERBENA.get(),"wild_verbena");
        wildCropBlockItem(ModFlowers.WILD_GINGER.get(),"wild_ginger");
        wildCropBlockItem(ModFlowers.WILD_BURDOCK.get(),"wild_burdock");
        wildCropBlockItem(ModFlowers.WILD_KUDZU.get(),"wild_kudzu");
        wildCropBlockItem(ModFlowers.WILD_PORIA.get(),"wild_poria");
        wildCropBlockItem(ModFlowers.WILD_FLAX.get(),"wild_flax");
        wildCropBlockItem(ModFlowers.WILD_COFFEE.get(),"wild_coffee");
        wildCropBlockItem(ModFlowers.WILD_VANILLA.get(),"wild_vanilla");
        wildCropBlockItem(ModBlocks.ABYSS_SILENCE_MUSHROOM.get(),"abyss_silence_mushroom");

        simpleBlockWithItem(ModFlowers.POTTED_VIOLET.get(), models().singleTexture("potted_violet",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModFlowers.VIOLET.get())).renderType("cutout"));

        simpleBlockWithItem(ModFlowers.POTTED_HIBISCUS.get(), models().singleTexture("potted_hibiscus",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModFlowers.HIBISCUS.get())).renderType("cutout"));

        simpleBlockWithItem(ModFlowers.POTTED_PEONY.get(), models().singleTexture("potted_peony",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModFlowers.PEONY.get())).renderType("cutout"));

        simpleBlockWithItem(ModFlowers.POTTED_JASMINE.get(), models().singleTexture("potted_jasmine",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModFlowers.JASMINE.get())).renderType("cutout"));

        simpleBlockWithItem(ModFlowers.POTTED_LAVENDER.get(), models().singleTexture("potted_lavender",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModFlowers.LAVENDER.get())).renderType("cutout"));

        simpleBlockWithItem(ModFlowers.POTTED_LILY.get(), models().singleTexture("potted_lily",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModFlowers.LILY.get())).renderType("cutout"));

        simpleBlockWithItem(ModFlowers.POTTED_SAFFLOWER.get(), models().singleTexture("potted_safflower",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModFlowers.SAFFLOWER.get())).renderType("cutout"));

        simpleBlockWithItem(ModFlowers.POTTED_SNOW_LOTUS.get(), models().singleTexture("potted_snow_lotus",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModFlowers.SNOW_LOTUS.get())).renderType("cutout"));

        simpleBlockWithItem(ModFlowers.POTTED_MARIGOLD.get(), models().singleTexture("potted_marigold",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModFlowers.MARIGOLD.get())).renderType("cutout"));

        simpleBlockWithItem(ModFlowers.POTTED_OENOTHERA_LINDHEIMERI.get(), models().singleTexture("potted_oenothera_lindheimeri",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModFlowers.OENOTHERA_LINDHEIMERI.get())).renderType("cutout"));

        simpleBlockWithItem(ModFlowers.POTTED_PERILLA.get(), models().singleTexture("potted_perilla",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModFlowers.PERILLA.get())).renderType("cutout"));

        simpleBlockWithItem(ModFlowers.POTTED_HONEYSUCKLE.get(), models().singleTexture("potted_honeysuckle",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModFlowers.HONEYSUCKLE.get())).renderType("cutout"));

    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(),cubeAll(blockRegistryObject.get()));
    }
    private void wildCropBlockItem(Block block,String texutre){
        String blockName= BuiltInRegistries.BLOCK.getKey(block).getPath();

        simpleBlock(block,models().cross(blockName,new ResourceLocation(LushScentedParadise.MODID,"block/"+texutre)));
        models().getBuilder(blockName).parent(models().getExistingFile(mcLoc("block/cross")))
                .texture("cross",new ResourceLocation(LushScentedParadise.MODID,"block/"+texutre))
                .renderType("cutout");
        itemModels().getBuilder(blockName).parent(models().getExistingFile(mcLoc("item/generated"))).texture("layer0",new ResourceLocation(LushScentedParadise.MODID,"block/"+texutre));

    }
    private void logBlock(Block block) {
        ModelFile model = models().cubeColumn(
                name(block),
                modLoc("block/" + name(block) + "_side"),
                modLoc("block/" + name(block) + "_top")
        );
        simpleBlock(block, model);
        itemModels().withExistingParent(name(block),modLoc("block/"+name(block)));
    }
    private void logBlockWithAxis(Block block){
        ModelFile model = models().cubeColumn(name(block),modLoc("block/"+name(block)+"_side"),modLoc("block/"+name(block)+"_top"));
        getVariantBuilder(block).forAllStates(state -> {
            Direction.Axis axis = state.getValue(RotatedPillarBlock.AXIS);
            return ConfiguredModel.builder().modelFile(model).rotationX(axis == Direction.Axis.Y ? 0:90).rotationY(axis== Direction.Axis.X?90:0).build();
        });
        itemModels().withExistingParent(name(block),modLoc("block/"+name(block)));
    }
    private String name(Block block) {
        return Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();
    }
}
