package net.spartanweapons.entity.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.spartanweapons.entity.JavelinEntity;

@SuppressWarnings("deprecation")
@Environment(EnvType.CLIENT)
public class JavelinEntityRenderer extends EntityRenderer<JavelinEntity> {
    private final ItemRenderer itemRenderer;

    public JavelinEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.itemRenderer = context.getItemRenderer();
    }

    @Override
    public void render(JavelinEntity javelin_Entity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();

        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(g, javelin_Entity.prevYaw, javelin_Entity.getYaw()) - 90.0F));
        matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.lerp(g, javelin_Entity.prevPitch, javelin_Entity.getPitch()) + -45.0F));

        matrixStack.translate(-0.3D, -0.15D, 0.0D);
        // Use GUI type cause it isn't used for this type
        this.itemRenderer.renderItem(javelin_Entity.getStack(), ModelTransformationMode.GUI, i, OverlayTexture.DEFAULT_UV, matrixStack, vertexConsumerProvider, javelin_Entity.getWorld(),
                javelin_Entity.getId());
        matrixStack.pop();
        super.render(javelin_Entity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(JavelinEntity entity) {
        return SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE;
    }
}