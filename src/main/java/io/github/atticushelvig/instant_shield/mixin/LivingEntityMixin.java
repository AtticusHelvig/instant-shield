package io.github.atticushelvig.instant_shield.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @ModifyConstant(method = "isBlocking", constant = @Constant(intValue = 5))
    private int modifyBlockDelay(int constant) {
        return 0;
    }
}
