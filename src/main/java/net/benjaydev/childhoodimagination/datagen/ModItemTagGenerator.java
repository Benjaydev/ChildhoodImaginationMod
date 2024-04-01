package net.benjaydev.childhoodimagination.datagen;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.block.ModBlocks;
import net.benjaydev.childhoodimagination.item.ModItems;
import net.benjaydev.childhoodimagination.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
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

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BLUE_EASTER_BOOTS.get(),
                        ModItems.BLUE_EASTER_LEGGINGS.get(),
                        ModItems.BLUE_EASTER_CHESTPLATE.get(),
                        ModItems.BLUE_EASTER_HELMET.get());

        this.tag(ModTags.Items.EASTER_ARMOR)
                .add(ModItems.BLUE_EASTER_BOOTS.get(),
                    ModItems.BLUE_EASTER_LEGGINGS.get(),
                    ModItems.BLUE_EASTER_CHESTPLATE.get(),
                    ModItems.BLUE_EASTER_HELMET.get())
                .add(ModItems.RED_EASTER_BOOTS.get(),
                        ModItems.RED_EASTER_LEGGINGS.get(),
                        ModItems.RED_EASTER_CHESTPLATE.get(),
                        ModItems.RED_EASTER_HELMET.get())
                .add(ModItems.ORANGE_EASTER_BOOTS.get(),
                        ModItems.ORANGE_EASTER_LEGGINGS.get(),
                        ModItems.ORANGE_EASTER_CHESTPLATE.get(),
                        ModItems.ORANGE_EASTER_HELMET.get())
                .add(ModItems.PURPLE_EASTER_BOOTS.get(),
                        ModItems.PURPLE_EASTER_LEGGINGS.get(),
                        ModItems.PURPLE_EASTER_CHESTPLATE.get(),
                        ModItems.PURPLE_EASTER_HELMET.get())
                .add(ModItems.BROWN_EASTER_BOOTS.get(),
                        ModItems.BROWN_EASTER_LEGGINGS.get(),
                        ModItems.BROWN_EASTER_CHESTPLATE.get(),
                        ModItems.BROWN_EASTER_HELMET.get())
                .add(ModItems.YELLOW_EASTER_BOOTS.get(),
                        ModItems.YELLOW_EASTER_LEGGINGS.get(),
                        ModItems.YELLOW_EASTER_CHESTPLATE.get(),
                        ModItems.YELLOW_EASTER_HELMET.get())
                .add(ModItems.GREEN_EASTER_BOOTS.get(),
                        ModItems.GREEN_EASTER_LEGGINGS.get(),
                        ModItems.GREEN_EASTER_CHESTPLATE.get(),
                        ModItems.GREEN_EASTER_HELMET.get())
                .add(ModItems.GRAY_EASTER_BOOTS.get(),
                        ModItems.GRAY_EASTER_LEGGINGS.get(),
                        ModItems.GRAY_EASTER_CHESTPLATE.get(),
                        ModItems.GRAY_EASTER_HELMET.get())
                .add(ModItems.FIRE_EASTER_BOOTS.get(),
                        ModItems.FIRE_EASTER_LEGGINGS.get(),
                        ModItems.FIRE_EASTER_CHESTPLATE.get(),
                        ModItems.FIRE_EASTER_HELMET.get())
                .add(ModItems.VOID_EASTER_BOOTS.get(),
                        ModItems.VOID_EASTER_LEGGINGS.get(),
                        ModItems.VOID_EASTER_CHESTPLATE.get(),
                        ModItems.VOID_EASTER_HELMET.get());
    }
}
