package net.rhelv.originiummod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.rhelv.originiummod.OriginiumMod;

public class ModItemGroup {
    public static final ItemGroup ORIGINIUM = FabricItemGroupBuilder.build(
            new Identifier(OriginiumMod.MOD_ID, "originium"), () -> new ItemStack(ModItem.ORIGINIUM));
}
