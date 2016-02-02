package iamtheissue.myutils;

import iamtheissue.myutils.init.Blocks;
import iamtheissue.myutils.init.Items;
import iamtheissue.myutils.init.Recipes;
import iamtheissue.myutils.items.FuelHandler;
import iamtheissue.myutils.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Main
{
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Blocks.init();
		Blocks.register();
		Items.init();
		Items.register();
		Items.preInit();
		GameRegistry.registerFuelHandler(new FuelHandler());
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		MinecraftForge.EVENT_BUS.register(new EventHook());
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		if(Loader.isModLoaded("Thaumcraft"))
		{
			Blocks.registerThaumcraftAspects();
			Items.registerThaumcraftAspects();
		}
		Recipes.register();
	}

}
