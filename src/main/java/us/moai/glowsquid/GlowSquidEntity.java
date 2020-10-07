package us.moai.glowsquid;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.world.World;

public class GlowSquidEntity extends SquidEntity {

    public GlowSquidEntity(EntityType<? extends SquidEntity> entityType, World world) {
        super(entityType, world);
    }
}
