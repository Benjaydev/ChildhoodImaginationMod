package net.benjaydev.childhoodimagination.datagen;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.block.ModBlocks;
import net.benjaydev.childhoodimagination.item.ModItems;
import net.benjaydev.childhoodimagination.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, ChildhoodImaginationMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(ModTags.Items.COMPRESSED_EASTER_BLOCK)
                .add(ModBlocks.BLUE_COMPRESSED_EASTER_BLOCK.get().asItem())
                .add(ModBlocks.RED_COMPRESSED_EASTER_BLOCK.get().asItem())
                .add(ModBlocks.ORANGE_COMPRESSED_EASTER_BLOCK.get().asItem())
                .add(ModBlocks.PURPLE_COMPRESSED_EASTER_BLOCK.get().asItem())
                .add(ModBlocks.BROWN_COMPRESSED_EASTER_BLOCK.get().asItem())
                .add(ModBlocks.YELLOW_COMPRESSED_EASTER_BLOCK.get().asItem())
                .add(ModBlocks.GREEN_COMPRESSED_EASTER_BLOCK.get().asItem())
                .add(ModBlocks.GRAY_COMPRESSED_EASTER_BLOCK.get().asItem())
                .add(ModBlocks.FIRE_COMPRESSED_EASTER_BLOCK.get().asItem())
                .add(ModBlocks.VOID_COMPRESSED_EASTER_BLOCK.get().asItem());
    }
}
