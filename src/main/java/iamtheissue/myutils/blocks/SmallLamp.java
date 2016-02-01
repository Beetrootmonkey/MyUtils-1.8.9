package iamtheissue.myutils.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SmallLamp extends Block
{
	
	public static final PropertyDirection PROPERTYFACING = PropertyDirection.create("facing");
	
	
	public SmallLamp()
	{
		super(Material.piston);
		setCreativeTab(CreativeTabs.tabDecorations);
		setStepSound(soundTypeMetal);
		setHardness(0.5f);
		setLightLevel(1f);
		setBlockBounds(0.1875f, 0.1875f, 0.1875f, 0.8125f, 0.8125f, 0.8125f);
		setDefaultState(this.blockState.getBaseState().withProperty(PROPERTYFACING, EnumFacing.DOWN));
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
	    EnumFacing facing = EnumFacing.getFront(meta);
	    return this.getDefaultState().withProperty(PROPERTYFACING, facing);
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
	    EnumFacing facing = (EnumFacing)state.getValue(PROPERTYFACING);

	    int meta = facing.getIndex();
	    return meta;
	}
	
	@Override
	protected BlockState createBlockState()
	{
	    return new BlockState(this, new IProperty[] {PROPERTYFACING});
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public boolean isFullCube()
	{
		return false;
	}
	
	
	@SideOnly(Side.CLIENT)
	@Override
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
	
	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing blockFaceClickedOn, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
	    return this.getDefaultState().withProperty(PROPERTYFACING, blockFaceClickedOn);
	}
	
}
