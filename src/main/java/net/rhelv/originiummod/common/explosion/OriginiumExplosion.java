package net.rhelv.originiummod.common.explosion;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class OriginiumExplosion extends Explosion {
    @NotNull
    BlockPos center;
    @NotNull
    World world;
    @NotNull
    int radius;
    @Nullable
    LivingEntity livingBase;

    public OriginiumExplosion(
            @NotNull BlockPos center,
            @NotNull World world,
            @NotNull int radius) {
        super(world, null, null, null, center.getX(), center.getY(), center.getZ(), radius, false, DestructionType.DESTROY);
        this.center = center;
        this.world = world;
        this.radius = radius;
    }
    public void setLivingBase(
            @Nullable LivingEntity livingBase) {
        this.livingBase = livingBase;
    }
    public @Nullable LivingEntity getLivingBase() {
        return livingBase;
    }
}
