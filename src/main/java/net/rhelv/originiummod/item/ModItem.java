package net.rhelv.originiummod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.rhelv.originiummod.OriginiumMod;

public class ModItem {

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OriginiumMod.MOD_ID, name), item);
    }

    public static void init() {
    }
    //Adds Items
    public static final Item ORIGINIUM = registerItem("originium",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.ORIGINIUM)));

    public static final Item ORINGINIUM_SWORD = registerItem("originium_sword",
            new SwordItem(ModToolMaterial.ORIGINIUM, 2, 1.2f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.ORIGINIUM)));
    public static final Item ORIGINIUM_PICKAXE = registerItem("originium_pickaxe",
            new PickaxeItem(ModToolMaterial.ORIGINIUM, 3, 0,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.ORIGINIUM)));
    public static final Item ORIGINIUM_AXE = registerItem("originium_axe",
            new AxeItem(ModToolMaterial.ORIGINIUM, 8, 1.5f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.ORIGINIUM)));
    public static final Item XIAOMI_12T_PRO_5G = registerItem("xiaomi_12t_pro_5g",
            new SwordItem(ModToolMaterial.ORIGINIUM, 9999, 9999.0f,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ORIGINIUM)));
}
