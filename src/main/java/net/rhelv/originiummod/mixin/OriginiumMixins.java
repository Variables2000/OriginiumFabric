package net.rhelv.originiummod.mixin;

import net.rhelv.originiummod.OriginiumMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class OriginiumMixins {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		OriginiumMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
