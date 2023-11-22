package net.spartanweapons.init;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.spartanweapons.entity.renderer.JavelinEntityRenderer;

@Environment(EnvType.CLIENT)
public class RenderInit {

    public static void init() {
        // Javelin
        EntityRendererRegistry.register(EntityInit.IRON_JAVELIN, JavelinEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.GOLDEN_JAVELIN, JavelinEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.DIAMOND_JAVELIN, JavelinEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.NETHERITE_JAVELIN, JavelinEntityRenderer::new);
        // Compat
        // CompatRender.loadRenderer();
    }

}
