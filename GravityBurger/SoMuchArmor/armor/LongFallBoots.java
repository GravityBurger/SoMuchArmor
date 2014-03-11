package GravityBurger.SoMuchArmor.armor;

import java.util.List;

import GravityBurger.SoMuchArmor.common.SoMuchArmor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LongFallBoots extends ItemArmor{

	public LongFallBoots(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == SoMuchArmor.LongFallBoots){
			return "SoMuchArmor:textures/models/armor/LongFallBoots_1.png";
		}
		else return null;

	
	}
	
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4){
		list.add("'Gentlement, I give you the");
		list.add("Long Fall Boots! I'm not");
		list.add("gonna lie to you, they");
		list.add("were expensive as hell.'");
		list.add("-Cave Johnson");
	}
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		if(itemStack.getItem() == SoMuchArmor.LongFallBoots){
			player.fallDistance = 0.0f;
		}
	}
	
	
	
	
}
