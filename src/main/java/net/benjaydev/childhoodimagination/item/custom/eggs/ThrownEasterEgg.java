
package net.benjaydev.childhoodimagination.item.custom.eggs;


import net.benjaydev.childhoodimagination.entity.ModEntities;
import net.benjaydev.childhoodimagination.entity.custom.EasterChickenEntity;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class ThrownEasterEgg extends ThrowableItemProjectile {

    private String CHICKEN_TYPE = "blue";

    public ThrownEasterEgg(EntityType<? extends ThrownEasterEgg> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public ThrownEasterEgg(Level pLevel, LivingEntity pShooter) {
        super(EntityType.EGG, pShooter, pLevel);
    }

    public ThrownEasterEgg(Level pLevel, double pX, double pY, double pZ) {
        super(EntityType.EGG, pX, pY, pZ, pLevel);
    }

    public void SetChickenType(String chicken_type){
        CHICKEN_TYPE = chicken_type;
    }

    public void handleEntityEvent(byte pId) {
        if (pId == 3) {
            double $$1 = 0.08;

            for(int i = 0; i < 8; ++i) {
                this.level().addParticle(new ItemParticleOption(ParticleTypes.ITEM, this.getItem()), this.getX(), this.getY(), this.getZ(), ((double)this.random.nextFloat() - 0.5) * 0.08, ((double)this.random.nextFloat() - 0.5) * 0.08, ((double)this.random.nextFloat() - 0.5) * 0.08);
            }
        }

    }

    protected void onHitEntity(EntityHitResult pResult) {
        super.onHitEntity(pResult);
        pResult.getEntity().hurt(this.damageSources().thrown(this, this.getOwner()), 0.0F);
    }

    protected void onHit(HitResult pResult) {
        super.onHit(pResult);
        if (!this.level().isClientSide) {
            if (this.random.nextInt(4) == 0) {
                int chickenCount = 1;
                if (this.random.nextInt(32) == 0) {
                    chickenCount = 4;
                }

                for(int i = 0; i < chickenCount; ++i) {
                    EasterChickenEntity easterChicken;

                    switch (CHICKEN_TYPE){
                        case "blue":
                            easterChicken = ModEntities.BLUE_EASTER_CHICKEN.get().create(level());
                            break;
                        case "red":
                            easterChicken = ModEntities.RED_EASTER_CHICKEN.get().create(level());
                            break;
                        case "orange":
                            easterChicken = ModEntities.ORANGE_EASTER_CHICKEN.get().create(level());
                            break;
                        case "purple":
                            easterChicken = ModEntities.PURPLE_EASTER_CHICKEN.get().create(level());
                            break;
                        case "brown":
                            easterChicken = ModEntities.BROWN_EASTER_CHICKEN.get().create(level());
                            break;
                        case "yellow":
                            easterChicken = ModEntities.YELLOW_EASTER_CHICKEN.get().create(level());
                            break;
                        case "green":
                            easterChicken = ModEntities.GREEN_EASTER_CHICKEN.get().create(level());
                            break;
                        case "gray":
                            easterChicken = ModEntities.GRAY_EASTER_CHICKEN.get().create(level());
                            break;
                        case "fire":
                            easterChicken = ModEntities.FIRE_EASTER_CHICKEN.get().create(level());
                            break;
                        case "void":
                            easterChicken = ModEntities.VOID_EASTER_CHICKEN.get().create(level());
                            break;
                        default:
                            easterChicken = ModEntities.BLUE_EASTER_CHICKEN.get().create(level());
                            break;
                    }

                    if (easterChicken != null) {
                        easterChicken.setAge(-24000);
                        easterChicken.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
                        this.level().addFreshEntity(easterChicken);
                    }
                }
            }

            this.level().broadcastEntityEvent(this, (byte)3);
            this.discard();
        }

    }

    protected Item getDefaultItem() {
        return Items.EGG;
    }
}
