
package net.mcreator.succsmp.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.succsmp.itemgroup.SuccsAdditionsItemGroup;
import net.mcreator.succsmp.SuccsmpModElements;

@SuccsmpModElements.ModElement.Tag
public class NajiteClumpItem extends SuccsmpModElements.ModElement {
	@ObjectHolder("succsmp:najite_clump")
	public static final Item block = null;
	public NajiteClumpItem(SuccsmpModElements instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SuccsAdditionsItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.UNCOMMON));
			setRegistryName("najite_clump");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
