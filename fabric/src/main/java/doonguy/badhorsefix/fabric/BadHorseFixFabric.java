package doonguy.badhorsefix.fabric;

import doonguy.badhorsefix.BadHorseFix;
import net.fabricmc.api.ModInitializer;

public class BadHorseFixFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        BadHorseFix.init();
    }
}
