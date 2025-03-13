package net.royling.LushScentedParadise.Item.colorfulflower;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.registries.ForgeRegistries;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.Registry.ModEntities;

public class MagicArrowEntity extends AbstractArrow {
    private static final int DAMAGE = 9;
    private int hitTimer = -1; // 碰撞后计时器
    private static final int MAX_HIT_TIME = 24; // 1.2秒（20 ticks/秒 * 1.2）

    public MagicArrowEntity(EntityType<? extends MagicArrowEntity> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.setNoGravity(true);
    }
    public MagicArrowEntity(Level world, LivingEntity shooter){
        super(ModEntities.MAGIC_ARROW.get(),shooter,world);
        this.setNoGravity(true);
    }

    @Override
    public void tick() {
        super.tick();
        if (hitTimer > 0) {
            hitTimer--;
            if (hitTimer <= 0) {
                this.discard();
            }
        }
        if(this.level().isClientSide){
            Vec3 motion = this.getDeltaMovement();
            for(int i = 0; i<10;i++){
                double offsetX = (random.nextDouble() - 0.5) * 0.3;
                double offsetY = (random.nextDouble() - 0.5) * 0.3;
                double offsetZ = (random.nextDouble() - 0.5) * 0.3;
                this.level().addParticle(ParticleTypes.FALLING_SPORE_BLOSSOM,this.getX()+offsetX,this.getY()+offsetY,this.getZ()+offsetZ,
                        -motion.x * 0.2, -motion.y * 0.2, -motion.z * 0.2);
            }
        }
    }

    @Override
    protected void onHitEntity(EntityHitResult pResult) {
        if(pResult.getEntity() == this.getOwner()) return;
        if(pResult.getEntity() instanceof LivingEntity target){
            target.hurt(level().damageSources().arrow(this,this.getOwner()),DAMAGE);
            this.discard();
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        this.setDeltaMovement(Vec3.ZERO);
        this.hitTimer = MAX_HIT_TIME;
        if (this.level().isClientSide) {
            Vec3 pos = pResult.getLocation();
            for (int i = 0; i < 30; i++) {
                level().addParticle(ParticleTypes.FALLING_SPORE_BLOSSOM,
                        pos.x, pos.y + 0.5, pos.z,
                        (random.nextDouble() - 0.5) * 0.5,
                        random.nextDouble() * 0.5,
                        (random.nextDouble() - 0.5) * 0.5);
            }
        }
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
    }

    @Override
    public Packet<ClientGamePacketListener> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }
}
