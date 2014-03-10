package GravityBurger.SoMuchArmor.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import GravityBurger.SoMuchArmor.armor.NightVisionArmor;
import GravityBurger.SoMuchArmor.block.BlockTitaniumOre;
import GravityBurger.SoMuchArmor.item.ItemSteelIngot;
import GravityBurger.SoMuchArmor.item.ItemTitaniumIngot;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "SoMuchArmor", name = "So Much Armor", version = "Alpha 1.0")

public class SoMuchArmor {
@SidedProxy(clientSide = "GravityBurger.SoMuchArmor.common.ClientProxy", serverSide = "GravityBurger.SoMuchArmor.common.CommonProxy")
public static CommonProxy proxy;
	
//Armor ID's
private static int NightVision;

//Armor Material
public static ArmorMaterial NightVisionArmor = EnumHelper.addArmorMaterial("NIGHTVISION", 15, new int[] {2, 0, 0, 0}, 10);


//Armor Registration

public static Item NightVisionHelmet = new NightVisionArmor(NightVisionArmor, NightVision, 0).setUnlocalizedName("NightVisionHelmet").setTextureName("SoMuchArmor:NightVisionHelmet");


//WorldGen

public static TitaniumOreWG worldgen1 = new TitaniumOreWG();


//Item Registration

public static Item SteelIngot = new ItemSteelIngot(4000).setUnlocalizedName("SteelIngot").setTextureName("SoMuchArmor:SteelIngot");
public static Item TitaniumIngot = new ItemTitaniumIngot(4001).setUnlocalizedName("TitaniumIngot").setTextureName("SoMuchArmor:TitaniumIngot");
	
//Ore Registration

public static Block TitaniumOre = new BlockTitaniumOre(3000, Material.rock).setBlockTextureName("SoMuchArmor:TitaniumOre");
	
	public SoMuchArmor(){
		
		
		//Armor GameRegistry
		GameRegistry.registerItem(NightVisionHelmet, "NightVisionHelmet");
		
		
		
		
		//Item GameRegistry
		
		GameRegistry.registerItem(SteelIngot, "SteelIngot");
		GameRegistry.registerItem(TitaniumIngot, "TitanuiumIngot");
		
		//Ore Registration
		
		GameRegistry.registerBlock(TitaniumOre, "TitaniumOre");
		
		
		//Armor Recipes
		
		GameRegistry.addShapedRecipe(new ItemStack(NightVisionHelmet, 1), "XXX", "XOX", "  ", 'X', SteelIngot, 'O');
		
		
		
		
		
		//Item Recipes
		
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(SteelIngot, 1), 10);
		
		
		
		
		
		
		
		
		
		
	}

}
