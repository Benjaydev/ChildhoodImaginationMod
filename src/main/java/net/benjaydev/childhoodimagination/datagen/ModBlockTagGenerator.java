package net.benjaydev.childhoodimagination.datagen;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.block.ModBlocks;
import net.benjaydev.childhoodimagination.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ChildhoodImaginationMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SCRUE_ORE.get())
                .add(ModBlocks.EASTER_GEM_ORE.get());


        this.tag(ModTags.Blocks.NEEDS_SCRUE_TOOL)
                .add(ModBlocks.EASTER_GEM_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.SCRUE_ORE.get());

    }
}
