package net.royling.LushScentedParadise.ModBlock.JEI;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.*;
import mezz.jei.api.runtime.IJeiRuntime;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.Registry.ModBlocks;
import net.royling.LushScentedParadise.Registry.ModMenuTypes;
import net.royling.LushScentedParadise.Registry.ModRecipeTypes;
import net.royling.LushScentedParadise.ModBlock.TeapotBlock.TeapotMenu;
import net.royling.LushScentedParadise.ModBlock.TeapotBlock.TeapotRecipe;
import net.royling.LushScentedParadise.ModBlock.TeapotBlock.TeapotScreen;

import java.util.List;

@SuppressWarnings("removal")
@JeiPlugin
public class TeapotJEI implements IModPlugin {

    public static final ResourceLocation PLUGIN_ID =
            new ResourceLocation(LushScentedParadise.MODID,"teapot_plugin");
    private static IJeiRuntime jeiRuntime;


    @Override
    public ResourceLocation getPluginUid() {
        return PLUGIN_ID;
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        Level level = Minecraft.getInstance().level;
        if(level==null)return;
        List<TeapotRecipe> teapotList =
                level.getRecipeManager().getAllRecipesFor(ModRecipeTypes.TEAPOT_RECIPE.get());
        registration.addRecipes(TeapotRecipeCateGory.RECIPE_TYPE,teapotList);
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new TeapotRecipeCateGory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.TEAPOT.get()),TeapotRecipeCateGory.RECIPE_TYPE);
    }

    @Override
    public void registerRecipeTransferHandlers(IRecipeTransferRegistration registration) {
        registration.addRecipeTransferHandler(
                TeapotMenu.class,
                ModMenuTypes.TEAPOT_MENU.get(),
                TeapotRecipeCateGory.RECIPE_TYPE,
                0,5,6,36

        );
    }
    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(
                TeapotScreen.class,
                79,34,24,16,
                TeapotRecipeCateGory.RECIPE_TYPE
        );
    }
}
