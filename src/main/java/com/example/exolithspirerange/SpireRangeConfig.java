package com.example.exolithspirerange;

import net.neoforged.neoforge.common.ModConfigSpec;

public final class SpireRangeConfig {
    public static final ModConfigSpec SPEC;
    public static final ModConfigSpec.DoubleValue RADIUS;

    static {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();
        builder.push("starfallSpire");
        RADIUS = builder
                .comment("Starfall Spire range in blocks. Applies to nearby-player checks and protection.")
                .defineInRange("radius", 64.0D, 1.0D, 512.0D);
        builder.pop();
        SPEC = builder.build();
    }

    private SpireRangeConfig() {
    }

    public static double radiusSquared() {
        double radius = RADIUS.get();
        return radius * radius;
    }
}
