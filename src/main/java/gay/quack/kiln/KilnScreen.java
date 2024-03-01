package gay.quack.kiln;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen;
import net.minecraft.client.gui.screen.recipebook.FurnaceRecipeBookScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class KilnScreen extends AbstractFurnaceScreen<KilnScreenHandler> {
    private static final Identifier LIT_PROGRESS_TEXTURE = new Identifier("container/smoker/lit_progress");
    private static final Identifier BURN_PROGRESS_TEXTURE = new Identifier("container/smoker/burn_progress");
    private static final Identifier TEXTURE = new Identifier("textures/gui/container/smoker.png");

    public KilnScreen(KilnScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, new FurnaceRecipeBookScreen(), inventory, title, TEXTURE, LIT_PROGRESS_TEXTURE, BURN_PROGRESS_TEXTURE);
    }

}
