
package net.mcreator.succsmp.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.succsmp.itemgroup.SuccsAdditionsItemGroup;
import net.mcreator.succsmp.SuccsmpModElements;

@SuccsmpModElements.ModElement.Tag
public class MakkusediteSwordItem extends SuccsmpModElements.ModElement {
	@ObjectHolder("succsmp:makkusedite_sword")
	public static final Item block = null;
	public MakkusediteSwordItem(SuccsmpModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 5200;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MakkusediteClumpItem.block));
			}
		}, 3, -2f, new Item.Properties().group(SuccsAdditionsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("makkusedite_sword"));
	}
}
