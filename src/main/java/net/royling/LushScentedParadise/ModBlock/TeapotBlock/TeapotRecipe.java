package net.royling.LushScentedParadise.ModBlock.TeapotBlock;

import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.royling.LushScentedParadise.Registry.ModItems;
import net.royling.LushScentedParadise.Registry.ModRecipeSerializers;
import net.royling.LushScentedParadise.Registry.ModRecipeTypes;

import java.util.ArrayList;
import java.util.List;

public class TeapotRecipe implements Recipe<Container> {
    private final ResourceLocation id;
    private final List<Ingredient> ingredients;
    private final ItemStack result;
    private final int brewTime;

    public TeapotRecipe(ResourceLocation id,List<Ingredient> ingredients,ItemStack result,int brewTime){
        this.id=id;
        this.ingredients = ingredients;
        this.result = result;
        this.brewTime = brewTime;
    }

    @Override
    public boolean matches(Container pContainer, Level pLevel) {
        List<ItemStack> inputs = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if(!pContainer.getItem(i).isEmpty()) {
                inputs.add(pContainer.getItem(i));
            }
        }

        ItemStack waterBottle = pContainer.getItem(4);
        if (!waterBottle.is(ModItems.CLEAN_WATER.get())) return false;
        if (inputs.size() != ingredients.size()) {
            return false;
        }

        List<Ingredient> required = new ArrayList<>(ingredients);
        for (ItemStack stack : inputs) {
            required.removeIf(ingredient -> ingredient.test(stack));
        }
        return required.isEmpty();
    }

    @Override
    public ItemStack assemble(Container pContainer, RegistryAccess pRegistryAccess) {
        return result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess pRegistryAccess) {
        return result.copy();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipeTypes.TEAPOT_RECIPE.get();
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipeSerializers.TEAPOT_RECIPE.get();
    }

    public int getBrewTime() {
        return brewTime;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> ingredientsList = NonNullList.create();
        ingredientsList.addAll(ingredients);
        return ingredientsList;
    }

    public ItemStack getResult() {
        return result;
    }
    public Ingredient getinputf(){
        return ingredients.get(0);
    }
    public Ingredient getinputs(){
        return ingredients.get(1);
    }
    public Ingredient getinputt(){
        return ingredients.get(2);
    }
    public Ingredient getinputfo(){
        return ingredients.get(3);
    }
    public Ingredient getInputInt(int c){
        return ingredients.get(c);
    }

}
