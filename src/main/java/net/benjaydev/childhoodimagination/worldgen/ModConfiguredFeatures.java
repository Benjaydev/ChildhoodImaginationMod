package net.benjaydev.childhoodimagination.worldgen;

import io.netty.bootstrap.BootstrapConfig;
import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SCRUE_ORE_KEY = registerKey("scrue_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EASTER_GEM_ORE_KEY = registerKey("easter_gem_ore");


    public static void boostrap(BootstapContext<ConfiguredFeature<?, ?>> context){
        RuleTest stoneReplacable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldScrueOres = List.of(OreConfiguration.target(stoneReplacable,
                ModBlocks.SCRUE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldEasterGemOres = List.of(OreConfiguration.target(stoneReplacable,
                ModBlocks.EASTER_GEM_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_SCRUE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldScrueOres, 4));
        register(context, OVERWORLD_EASTER_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldEasterGemOres, 1));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ChildhoodImaginationMod.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
