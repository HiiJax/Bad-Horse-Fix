package doonguy.badhorsefix.mixin;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.Digraphs;
import de.odysseus.ithaka.digraph.util.fas.FeedbackArcSet;
import de.odysseus.ithaka.digraph.util.fas.FeedbackArcSetPolicy;
import de.odysseus.ithaka.digraph.util.fas.FeedbackArcSetProvider;
import doonguy.badhorsefix.RenderTypeOrderer;
import net.coderbot.batchedentityrendering.impl.TransparencyType;
import net.coderbot.batchedentityrendering.impl.ordering.GraphTranslucencyRenderOrderManager;
import net.minecraft.client.renderer.RenderType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

// Credit to coderbot/IMS212/Iris for all the original code
@Mixin(GraphTranslucencyRenderOrderManager.class)
public abstract class GraphTranslucencyRenderOrderManagerMixin {

    @Final
    @Shadow
    private FeedbackArcSetProvider feedbackArcSetProvider;

    @Final
    @Shadow
    private EnumMap<TransparencyType, Digraph<RenderType>> types;
    /**
     * @author DoonGuy
     * @reason Fix the render order of horses
     */
    @Overwrite
    public List<RenderType> getRenderOrder() {
        int layerCount = 0;

        for (Digraph<RenderType> graph : types.values()) {
            layerCount += graph.getVertexCount();
        }

        List<RenderType> allLayers = new ArrayList<>();

        for (Digraph<RenderType> graph : types.values()) {
            // TODO: Make sure that FAS can't become a bottleneck!
            // Running NP-hard algorithms in a real time rendering loop might not be an amazing idea.
            // This shouldn't be necessary in sane scenes, though, and if there aren't cycles,
            // then this *should* be relatively inexpensive, since it'll bail out and return an empty set.
            FeedbackArcSet<RenderType> arcSet =
                    feedbackArcSetProvider.getFeedbackArcSet(graph, graph, FeedbackArcSetPolicy.MIN_WEIGHT);

            if (arcSet.getEdgeCount() > 0) {
                // This means that our dependency graph had cycles!!!
                // This is very weird and isn't expected - but we try to handle it gracefully anyways.

                // Our feedback arc set algorithm finds some dependency links that can be removed hopefully
                // without disrupting the overall order too much. Hopefully it isn't too slow!
                for (RenderType source : arcSet.vertices()) {
                    for (RenderType target : arcSet.targets(source)) {
                        graph.remove(source, target);
                    }
                }
            }

            allLayers.addAll(Digraphs.toposort(graph, false));
        }

        // Sort layers based on custom priority
        allLayers.sort(new RenderTypeOrderer());

        return allLayers;
    }
}