package net.royling.LushScentedParadise.ModBlock.JEI;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.ModBlock.DryingRack.DryingRecipe;
import net.royling.LushScentedParadise.Registry.ModBlocks;
import org.jetbrains.annotations.Nullable;
import oshi.driver.unix.aix.Ls;
@SuppressWarnings("removal")
public class DryingRecipeCategory implements IRecipeCategory<DryingRecipe> {
    public static final RecipeType<DryingRecipe> TYPE = RecipeType.create(LushScentedParadise.MODID,"drying",DryingRecipe.class);
    private final IDrawable background;
    private final IDrawable icon;
    public DryingRecipeCategory(IGuiHelper guiHelper){
        background = guiHelper.createDrawable(new ResourceLocation(LushScentedParadise.MODID,"textures/gui/drying_rack.png"),0,0,82,34);
        icon = guiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK,new ItemStack(ModBlocks.DRYING_RACK.get()));
    }

    @Override
    public RecipeType<DryingRecipe> getRecipeType() {
        return TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("jei.title.drying");
    }

    @Override
    public @Nullable IDrawable getBackground() {
        return background;
    }

    @Override
    public @Nullable IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder iRecipeLayoutBuilder, DryingRecipe dryingRecipe, IFocusGroup iFocusGroup) {
        iRecipeLayoutBuilder.addSlot(RecipeIngredientRole.INPUT,1,9).addIngredients(dryingRecipe.getInput());
        iRecipeLayoutBuilder.addSlot(RecipeIngredientRole.OUTPUT,65,9).addItemStack(dryingRecipe.getOutput());
    }
}
