
package com.rileyicee.copperio.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

import com.rileyicee.copperio.creativetab.TabCopperTab;
import com.rileyicee.copperio.ElementsCopperIO;

@ElementsCopperIO.ModElement.Tag
public class ItemCopperPickaxe extends ElementsCopperIO.ModElement {
	@GameRegistry.ObjectHolder("copperioport:copperpickaxe")
	public static final Item block = null;
	public ItemCopperPickaxe(ElementsCopperIO instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("COPPERPICKAXE", 2, 190, 4f, 0f, 5)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("copperpickaxe").setRegistryName("copperpickaxe").setCreativeTab(TabCopperTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("copperioport:copperpickaxe", "inventory"));
	}
}
