package net.royling.LushScentedParadise.ModBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.registries.ForgeRegistries;
import net.royling.LushScentedParadise.Registry.ModBlocks;
import net.royling.LushScentedParadise.Registry.ModItems;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("removal")
public class VanillaCropBlock extends CropBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 7); // 8个生长阶段
    public static final TagKey<Item> SHEARS = TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(), new ResourceLocation("forge", "shears"));

    public VanillaCropBlock() {
        super(Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.CROP));
        this.registerDefaultState(this.getStateDefinition().any().setValue(AGE,0));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader pLevel, BlockPos pPos, BlockState pState, boolean pIsClient) {
        return pState.getValue(AGE)<7;
    }

    @Override
    public boolean isBonemealSuccess(Level pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
        int age = pState.getValue(AGE);
        if(age<7){
            pLevel.setBlock(pPos,pState.setValue(AGE,age+1),2);
        }
    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader world, BlockPos pos) {
        return world.getBlockState(pos.below()).is(Blocks.GRASS_BLOCK) ||
                world.getBlockState(pos.below()).is(Blocks.DIRT) ||
                world.getBlockState(pos.below()).is(Blocks.FARMLAND);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hit) {
        if (state.getValue(AGE) == 7) {
            ItemStack heldItem = player.getItemInHand(hand);

            if (heldItem.is(SHEARS)) {
                if (!level.isClientSide) {
                    int amount = 1 + level.getRandom().nextInt(3);
                    level.playSound(null, pos, SoundEvents.SHEEP_SHEAR, SoundSource.BLOCKS, 1.0F, 1.0F);
                    Block.popResource(level, pos, new ItemStack(ModItems.VANILLA_POD.get(), amount));
                    level.setBlock(pos, state.setValue(AGE, 3), 2);
                    heldItem.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(hand));
                }
                return InteractionResult.SUCCESS;
            }
        }
        return super.use(state, level, pos, player, hand, hit);
    }

    @Override
    public @NotNull ItemStack getCloneItemStack(@NotNull BlockGetter pLevel, @NotNull BlockPos pPos, @NotNull BlockState pState) {
        return new ItemStack(ModBlocks.VANILLA_CROP.get());
    }
    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (entity instanceof Player) {
            entity.setDeltaMovement(entity.getDeltaMovement().multiply(0.05, 0.1, 0.05));
        }
        super.entityInside(state, level, pos, entity);
    }

}
