
package net.mcreator.succsmp.item;

@SuccsmpModElements.ModElement.Tag
public class SucciteAxeItem extends SuccsmpModElements.ModElement {

	@ObjectHolder("succsmp:succite_axe")
	public static final Item block = null;

	public SucciteAxeItem(SuccsmpModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
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

		}.setRegistryName("succite_axe"));
	}

}
