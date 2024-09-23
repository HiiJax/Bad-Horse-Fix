package hiijax.badhorsefix.neoforge;

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
            return 1; // Horse without armor or markings
        } else if (texture.contains("markings")) {
            return 2; // Horse with markings
        } else if (texture.contains("armor")) {
            return 3; // Horse with armor
        } else {
            return 4; // Others (fallback)
        }
    }
}