package net.benjaydev.childhoodimagination.datagen;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ChildhoodImaginationMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.EASTER_DUNGEON_BEDROCK);
        blockWithItem(ModBlocks.EASTER_GEM_ORE);
        blockWithItem(ModBlocks.SCRUE_ORE);
        blockWithItem(ModBlocks.EASTER_PORTAL);
        blockWithItem(ModBlocks.BLUE_COMPRESSED_EASTER_BLOCK);
        blockWithItem(ModBlocks.RED_COMPRESSED_EASTER_BLOCK);
        blockWithItem(ModBlocks.ORANGE_COMPRESSED_EASTER_BLOCK);
        blockWithItem(ModBlocks.PURPLE_COMPRESSED_EASTER_BLOCK);
        blockWithItem(ModBlocks.BROWN_COMPRESSED_EASTER_BLOCK);
        blockWithItem(ModBlocks.YELLOW_COMPRESSED_EASTER_BLOCK);
        blockWithItem(ModBlocks.GREEN_COMPRESSED_EASTER_BLOCK);
        blockWithItem(ModBlocks.GRAY_COMPRESSED_EASTER_BLOCK);
        blockWithItem(ModBlocks.FIRE_COMPRESSED_EASTER_BLOCK);
        blockWithItem(ModBlocks.VOID_COMPRESSED_EASTER_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
