
package net.mcreator.succsmp.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.succsmp.itemgroup.SuccsAdditionsItemGroup;
import net.mcreator.succsmp.SuccsmpModElements;

@SuccsmpModElements.ModElement.Tag
public class SuccitePickaxeItem extends SuccsmpModElements.ModElement {
	@ObjectHolder("succsmp:succite_pickaxe")
	public static final Item block = null;
	public SuccitePickaxeItem(SuccsmpModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 5200;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(SuccsAdditionsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("succite_pickaxe"));
	}
}
