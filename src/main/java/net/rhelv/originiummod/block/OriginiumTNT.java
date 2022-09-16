package net.rhelv.originiummod.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.rhelv.originiummod.OriginiumMod;
import net.rhelv.originiummod.item.ModItemGroup;

import static net.rhelv.originiummod.block.ModBlock.registerBlock;

public class OriginiumTNT extends TntBlock {
    public static final Block OriginiumTNT = registerBlock("originiumtnt",
            new TntBlock(FabricBlockSettings.of(Material.TNT).strength(0.5f)), ModItemGroup.ORIGINIUM);
    public static void registerModBlocks() {
        OriginiumMod.LOGGER.debug("Registering ModBlocks for " + OriginiumMod.MOD_ID);
    }
    public OriginiumTNT(Settings settings) {
        super(settings);
    }
}
