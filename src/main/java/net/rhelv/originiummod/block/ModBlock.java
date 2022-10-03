package net.rhelv.originiummod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.rhelv.originiummod.OriginiumMod;
import net.rhelv.originiummod.item.ModItemGroup;

public class ModBlock{
    public static Block registerBlock(String name, Block block, ItemGroup tab, Rarity rarity) {
        registerBlockItem(name, block, tab, rarity);
        return Registry.register(Registry.BLOCK, new Identifier(OriginiumMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup tab, Rarity rarity) {
        return Registry.register(Registry.ITEM, new Identifier(OriginiumMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab).rarity(rarity)));
    }
}
