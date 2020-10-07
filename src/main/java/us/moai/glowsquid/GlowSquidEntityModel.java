package us.moai.glowsquid;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.entity.model.SquidEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.SquidEntity;

public class GlowSquidEntityModel extends SquidEntityModel<GlowSquidEntity> {
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.getParts().forEach((modelPart) -> {
            modelPart.render(matrices, vertices, 6029544, overlay, red, green, blue, alpha);
        });
    }
}
