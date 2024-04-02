package net.benjaydev.childhoodimagination.item.custom;

import net.benjaydev.childhoodimagination.block.ModBlocks;
import net.benjaydev.childhoodimagination.item.ModItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.StructureTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.EyeOfEnder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
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
