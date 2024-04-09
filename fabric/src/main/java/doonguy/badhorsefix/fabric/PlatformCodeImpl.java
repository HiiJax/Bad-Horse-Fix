package doonguy.badhorsefix.fabric;

import doonguy.badhorsefix.PlatformCode;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class PlatformCodeImpl {
    /**
     * This is our actual method to {@link PlatformCode#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
