package net.rhelv.originiummod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rhelv.originiummod.OriginiumMod;

public class ModBlock{
    public static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(OriginiumMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(OriginiumMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
}
