package com.example.exolithspirerange.mixin;

import com.example.exolithspirerange.SpireRangeConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(targets = "it.mralxart.exolith.tiles.StarfallSpireTile")
public abstract class StarfallSpireTileMixin {
    @ModifyConstant(
            method = "isPlayerNearbyCylindrical",
            constant = @Constant(doubleValue = 1024.0D),
            require = 1
    )
    private double exolithSpireRange$nearbyRadiusSquared(double original) {
        return SpireRangeConfig.radiusSquared();
    }

    @ModifyConstant(
            method = "isPlayerProtected",
            constant = @Constant(doubleValue = 1024.0D),
            require = 1
    )
    private static double exolithSpireRange$protectionRadiusSquared(double original) {
        return SpireRangeConfig.radiusSquared();
    }
}
