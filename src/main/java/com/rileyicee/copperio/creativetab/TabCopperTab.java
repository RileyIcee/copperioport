
package com.rileyicee.copperio.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import com.rileyicee.copperio.item.ItemCopperIngot;
import com.rileyicee.copperio.ElementsCopperIO;

@ElementsCopperIO.ModElement.Tag
public class TabCopperTab extends ElementsCopperIO.ModElement {
	public TabCopperTab(ElementsCopperIO instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabcoppertab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCopperIngot.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
