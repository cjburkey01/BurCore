package com.cjburkey.core.gui;

import java.text.NumberFormat;
import java.util.Locale;
import com.cjburkey.burcore.BurCore;

public class NumFormatHelper {
	
	private static NumberFormat nf = null;
	
	public static final void commonConstruct() {
		Exception ex = null;
		try {
			if (Class.forName("java.text.NumberFormat") != null) {
				nf = NumberFormat.getInstance(Locale.getDefault());
				return;
			}
		} catch(Exception e) {
			ex = e;
		}
		BurCore.logError("Unable to construct a number formatter. Numbers may look ugly, error: " + ((ex != null) ? ex.getMessage() : "Class not found."));
		BurCore.logWarn("This may be a deobf bug...you'll likely/hopefully never see this in game.");
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