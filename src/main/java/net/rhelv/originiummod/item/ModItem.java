package net.rhelv.originiummod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.rhelv.originiummod.OriginiumMod;

public class ModItem {

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OriginiumMod.MOD_ID, name), item);
    }

    public static void registerModItem() {
        OriginiumMod.LOGGER.debug("Registering items for " + OriginiumMod.MOD_ID);
    }
    //Adds Items
    public static final Item ORIGINIUM = registerItem("originium",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ORIGINIUM)));

    public static final Item ORINGINIUM_SWORD = registerItem("originium_sword",
            new SwordItem(ModToolMaterial.ORIGINIUM, 250, 2.5f,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ORIGINIUM)));
}
