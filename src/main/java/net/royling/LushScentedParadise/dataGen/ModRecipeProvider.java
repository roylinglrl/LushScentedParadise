package net.royling.LushScentedParadise.dataGen;

import com.google.gson.JsonObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.ModList;
import net.royling.LushScentedParadise.Botania.LSPBotaniaItems;
import net.royling.LushScentedParadise.Item.Flowertea.ModFoods;
import net.royling.LushScentedParadise.Item.coffee.ModCoffee;
import net.royling.LushScentedParadise.Item.milktea.ModMilktea;
import net.royling.LushScentedParadise.ModBlock.newFlower.ModFlowers;
import net.royling.LushScentedParadise.Item.snack.ModSnack;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.Registry.ModBlocks;
import net.royling.LushScentedParadise.Registry.ModItems;
import net.royling.LushScentedParadise.Registry.ModRecipeSerializers;
import net.royling.LushScentedParadise.dataGen.modRecipeBuilder.DryingRecipeBuilder;
import net.royling.LushScentedParadise.dataGen.modRecipeBuilder.TeapotRecipeBuilder;
import net.royling.LushScentedParadise.util.ModTags;

import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings("removal")
public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    public static Item BotaniaItems(String string){
        return BuiltInRegistries.ITEM.get(new ResourceLocation("botania",string));
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        //region
        addDryingRecipe(pWriter,"dried_dandelion", Items.DANDELION, ModItems.DRIED_DANDELION.get(), 600);
        addDryingRecipe(pWriter,"dried_poppy", Items.POPPY, ModItems.DRIED_POPPY.get(), 600);
        addDryingRecipe(pWriter,"dried_orchid", Items.BLUE_ORCHID, ModItems.DRIED_ORCHID.get(), 600);
        addDryingRecipe(pWriter,"dried_tulipr", Items.RED_TULIP, ModItems.DRIED_TULIP.get(), 600);
        addDryingRecipe(pWriter,"dried_tulipo", Items.ORANGE_TULIP, ModItems.DRIED_TULIP.get(), 600);
        addDryingRecipe(pWriter,"dried_tulipp", Items.PINK_TULIP, ModItems.DRIED_TULIP.get(), 600);
        addDryingRecipe(pWriter,"dried_tulipw", Items.WHITE_TULIP, ModItems.DRIED_TULIP.get(), 600);
        addDryingRecipe(pWriter,"dried_oxeye_daisy", Items.OXEYE_DAISY, ModItems.DRIED_OXEYE_DAISY.get(), 600);
        addDryingRecipe(pWriter,"dried_cornflower", Items.CORNFLOWER, ModItems.DRIED_CORNFLOWER.get(), 600);
        addDryingRecipe(pWriter,"dried_lily_of_the_valley", Items.LILY_OF_THE_VALLEY, ModItems.DRIED_LILY_OF_THE_VALLEY.get(), 600);
        addDryingRecipe(pWriter,"dried_lilac", Items.LILAC, ModItems.DRIED_LILAC.get(), 600);
        addDryingRecipe(pWriter,"dried_rose", Items.ROSE_BUSH, ModItems.DRIED_ROSE.get(), 600);
        addDryingRecipe(pWriter,"dried_peony", Items.PEONY, ModItems.DRIED_PEONY.get(), 600);

        addDryingRecipe(pWriter,"dried_violet", ModFlowers.VIOLET_ITEM.get(), ModItems.DRIED_VIOLET.get(), 600);
        addDryingRecipe(pWriter,"dried_hibiscus", ModFlowers.HIBISCUS_ITEM.get(), ModItems.DRIED_HIBISCUS.get(), 600);
        addDryingRecipe(pWriter,"dried_herbaceous_peony", ModFlowers.PEONY_ITEM.get(), ModItems.DRIED_HERBACEOUS_PEONY.get(), 600);
        addDryingRecipe(pWriter,"dried_jasmine", ModFlowers.JASMINE_ITEM.get(), ModItems.DRIED_JASMINE.get(), 600);
        addDryingRecipe(pWriter,"dried_lavender", ModFlowers.LAVENDER_ITEM.get(), ModItems.DRIED_LAVENDER.get(), 600);
        addDryingRecipe(pWriter,"dried_lily", ModFlowers.LILY_ITEM.get(), ModItems.DRIED_LILY.get(), 600);
        addDryingRecipe(pWriter,"dried_safflower", ModFlowers.SAFFLOWER_ITEM.get(), ModItems.DRIED_SAFFLOWER.get(), 600);
        addDryingRecipe(pWriter,"dried_snow_lotus", ModFlowers.SNOW_LOTUS_ITEM.get(), ModItems.DRIED_SNOW_LOTUS.get(), 600);
        addDryingRecipe(pWriter,"dried_marigold", ModFlowers.MARIGOLD_ITEM.get(), ModItems.DRIED_MARIGOLD.get(), 600);
        addDryingRecipe(pWriter,"dried_oenothera_lindheimeri", ModFlowers.OENOTHERA_LINDHEIMERI_ITEM.get(), ModItems.DRIED_OENOTHERA_LINDHEIMERI.get(), 600);
        addDryingRecipe(pWriter,"dried_perilla", ModFlowers.PERILLA_ITEM.get(), ModItems.DRIED_PERILLA.get(), 600);
        addDryingRecipe(pWriter,"dried_honeysuckle", ModFlowers.HONEYSUCKLE_ITEM.get(), ModItems.DRIED_HONEYSUCKLE.get(), 600);

        addDryingRecipe(pWriter,"dried_green_tea_leave", ModFlowers.GREEN_TEA_LEAVE.get(), ModItems.DRIED_GREEN_TEA_LEAVE.get(), 600);
        addDryingRecipe(pWriter,"dried_black_tea_leave", ModFlowers.BLACK_TEA_LEAVE.get(), ModItems.DRIED_BLACK_TEA_LEAVE.get(), 600);
        addDryingRecipe(pWriter,"dried_ginger", ModFlowers.GINGER_ITEM.get(), ModItems.DRIED_GINGER_ITEM.get(), 600);
        addDryingRecipe(pWriter,"dried_white_tea_leave", ModFlowers.WHITE_TEA_LEAVE.get(), ModItems.DRIED_WHITE_TEA_LEAVE.get(), 600);
        addDryingRecipe(pWriter,"dried_oolong_tea_leave", ModFlowers.OOLONG_TEA_LEAVE.get(), ModItems.DRIED_OOLONG_TEA_LEAVE.get(), 600);
        addDryingRecipe(pWriter,"dried_puer_tea_leave", ModFlowers.PUER_TEA_LEAVE.get(), ModItems.DRIED_PUER_TEA_LEAVE.get(), 600);
        addDryingRecipe(pWriter,"dried_mint_leave", ModFlowers.MINT_LEAVE.get(), ModItems.DRIED_MINT_LEAVE.get(), 600);
        addDryingRecipe(pWriter,"dried_licorice_root", ModFlowers.LICORICE_ROOT.get(), ModItems.DRIED_LICORICE_ROOT.get(), 600);
        addDryingRecipe(pWriter,"dried_astragalus_root", ModFlowers.ASTRAGALUS_ROOT.get(), ModItems.DRIED_ASTRAGALUS_ROOT.get(), 600);
        addDryingRecipe(pWriter,"dried_verbena", ModFlowers.VERBENA_ITEM.get(), ModItems.DRIED_VERBENA_ITEM.get(), 600);
        addDryingRecipe(pWriter,"dried_burdock", ModFlowers.BURDOCK_ITEM.get(), ModItems.DRIED_BURDOCK_ITEM.get(), 600);
        addDryingRecipe(pWriter,"dried_kudzu", ModFlowers.KUDZU_ITEM.get(), ModItems.DRIED_KUDZU_ITEM.get(), 600);
        addDryingRecipe(pWriter,"dried_poria", ModFlowers.PORIA_ITEM.get(), ModItems.DRIED_PORIA_ITEM.get(), 600);
        addDryingRecipe(pWriter,"dried_flax", ModFlowers.FLAX_ITEM.get(), ModItems.DRIED_FLAX_ITEM.get(), 600);
        addDryingRecipe(pWriter,"dried_wither_rose", Items.WITHER_ROSE, ModItems.DRIED_WITHER_ROSE.get(), 600);
        addDryingRecipe(pWriter,"dried_spore_blossom", Items.SPORE_BLOSSOM, ModItems.DRIED_SPORE_BLOSSOM.get(), 600);
        addDryingRecipe(pWriter,"dried_cactus", Items.CACTUS, ModItems.DRIED_CACTUS.get(), 600);
        addDryingRecipe(pWriter,"dried_cocoa_beans", Items.COCOA_BEANS, ModItems.DRIED_COCOA_BEANS.get(), 600);
        addDryingRecipe(pWriter,"dried_glow_berries", Items.GLOW_BERRIES, ModItems.DRIED_GLOW_BERRIES.get(), 600);
        addDryingRecipe(pWriter,"dried_sweet_berries", Items.SWEET_BERRIES, ModItems.DRIED_SWEET_BERRIES.get(), 600);
        //endregion
        // 折叠的干燥配方


        if(ModList.get().isLoaded("botania")){
            addDryingRecipe(pWriter, "dried_white_petal", BotaniaItems("white_petal"), LSPBotaniaItems.DRIED_WHITE_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_orange_petal", BotaniaItems("orange_petal"), LSPBotaniaItems.DRIED_ORANGE_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_magenta_petal", BotaniaItems("magenta_petal"), LSPBotaniaItems.DRIED_MAGENTA_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_light_blue_petal", BotaniaItems("light_blue_petal"), LSPBotaniaItems.DRIED_LIGHT_BLUE_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_yellow_petal", BotaniaItems("yellow_petal"), LSPBotaniaItems.DRIED_YELLOW_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_green_petal", BotaniaItems("green_petal"), LSPBotaniaItems.DRIED_GREEN_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_pink_petal", BotaniaItems("pink_petal"), LSPBotaniaItems.DRIED_PINK_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_gray_petal", BotaniaItems("gray_petal"), LSPBotaniaItems.DRIED_GRAY_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_light_gray_petal", BotaniaItems("light_gray_petal"), LSPBotaniaItems.DRIED_LIGHT_GRAY_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_cyan_petal", BotaniaItems("cyan_petal"), LSPBotaniaItems.DRIED_CYAN_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_purple_petal", BotaniaItems("purple_petal"), LSPBotaniaItems.DRIED_PURPLE_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_blue_petal", BotaniaItems("blue_petal"), LSPBotaniaItems.DRIED_BLUE_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_brown_petal", BotaniaItems("brown_petal"), LSPBotaniaItems.DRIED_BROWN_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_red_petal", BotaniaItems("red_petal"), LSPBotaniaItems.DRIED_RED_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_black_petal", BotaniaItems("black_petal"), LSPBotaniaItems.DRIED_BLACK_PETAL.get(), 600);
            addDryingRecipe(pWriter, "dried_lime_petal", BotaniaItems("lime_petal"), LSPBotaniaItems.DRIED_LIME_PETAL.get(), 600);

        }
        //region
        addTeapotRecipe(pWriter,"dandelion_tea",List.of(
                Ingredient.of(ModItems.DRIED_DANDELION.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.DANDELION_TEA.get()),100);
        addTeapotRecipe(pWriter,"poppy_tea",List.of(
                Ingredient.of(ModItems.DRIED_POPPY.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.POPPY_TEA.get()),100);
        addTeapotRecipe(pWriter,"blue_oc_tea",List.of(
                Ingredient.of(ModItems.DRIED_ORCHID.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.BLUE_OC_TEA.get()),100);
        addTeapotRecipe(pWriter,"tulip_tea",List.of(
                Ingredient.of(ModItems.DRIED_TULIP.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.TULIP_TEA.get()),100);
        addTeapotRecipe(pWriter,"oxeye_daisy_tea",List.of(
                Ingredient.of(ModItems.DRIED_OXEYE_DAISY.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.OXEYE_DAISY_TEA.get()),100);
        addTeapotRecipe(pWriter,"cornflower_tea",List.of(
                Ingredient.of(ModItems.DRIED_CORNFLOWER.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.CORNFLOWER_TEA.get()),100);
        addTeapotRecipe(pWriter,"lily_of_the_valley_tea",List.of(
                Ingredient.of(ModItems.DRIED_LILY_OF_THE_VALLEY.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.LILY_OF_THE_VALLEY_TEA.get()),100);
        addTeapotRecipe(pWriter,"lilac_tea",List.of(
                Ingredient.of(ModItems.DRIED_LILAC.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.LILAC_TEA.get()),100);
        addTeapotRecipe(pWriter,"rose_tea",List.of(
                Ingredient.of(ModItems.DRIED_ROSE.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.ROSE_TEA.get()),100);
        addTeapotRecipe(pWriter,"peony_tea",List.of(
                Ingredient.of(ModItems.DRIED_PEONY.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.PEONY_TEA.get()),100);

        addTeapotRecipe(pWriter,"wither_rose_tea",List.of(
                Ingredient.of(ModItems.DRIED_WITHER_ROSE.get()),
                Ingredient.of(ModTags.Items.HONEY)
        ),new ItemStack(ModFoods.WITHER_ROSE_TEA.get()),400);
        addTeapotRecipe(pWriter,"glow_berries_tea",List.of(
                Ingredient.of(ModItems.DRIED_GLOW_BERRIES.get()),
                Ingredient.of(ModItems.DRIED_GLOW_BERRIES.get()),
                Ingredient.of(ModItems.MILK.get())
        ),new ItemStack(ModFoods.GLOW_BERRIES_TEA.get()),200);
        addTeapotRecipe(pWriter,"sweet_rose_tea",List.of(
                Ingredient.of(ModItems.DRIED_SWEET_BERRIES.get()),
                Ingredient.of(ModItems.DRIED_SWEET_BERRIES.get()),
                Ingredient.of(ModItems.DRIED_SWEET_BERRIES.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.SWEET_BERRIES_TEA.get()),200);
        addTeapotRecipe(pWriter,"chorus_tea",List.of(
                Ingredient.of(Items.CHORUS_FRUIT),
                Ingredient.of(ModItems.MILK.get())
        ),new ItemStack(ModFoods.CHORUS_TEA.get()),100);
        addTeapotRecipe(pWriter,"fern_tea",List.of(
                Ingredient.of(Items.FERN),
                Ingredient.of(Items.SUGAR),
                Ingredient.of(ModTags.Items.HONEY)
        ),new ItemStack(ModFoods.FERN_TEA.get()),50);
        addTeapotRecipe(pWriter,"spore_blossom_tea",List.of(
                Ingredient.of(ModItems.DRIED_SPORE_BLOSSOM.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.SPORE_BLOSSOM_TEA.get()),100);
        addTeapotRecipe(pWriter,"cactus_tea",List.of(
                Ingredient.of(ModItems.DRIED_CACTUS.get()),
                Ingredient.of(ModTags.Items.HONEY),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.CACTUS_TEA.get()),200);
        addTeapotRecipe(pWriter,"hot_cocoa",List.of(
                Ingredient.of(ModItems.COCOA_POWDER.get()),
                Ingredient.of(ModItems.COCOA_POWDER.get()),
                Ingredient.of(Items.SUGAR),
                Ingredient.of(ModTags.Items.HONEY)
        ),new ItemStack(ModFoods.HOT_COCOA.get()),400);



        addTeapotRecipe(pWriter,"green_tea",List.of(
                Ingredient.of(ModItems.DRIED_GREEN_TEA_LEAVE.get()),
                Ingredient.of(ModItems.DRIED_GREEN_TEA_LEAVE.get())
        ),new ItemStack(ModFoods.GREEN_TEA.get()),200);
        addTeapotRecipe(pWriter,"black_tea",List.of(
                Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get()),
                Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get())
        ),new ItemStack(ModFoods.BLACK_TEA.get()),200);
        addTeapotRecipe(pWriter,"white_tea",List.of(
                Ingredient.of(ModItems.DRIED_WHITE_TEA_LEAVE.get()),
                Ingredient.of(ModItems.DRIED_WHITE_TEA_LEAVE.get())
        ),new ItemStack(ModFoods.WHITE_TEA.get()),200);
        addTeapotRecipe(pWriter,"oolong_tea",List.of(
                Ingredient.of(ModItems.DRIED_OOLONG_TEA_LEAVE.get()),
                Ingredient.of(ModItems.DRIED_OOLONG_TEA_LEAVE.get())
        ),new ItemStack(ModFoods.OOLONG_TEA.get()),200);
        addTeapotRecipe(pWriter,"puer_tea",List.of(
                Ingredient.of(ModItems.DRIED_PUER_TEA_LEAVE.get()),
                Ingredient.of(ModItems.DRIED_PUER_TEA_LEAVE.get())
        ),new ItemStack(ModFoods.PUER_TEA.get()),200);
        addTeapotRecipe(pWriter,"mint_tea",List.of(
                Ingredient.of(ModItems.DRIED_MINT_LEAVE.get()),
                Ingredient.of(ModItems.DRIED_MINT_LEAVE.get())
        ),new ItemStack(ModFoods.MINT_TEA.get()),150);

        addTeapotRecipe(pWriter,"ginger_tea",List.of(
                Ingredient.of(ModItems.DRIED_GINGER_ITEM.get()),
                Ingredient.of(ModItems.DRIED_GINGER_ITEM.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.GINGER_SOUP.get()),400);
        addTeapotRecipe(pWriter,"honeysuckle_tea",List.of(
                Ingredient.of(ModItems.DRIED_HONEYSUCKLE.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.HONEYSUCKLE_TEA.get()),100);
        addTeapotRecipe(pWriter,"violet_tea",List.of(
                Ingredient.of(ModItems.DRIED_VIOLET.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.VIOLET_TEA.get()),100);
        addTeapotRecipe(pWriter,"hibiscus_tea",List.of(
                Ingredient.of(ModItems.DRIED_HIBISCUS.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.HIBISCUS_TEA.get()),100);
        addTeapotRecipe(pWriter,"herbaceous_peony_tea",List.of(
                Ingredient.of(ModItems.DRIED_HERBACEOUS_PEONY.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.HERBACEOUS_PEONY_TEA.get()),100);
        addTeapotRecipe(pWriter,"jasmine_tea",List.of(
                Ingredient.of(ModItems.DRIED_JASMINE.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.JASMINE_TEA.get()),100);
        addTeapotRecipe(pWriter,"lavender_tea",List.of(
                Ingredient.of(ModItems.DRIED_LAVENDER.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.LAVENDER_TEA.get()),100);
        addTeapotRecipe(pWriter,"lily_tea",List.of(
                Ingredient.of(ModItems.DRIED_LILY.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.LILY_TEA.get()),100);
        addTeapotRecipe(pWriter,"safflower_tea",List.of(
                Ingredient.of(ModItems.DRIED_SAFFLOWER.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.SAFFLOWER_TEA.get()),100);
        addTeapotRecipe(pWriter,"snow_lotus_tea",List.of(
                Ingredient.of(ModItems.DRIED_SNOW_LOTUS.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.SNOW_LOTUS_TEA.get()),100);
        addTeapotRecipe(pWriter,"marigold_tea",List.of(
                Ingredient.of(ModItems.DRIED_MARIGOLD.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.MARIGOLD_TEA.get()),100);
        addTeapotRecipe(pWriter,"oenothera_lindheimeri_tea",List.of(
                Ingredient.of(ModItems.DRIED_OENOTHERA_LINDHEIMERI.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.OENOTHERA_TEA.get()),100);
        addTeapotRecipe(pWriter,"perilla_tea",List.of(
                Ingredient.of(ModItems.DRIED_PERILLA.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.PERILLA_TEA.get()),100);
        addTeapotRecipe(pWriter,"licorice_root_tea",List.of(
                Ingredient.of(ModItems.DRIED_LICORICE_ROOT.get()),
                Ingredient.of(ModItems.DRIED_LICORICE_ROOT.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.LICORICE_SOUP.get()),400);
        addTeapotRecipe(pWriter,"astragalus_root_tea",List.of(
                Ingredient.of(ModItems.DRIED_ASTRAGALUS_ROOT.get()),
                Ingredient.of(ModItems.DRIED_ASTRAGALUS_ROOT.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.ASTRAGALUS_SOUP.get()),400);
        addTeapotRecipe(pWriter,"verbena_tea",List.of(
                Ingredient.of(ModItems.DRIED_VERBENA_ITEM.get()),
                Ingredient.of(ModItems.DRIED_VERBENA_ITEM.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.VERBENA_TEA.get()),400);
        addTeapotRecipe(pWriter,"burdock_tea",List.of(
                Ingredient.of(ModItems.DRIED_BURDOCK_ITEM.get()),
                Ingredient.of(ModItems.DRIED_BURDOCK_ITEM.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.BURDOCK_SOUP.get()),400);

        addTeapotRecipe(pWriter,"kudzu_tea",List.of(
                Ingredient.of(ModItems.DRIED_KUDZU_ITEM.get()),
                Ingredient.of(ModItems.DRIED_KUDZU_ITEM.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.KUDZU_SOUP.get()),400);

        addTeapotRecipe(pWriter,"poria_tea",List.of(
                Ingredient.of(ModItems.DRIED_PORIA_ITEM.get()),
                Ingredient.of(ModItems.DRIED_PORIA_ITEM.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.PORIA_TEA.get()),400);

        addTeapotRecipe(pWriter,"flax_tea",List.of(
                Ingredient.of(ModItems.DRIED_FLAX_ITEM.get()),
                Ingredient.of(ModItems.DRIED_FLAX_ITEM.get()),
                Ingredient.of(Items.SUGAR)
        ),new ItemStack(ModFoods.FLAX_TEA.get()),400);





        addTeapotRecipe(pWriter,"saprkling_matcha", List.of(
                        Ingredient.of(ModItems.DRIED_GLOW_BERRIES.get()),
                        Ingredient.of(Items.GLISTERING_MELON_SLICE),
                        Ingredient.of(Items.GLOW_INK_SAC),
                        Ingredient.of(ModTags.Items.TEA_LEAVES)
                ), new ItemStack(ModFoods.SPARKLING_MATCHA.get()),450);

        addTeapotRecipe(pWriter,"mint_honey_special_drink", List.of(
                Ingredient.of(ModTags.Items.HONEY),
                Ingredient.of(ModItems.DRIED_MINT_LEAVE.get()),
                Ingredient.of(ModItems.DRIED_OXEYE_DAISY.get()),
                Ingredient.of(Items.SUGAR)
        ), new ItemStack(ModFoods.MINT_HONEY_SPECIAL_DRINK.get()),200);

        addTeapotRecipe(pWriter,"ginger_honey_black_tea", List.of(
                Ingredient.of(ModTags.Items.HONEY),
                Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get()),
                Ingredient.of(ModItems.DRIED_CORNFLOWER.get()),
                Ingredient.of(ModItems.DRIED_GINGER_ITEM.get())
        ), new ItemStack(ModFoods.GINGER_HONEY_BLACK_TEA.get()),400);

        addTeapotRecipe(pWriter,"oolong_apple_honey_special_drink", List.of(
                Ingredient.of(ModItems.DRIED_OOLONG_TEA_LEAVE.get()),
                Ingredient.of(ModTags.Items.HONEY),
                Ingredient.of(ModItems.DRIED_OENOTHERA_LINDHEIMERI.get()),
                Ingredient.of(Items.APPLE)
        ), new ItemStack(ModFoods.OOLONG_APPLE_HONEY_SPECIAL_DRINK.get()),400);

        addTeapotRecipe(pWriter,"nether_flavor", List.of(
                Ingredient.of(Items.NETHER_WART),
                Ingredient.of(Items.GOLD_NUGGET),
                Ingredient.of(Items.CRIMSON_FUNGUS),
                Ingredient.of(Items.WARPED_FUNGUS)
        ), new ItemStack(ModFoods.NETHER_FLAVOR.get()),400);

        addTeapotRecipe(pWriter,"ender_flavor", List.of(
                Ingredient.of(ModTags.Items.HONEY),
                Ingredient.of(Items.CHORUS_FRUIT),
                Ingredient.of(ModItems.MILK.get()),
                Ingredient.of(ModItems.DRIED_PERILLA.get())
        ), new ItemStack(ModFoods.ENDER_FLAVOR.get()),400);

        addTeapotRecipe(pWriter,"horror_soup", List.of(
                Ingredient.of(ModFoods.WITHER_ROSE_TEA.get()),
                Ingredient.of(Items.BONE),
                Ingredient.of(Items.ROTTEN_FLESH),
                Ingredient.of(Items.SPIDER_EYE)
        ), new ItemStack(ModFoods.HORROR_SOUP.get()),2000);

        addTeapotRecipe(pWriter,"explosive_ginger_soup", List.of(
                Ingredient.of(ModItems.DRIED_GINGER_ITEM.get()),
                Ingredient.of(Items.FLINT),
                Ingredient.of(Items.GUNPOWDER),
                Ingredient.of(ItemTags.COALS)
        ), new ItemStack(ModFoods.EXPLOSIVE_GINGER_SOUP.get()),600);

        addTeapotRecipe(pWriter,"chocolate_lily_tea", List.of(
                Ingredient.of(ModItems.DRIED_LILY.get()),
                Ingredient.of(ModTags.Items.HONEY),
                Ingredient.of(ModItems.COCOA_POWDER.get()),
                Ingredient.of(ModItems.MILK.get())
        ), new ItemStack(ModFoods.CHOCOLATE_LILY_TEA.get()),1000);

        addTeapotRecipe(pWriter,"watermelon_mint_special_drink", List.of(
                Ingredient.of(Items.MELON_SLICE),
                Ingredient.of(ModItems.DRIED_MINT_LEAVE.get()),
                Ingredient.of(Items.ICE),
                Ingredient.of(Items.SUGAR)
        ), new ItemStack(ModFoods.WATERMELON_MINT_SPECIAL_DRINK.get()),100);

        addTeapotRecipe(pWriter,"rose_apple_tea", List.of(
                Ingredient.of(ModItems.DRIED_ROSE.get()),
                Ingredient.of(ModTags.Items.TEA_LEAVES),
                Ingredient.of(Items.APPLE),
                Ingredient.of(Items.SUGAR)
        ), new ItemStack(ModFoods.ROSE_APPLE_TEA.get()),100);


        addTeapotRecipe(pWriter,"fire_hibiscus_tea", List.of(
                Ingredient.of(Items.BLAZE_POWDER),
                Ingredient.of(ModItems.DRIED_HIBISCUS.get()),
                Ingredient.of(Items.SUGAR),
                Ingredient.of(Items.TORCHFLOWER)
        ), new ItemStack(ModFoods.FIRE_HIBISCUS_TEA.get()),200);

        addTeapotRecipe(pWriter,"legendary_chinese_medicine", List.of(
                Ingredient.of(ModItems.DRIED_LICORICE_ROOT.get()),
                Ingredient.of(ModItems.DRIED_ASTRAGALUS_ROOT.get()),
                Ingredient.of(ModItems.DRIED_KUDZU_ITEM.get()),
                Ingredient.of(ModItems.DRIED_PORIA_ITEM.get())
        ), new ItemStack(ModFoods.LEGENDARY_CHINESE_MEDICINE.get()),600);

        addTeapotRecipe(pWriter,"bak_kut_geh", List.of(
                Ingredient.of(ModFoods.LEGENDARY_CHINESE_MEDICINE.get()),
                Ingredient.of(Items.BONE),
                Ingredient.of(Items.PORKCHOP),
                Ingredient.of(Items.CARROT)
        ), new ItemStack(ModFoods.BAK_KUT_TEH.get()),600);

        addTeapotRecipe(pWriter,"brilliant_amethyst_drink", List.of(
                Ingredient.of(Items.AMETHYST_SHARD),
                Ingredient.of(ModItems.MILK.get()),
                Ingredient.of(ModItems.DRIED_VIOLET.get()),
                Ingredient.of(ModTags.Items.HONEY)
        ), new ItemStack(ModFoods.BRILLIANT_AMETHYST_DRINK.get()),200);

        addTeapotRecipe(pWriter,"golden_soup", List.of(
                Ingredient.of(Items.GOLDEN_CARROT),
                Ingredient.of(Items.GLISTERING_MELON_SLICE),
                Ingredient.of(ModItems.DRIED_MARIGOLD.get()),
                Ingredient.of(Items.GOLD_INGOT)
        ), new ItemStack(ModFoods.GOLDEN_SOUP.get()),200);

        addTeapotRecipe(pWriter,"supreme_golden_tea", List.of(
                Ingredient.of(Items.GOLDEN_APPLE),
                Ingredient.of(ModTags.Items.HONEY),
                Ingredient.of(ModItems.DRIED_SNOW_LOTUS.get()),
                Ingredient.of(Items.GOLD_INGOT)
        ), new ItemStack(ModFoods.SUPREME_GOLDEN_TEA.get()),1000);

        addTeapotRecipe(pWriter,"enchanted_supreme_golden_tea", List.of(
                Ingredient.of(Items.ENCHANTED_GOLDEN_APPLE),
                Ingredient.of(ModTags.Items.HONEY),
                Ingredient.of(ModItems.DRIED_SNOW_LOTUS.get()),
                Ingredient.of(Items.GOLD_BLOCK)
        ), new ItemStack(ModFoods.ENCHANTED_SUPREME_GOLDEN_TEA.get()),2000);

        addTeapotRecipe(pWriter,"ocean_journey", List.of(
                Ingredient.of(Items.KELP),
                Ingredient.of(Items.ICE),
                Ingredient.of(Items.NAUTILUS_SHELL),
                Ingredient.of(ModTags.Items.HONEY)
        ), new ItemStack(ModFoods.OCEAN_JOURNEY.get()),100);

        addTeapotRecipe(pWriter,"extremely_cold_condensed_milk_scented_tea", List.of(
                Ingredient.of(ModItems.DRIED_SNOW_LOTUS.get()),
                Ingredient.of(ModItems.MILK.get()),
                Ingredient.of(Items.ICE),
                Ingredient.of(ModTags.Items.HONEY)
        ), new ItemStack(ModFoods.EXTREMELY_COLD_CONDENSED_MILK_SCENTED_TEA.get()),60);

        addTeapotRecipe(pWriter,"axolotl_tea", List.of(
                Ingredient.of(Items.TROPICAL_FISH),
                Ingredient.of(Items.KELP),
                Ingredient.of(ModTags.Items.HONEY),
                Ingredient.of(ModItems.DRIED_LAVENDER.get())
        ), new ItemStack(ModFoods.AXOLOTL_TEA.get()),200);

        addTeapotRecipe(pWriter,"flower_party", List.of(
                Ingredient.of(ModItems.DRIED_HIBISCUS.get()),
                Ingredient.of(ModItems.DRIED_HONEYSUCKLE.get()),
                Ingredient.of(ModItems.DRIED_ROSE.get()),
                Ingredient.of(ModItems.DRIED_LAVENDER.get())
        ), new ItemStack(ModFoods.FLOWER_PARTY.get()),200);

        addTeapotRecipe(pWriter,"scarlet_margarita", List.of(
                Ingredient.of(Items.REDSTONE),
                Ingredient.of(Items.BLAZE_POWDER),
                Ingredient.of(Items.GLOWSTONE_DUST),
                Ingredient.of(ModItems.DRIED_LAVENDER.get())
        ), new ItemStack(ModFoods.SCARLET_MARGARITA.get()),200);

        addTeapotRecipe(pWriter,"strong_mouth_mushroom_tea", List.of(
                Ingredient.of(Items.RED_MUSHROOM),
                Ingredient.of(Items.BLAZE_POWDER),
                Ingredient.of(ModItems.DRIED_GREEN_TEA_LEAVE.get()),
                Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get())
        ), new ItemStack(ModFoods.STRONG_MOUTH_MUSHROOM_TEA.get()),200);
        addTeapotRecipe(pWriter,"lava_special_drink", List.of(
                Ingredient.of(Items.MAGMA_CREAM),
                Ingredient.of(Items.NETHER_WART),
                Ingredient.of(ModItems.DRIED_SAFFLOWER.get()),
                Ingredient.of(ModItems.DRIED_GINGER_ITEM.get())
        ), new ItemStack(ModFoods.LAVA_SPECIAL_DRINK.get()),200);

        addTeapotRecipe(pWriter,"coral_mint_sparkling_water", List.of(
                Ingredient.of(ModItems.DRIED_MINT_LEAVE.get()),
                Ingredient.of(ModTags.Items.TEA_LEAVES),
                Ingredient.of(Items.SUGAR),
                Ingredient.of(Items.ICE)
        ), new ItemStack(ModFoods.CORAL_MINT_SPARKLING_WATER.get()),200);

        addTeapotRecipe(pWriter,"mixed_berry_smoothie", List.of(
                Ingredient.of(ModItems.DRIED_SWEET_BERRIES.get()),
                Ingredient.of(ModItems.DRIED_GLOW_BERRIES.get()),
                Ingredient.of(ModTags.Items.HONEY),
                Ingredient.of(Items.ICE)
        ), new ItemStack(ModFoods.MIXED_BERRY_SMOOTHIE.get()),200);

        addTeapotRecipe(pWriter,"milk_mushroom_soup", List.of(
                Ingredient.of(Items.BROWN_MUSHROOM),
                Ingredient.of(ModItems.MILK.get()),
                Ingredient.of(Items.CARROT),
                Ingredient.of(Items.BEETROOT)
        ), new ItemStack(ModFoods.MILK_MUSHROOM_SOUP.get()),200);

        addTeapotRecipe(pWriter,"the_tide_is_coming", List.of(
                Ingredient.of(Items.PUFFERFISH),
                Ingredient.of(Items.PRISMARINE_SHARD),
                Ingredient.of(Items.SCUTE),
                Ingredient.of(Items.KELP)
        ), new ItemStack(ModFoods.THE_TIDE_IS_COMING.get()),200);

        addTeapotRecipe(pWriter,"oenothera_lindheimeri_phantom", List.of(
                Ingredient.of(ModItems.DRIED_OENOTHERA_LINDHEIMERI.get()),
                Ingredient.of(Items.SUGAR),
                Ingredient.of(Items.PHANTOM_MEMBRANE),
                Ingredient.of(Items.CHORUS_FRUIT)
        ), new ItemStack(ModFoods.OENOTHERA_LINDHEIMERI_PHANTOM.get()),200);

        addTeapotRecipe(pWriter,"turtle_shell_lily_tea", List.of(
                Ingredient.of(ModItems.DRIED_LILY.get()),
                Ingredient.of(ModItems.DRIED_JASMINE.get()),
                Ingredient.of(ModItems.DRIED_LILY_OF_THE_VALLEY.get()),
                Ingredient.of(Items.SCUTE)
        ), new ItemStack(ModFoods.TURTLE_SHELL_LILY_TEA.get()),200);

        addTeapotRecipe(pWriter,"the_evokers_wrath", List.of(
                Ingredient.of(Items.EMERALD),
                Ingredient.of(Items.IRON_SWORD),
                Ingredient.of(ModItems.DRIED_SAFFLOWER.get()),
                Ingredient.of(ItemTags.WOOL)
        ), new ItemStack(ModFoods.THE_EVOKERS_WRATH.get()),200);

        addTeapotRecipe(pWriter,"the_devils_call", List.of(
                Ingredient.of(ModItems.DRIED_WITHER_ROSE.get()),
                Ingredient.of(ModItems.DRIED_LILY_OF_THE_VALLEY.get()),
                Ingredient.of(ModItems.DRIED_HERBACEOUS_PEONY.get()),
                Ingredient.of(Items.PUFFERFISH)
        ), new ItemStack(ModFoods.THE_DEVILS_CALL.get()),200);

        addTeapotRecipe(pWriter,"star_silver_potion", List.of(
                Ingredient.of(ModItems.STAR_SILVER_FLOWER_CROP.get()),
                Ingredient.of(ModItems.STAR_SILVER_INGOT.get()),
                Ingredient.of(ModItems.DRIED_LILY.get()),
                Ingredient.of(Items.SUGAR)
        ), new ItemStack(ModFoods.STAR_SILVER_POTION.get()),400);

        addTeapotRecipe(pWriter,"abyssal_brew", List.of(
                Ingredient.of(ModItems.DRIED_ABYSS_SILENCE_MUSHROOM.get()),
                Ingredient.of(ModItems.DRIED_LILY_OF_THE_VALLEY.get()),
                Ingredient.of(ModItems.PHANTOM_LOTUS_KOI.get()),
                Ingredient.of(Items.SUGAR)
        ), new ItemStack(ModFoods.ABYSSAL_BREW.get()),600);

        addTeapotRecipe(pWriter,"celestial_extract", List.of(
                Ingredient.of(ModItems.DRIED_ABYSS_SILENCE_MUSHROOM.get()),
                Ingredient.of(ModItems.STAR_SILVER_FLOWER_CROP.get()),
                Ingredient.of(ModItems.VANILLA_SYRUP.get()),
                Ingredient.of(ModItems.GLOWPETAL_PIGFISH.get())
        ), new ItemStack(ModFoods.CELESTIAL_EXTRACT.get()),200);


        //折叠的煮茶配方
        addTeapotRecipe(pWriter,"vanilla_syrup",List.of(Ingredient.of(ModItems.DRIED_VANILLA_POD.get()),Ingredient.of(Items.SUGAR),Ingredient.of(Items.SUGAR)),new ItemStack(ModItems.VANILLA_SYRUP.get()),600);

        addTeapotRecipe(pWriter,"espresso",List.of(Ingredient.of(ModItems.COFFEE_POWDER.get())),new ItemStack(ModCoffee.ESPRESSO.get()),600);
        addTeapotRecipe(pWriter,"triespresso",List.of(Ingredient.of(ModItems.COFFEE_POWDER.get()),Ingredient.of(ModItems.COFFEE_POWDER.get()),Ingredient.of(ModItems.COFFEE_POWDER.get())),new ItemStack(ModCoffee.TRIESPRESSO.get()),900);
        addTeapotRecipe(pWriter,"americano",List.of(Ingredient.of(ModItems.COFFEE_POWDER.get()),Ingredient.of(ModItems.CLEAN_WATER.get())),new ItemStack(ModCoffee.AMERICANO.get()),600);
        addTeapotRecipe(pWriter,"cappuccino",List.of(Ingredient.of(ModItems.COFFEE_POWDER.get()),Ingredient.of(ModItems.MILK_FOAM.get()),Ingredient.of(ModItems.MILK.get())),new ItemStack(ModCoffee.CAPPUCCINO.get()),600);
        addTeapotRecipe(pWriter,"latte",List.of(Ingredient.of(ModItems.COFFEE_POWDER.get()),Ingredient.of(ModItems.MILK_FOAM.get()),Ingredient.of(ModItems.MILK.get()),Ingredient.of(ModItems.MILK.get())),new ItemStack(ModCoffee.LATTE.get()),600);

        addTeapotRecipe(pWriter,"mocha",List.of(Ingredient.of(ModItems.COFFEE_POWDER.get()),Ingredient.of(ModItems.MILK_FOAM.get()),Ingredient.of(ModItems.COCOA_POWDER.get())),new ItemStack(ModCoffee.MOCHA.get()),600);
        addTeapotRecipe(pWriter,"caramel_macchiato",List.of(Ingredient.of(ModItems.COFFEE_POWDER.get()),Ingredient.of(ModItems.VANILLA_SYRUP.get()),Ingredient.of(ModItems.MILK.get()),Ingredient.of(Items.SUGAR)),new ItemStack(ModCoffee.CARAMEL_MACCHIATO.get()),600);
        addTeapotRecipe(pWriter,"iced_americano",List.of(Ingredient.of(ModItems.COFFEE_POWDER.get()),Ingredient.of(Items.ICE),Ingredient.of(ModItems.CLEAN_WATER.get())),new ItemStack(ModCoffee.ICED_AMERICANO.get()),600);
        addTeapotRecipe(pWriter,"cold_brew",List.of(Ingredient.of(ModItems.COFFEE_POWDER.get()),Ingredient.of(Items.ICE)),new ItemStack(ModCoffee.COLD_BREW.get()),1200);

        addTeapotRecipe(pWriter,"jasmine_coffee",List.of(Ingredient.of(ModItems.COFFEE_POWDER.get()),Ingredient.of(ModItems.DRIED_JASMINE.get()),Ingredient.of(ModItems.MILK.get())),new ItemStack(ModCoffee.JASMINE_COFFEE.get()),600);

        addTeapotRecipe(pWriter,"tradition_milktea",
                List.of(Ingredient.of(ModItems.MILK.get()),Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get())),
                new ItemStack(ModMilktea.TRADITION_MILKTEA.get()),600);

        addTeapotRecipe(pWriter, "hkstyle_silkstocking_milktea",
                List.of(Ingredient.of(ModItems.MILK.get()), Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get()), Ingredient.of(ModItems.MILK_FOAM.get())),
                new ItemStack(ModMilktea.HKSTYLE_SILKSTOCKING_MILKTEA.get()), 800);

        addTeapotRecipe(pWriter, "milk_cap_milktea",
                List.of(Ingredient.of(ModItems.MILK.get()), Ingredient.of(ModItems.DRIED_GREEN_TEA_LEAVE.get()), Ingredient.of(ModItems.CREAM.get())),
                new ItemStack(ModMilktea.MILK_CAP_MILKTEA.get()), 600);

        addTeapotRecipe(pWriter, "pudding_milktea",
                List.of(Ingredient.of(ModItems.MILK.get()), Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get()), Ingredient.of(ModSnack.PUDDING.get())),
                new ItemStack(ModMilktea.PUDDING_MILKTEA.get()), 700);

        addTeapotRecipe(pWriter, "brownsugar_milktea",
                List.of(Ingredient.of(ModItems.MILK.get()), Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get()), Ingredient.of(Items.SUGAR),Ingredient.of(Items.SUGAR)),
                new ItemStack(ModMilktea.BROWNSUGAR_MILKTEA.get()), 650);

        addTeapotRecipe(pWriter, "chocolate_milktea",
                List.of(Ingredient.of(ModItems.MILK.get()), Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get()), Ingredient.of(ModItems.COCOA_POWDER.get())),
                new ItemStack(ModMilktea.CHOCOLATE_MILKTEA.get()), 650);

        addTeapotRecipe(pWriter, "jasmine_oolong_milktea",
                List.of(Ingredient.of(ModItems.MILK.get()), Ingredient.of(ModItems.DRIED_OOLONG_TEA_LEAVE.get()), Ingredient.of(ModItems.DRIED_JASMINE.get())),
                new ItemStack(ModMilktea.JASMINE_OOLONG_MILKTEA.get()), 700);

        addTeapotRecipe(pWriter, "rose_blacktea_milktea",
                List.of(Ingredient.of(ModItems.MILK.get()), Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get()), Ingredient.of(ModItems.DRIED_ROSE.get())),
                new ItemStack(ModMilktea.ROSE_BLACKTEA_MILKTEA.get()), 750);

        addTeapotRecipe(pWriter, "vanilla_milktea",
                List.of(Ingredient.of(ModItems.MILK.get()), Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get()), Ingredient.of(ModItems.DRIED_VANILLA_POD.get())),
                new ItemStack(ModMilktea.VANILLA_MILKTEA.get()), 700);

        addTeapotRecipe(pWriter, "ginger_milktea",
                List.of(Ingredient.of(ModItems.MILK.get()), Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get()), Ingredient.of(ModItems.GINGER_POWDER.get())),
                new ItemStack(ModMilktea.GINGER_MILKTEA.get()), 650);

        addTeapotRecipe(pWriter, "lavender_milktea",
                List.of(Ingredient.of(ModItems.MILK.get()), Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get()), Ingredient.of(ModItems.DRIED_LAVENDER.get())),
                new ItemStack(ModMilktea.LAVENDER_MILKTEA.get()), 750);

        addTeapotRecipe(pWriter, "coffee_milktea",
                List.of(Ingredient.of(ModItems.MILK.get()), Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get()), Ingredient.of(ModItems.COFFEE_POWDER.get())),
                new ItemStack(ModMilktea.COFFEE_MILKTEA.get()), 800);

        addTeapotRecipe(pWriter, "glow_berries_milktea",
                List.of(Ingredient.of(ModItems.MILK.get()), Ingredient.of(ModItems.DRIED_GREEN_TEA_LEAVE.get()), Ingredient.of(Items.GLOW_BERRIES)),
                new ItemStack(ModMilktea.GLOW_BERRIES_MILKTEA.get()), 750);

        addTeapotRecipe(pWriter, "violet_milktea",
                List.of(Ingredient.of(ModItems.MILK.get()), Ingredient.of(ModItems.DRIED_BLACK_TEA_LEAVE.get()), Ingredient.of(ModItems.DRIED_VIOLET.get())),
                new ItemStack(ModMilktea.VIOLET_MILKTEA.get()), 750);
//endregion

        addShapelessRecipe(pWriter,"coffee_beans",ModItems.COFFEE_BEANS.get(),1,ModItems.COFFEE_FRUIT.get());
        addShapelessRecipe(pWriter,"milk_foam",ModItems.MILK_FOAM.get(),1,ModItems.MILK.get(),ModItems.MORTAR_AND_PESTLE.get());
        addShapelessRecipe(pWriter,"coffee_powder",ModItems.COFFEE_POWDER.get(),1,ModItems.DRIED_COFFEE_BEANS.get(),ModItems.DRIED_COFFEE_BEANS.get(),ModItems.DRIED_COFFEE_BEANS.get(),ModItems.DRIED_COFFEE_BEANS.get(),ModItems.MORTAR_AND_PESTLE.get());
        addDryingRecipe(pWriter,"dried_coffee_beans",ModItems.COFFEE_BEANS.get(),ModItems.DRIED_COFFEE_BEANS.get(),1200);
        addDryingRecipe(pWriter,"dried_vanilla_pod",ModItems.VANILLA_POD.get(),ModItems.DRIED_VANILLA_POD.get(),600);
        addDryingRecipe(pWriter,"dried_abyss_silence_mushroom",ModItems.ABYSS_SILENCE_MUSHROOM.get(),ModItems.DRIED_ABYSS_SILENCE_MUSHROOM.get(),600);
        addShapelessRecipe(pWriter,"cream",ModItems.CREAM.get(),1,ModItems.MILK_FOAM.get(),ModItems.MORTAR_AND_PESTLE.get());
        addShapelessRecipe(pWriter,"butter",ModItems.BUTTER.get(),1,ModItems.CREAM.get(),ModItems.MORTAR_AND_PESTLE.get());
        addShapelessRecipe(pWriter,"ginger_powder",ModItems.GINGER_POWDER.get(),1,ModItems.DRIED_GINGER_ITEM.get(),ModItems.MORTAR_AND_PESTLE.get());
        addShapelessRecipe(pWriter,"gingerbread_man",ModItems.GINGERBREAD_MAN.get(),1,ModItems.GINGER_POWDER.get(),Items.WHEAT,Items.SUGAR,Items.EGG,ModItems.BUTTER.get());
        addShapelessRecipe(pWriter,"chocolate",ModItems.CHOCOLATE.get(),2,ModItems.COCOA_POWDER.get(),ModItems.COCOA_POWDER.get(),Items.SUGAR,ModItems.MILK_FOAM.get(),ModItems.VANILLA_SYRUP.get());
        addShapelessRecipe(pWriter,"macaron", ModSnack.MACARON.get(),4,ModItems.COCOA_POWDER.get(),Items.EGG,Items.SUGAR,ModItems.VANILLA_SYRUP.get(),ModItems.DRIED_HIBISCUS.get());
        addShapelessRecipe(pWriter,"vanilla_whipped_cream", ModSnack.VANILLA_WHIPPED_CREAM.get(),1,ModItems.CREAM.get(),Items.SUGAR,ModItems.VANILLA_SYRUP.get());
        addShapelessRecipe(pWriter,"vanilla_ice_cream", ModSnack.VANILLA_ICE_CREAM.get(),1,ModItems.CREAM.get(),Items.SUGAR,ModItems.DRIED_VANILLA_POD.get(),Items.EGG);
        addShapelessRecipe(pWriter,"pudding", ModSnack.PUDDING.get(),1,ModItems.MILK.get(),Items.SUGAR,Items.EGG,Items.EGG);
        addShapelessRecipe(pWriter,"hibiscus_dye",Items.PINK_DYE,1,ModFlowers.HIBISCUS.get());
        addShapelessRecipe(pWriter,"jasmine_dye",Items.WHITE_DYE,1,ModFlowers.JASMINE.get());
        addShapelessRecipe(pWriter,"lavender_dye",Items.PURPLE_DYE,1,ModFlowers.LAVENDER.get());
        addShapelessRecipe(pWriter,"lily_dye",Items.WHITE_DYE,1,ModFlowers.LILY.get());
        addShapelessRecipe(pWriter,"marigold_dye",Items.LIGHT_GRAY_DYE,1,ModFlowers.MARIGOLD.get());
        addShapelessRecipe(pWriter,"oenothrea_dye",Items.LIGHT_GRAY_DYE,1,ModFlowers.OENOTHERA_LINDHEIMERI.get());
        addShapelessRecipe(pWriter,"peony_dye",Items.MAGENTA_DYE,1,ModFlowers.PEONY.get());
        addShapelessRecipe(pWriter,"perilla_dye",Items.PURPLE_DYE,1,ModFlowers.PERILLA.get());
        addShapelessRecipe(pWriter,"safflower_dye",Items.YELLOW_DYE,1,ModFlowers.SAFFLOWER.get());
        addShapelessRecipe(pWriter,"snow_lotus_dye",Items.WHITE_DYE,1,ModFlowers.SNOW_LOTUS.get());
        addShapelessRecipe(pWriter,"violet_dye",Items.PURPLE_DYE,1,ModFlowers.VIOLET.get());
        addShapelessRecipe(pWriter,"coffee_dye",Items.BROWN_DYE,1,ModItems.DRIED_COFFEE_BEANS.get());
        addShapelessRecipe(pWriter,"vanilla_seeds",ModItems.VANILLA_SEEDS.get(),1,ModItems.VANILLA_POD.get());
        addShapelessRecipe(pWriter,"ice_black_tea",ModFoods.ICE_BLACK_TEA.get(),1,ModFoods.BLACK_TEA.get(),Items.ICE,Items.SUGAR);

        addShapelessRecipe(pWriter,"star_silver_flower_powder",ModItems.STAR_SILVER_FLOWER_POWDER.get(),1,ModItems.STAR_SILVER_FLOWER_CROP.get(),ModItems.MORTAR_AND_PESTLE.get());
        addShapelessRecipe(pWriter,"abyss_mushroom_powder",ModItems.ABYSS_MUSHROOM_POWDER.get(),1,ModItems.DRIED_ABYSS_SILENCE_MUSHROOM.get(),ModItems.MORTAR_AND_PESTLE.get());

        addOreRecipe(pWriter, "star_silver_ore", ModBlocks.STAR_SILVER_ORE.get(), ModItems.STAR_SILVER_INGOT.get(), 0.7f, 200);
        addOreRecipe(pWriter, "raw_star_silver", ModItems.RAW_STAR_SILVER.get(), ModItems.STAR_SILVER_INGOT.get(), 0.7f, 200);
        addOreRecipe(pWriter, "deepslate_star_silver_ore", ModItems.DEEPSLATE_STAR_SILVER_ORE_ITEM.get(), ModItems.STAR_SILVER_INGOT.get(), 0.7f, 200);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT,ModItems.STAR_SILVER_SWORD.get()).define('#',ModItems.STAR_SILVER_INGOT.get()).define('S',Items.STICK)
                .pattern("#").pattern("#").pattern("S")
                .unlockedBy("has_star_silver_ingot",has(ModItems.STAR_SILVER_INGOT.get()))
                .save((recipeConsumer)->pWriter.accept(new EnchantedResult(recipeConsumer,new ResourceLocation(LushScentedParadise.MODID,"star_silver_sword"), Enchantments.MOB_LOOTING,1)));

        addArmorRecipe(pWriter, "star_silver_helmet", ModItems.STAR_SILVER_HELMET.get(), "###", "# #");
        addArmorRecipe(pWriter, "star_silver_chestplate", ModItems.STAR_SILVER_CHESTPLATE.get(), "# #", "###", "###");
        addArmorRecipe(pWriter, "star_silver_leggings", ModItems.STAR_SILVER_LEGGINGS.get(), "###", "# #", "# #");
        addArmorRecipe(pWriter, "star_silver_boots", ModItems.STAR_SILVER_BOOTS.get(), "# #", "# #");
        // 星银镐
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STAR_SILVER_PICKAXE.get())
                .define('#', ModItems.STAR_SILVER_INGOT.get()).define('S', Items.STICK)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .unlockedBy("has_star_silver_ingot", has(ModItems.STAR_SILVER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STAR_SILVER_AXE.get())
                .define('#', ModItems.STAR_SILVER_INGOT.get()).define('S', Items.STICK)
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .unlockedBy("has_star_silver_ingot", has(ModItems.STAR_SILVER_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STAR_SILVER_SHOVEL.get())
                .define('#', ModItems.STAR_SILVER_INGOT.get()).define('S', Items.STICK)
                .pattern("#")
                .pattern("S")
                .pattern("S")
                .unlockedBy("has_star_silver_ingot", has(ModItems.STAR_SILVER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STAR_SILVER_HOE.get())
                .define('#', ModItems.STAR_SILVER_INGOT.get()).define('S', Items.STICK)
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .unlockedBy("has_star_silver_ingot", has(ModItems.STAR_SILVER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STAR_SILVER_SHEARS.get())
                .define('#', ModItems.STAR_SILVER_INGOT.get())
                .pattern(" #")
                .pattern("# ")
                .unlockedBy("has_star_silver_ingot", has(ModItems.STAR_SILVER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,ModItems.COLORFUL_FLOWER_SWORD.get())
                .define('C',ModItems.FLOWER_INGOT.get())
                .define('E',Items.DIAMOND_SWORD)
                .define('T',ModItems.STAR_SILVER_SWORD.get())
                .define('F',ModItems.ORIGINAL_FLOWER_SWORD.get())
                .define('D',ModItems.STAR_SILVER_INGOT.get())
                .define('R',ModFoods.CELESTIAL_EXTRACT.get())
                .define('W',Items.EMERALD)
                .pattern("CWC")
                .pattern("ETF")
                .pattern("DRD")
                .unlockedBy("has_flower_ingot",has(ModItems.FLOWER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,ModItems.COLORFUL_FLOWER_PICKAXE.get())
                .define('C',ModItems.FLOWER_INGOT.get())
                .define('E',Items.DIAMOND_PICKAXE)
                .define('T',Items.GLOW_BERRIES)
                .define('F',ModItems.STAR_SILVER_PICKAXE.get())
                .define('D',ModItems.STAR_SILVER_INGOT.get())
                .define('R',ModItems.ABYSS_MUSHROOM_POWDER.get())
                .define('W',Items.GOLD_INGOT)
                .pattern("CWC")
                .pattern("ETF")
                .pattern("DRD")
                .unlockedBy("has_flower_ingot",has(ModItems.FLOWER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,ModItems.COLORFUL_FLOWER_AXE.get())
                .define('C',ModItems.FLOWER_INGOT.get())
                .define('E',Items.DIAMOND_AXE)
                .define('F',ModItems.STAR_SILVER_AXE.get())
                .define('T',Items.OAK_SAPLING)
                .define('D',ModItems.STAR_SILVER_INGOT.get())
                .define('R',ModCoffee.ESPRESSO.get())
                .define('W',Items.REDSTONE)
                .pattern("CWC")
                .pattern("ETF")
                .pattern("DRD")
                .unlockedBy("has_flower_ingot",has(ModItems.FLOWER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,ModItems.COLORFUL_FLOWER_SHOVEL.get())
                .define('C',ModItems.FLOWER_INGOT.get())
                .define('E',Items.DIAMOND_SHOVEL)
                .define('F',ModItems.STAR_SILVER_SHOVEL.get())
                .define('T',Items.GRASS_BLOCK)
                .define('D',ModItems.STAR_SILVER_INGOT.get())
                .define('R',ModItems.CHOCOLATE.get())
                .define('W',Items.DIAMOND)
                .pattern("CWC")
                .pattern("ETF")
                .pattern("DRD")
                .unlockedBy("has_flower_ingot",has(ModItems.FLOWER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,ModItems.COLORFUL_FLOWER_HOE.get())
                .define('C',ModItems.FLOWER_INGOT.get())
                .define('E',Items.DIAMOND_HOE)
                .define('F',ModItems.STAR_SILVER_HOE.get())
                .define('T',Items.WHEAT_SEEDS)
                .define('D',ModItems.STAR_SILVER_INGOT.get())
                .define('R',ModSnack.PUDDING.get())
                .define('W',Items.LAPIS_LAZULI)
                .pattern("CWC")
                .pattern("ETF")
                .pattern("DRD")
                .unlockedBy("has_flower_ingot",has(ModItems.FLOWER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,ModItems.COLORFUL_FLOWER_HELMET.get())
                .define('C',ModItems.FLOWER_INGOT.get())
                .define('E',Items.DIAMOND_HELMET)
                .define('F',ModItems.STAR_SILVER_HELMET.get())
                .define('T',Items.KELP)
                .define('D',ModItems.STAR_SILVER_INGOT.get())
                .define('R',ModFoods.OCEAN_JOURNEY.get())
                .define('W',Items.GOLD_INGOT)
                .pattern("CWC")
                .pattern("ETF")
                .pattern("DRD")
                .unlockedBy("has_flower_ingot",has(ModItems.FLOWER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,ModItems.COLORFUL_FLOWER_CHESTPLATE.get())
                .define('C',ModItems.FLOWER_INGOT.get())
                .define('E',Items.DIAMOND_CHESTPLATE)
                .define('F',ModItems.STAR_SILVER_CHESTPLATE.get())
                .define('T',Items.LEATHER)
                .define('D',ModItems.STAR_SILVER_INGOT.get())
                .define('R',ModFoods.LAVA_SPECIAL_DRINK.get())
                .define('W',Items.EMERALD)
                .pattern("CWC")
                .pattern("ETF")
                .pattern("DRD")
                .unlockedBy("has_flower_ingot",has(ModItems.FLOWER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,ModItems.COLORFUL_FLOWER_LEGGINGS.get())
                .define('C',ModItems.FLOWER_INGOT.get())
                .define('E',Items.DIAMOND_LEGGINGS)
                .define('F',ModItems.STAR_SILVER_LEGGINGS.get())
                .define('T',Items.SUGAR)
                .define('D',ModItems.STAR_SILVER_INGOT.get())
                .define('R',ModFoods.FLOWER_PARTY.get())
                .define('W',Items.LAPIS_LAZULI)
                .pattern("CWC")
                .pattern("ETF")
                .pattern("DRD")
                .unlockedBy("has_flower_ingot",has(ModItems.FLOWER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,ModItems.COLORFUL_FLOWER_BOOTS.get())
                .define('C',ModItems.FLOWER_INGOT.get())
                .define('E',Items.DIAMOND_BOOTS)
                .define('F',ModItems.STAR_SILVER_BOOTS.get())
                .define('T',Items.SUNFLOWER)
                .define('D',ModItems.STAR_SILVER_INGOT.get())
                .define('R',ModMilktea.ROSE_BLACKTEA_MILKTEA.get())
                .define('W',Items.DIAMOND)
                .pattern("CWC")
                .pattern("ETF")
                .pattern("DRD")
                .unlockedBy("has_flower_ingot",has(ModItems.FLOWER_INGOT.get()))
                .save(pWriter);




        NineToOneRecipe(pWriter,ModItems.RAW_STAR_SILVER.get(),ModItems.RAW_STAR_SILVER_BLOCK_ITEM.get());
        NineToOneRecipe(pWriter,ModItems.STAR_SILVER_INGOT.get(),ModItems.STAR_SILVER_BLOCK_ITEM.get());
        OneToNineRecipe(pWriter,ModItems.STAR_SILVER_BLOCK_ITEM.get(),ModItems.STAR_SILVER_INGOT.get(),9);
        OneToNineRecipe(pWriter,ModItems.RAW_STAR_SILVER_BLOCK_ITEM.get(),ModItems.RAW_STAR_SILVER.get(),9);
        NineToOneRecipe(pWriter,ModItems.FLOWER_INGOT.get(),ModItems.COLORFUL_FLOWER_BLOCK_ITEM.get());
        OneToNineRecipe(pWriter,ModItems.COLORFUL_FLOWER_BLOCK_ITEM.get(),ModItems.FLOWER_INGOT.get(),9);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.FLOWER_INGOT.get(),1)
                .define('#',ModItems.STAR_SILVER_INGOT.get())//
                .define('A',ModFoods.AXOLOTL_TEA.get())//
                .define('B',ModItems.STAR_SILVER_FLOWER_POWDER.get())//
                .define('C',ModFoods.HORROR_SOUP.get())//
                .define('D',ModCoffee.TRIESPRESSO.get())
                .define('E',ModMilktea.VIOLET_MILKTEA.get())
                .define('F',ModFoods.MIXED_BERRY_SMOOTHIE.get())
                .define('G',ModItems.ABYSS_MUSHROOM_POWDER.get())//
                .define('H',ModFoods.FLOWER_PARTY.get())
                .pattern("ABC")
                .pattern("D#E")
                .pattern("FGH")
                .unlockedBy("has_item", has(ModItems.STAR_SILVER_INGOT.get()))
                .save(pWriter,new ResourceLocation(LushScentedParadise.MODID,"colorful_flower_ingot_recipe"));

        foodCooked(pWriter,"cooked_phantom_lotus_koi",ModItems.PHANTOM_LOTUS_KOI.get(),ModItems.COOKED_PHANTOM_LOTUS_KOI.get(),3,200);
        foodCooked(pWriter,"cooked_glowpetal_pigfish",ModItems.GLOWPETAL_PIGFISH.get(),ModItems.COOKED_GLOWPETAL_PIGFISH.get(),3,200);
    }


    //添加干燥配方
    protected void addDryingRecipe(Consumer<FinishedRecipe> consumer, String name, Item input, Item output, int dryingTime){
        DryingRecipeBuilder.drying(ModRecipeSerializers.DRYING_RECIPE.get(),input,output,dryingTime)
                .save(consumer,new ResourceLocation(LushScentedParadise.MODID,name));
    }
    //添加茶壶配方
    protected void addTeapotRecipe(Consumer<FinishedRecipe> consumer, String name, List<Ingredient> inputs, ItemStack result, int brewTime){
        TeapotRecipeBuilder.teapot(ModRecipeSerializers.TEAPOT_RECIPE.get(), inputs,result,brewTime)
                .save(consumer,new ResourceLocation(LushScentedParadise.MODID,name));
    }
    //添加无序合成配方
    protected void addShapelessRecipe(Consumer<FinishedRecipe> consumer,String name,ItemLike output,int count,ItemLike... inputs){
        {
            ShapelessRecipeBuilder builder = ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, count);
            for (ItemLike input : inputs) {
                builder.requires(input);
            }
            builder.unlockedBy("has_" + inputs[0].asItem().toString(), has(inputs[0]))
                    .save(consumer, new ResourceLocation(LushScentedParadise.MODID, name));
        }
    }
    //添加矿石煅烧配方
    protected void addOreRecipe(Consumer<FinishedRecipe> consumer,String name,ItemLike input,ItemLike output,float experience,int cookingTime){
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), RecipeCategory.MISC, output, experience, cookingTime)
                .unlockedBy("has_" + name, has(input))
                .save(consumer, new ResourceLocation("lushscentedparadise", "smelting/" + name));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(input), RecipeCategory.MISC, output, experience, cookingTime / 2)
                .unlockedBy("has_" + name, has(input))
                .save(consumer, new ResourceLocation("lushscentedparadise", "blasting/" + name));
    }
    protected void foodCooked(Consumer<FinishedRecipe> consumer,String name,ItemLike input,ItemLike output,float exp,int cookingTime){
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(input),RecipeCategory.MISC,output,exp,cookingTime)
                .unlockedBy("has_" + name, has(input))
                .save(consumer,new ResourceLocation(LushScentedParadise.MODID,"smelting/"+name));
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(input),RecipeCategory.MISC,output,exp,cookingTime/2)
                .unlockedBy("has_" + name, has(input))
                .save(consumer,new ResourceLocation(LushScentedParadise.MODID,"smoking/"+name));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(input),RecipeCategory.MISC,output,exp,cookingTime*3)
                .unlockedBy("has_" + name, has(input))
                .save(consumer,new ResourceLocation(LushScentedParadise.MODID,"campfirecooking/"+name));
    }
    private void addArmorRecipe(Consumer<FinishedRecipe> consumer, String name, ItemLike result, String... pattern) {
        ShapedRecipeBuilder builder = ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .define('#', ModItems.STAR_SILVER_INGOT.get());
        for (String row : pattern) {
            builder.pattern(row);
        }
        builder.unlockedBy("has_star_silver_ingot", has(ModItems.STAR_SILVER_INGOT.get()))
                .save(consumer, new ResourceLocation("lushscentedparadise", name));
    }
    private void NineToOneRecipe(Consumer<FinishedRecipe> consumer, Item input, Item output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,output)
                .define('#', input)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(input))
                .save(consumer);
    }
    private void OneToNineRecipe(Consumer<FinishedRecipe> consumer, ItemLike input, ItemLike output, int count) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, count)
                .requires(input)
                .unlockedBy("has_item", has(input))
                .save(consumer);
    }

//合成附带附魔的方法
    public class EnchantedResult implements FinishedRecipe {
        private final FinishedRecipe baseRecipe;
        private final ResourceLocation id;
        private final Enchantment enchantment;
        private final int level;

        public EnchantedResult(FinishedRecipe baseRecipe, ResourceLocation id, Enchantment enchantment, int level) {
            this.baseRecipe = baseRecipe;
            this.id = id;
            this.enchantment = enchantment;
            this.level = level;
        }

        @Override
        public void serializeRecipeData(JsonObject json) {
            baseRecipe.serializeRecipeData(json);
            JsonObject result = json.getAsJsonObject("result");
            if (result == null) result = new JsonObject();

            // ✅ 1. 获取正确的附魔 ID
            ResourceLocation enchantmentID = BuiltInRegistries.ENCHANTMENT.getKey(enchantment);

            // ✅ 2. 创建 NBT 附魔标签
            CompoundTag nbt = new CompoundTag();
            ListTag enchantmentsList = new ListTag();
            CompoundTag enchantmentEntry = new CompoundTag();
            enchantmentEntry.putString("id", enchantmentID.toString()); // 确保 `minecraft:looting`
            enchantmentEntry.putInt("lvl", level);
            enchantmentsList.add(enchantmentEntry);
            nbt.put("Enchantments", enchantmentsList);

            // ✅ 3. 添加 NBT 数据到 JSON
            result.addProperty("nbt", nbt.toString());
            json.add("result", result);
        }

        @Override
        public ResourceLocation getId() {
            return id;
        }

        @Override
        public RecipeSerializer<?> getType() {
            return baseRecipe.getType();
        }

        @Override
        public JsonObject serializeAdvancement() {
            return baseRecipe.serializeAdvancement();
        }

        @Override
        public ResourceLocation getAdvancementId() {
            return baseRecipe.getAdvancementId();
        }
    }

}

