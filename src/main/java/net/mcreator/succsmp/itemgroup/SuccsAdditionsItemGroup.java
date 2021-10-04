
package net.mcreator.succsmp.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.succsmp.item.TunesofSuccItem;
import net.mcreator.succsmp.SuccsmpModElements;

@SuccsmpModElements.ModElement.Tag
public class SuccsAdditionsItemGroup extends SuccsmpModElements.ModElement {
	public SuccsAdditionsItemGroup(SuccsmpModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsuccs_additions") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TunesofSuccItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
