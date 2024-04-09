package doonguy.badhorsefix.forge;

import doonguy.badhorsefix.PlatformCode;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class PlatformCodeImpl {
    /**
     * This is our actual method to {@link PlatformCode#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
