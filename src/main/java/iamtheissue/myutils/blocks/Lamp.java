package iamtheissue.myutils.blocks;

import java.util.ArrayList;
import java.util.List;

import iamtheissue.myutils.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;

public class Lamp extends Block
{

	public Lamp()
	{
		super(Material.piston);
		setCreativeTab(CreativeTabs.tabDecorations);
		setStepSound(soundTypeMetal);
		setHardness(0.5f);
		setLightLevel(1f);
		
	}
	
}
