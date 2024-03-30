package net.benjaydev.childhoodimagination.worldgen.biome.surface;


import net.benjaydev.childhoodimagination.block.ModBlocks;
import net.benjaydev.childhoodimagination.worldgen.biome.ModBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraftforge.fml.common.Mod;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource SCRUE = makeStateRule(ModBlocks.SCRUE_ORE.get());
    private static final SurfaceRules.RuleSource EASTER_GEM = makeStateRule(ModBlocks.EASTER_GEM_ORE.get());


    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return SurfaceRules.sequence(
                SurfaceRules.sequence(
                        SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.EASTER_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, EASTER_GEM)),


                // Default to a grass and dirt surface
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}