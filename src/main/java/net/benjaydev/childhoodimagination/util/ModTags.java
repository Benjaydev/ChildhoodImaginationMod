package net.benjaydev.childhoodimagination.util;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SCRUE_TOOL = tag("needs_scrue_tool");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(ChildhoodImaginationMod.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> COMPRESSED_EASTER_BLOCK = tag("compressed_easter_block");
        public static final TagKey<Item> EASTER_ARMOR = tag("easter_armor");

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(ChildhoodImaginationMod.MODID, name));
        }
    }

}
