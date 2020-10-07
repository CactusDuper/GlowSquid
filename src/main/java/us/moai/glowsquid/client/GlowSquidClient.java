package us.moai.glowsquid.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import us.moai.glowsquid.GlowSquid;
import us.moai.glowsquid.GlowSquidEntityRenderer;

@Environment(EnvType.CLIENT)
public class GlowSquidClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(GlowSquid.GLOW_SQUID, (dispatcher, context) -> {
            return new GlowSquidEntityRenderer(dispatcher);
        });

    }
}
