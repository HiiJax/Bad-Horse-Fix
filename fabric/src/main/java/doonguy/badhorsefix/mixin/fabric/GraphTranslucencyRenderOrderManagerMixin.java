package doonguy.badhorsefix.mixin.fabric;

import doonguy.badhorsefix.fabric.RenderTypeOrderer;
import net.coderbot.batchedentityrendering.impl.ordering.GraphTranslucencyRenderOrderManager;
import net.minecraft.client.renderer.RenderType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(GraphTranslucencyRenderOrderManager.class)
public abstract class GraphTranslucencyRenderOrderManagerMixin {
    @Inject(method = "getRenderOrder", at = @At("RETURN"), cancellable = true, remap = false)
    private void sortLayers(CallbackInfoReturnable<List<RenderType>> cir) {
        List<RenderType> allLayers = cir.getReturnValue();
        allLayers.sort(new RenderTypeOrderer());
        cir.setReturnValue(allLayers);
    }
}