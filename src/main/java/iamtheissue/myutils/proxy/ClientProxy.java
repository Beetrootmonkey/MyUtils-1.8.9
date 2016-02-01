package iamtheissue.myutils.proxy;

import iamtheissue.myutils.init.Blocks;
import iamtheissue.myutils.init.Items;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
		Items.registerRenders();
		Blocks.registerRenders();
	}
}
