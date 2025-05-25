package net.hiijax.badhorsefix.mixin;

import net.hiijax.badhorsefix.RenderTypeOrderer;
import net.minecraft.client.renderer.RenderType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(targets = "net.coderbot.batchedentityrendering.impl.ordering.GraphTranslucencyRenderOrderManager", remap = false)
@Pseudo
public class GraphTranslucencyRenderOrderManagerMixinLegacy {
    @Inject(method = "getRenderOrder", at = @At("RETURN"), cancellable = true, remap = false)
    private void sortLayers(CallbackInfoReturnable<List<RenderType>> cir) {
        List<RenderType> allLayers = cir.getReturnValue();
        allLayers.sort(new RenderTypeOrderer());
        cir.setReturnValue(allLayers);

    }
}
