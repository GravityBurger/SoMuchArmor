package GravityBurger.SoMuchArmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import GravityBurger.SoMuchArmor.common.SoMuchArmor;

public class NightVisionArmor extends ItemArmor{

	public NightVisionArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == SoMuchArmor.NightVisionHelmet){
			return "SoMuchArmor:textures/models/armor/NightVision_1.png";
		}
		else return null;
		
	};
	
	
	
	

}
