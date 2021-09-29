
package net.mcreator.succsmp.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PotionOfSuccPotion {
	@ObjectHolder("succsmp:potion_of_succ")
	public static final Potion potionType = null;
	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(Effects.STRENGTH, 500, 3, false, true), new EffectInstance(Effects.HASTE, 500, 3, false, true),
					new EffectInstance(Effects.SLOWNESS, 500, 2, false, true), new EffectInstance(Effects.HEALTH_BOOST, 500, 4, false, true),
					new EffectInstance(Effects.REGENERATION, 500, 3, false, true));
			setRegistryName("potion_of_succ");
		}
	}
}
