package net.hiijax.badhorsefix;

import net.minecraft.client.renderer.RenderType;

import java.util.Comparator;

public class RenderTypeOrderer implements Comparator<RenderType> {
    @Override
    public int compare(RenderType o1, RenderType o2) {
        return Integer.compare(getPriority(o1), getPriority(o2));
    }

    private int getPriority(RenderType renderType) {
        String texture = renderType.toString();
        if (texture.contains("horse") && !texture.contains("armor") && !texture.contains("markings")) {
            return 1; // First render the horse
        } else if (texture.contains("horse") && texture.contains("markings")) {
            return 2; // Then render the horse markings
        } else if (texture.contains("horse") && texture.contains("armor") && !texture.contains("iceandfire")) {
            return 3; // Then the horse armor
        } else {
            return 4; // Then anything else
        }
    }
}