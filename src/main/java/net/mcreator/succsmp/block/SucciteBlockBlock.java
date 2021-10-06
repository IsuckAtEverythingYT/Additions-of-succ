
package net.mcreator.succsmp.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.succsmp.itemgroup.SuccsAdditionsItemGroup;
import net.mcreator.succsmp.SuccsmpModElements;

import java.util.List;
import java.util.Collections;

@SuccsmpModElements.ModElement.Tag
public class SucciteBlockBlock extends SuccsmpModElements.ModElement {
	@ObjectHolder("succsmp:succite_block")
	public static final Block block = null;
	public SucciteBlockBlock(SuccsmpModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(SuccsAdditionsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK)
					.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.netherite_block.break")),
							() -> new SoundEvent(new ResourceLocation("block.netherite_block.step")),
							() -> new SoundEvent(new ResourceLocation("block.netherite_block.place")),
							() -> new SoundEvent(new ResourceLocation("block.netherrack.hit")),
							() -> new SoundEvent(new ResourceLocation("block.netherite_block.fall"))))
					.hardnessAndResistance(1.05f, 1000000f).setLightLevel(s -> 0).harvestLevel(4).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("succite_block");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
