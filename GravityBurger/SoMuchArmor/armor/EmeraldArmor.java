package GravityBurger.SoMuchArmor.armor;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import GravityBurger.SoMuchArmor.common.SoMuchArmor;

public class EmeraldArmor extends ItemArmor{

	public EmeraldArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == SoMuchArmor.EmeraldHelmet || stack.getItem() == SoMuchArmor.EmeraldChestplate || stack.getItem() == SoMuchArmor.EmeraldBoots){
			return "SoMuchArmor:textures/models/armor/EmeraldArmor_1.png";
		}
		if(stack.getItem() == SoMuchArmor.EmeraldLeggings){
			return "SoMuchArmor:textures/models/armor/EmeraldArmor_2.png";
		}
		else return null;
	}
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4){
		list.add("This armor is magical. It gives you regeneration, but");
		list.add("will make you weak.");
	}
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		if(itemStack.getItem() == SoMuchArmor.EmeraldHelmet || itemStack.getItem() == SoMuchArmor.EmeraldChestplate || itemStack.getItem() == SoMuchArmor.EmeraldLeggings || itemStack.getItem() == SoMuchArmor.EmeraldBoots){
			player.addPotionEffect((new PotionEffect(Potion.weakness.getId(), 2, 2)));
			player.addPotionEffect((new PotionEffect(Potion.regeneration.getId(), 2, 1)));
		}
	}
}
