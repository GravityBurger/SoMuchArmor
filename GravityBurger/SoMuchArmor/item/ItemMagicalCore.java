package GravityBurger.SoMuchArmor.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMagicalCore extends Item{

	public ItemMagicalCore(){
		
	}
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4){
		list.add("Explorers don't know why");
		list.add("there are so many of these.");
	}
	public boolean hasEffect(ItemStack itemStack){
		return true;
	}
	
}
