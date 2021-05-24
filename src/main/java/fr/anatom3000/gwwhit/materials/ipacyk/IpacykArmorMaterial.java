package fr.anatom3000.gwwhit.materials.ipacyk;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
public class IpacykArmorMaterial implements ArmorMaterial {
public static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
public static final int[] PROTECTION_VALUES = new int[] {1, 2, 3, 1};

@Override
public int getDurability(EquipmentSlot slot) {
return BASE_DURABILITY[slot.getEntitySlotId()] * 30;
}
@Override
public int getProtectionAmount(EquipmentSlot slot) {
return PROTECTION_VALUES[slot.getEntitySlotId()];
}
@Override
public int getEnchantability() {
return 5;
}
@Override
public Ingredient getRepairIngredient() {
return Ingredient.ofItems(IpacykRoot.IPACYK_INGOT);
}
@Override
public String getName() {
return "ipacyk";
}
@Override
public float getToughness() {
return 4.199092310402757f;
}
@Override
public float getKnockbackResistance() {
return 1.9139139528828422f;
}
@Override
public SoundEvent getEquipSound() {
return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
}
}