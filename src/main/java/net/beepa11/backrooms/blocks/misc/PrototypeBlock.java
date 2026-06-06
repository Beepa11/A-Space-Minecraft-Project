package net.beepa11.backrooms.blocks.misc;

import net.beepa11.backrooms.registry.BRBlockEntities;
import net.beepa11.backrooms.registry.BRBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class PrototypeBlock extends Block implements EntityBlock {
    public PrototypeBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return BRBlockEntities.PROTOTYPE.create(blockPos,blockState);
    }
}
