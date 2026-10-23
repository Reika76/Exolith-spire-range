package com.example.exolithspirerange;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(ExolithSpireRange.MOD_ID)
public final class ExolithSpireRange {
    public static final String MOD_ID = "exolith_spire_range";

    public ExolithSpireRange(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.COMMON, SpireRangeConfig.SPEC);
    }
}
