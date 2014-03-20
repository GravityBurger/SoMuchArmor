package GravityBurger.SoMuchArmor.armor;

import GravityBurger.SoMuchArmor.common.SoMuchArmor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class MagicalArmor extends ItemArmor{

	public MagicalArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == SoMuchArmor.MagicalHelmet || stack.getItem() == SoMuchArmor.MagicalChestplate || stack.getItem() == SoMuchArmor.MagicalBoots){
			return "SoMuchArmor:textures/models/armor/MagicalArmor_1.png";
		}
		if(stack.getItem() == SoMuchArmor.MagicalLeggings){
			return "SoMuchArmor:textures/models/armor/MagicalArmor_2.png";
		}
		else return null;
	}
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		if(itemStack.getItem() == SoMuchArmor.MagicalHelmet){
			player.addPotionEffect((new PotionEffect(Potion.field_76443_y.getId(), 1, 1)));
		}
		if(itemStack.getItem() == SoMuchArmor.MagicalChestplate){
			player.addPotionEffect((new PotionEffect(Potion.digSpeed.getId(), 1, 4)));
		}
		if(itemStack.getItem() == SoMuchArmor.MagicalLeggings){
			player.addPotionEffect((new PotionEffect(Potion.moveSpeed.getId(), 1, 3)));
		}
		if(itemStack.getItem() == SoMuchArmor.MagicalBoots){
			player.addPotionEffect((new PotionEffect(Potion.fireResistance.getId(), 1, 1)));
			player.addPotionEffect((new PotionEffect(Potion.jump.getId(), 1, 1)));
		}
	}
	public boolean hasEffect(ItemStack itemStack){
		return true;
	}
}
