package GravityBurger.SoMuchArmor.armor;

import GravityBurger.SoMuchArmor.common.SoMuchArmor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class TitaniumArmor extends ItemArmor{

	public TitaniumArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == SoMuchArmor.TitaniumHelmet || stack.getItem() == SoMuchArmor.TitaniumChestplate || stack.getItem() == SoMuchArmor.TitaniumBoots){
			return "SoMuchArmor:textures/models/armor/TitaniumArmor_1.png";
		}
		if(stack.getItem() == SoMuchArmor.TitaniumLeggings){
			return "SoMuchArmor:textures/models/armor/TitaniumArmor_2.png";
		}
		else return null;
	};
	
	

}
