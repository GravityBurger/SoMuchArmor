package GravityBurger.SoMuchArmor.armor;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import GravityBurger.SoMuchArmor.common.SoMuchArmor;

public class CobbleArmor extends ItemArmor {

	public CobbleArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(SoMuchArmor.SMATab);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == SoMuchArmor.CobbleHelmet || stack.getItem() == SoMuchArmor.CobbleChestplate || stack.getItem() == SoMuchArmor.CobbleBoots){
			return "SoMuchArmor:textures/models/armor/CobbleArmor_1.png";
		}
		if(stack.getItem() == SoMuchArmor.CobbleLeggings){
			return "SoMuchArmor:textures/models/armor/CobbleArmor_2.png";
		}
		else return null;
	}
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4){
		list.add("Better than leather, but");
		list.add("not as strong as Iron");
	}
}
