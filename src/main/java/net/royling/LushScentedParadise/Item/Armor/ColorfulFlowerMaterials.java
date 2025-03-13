package net.royling.LushScentedParadise.Item.Armor;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.royling.LushScentedParadise.Registry.ModItems;

import java.util.function.Supplier;

public enum ColorfulFlowerMaterials implements ArmorMaterial {

    COLORFUL_FLOWER_MATERIALS("lushscentedparadise:colorful_flower",45,new int[]{3,8,6,3},25,SoundEvents.ARMOR_EQUIP_LEATHER,2.0f,0.02f,
            ()->Ingredient.of(ModItems.FLOWER_INGOT.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] defenseAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;
    private static final int[] DURABILITY_BASE = {13, 15, 16, 11};

    ColorfulFlowerMaterials(String name, int durabilityMultiplier, int[] defenseAmounts, int enchantability,
                            SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.defenseAmounts = defenseAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return DURABILITY_BASE[type.ordinal()]*durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return defenseAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }

    @Override
    public String getName() {
        return "lushscentedparadise:colorful_flower";
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}
