package gay.quack.kiln;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.CookingRecipeCategory;
import net.minecraft.recipe.book.RecipeBookCategories;
import net.minecraft.recipe.book.RecipeBookCategory;

public class KilnRecipe extends AbstractCookingRecipe {
    public KilnRecipe(String group, CookingRecipeCategory category, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(group, category, input, output, experience, cookTime);
    }

    @Override
    public RecipeSerializer<KilnRecipe> getSerializer() {
        return KilnMain.KILN_RECIPE_SERIALIZER;
    }

    @Override
    public RecipeType<? extends AbstractCookingRecipe> getType() {
        return KilnMain.KILN_RECIPE_TYPE;
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return switch (this.getCategory()) {
            case CookingRecipeCategory.BLOCKS -> RecipeBookCategories.FURNACE_BLOCKS;
            case CookingRecipeCategory.FOOD -> RecipeBookCategories.FURNACE_FOOD;
            case CookingRecipeCategory.MISC -> RecipeBookCategories.FURNACE_MISC;
        };
    }

    @Override
    protected Item getCookerItem() {
        return KilnMain.KILN_ITEM;
    }
}
