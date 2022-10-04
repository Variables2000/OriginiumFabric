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
        setFuse(OriginiumModConfig.fuseTime);
    }
    public OriginiumTNTEntity(World world, double x, double y, double z, LivingEntity tntPlacedBy) {
        super(world, x, y, z, tntPlacedBy);
        setFuse(OriginiumModConfig.fuseTime);
    }
    public void Tick() {
        if (!this.hasNoGravity()) {
            this.setVelocity(this.getVelocity().add(0.0D, -0.04D, 0.0D));
        }

        this.move(MovementType.SELF, this.getVelocity());
        this.setVelocity(this.getVelocity().multiply(0.98D));
        if (this.onGround) {
            this.setVelocity(this.getVelocity().multiply(0.7D, -0.5D, 0.7D));
        }

        setFuse(getFuse() - 1);
        if (this.getFuse() <= 0) {
            this.remove(RemovalReason.KILLED);
            if (!this.world.isClient) {
                this.explodeOriginiumTNT();
            }
        } else {
            this.updateWaterState();
            if (this.world.isClient) {
                this.world.addParticle(ParticleTypes.SMOKE, this.getX(), this.getY() + 0.5D, this.getZ(), 0.0D, 0.0D, 0.0D);
            }
        }
    }
    private void explodeOriginiumTNT() {
        float f = 4.0F;
        this.world.createExplosion(this, this.getX(), this.getBodyY(0.0625), this.getZ(), 8.0F, Explosion.DestructionType.BREAK);
    }
}