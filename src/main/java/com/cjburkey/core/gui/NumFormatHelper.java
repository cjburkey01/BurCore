package com.cjburkey.core.gui;

import java.util.Locale;
import com.cjburkey.burcore.BurCore;
import com.ibm.icu.text.NumberFormat;

public class NumFormatHelper {
	
	private static NumberFormat nf = null;
	
	public static final void commonPreinit() {
		try {
			nf = NumberFormat.getInstance(Locale.getDefault());
		} catch(Exception e) {
			BurCore.logError("Unable to construct a number formatter. Numbers may look ugly, error: " + e.getMessage());
			BurCore.logWarn("This may be a deobf bug...you'll likely/hopefully never see this in game.");
		}
	}
	
	public static final boolean hasFormat() {
		return nf != null;
	}
	
	public static final NumberFormat getFormat() {
		return nf;
	}
	
	public static final String format(int format) {
		if (hasFormat()) {
			return nf.format(format);
		}
		return null;
	}
	
}