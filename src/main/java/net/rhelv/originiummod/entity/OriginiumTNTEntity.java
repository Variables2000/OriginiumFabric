package net.rhelv.originiummod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.TntEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import net.rhelv.originiummod.config.OriginiumModConfig;

public class OriginiumTNTEntity extends TntEntity {
    public OriginiumTNTEntity(EntityType<OriginiumTNTEntity> entityType, World world) {
        super(entityType, world);
    }
}