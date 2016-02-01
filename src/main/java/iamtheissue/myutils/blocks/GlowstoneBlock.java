package iamtheissue.myutils.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import iamtheissue.myutils.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

public class GlowstoneBlock extends Block
{
	public GlowstoneBlock()
	{
		super(Material.rock);
		setCreativeTab(CreativeTabs.tabDecorations);
		setStepSound(soundTypeMetal);
		setHarvestLevel("pickaxe", 0);
		setHardness(2.0f);
		setLightLevel(1f);
	}
	
	
}
