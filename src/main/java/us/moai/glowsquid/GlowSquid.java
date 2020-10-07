package us.moai.glowsquid;

import me.lambdaurora.lambdynlights.api.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static me.lambdaurora.lambdynlights.api.DynamicLightHandlers.registerDynamicLightHandler;

public class GlowSquid implements ModInitializer {
    public static final EntityType<GlowSquidEntity> GLOW_SQUID = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("glowsquid", "glow_squid"),
            FabricEntityTypeBuilder.<GlowSquidEntity>create(SpawnGroup.CREATURE, GlowSquidEntity::new).dimensions(EntityDimensions.fixed(.75f, 0.75f)).build());

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(GLOW_SQUID, GlowSquidEntity.createMobAttributes());
        registerDynamicLightHandler(GLOW_SQUID, DynamicLightHandler.makeHandler(GLOW_SQUID -> 15, GLOW_SQUID -> false));
    }

}
/*
friendly reminder that dream sucks
 */