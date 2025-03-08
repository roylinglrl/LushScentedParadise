package net.royling.LushScentedParadise.ModBlock.TeapotBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;
import net.royling.LushScentedParadise.Registry.ModBlockEntities;
import org.jetbrains.annotations.Nullable;

public class TeapotBlock extends Block implements EntityBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;


    public static final BooleanProperty HEATED = BooleanProperty.create("heated");


    public TeapotBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(HEATED, false));
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new TeapotBlockEntity(pPos, pState);
    }
    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        if (type == ModBlockEntities.TEAPOT.get()) {
            return level.isClientSide
                    ? (BlockEntityTicker<T>) (lvl, pos, st, be) -> ((TeapotBlockEntity) be).clientTick(st)
                    : (BlockEntityTicker<T>) (lvl, pos, st, be) -> ((TeapotBlockEntity) be).serverTick();
        }
        return null;
    }


    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if(!pLevel.isClientSide){
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if(blockEntity instanceof TeapotBlockEntity teapot){
                if(teapot.isHeated()){
                    if(pPlayer instanceof ServerPlayer serverPlayer){
                        NetworkHooks.openScreen(serverPlayer,teapot,pPos);
                    }

                }else {
                    pPlayer.displayClientMessage(Component.translatable("lushscentedparadise.no_heated.text"),true);
                }
            }
        }
        return InteractionResult.sidedSuccess(pLevel.isClientSide);
    }

    @Override
    public void neighborChanged(BlockState pState, Level pLevel, BlockPos pPos, Block pNeighborBlock, BlockPos pNeighborPos, boolean pMovedByPiston) {
        if(!pLevel.isClientSide){
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if(blockEntity instanceof TeapotBlockEntity teapot){
                boolean previousState = teapot.isHeated();
                teapot.updateHeatingState();
                if(previousState != teapot.isHeated()){
                    teapot.setChanged();
                }
            }
        }
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING,pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING,HEATED);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return Shapes.box(0.2, 0, 0.2, 0.8, 0.6, 0.8);
    }
    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!state.is(newState.getBlock())) {
            if (level.getBlockEntity(pos) instanceof TeapotBlockEntity blockEntity) {
                SimpleContainer inventory = new SimpleContainer(blockEntity.getInventory().getSlots());
                for (int i = 0; i < blockEntity.getInventory().getSlots(); i++) {
                    inventory.setItem(i, blockEntity.getInventory().getStackInSlot(i));
                }
                Containers.dropContents(level, pos, inventory);
            }
        }
        super.onRemove(state, level, pos, newState, isMoving);
    }

}
