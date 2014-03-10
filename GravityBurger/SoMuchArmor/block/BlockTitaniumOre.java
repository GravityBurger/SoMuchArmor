package GravityBurger.SoMuchArmor.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTitaniumOre extends Block{

	public BlockTitaniumOre(int i, Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(4.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setResistance(4.0F);
	}

}
