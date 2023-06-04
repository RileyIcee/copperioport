
package com.rileyicee.copperio.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import com.rileyicee.copperio.item.ItemRawCopper;
import com.rileyicee.copperio.item.ItemCopperIngot;
import com.rileyicee.copperio.ElementsCopperIO;

@ElementsCopperIO.ModElement.Tag
public class RecipeRawCoptoCop extends ElementsCopperIO.ModElement {
	public RecipeRawCoptoCop(ElementsCopperIO instance) {
		super(instance, 14);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemRawCopper.block, (int) (1)), new ItemStack(ItemCopperIngot.block, (int) (1)), 1F);
	}
}
