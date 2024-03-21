package net.benjaydev.childhoodimagination.item;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.util.ModTags;
import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SCRUE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 100, 7f, 4f, 25,
                    ModTags.Blocks.NEEDS_SCRUE_TOOL, () -> Ingredient.of(ModItems.SCRUE.get())),
                    new ResourceLocation(ChildhoodImaginationMod.MODID, "scrue"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
}
