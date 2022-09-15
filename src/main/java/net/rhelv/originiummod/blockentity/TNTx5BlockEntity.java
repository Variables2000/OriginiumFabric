package net.rhelv.originiummod.blockentity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.rhelv.originiummod.OriginiumMod;
import net.rhelv.originiummod.block.ModBlock;

public class TNTx5BlockEntity extends BlockEntity {
    public static final BlockEntityType<TNTx5BlockEntity> TNTx5_MOD_ENTITY = Registry.register(
            Registry.BLOCK_ENTITY_TYPE,
            new Identifier(OriginiumMod.MOD_ID, "originiumtnt"),
            FabricBlockEntityTypeBuilder.create(TNTx5BlockEntity::new, ModBlock.TNTX5).build()
    );

    public TNTx5BlockEntity(BlockPos pos, BlockState state) {
        super(TNTx5_MOD_ENTITY, pos, state);
    }

    public static void registerModBlockEntity() {
        OriginiumMod.LOGGER.debug("Registering Mod Block Entities for "+ OriginiumMod.MOD_ID);
    }
}
