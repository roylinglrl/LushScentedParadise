package net.royling.LushScentedParadise.ModBlock.TeapotBlock;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;

import java.util.ArrayList;
import java.util.List;

public class TeapotRecipeSerializer implements RecipeSerializer<TeapotRecipe> {
    @Override
    public TeapotRecipe fromJson(ResourceLocation recipeId, JsonObject json) {
        List<Ingredient> ingredients = new ArrayList<>();
        JsonArray ingredientsArray = GsonHelper.getAsJsonArray(json, "ingredients");

        for (int i = 0; i < ingredientsArray.size(); i++) {
            ingredients.add(Ingredient.fromJson(ingredientsArray.get(i)));
        }

        ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json,"result"));
        int brewTime = GsonHelper.getAsInt(json, "brew_time", 200);

        return new TeapotRecipe(recipeId, ingredients, output, brewTime);
}
    @Override
    public TeapotRecipe fromNetwork(ResourceLocation recipeId, FriendlyByteBuf buffer) {
        int size = buffer.readInt();
        List<Ingredient> ingredients = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ingredients.add(Ingredient.fromNetwork(buffer));
        }

        ItemStack output = buffer.readItem();
        int brewTime = buffer.readInt();

        return new TeapotRecipe(recipeId, ingredients, output, brewTime);
    }
    @Override
    public void toNetwork(FriendlyByteBuf buffer, TeapotRecipe recipe) {
        buffer.writeInt(recipe.getIngredients().size());
        for (Ingredient ingredient : recipe.getIngredients()) {
            ingredient.toNetwork(buffer);
        }
        buffer.writeItem(recipe.getResultItem(RegistryAccess.EMPTY));
        buffer.writeInt(recipe.getBrewTime());
    }
}
