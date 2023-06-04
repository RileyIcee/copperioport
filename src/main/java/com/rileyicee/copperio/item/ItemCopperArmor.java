
package com.rileyicee.copperio.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import com.rileyicee.copperio.creativetab.TabCopperTab;
import com.rileyicee.copperio.ElementsCopperIO;

@ElementsCopperIO.ModElement.Tag
public class ItemCopperArmor extends ElementsCopperIO.ModElement {
	@GameRegistry.ObjectHolder("copperioport:copperarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("copperioport:copperarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("copperioport:copperarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("copperioport:copperarmorboots")
	public static final Item boots = null;
	public ItemCopperArmor(ElementsCopperIO instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("COPPERARMOR", "copperioport:copperarmorv2_", 25, new int[]{2, 5, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("copperarmorhelmet")
				.setRegistryName("copperarmorhelmet").setCreativeTab(TabCopperTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("copperarmorbody")
				.setRegistryName("copperarmorbody").setCreativeTab(TabCopperTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("copperarmorlegs")
				.setRegistryName("copperarmorlegs").setCreativeTab(TabCopperTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("copperarmorboots")
				.setRegistryName("copperarmorboots").setCreativeTab(TabCopperTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("copperioport:copperarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("copperioport:copperarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("copperioport:copperarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("copperioport:copperarmorboots", "inventory"));
	}
}
