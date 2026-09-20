package net.hiijax.badhorsefix;

import net.minecraft.client.renderer.RenderType;
import java.util.List;

public class HorseArmorLayerMover {
    public static List<RenderType> fixHorseArmor(List<RenderType> allLayers) {
        // iterate backwards thru render layers to find horse armor and move it to the end
        for (int i = allLayers.size() - 1; i >= 0; i--) {
            if (allLayers.get(i).toString().contains("minecraft:textures/entity/horse/armor")) {
                allLayers.add(allLayers.get(i));
                allLayers.remove(i);
            }
        }
        return allLayers;
    }
}
