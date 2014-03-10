package GravityBurger.SoMuchArmor.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import GravityBurger.SoMuchArmor.armor.NightVisionArmor;
import GravityBurger.SoMuchArmor.block.BlockTitaniumOre;
import GravityBurger.SoMuchArmor.block.worldgeneration.TitaniumOreWG;
import GravityBurger.SoMuchArmor.item.ItemGoggles;
import GravityBurger.SoMuchArmor.item.ItemSteelIngot;
import GravityBurger.SoMuchArmor.item.ItemTitaniumIngot;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;
import GravityBurger.SoMuchArmor.armor.TitaniumArmor;


@Mod(modid = "SoMuchArmor", name = "So Much Armor", version = "Alpha 1.0")

public class SoMuchArmor {
@SidedProxy(clientSide = "GravityBurger.SoMuchArmor.common.ClientProxy", serverSide = "GravityBurger.SoMuchArmor.common.CommonProxy")
public static CommonProxy proxy;
	
//Armor ID's
private static int NightVision;
private static int TitaniumHat;
private static int TitaniumShirt;
private static int TitaniumPants;
private static int TitaniumShoes;



//Armor Material
public static ArmorMaterial NightVisionArmor = EnumHelper.addArmorMaterial("NIGHTVISION", 15, new int[] {2, 0, 0, 0}, 10);
public static ArmorMaterial TitaniumArmor = EnumHelper.addArmorMaterial("TITANIUM", 42, new int[] {4, 8, 6, 2}, 5);

//Armor Registration

//Night Vision
public static Item NightVisionHelmet = new NightVisionArmor(NightVisionArmor, NightVision, 0).setUnlocalizedName("NightVisionHelmet").setTextureName("SoMuchArmor:NightVisionHelmet");

//Titanium
public static Item TitaniumHelmet = new TitaniumArmor(TitaniumArmor, TitaniumHat, 0).setUnlocalizedName("TitaniumHelmet").setTextureName("SoMuchArmor:TitaniumHelmet");
public static Item TitaniumChestplate = new TitaniumArmor(TitaniumArmor, TitaniumShirt, 1).setUnlocalizedName("TitaniumChestplate").setTextureName("SoMuchArmor:TitaniumChestplate");
public static Item TitaniumLeggings = new TitaniumArmor(TitaniumArmor, TitaniumPants, 2).setUnlocalizedName("TitaniumLeggings").setTextureName("SoMuchArmor:TitaniumLeggings");
public static Item TitaniumBoots = new TitaniumArmor(TitaniumArmor, TitaniumShoes, 3).setUnlocalizedName("TitaniumBoots").setTextureName("SoMuchArmor:TitaniumBoots");
//WorldGen

public static TitaniumOreWG worldgen1 = new TitaniumOreWG();



//Item Registration

public static Item SteelIngot = new ItemSteelIngot(4000).setUnlocalizedName("SteelIngot").setTextureName("SoMuchArmor:SteelIngot");
public static Item TitaniumIngot = new ItemTitaniumIngot(4001).setUnlocalizedName("TitaniumIngot").setTextureName("SoMuchArmor:TitaniumIngot");
public static Item Goggles = new ItemGoggles(4002).setUnlocalizedName("Goggles").setTextureName("SoMuchArmor:Goggles"); 
//Ore Registration

public static Block TitaniumOre = new BlockTitaniumOre(3000, Material.rock).setBlockName("TitaniumOre").setBlockTextureName("SoMuchArmor:TitaniumOre");
	
	public SoMuchArmor(){
		
		//World Generator
		
		GameRegistry.registerWorldGenerator(worldgen1, 1);
		
		
		
		//Armor GameRegistry
		GameRegistry.registerItem(NightVisionHelmet, "NightVisionHelmet");
		GameRegistry.registerItem(TitaniumHelmet, "TitaniumHelmet");
		GameRegistry.registerItem(TitaniumChestplate, "TitaniumChestplate");
		GameRegistry.registerItem(TitaniumLeggings, "TitaniumLeggings");
		GameRegistry.registerItem(TitaniumBoots, "TitaniumBoots");
		
		
		
		
		
		//Item GameRegistry
		
		GameRegistry.registerItem(SteelIngot, "SteelIngot");
		GameRegistry.registerItem(TitaniumIngot, "TitanuiumIngot");
		GameRegistry.registerItem(Goggles, "Goggles");
		
		//Ore Registration
		
		GameRegistry.registerBlock(TitaniumOre, "TitaniumOre");
		
		
		//Armor Recipes
		
		GameRegistry.addShapedRecipe(new ItemStack(NightVisionHelmet, 1), "XXX", "XOX", "  ", 'X', SteelIngot, 'O', Goggles);
		GameRegistry.addShapedRecipe(new ItemStack(TitaniumHelmet, 1), "XXX", "X X", "  ", 'X', TitaniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(TitaniumChestplate, 1), "X X", "XXX", "XXX", 'X', TitaniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(TitaniumLeggings, 1), "XXX", "X X", "X X", 'X', TitaniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(TitaniumBoots, 1), "   ", "X X", "X X", 'X', TitaniumIngot);
		
		
		
		
		//Item Recipes
		
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(SteelIngot, 1), 10);
		GameRegistry.addSmelting(TitaniumOre, new ItemStack(TitaniumIngot, 1), 10);
		GameRegistry.addShapedRecipe(new ItemStack(Goggles, 1), "  ", "X0X", "  ", 'X', Blocks.glass, '0', Blocks.redstone_block);
		
		
		
		
		
		
		
		
		
		
	}

}
