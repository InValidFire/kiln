package gay.quack.kiln;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;

public class KilnScreenHandler extends AbstractFurnaceScreenHandler {
    public KilnScreenHandler(int i, PlayerInventory playerInventory) {
        super(KilnMain.KILN_SCREEN_HANDLER, KilnMain.KILN_RECIPE_TYPE, RecipeBookCategory.FURNACE, i, playerInventory);
    }

    public KilnScreenHandler(int i, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(KilnMain.KILN_SCREEN_HANDLER, KilnMain.KILN_RECIPE_TYPE, RecipeBookCategory.FURNACE, i, playerInventory, inventory, propertyDelegate);
    }
}
