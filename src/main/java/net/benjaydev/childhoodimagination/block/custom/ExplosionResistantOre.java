package net.benjaydev.childhoodimagination.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ExplosionResistantOre extends DropExperienceBlock {
    public ExplosionResistantOre(Properties pProperties, IntProvider pXpRange) {
        super(pProperties, pXpRange);
    }


    @Override
    public boolean canDropFromExplosion(BlockState state, BlockGetter level, BlockPos pos, Explosion explosion) {
        return false;
    }
}
