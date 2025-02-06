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
    private static final Identifier LIT_PROGRESS_TEXTURE = Identifier.of(KilnMain.MOD_ID, "container/kiln/lit_progress");
    private static final Identifier BURN_PROGRESS_TEXTURE = Identifier.of(KilnMain.MOD_ID, "container/kiln/burn_progress");
    private static final Identifier TEXTURE = Identifier.of(KilnMain.MOD_ID, "textures/gui/container/kiln.png");

    public KilnScreen(KilnScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, new FurnaceRecipeBookScreen(), inventory, title, TEXTURE, LIT_PROGRESS_TEXTURE, BURN_PROGRESS_TEXTURE);
    }

}
