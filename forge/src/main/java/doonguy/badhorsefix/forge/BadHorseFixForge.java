package doonguy.badhorsefix.forge;

import dev.architectury.platform.forge.EventBuses;
import doonguy.badhorsefix.BadHorseFix;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BadHorseFix.MOD_ID)
public class BadHorseFixForge {
    public BadHorseFixForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(BadHorseFix.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        BadHorseFix.init();
    }
}
