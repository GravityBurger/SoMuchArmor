package GravityBurger.SoMuchArmor.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.ai.EntitySenses;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.util.EnumHelper;
import GravityBurger.SoMuchArmor.armor.NightVisionArmor;
import GravityBurger.SoMuchArmor.block.BlockTitaniumOre;
import GravityBurger.SoMuchArmor.block.worldgeneration.TitaniumOreWG;
import GravityBurger.SoMuchArmor.item.ItemEnderIngot;
import GravityBurger.SoMuchArmor.item.ItemGoggles;
import GravityBurger.SoMuchArmor.item.ItemMagicalCore;
import GravityBurger.SoMuchArmor.item.ItemSteelIngot;
import GravityBurger.SoMuchArmor.item.ItemTitaniumIngot;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;
import GravityBurger.SoMuchArmor.armor.CobbleArmor;
import GravityBurger.SoMuchArmor.armor.TitaniumArmor;
import GravityBurger.SoMuchArmor.armor.EmeraldArmor;
import GravityBurger.SoMuchArmor.armor.ArmorInvisability;
import GravityBurger.SoMuchArmor.armor.LongFallBoots;
import GravityBurger.SoMuchArmor.armor.WoodenArmor;
import GravityBurger.SoMuchArmor.creativetabs.SMATab;
import GravityBurger.SoMuchArmor.armor.EnderArmor;
import GravityBurger.SoMuchArmor.armor.MagicalArmor;

@Mod(modid = "SoMuchArmor", name = "So Much Armor", version = "Alpha 1.0")

public class SoMuchArmor {
@SidedProxy(clientSide = "GravityBurger.SoMuchArmor.common.ClientProxy", serverSide = "GravityBurger.SoMuchArmor.common.CommonProxy")
public static CommonProxy proxy;

public static CreativeTabs SMATab = new SMATab(CreativeTabs.getNextID(), "SMATab");


//Armor ID's
private static int NightVision;
private static int TitaniumHat;
private static int TitaniumShirt;
private static int TitaniumPants;
private static int TitaniumShoes;
private static int EmeraldHat;
private static int EmeraldShirt;
private static int EmeraldPants;
private static int EmeraldShoes;
private static int Invisability;
private static int LongFallBoot;
private static int Ender1;
private static int Ender2;
private static int Ender3;
private static int Ender4;
private static int Magical1;
private static int Magical2;
private static int Magical3;
private static int Magical4;
private static int Wood1;
private static int Wood2;
private static int Wood3;
private static int Wood4;
private static int Cobble1;
private static int Cobble2;
private static int Cobble3;
private static int Cobble4;




//Armor Material
public static ArmorMaterial NightVisionArmor = EnumHelper.addArmorMaterial("NIGHTVISION", 15, new int[] {2, 0, 0, 0}, 10);
public static ArmorMaterial TitaniumArmor = EnumHelper.addArmorMaterial("TITANIUM", 42, new int[] {4, 8, 6, 2}, 5);
public static ArmorMaterial EmeraldArmor = EnumHelper.addArmorMaterial("EMERALD", 66, new int[] {4, 8, 6, 2}, 20);
public static ArmorMaterial ArmorInvisability = EnumHelper.addArmorMaterial("INVISABILITY", 0, new int[] {0, 0, 0, 0}, 0);
public static ArmorMaterial LongFall = EnumHelper.addArmorMaterial("LONGFALLBOOTS", 0, new int[] {0, 0, 0, 0}, 0);
public static ArmorMaterial EnderArmor = EnumHelper.addArmorMaterial("ENDER", 128, new int[] {4, 10, 4, 4}, 30);
public static ArmorMaterial MagicalArmor = EnumHelper.addArmorMaterial("MAGICAL", 0, new int[] {0, 0, 0, 0}, 0);
public static ArmorMaterial WoodArmor = EnumHelper.addArmorMaterial("WOODEN", 4, new int[] {2, 4, 3, 3}, 10);
public static ArmorMaterial CobbleArmor = EnumHelper.addArmorMaterial("COBBLE", 8, new int[] {3, 6, 4, 3}, 20);




//Item Registration

public static Item SteelIngot = new ItemSteelIngot().setUnlocalizedName("SteelIngot").setTextureName("SoMuchArmor:SteelIngot");
public static Item TitaniumIngot = new ItemTitaniumIngot().setUnlocalizedName("TitaniumIngot").setTextureName("SoMuchArmor:TitaniumIngot");
public static Item Goggles = new ItemGoggles().setUnlocalizedName("Goggles").setTextureName("SoMuchArmor:Goggles"); 
public static Item EnderIngot = new ItemEnderIngot().setUnlocalizedName("EnderIngot").setTextureName("SoMuchArmor:EnderIngot");
public static Item EnderBlend = new ItemEnderIngot().setUnlocalizedName("EnderBlend").setTextureName("SoMuchArmor:EnderBlend");
public static Item MagicalCore = new ItemMagicalCore().setUnlocalizedName("MagicalCore").setTextureName("SoMuchArmor:MagicalCore").setCreativeTab(SMATab);

//Night Vision
public static Item NightVisionHelmet = new NightVisionArmor(NightVisionArmor, NightVision, 0).setUnlocalizedName("NightVisionHelmet").setTextureName("SoMuchArmor:NightVisionHelmet");


//Titanium
public static Item TitaniumHelmet = new TitaniumArmor(TitaniumArmor, TitaniumHat, 0).setUnlocalizedName("TitaniumHelmet").setTextureName("SoMuchArmor:TitaniumHelmet");
public static Item TitaniumChestplate = new TitaniumArmor(TitaniumArmor, TitaniumShirt, 1).setUnlocalizedName("TitaniumChestplate").setTextureName("SoMuchArmor:TitaniumChestplate");
public static Item TitaniumLeggings = new TitaniumArmor(TitaniumArmor, TitaniumPants, 2).setUnlocalizedName("TitaniumLeggings").setTextureName("SoMuchArmor:TitaniumLeggings");
public static Item TitaniumBoots = new TitaniumArmor(TitaniumArmor, TitaniumShoes, 3).setUnlocalizedName("TitaniumBoots").setTextureName("SoMuchArmor:TitaniumBoots");

//Emerald

public static Item EmeraldHelmet = new EmeraldArmor(EmeraldArmor, EmeraldHat, 0).setUnlocalizedName("EmeraldHelmet").setTextureName("SoMuchArmor:EmeraldHelmet");
public static Item EmeraldChestplate = new EmeraldArmor(EmeraldArmor, EmeraldShirt, 1).setUnlocalizedName("EmeraldChestplate").setTextureName("SoMuchArmor:EmeraldChestplate");
public static Item EmeraldLeggings = new EmeraldArmor(EmeraldArmor, EmeraldPants, 2).setUnlocalizedName("EmeraldLeggings").setTextureName("SoMuchArmor:EmeraldLeggings");
public static Item EmeraldBoots = new EmeraldArmor(EmeraldArmor, EmeraldShoes, 3).setUnlocalizedName("EmeraldBoots").setTextureName("SoMuchArmor:EmeraldBoots");

//Invisability

public static Item InvisabilityCloak = new ArmorInvisability(ArmorInvisability, Invisability, 1).setUnlocalizedName("InvisabilityCloak").setTextureName("SoMuchArmor:InvisabilityCloak");

//Ender

public static Item EnderChestplate = new EnderArmor(EnderArmor, Ender2, 1).setUnlocalizedName("EnderChestplate").setTextureName("SoMuchArmor:EnderChestplate");
public static Item EnderHelmet = new EnderArmor(EnderArmor, Ender1, 0).setUnlocalizedName("EnderHelmet").setTextureName("SoMuchArmor:EnderHelmet");
public static Item EnderLeggings = new EnderArmor(EnderArmor, Ender3, 2).setUnlocalizedName("EnderLeggings").setTextureName("SoMuchArmor:EnderLeggings");
public static Item EnderBoots = new EnderArmor(EnderArmor, Ender4, 3).setUnlocalizedName("EnderBoots").setTextureName("SoMuchArmor:EnderBoots");



//Magical

public static Item MagicalHelmet = new MagicalArmor(MagicalArmor, Magical1, 0).setUnlocalizedName("MagicalHelmet").setTextureName("SoMuchArmor:MagicalHelmet").setCreativeTab(SMATab);
public static Item MagicalChestplate = new MagicalArmor(MagicalArmor, Magical2, 1).setUnlocalizedName("MagicalChestplate").setTextureName("SoMuchArmor:MagicalChestplate").setCreativeTab(SMATab);
public static Item MagicalLeggings = new MagicalArmor(MagicalArmor, Magical3, 2).setUnlocalizedName("MagicalLeggings").setTextureName("SoMuchArmor:MagicalLeggings").setCreativeTab(SMATab);
public static Item MagicalBoots = new MagicalArmor(MagicalArmor, Magical4, 3).setUnlocalizedName("MagicalBoots").setTextureName("SoMuchArmor:MagicalBoots").setCreativeTab(SMATab);

//Wooden

public static Item WoodenHelmet = new WoodenArmor(WoodArmor, Wood1, 0).setUnlocalizedName("WoodenHelmet").setTextureName("SoMuchArmor:WoodenHelmet");
public static Item WoodenChestplate = new WoodenArmor(WoodArmor, Wood2, 0).setUnlocalizedName("WoodenChestplate").setTextureName("SoMuchArmor:WoodenChestplate");
public static Item WoodenLeggings = new WoodenArmor(WoodArmor, Wood3, 0).setUnlocalizedName("WoodenLeggings").setTextureName("SoMuchArmor:WoodenLeggings");
public static Item WoodenBoots = new WoodenArmor(WoodArmor, Wood4, 0).setUnlocalizedName("WoodenBoots").setTextureName("SoMuchArmor:WoodenBoots");

//Long Fall Boots

public static Item LongFallBoots = new LongFallBoots(LongFall, LongFallBoot, 3).setUnlocalizedName("LongFallBoots").setTextureName("SoMuchArmor:LongFallBoots");

//Cobblestone

public static Item CobbleHelmet = new CobbleArmor(CobbleArmor, Cobble1, 0).setUnlocalizedName("CobbleHelmet").setTextureName("SoMuchArmor:CobbleHelmet");
public static Item CobbleChestplate = new CobbleArmor(CobbleArmor, Cobble2, 1).setUnlocalizedName("CobbleChsetplate").setTextureName("SoMuchArmor:CobbleChestplate");
public static Item CobbleLeggings = new CobbleArmor(CobbleArmor, Cobble3, 2).setUnlocalizedName("CobbleLeggings").setTextureName("SoMuchArmor:CobbleLeggings");
public static Item CobbleBoots = new CobbleArmor(CobbleArmor, Cobble4, 3).setUnlocalizedName("CobbleBoots").setTextureName("SoMuchArmor:CobbleBoots");


//WorldGen
public static TitaniumOreWG worldgen1 = new TitaniumOreWG();



//Item Registration



//Ore Registration

public static Block TitaniumOre = new BlockTitaniumOre(Material.rock).setBlockName("TitaniumOre").setBlockTextureName("SoMuchArmor:TitaniumOre");
	
	public SoMuchArmor(){
		
		//World Generator
		
		GameRegistry.registerWorldGenerator(worldgen1, 1);
		
		
		
		//Armor GameRegistry
		GameRegistry.registerItem(NightVisionHelmet, "NightVisionHelmet");
		GameRegistry.registerItem(TitaniumHelmet, "TitaniumHelmet");
		GameRegistry.registerItem(TitaniumChestplate, "TitaniumChestplate");
		GameRegistry.registerItem(TitaniumLeggings, "TitaniumLeggings");
		GameRegistry.registerItem(TitaniumBoots, "TitaniumBoots");
		GameRegistry.registerItem(EmeraldHelmet, "EmeraldHelmet");
		GameRegistry.registerItem(EmeraldChestplate, "EmeraldChestplate");
		GameRegistry.registerItem(EmeraldLeggings, "EmeraldLeggings");
		GameRegistry.registerItem(EmeraldBoots, "EmeraldBoots");
		GameRegistry.registerItem(InvisabilityCloak, "InvisabilityCloak");
		GameRegistry.registerItem(LongFallBoots, "LongFallBoots");		
		GameRegistry.registerItem(EnderChestplate, "EnderChestplate");
		GameRegistry.registerItem(EnderHelmet, "EnderHelmet");
		GameRegistry.registerItem(EnderLeggings, "EnderLeggings");
		GameRegistry.registerItem(EnderBoots, "EnderBoots");
		GameRegistry.registerItem(MagicalHelmet, "MagicalHelmet");
		GameRegistry.registerItem(MagicalChestplate, "MagicalChestplate");
		GameRegistry.registerItem(MagicalLeggings, "MagicalLeggings");
		GameRegistry.registerItem(MagicalBoots, "MagicalBoots");
		GameRegistry.registerItem(WoodenHelmet, "WoodenHelmet");
		GameRegistry.registerItem(WoodenChestplate, "WoodenChestplate");
		GameRegistry.registerItem(WoodenLeggings, "WoodenLeggings");
		GameRegistry.registerItem(WoodenBoots, "WoodenBoots");
		GameRegistry.registerItem(CobbleHelmet, "CobbleHelmet");
		GameRegistry.registerItem(CobbleChestplate, "CobbleChestplate");
		GameRegistry.registerItem(CobbleLeggings, "CobbleLeggings");
		GameRegistry.registerItem(CobbleBoots, "CobbleBoots");
		
		
		
		
	
		
		
		
		
		
		//Item GameRegistry
		
		GameRegistry.registerItem(SteelIngot, "SteelIngot");
		GameRegistry.registerItem(TitaniumIngot, "TitanuiumIngot");
		GameRegistry.registerItem(Goggles, "Goggles");
		GameRegistry.registerItem(EnderIngot, "EnderIngot");
		GameRegistry.registerItem(EnderBlend, "EnderBlend");
		GameRegistry.registerItem(MagicalCore, "MagicalCore");
		
		
		//Ore Registration
		
		GameRegistry.registerBlock(TitaniumOre, "TitaniumOre");
		
		
		//Armor Recipes
		
		GameRegistry.addShapedRecipe(new ItemStack(NightVisionHelmet, 1), "XXX", "XOX", "   ", 'X', SteelIngot, 'O', Goggles);
		GameRegistry.addShapedRecipe(new ItemStack(TitaniumHelmet, 1), "XXX", "X X", "   ", 'X', TitaniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(TitaniumChestplate, 1), "X X", "XXX", "XXX", 'X', TitaniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(TitaniumLeggings, 1), "XXX", "X X", "X X", 'X', TitaniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(TitaniumBoots, 1), "   ", "X X", "X X", 'X', TitaniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(EmeraldHelmet, 1), "XXX", "X X", "   ", 'X', Items.emerald);
		GameRegistry.addShapedRecipe(new ItemStack(EmeraldChestplate, 1), "X X", "XXX", "XXX", 'X', Items.emerald);
		GameRegistry.addShapedRecipe(new ItemStack(EmeraldLeggings, 1), "XXX", "X X", "X X", 'X', Items.emerald);
		GameRegistry.addShapedRecipe(new ItemStack(EmeraldBoots, 1), "   ", "X X", "X X", 'X', Items.emerald);
		GameRegistry.addShapedRecipe(new ItemStack(LongFallBoots, 1), "   ", "X X", "O O", 'X', Blocks.iron_block, 'O', Blocks.wool);
		GameRegistry.addShapedRecipe(new ItemStack(EnderHelmet, 1), "XXX", "X X", "   ", 'X', EnderIngot);
		GameRegistry.addShapedRecipe(new ItemStack(EnderChestplate, 1), "X X", "XOX", "XXX", 'X', EnderIngot, 'O', Blocks.dragon_egg);
		GameRegistry.addShapedRecipe(new ItemStack(EnderLeggings, 1), "XXX", "XOX", "X X",  'X', EnderIngot, 'O', Items.nether_star);
		GameRegistry.addShapedRecipe(new ItemStack(EnderBoots, 1), "   ", "X X", "X X", 'X', EnderIngot);
		GameRegistry.addShapedRecipe(new ItemStack(MagicalHelmet, 1), "XXX", "XOX", "   ", 'X', Items.leather);
		GameRegistry.addShapedRecipe(new ItemStack(MagicalChestplate, 1), "X X", "XOX", "XXX", 'X', Items.leather);
		GameRegistry.addShapedRecipe(new ItemStack(MagicalLeggings, 1), "XXX", "XOX", "X X", 'X', Items.leather);
		GameRegistry.addShapedRecipe(new ItemStack(MagicalBoots, 1), "   ", "XOX", "XOX", 'X', Items.leather);
		GameRegistry.addShapedRecipe(new ItemStack(WoodenHelmet, 1), "XXX", "X X", "   ", 'X', Blocks.log);
		GameRegistry.addShapedRecipe(new ItemStack(WoodenChestplate, 1), "X X", "XXX", "XXX", 'X', Blocks.log);
		GameRegistry.addShapedRecipe(new ItemStack(WoodenLeggings, 1), "XXX", "X X", "X X", 'X', Blocks.log);
		GameRegistry.addShapedRecipe(new ItemStack(WoodenBoots, 1), "   ", "X X", "X X", 'X', Blocks.log);
		GameRegistry.addShapedRecipe(new ItemStack(CobbleHelmet, 1), "XXX", "X X", "   ", 'X', Blocks.cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(CobbleChestplate, 1), "X X", "XXX", "XXX", 'X', Blocks.cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(CobbleLeggings, 1), "XXX", "X X", "X X", 'X', Blocks.cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(CobbleBoots, 1), "   ", "X X", "X X", 'X', Blocks.cobblestone);
	
		//Item Recipes
		
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(SteelIngot, 1), 10);
		GameRegistry.addSmelting(TitaniumOre, new ItemStack(TitaniumIngot, 1), 10);
		GameRegistry.addShapedRecipe(new ItemStack(Goggles, 1), "   ", "X0X", "   ", 'X', Blocks.glass, '0', Blocks.redstone_block);
		GameRegistry.addSmelting(EnderBlend, new ItemStack(EnderIngot, 1), 10);
		GameRegistry.addShapelessRecipe(new ItemStack(EnderBlend, 1), new Object []{
			Items.diamond,
			Items.diamond,
			Items.ender_pearl,
			Items.ender_eye,
		});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.dragon_egg, 1), "XXX", "XOX", "XXX", 'X', Blocks.diamond_block, 'O', EnderIngot);
		GameRegistry.addShapedRecipe(new ItemStack(Items.nether_star, 2), "XXX", "XOX", "XXX", 'X', EnderIngot, 'O', Items.nether_star);
		
		
		

		//Dungeon Chests
		
		
		
		
		
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack(InvisabilityCloak), 1, 1, 1));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(new ItemStack(InvisabilityCloak), 1, 1, 1));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent(new ItemStack(InvisabilityCloak), 1, 1, 1));
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack(MagicalCore), 1, 5, 150));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(new ItemStack(MagicalCore), 1, 5, 150));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent(new ItemStack(MagicalCore), 1, 5, 150));
		ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, new WeightedRandomChestContent(new ItemStack(MagicalCore), 1, 5, 150));
	}

}
