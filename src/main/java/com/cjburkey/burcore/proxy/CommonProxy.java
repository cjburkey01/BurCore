package com.cjburkey.burcore.proxy;

import com.cjburkey.core.gui.NumFormatHelper;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void construct(FMLConstructionEvent e) {
		NumFormatHelper.commonConstruct();
	}
	
	public void preinit(FMLPreInitializationEvent e) {
		
	}
	
	public void init(FMLInitializationEvent e) {
		
	}
	
	public void postinit(FMLPostInitializationEvent e) {
		
	}
	
}