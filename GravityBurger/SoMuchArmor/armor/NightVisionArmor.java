package GravityBurger.SoMuchArmor.armor;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import GravityBurger.SoMuchArmor.common.SoMuchArmor;

public class NightVisionArmor extends ItemArmor{

	public NightVisionArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(SoMuchArmor.SMATab);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == SoMuchArmor.NightVisionHelmet){
			return "SoMuchArmor:textures/models/armor/NightVision_1.png";
		}
		else return null;
		
	
		
		
		
	}
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		if(itemStack.getItem() == SoMuchArmor.NightVisionHelmet){
			player.addPotionEffect((new PotionEffect(Potion.nightVision.getId(), 19, 1)));
		}
	}
	
	
	
	
	

}
