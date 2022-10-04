package net.rhelv.originiummod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TntBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class OriginiumTNT extends TntBlock {
    public OriginiumTNT(Settings settings) {
        super(settings);
    }
    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (world.isReceivingRedstonePower(pos)) {
            primeTnt(world, pos);
            world.removeBlock(pos, false);
        }

    }
}
