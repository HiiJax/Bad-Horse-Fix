package doonguy.badhorsefix;

import com.google.common.base.Suppliers;
import dev.architectury.registry.registries.RegistrarManager;

import java.util.function.Supplier;

public class BadHorseFix {
    public static final String MOD_ID = "badhorsefix";
    // We can use this if we don't want to use DeferredRegister
    public static final Supplier<RegistrarManager> REGISTRIES = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));


    
    public static void init() {

        
        System.out.println(PlatformCode.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
