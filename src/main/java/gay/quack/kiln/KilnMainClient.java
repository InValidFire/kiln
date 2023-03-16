package gay.quack.kiln;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

@Environment(EnvType.CLIENT)
public class KilnMainClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(KilnMain.KILN_SCREEN_HANDLER, KilnScreen::new);
    }
}
