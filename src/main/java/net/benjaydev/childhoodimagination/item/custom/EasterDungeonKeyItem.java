package net.benjaydev.childhoodimagination.item.custom;

import net.benjaydev.childhoodimagination.block.ModBlocks;
import net.benjaydev.childhoodimagination.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.fml.common.Mod;

public class EasterDungeonKeyItem extends Item {
    public EasterDungeonKeyItem(Properties pProperties) {
        super(pProperties);
    }


    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        if(!level.isClientSide()){
            BlockPos positionClicked = pContext.getClickedPos();

            BlockState blockState = level.getBlockState(positionClicked);
            Block block = blockState.getBlock();
            
            // If is the dungeon block, destroy
            if(blockState.is(ModBlocks.EASTER_DUNGEON_BEDROCK.get())){
                level.destroyBlock(positionClicked, false);
                level.updateNeighborsAt(positionClicked, block);


                pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), player -> player.broadcastBreakEvent(player.getUsedItemHand()));
            }
        }



        return super.useOn(pContext);
    }
}
