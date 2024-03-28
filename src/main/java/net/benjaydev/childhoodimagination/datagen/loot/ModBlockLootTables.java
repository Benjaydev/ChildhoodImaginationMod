package net.benjaydev.childhoodimagination.datagen.loot;

import net.benjaydev.childhoodimagination.block.ModBlocks;
import net.benjaydev.childhoodimagination.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(ModBlocks.SCRUE_ORE.get(),
                block -> createOreDrop(ModBlocks.SCRUE_ORE.get(), ModItems.SCRUE_CHUNK.get()));

        this.add(ModBlocks.EASTER_GEM_ORE.get(),
                block -> createOreDrop(ModBlocks.EASTER_GEM_ORE.get(), ModItems.EASTER_GEM.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
