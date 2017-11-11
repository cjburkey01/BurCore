package com.cjburkey.burcore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.cjburkey.burcore.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = ModInfo.NAME, modid = ModInfo.MODID, version = ModInfo.VERSION, dependencies = "", useMetadata = false, clientSideOnly = false, serverSideOnly = false,
	acceptedMinecraftVersions = "[1.12.2]", acceptableRemoteVersions = "", acceptableSaveVersions = "", certificateFingerprint = "", modLanguage = "java",
	modLanguageAdapter = "", canBeDeactivated = false, guiFactory = "", updateJSON = "", customProperties = {  })
public final class BurCore {
	
	public static final Logger logger = LogManager.getLogger(ModInfo.MODID);
	
	@Instance(ModInfo.MODID)
	public static BurCore instance;
	
	@SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void construct(FMLConstructionEvent e) {
		proxy.construct(e);
	}
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent e) {
		proxy.preinit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent e) {
		proxy.postinit(e);
	}
	
	public static void logInfo(Object msg) {
		logger.info(msg);
	}
	
	public static void logWarn(Object msg) {
		logger.warn(msg);
	}
	
	public static void logError(Object msg) {
		logger.error(msg);
	}
	
}