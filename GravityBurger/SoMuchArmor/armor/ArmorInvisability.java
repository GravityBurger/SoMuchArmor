package GravityBurger.SoMuchArmor.armor;

import java.util.List;

import GravityBurger.SoMuchArmor.common.SoMuchArmor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorInvisability extends ItemArmor{

	public ArmorInvisability(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(CreativeTabs.tabCombat);
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == SoMuchArmor.InvisabilityCloak){
			return "SoMuchArmor:textures/models/armor/InvisibilityArmor_1.png";
		}
		else return null;
	}
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4){
		list.add("A magical item, indeed.");
		list.add("Can be found in dungeon chests.");
		list.add("Makes you invisible.");
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		if(itemStack.getItem() == SoMuchArmor.InvisabilityCloak){
			player.addPotionEffect((new PotionEffect(Potion.invisibility.getId(), 2, 1)));
		}
	}
}
