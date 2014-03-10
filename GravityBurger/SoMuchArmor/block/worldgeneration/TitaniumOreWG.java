package GravityBurger.SoMuchArmor.block.worldgeneration;

import java.util.Random;

import GravityBurger.SoMuchArmor.common.SoMuchArmor;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class TitaniumOreWG implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1 : generateNether(world, random, chunkX*16, chunkZ*16);
		case 0 : generateSurface(world, random, chunkX*16, chunkZ*16);
		}
		
	}

	public void generateSurface(World world, Random random, int x, int z) {
		for(int i = 0; i < 13; i++){
			System.out.println("Ore Spawned Succesfully");
			int Xcoords = x + random.nextInt(16);
			int Ycoords = random.nextInt(30);
			int Zcoords = z + random.nextInt(16);
			new WorldGenMinable(SoMuchArmor.TitaniumOre, 1).generate(world, random, Xcoords, Ycoords, Zcoords);
		}
		
	}

	public void generateNether(World world, Random random, int i, int j) {
		
		
	}

}
