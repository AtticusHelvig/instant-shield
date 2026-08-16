package io.github.atticushelvig.instant_shield.mixin;

import net.minecraft.world.item.component.BlocksAttacks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlocksAttacks.class)
public abstract class BlocksAttacksComponentMixin {

    @Inject(method = "blockDelayTicks", at = @At("RETURN"), cancellable = true)
    private void modifyBlockDelay(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
        cir.cancel();
    }
}
