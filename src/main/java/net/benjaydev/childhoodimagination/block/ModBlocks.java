package net.benjaydev.childhoodimagination.block;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.block.custom.EasterPortalBlock;
import net.benjaydev.childhoodimagination.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ChildhoodImaginationMod.MODID);

    public static final RegistryObject<Block> SCRUE_ORE = registerBlock("scrue_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                    UniformInt.of(3, 6)));

    public static final RegistryObject<Block> EASTER_DUNGEON_BEDROCK = registerBlock("easter_dungeon_bedrock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK).noLootTable()));


    public static final RegistryObject<Block> EASTER_GEM_ORE = registerBlock("easter_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                    UniformInt.of(6, 12)));

    public static final RegistryObject<Block> EASTER_PORTAL = registerBlock("easter_portal",
            () -> new EasterPortalBlock(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE)));

    // Compressed easter blocks
    public static final RegistryObject<Block> BLUE_COMPRESSED_EASTER_BLOCK = registerBlock("blue_compressed_easter_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> RED_COMPRESSED_EASTER_BLOCK = registerBlock("red_compressed_easter_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> ORANGE_COMPRESSED_EASTER_BLOCK = registerBlock("orange_compressed_easter_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> PURPLE_COMPRESSED_EASTER_BLOCK = registerBlock("purple_compressed_easter_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> YELLOW_COMPRESSED_EASTER_BLOCK = registerBlock("yellow_compressed_easter_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> BROWN_COMPRESSED_EASTER_BLOCK = registerBlock("brown_compressed_easter_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> GREEN_COMPRESSED_EASTER_BLOCK = registerBlock("green_compressed_easter_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> GRAY_COMPRESSED_EASTER_BLOCK = registerBlock("gray_compressed_easter_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> FIRE_COMPRESSED_EASTER_BLOCK = registerBlock("fire_compressed_easter_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> VOID_COMPRESSED_EASTER_BLOCK = registerBlock("void_compressed_easter_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventbus){
        BLOCKS.register(eventbus);
    }

}
