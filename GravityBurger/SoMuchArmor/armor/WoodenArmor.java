package GravityBurger.SoMuchArmor.armor;

import java.util.List;

import GravityBurger.SoMuchArmor.common.SoMuchArmor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class WoodenArmor extends ItemArmor{

	public WoodenArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(SoMuchArmor.SMATab);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == SoMuchArmor.WoodenHelmet || stack.getItem() == SoMuchArmor.WoodenChestplate || stack.getItem() == SoMuchArmor.WoodenBoots){
			return "SoMuchArmor:textures/models/armor/WoodenArmor_1.png";
		}
		if(stack.getItem() == SoMuchArmor.WoodenLeggings){
			return "SoMuchArmor:textures/models/armor/WoodenArmor_2.png";
		}
		else return null;
	}
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4){
		list.add("Not very strong...");
	}
}
