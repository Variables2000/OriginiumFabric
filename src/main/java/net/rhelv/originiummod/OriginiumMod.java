package net.rhelv.originiummod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.entity.BlockEntityType;
import net.rhelv.originiummod.block.ModBlock;
import net.rhelv.originiummod.block.OriginiumTNT;
import net.rhelv.originiummod.item.ModItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OriginiumMod implements ModInitializer {

	public static final String MOD_ID = "originiummod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
	public void onInitialize() {
		ModItem.init();
		ModBlock.init();
	}
}
