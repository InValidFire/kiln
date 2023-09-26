package gay.quack.kiln;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.CookingRecipeCategory;

public class KilnRecipe extends AbstractCookingRecipe {
    public KilnRecipe(String group, CookingRecipeCategory category, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(KilnMain.KILN_RECIPE_TYPE, group, category, input, output, experience, cookTime);
    }

    @Override
    public RecipeSerializer<KilnRecipe> getSerializer() {
        return KilnMain.KILN_RECIPE_SERIALIZER;
    }
}
