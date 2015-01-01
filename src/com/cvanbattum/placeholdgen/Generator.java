package com.cvanbattum.placeholdgen;

import java.awt.Color;

/**
 * 
 * @author Casper van Battum
 * @version 1.0
 *
 */
public class Generator {

	public static String generateLink(Size size, OptionalSettings settings) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("http://placehold.it/");
		
		if (isSquare(size)) {
			sb.append(size.getWidth());
		}
		else {
			sb.append(size.getWidth() + "x" + size.getHeight());
		}
		
		if (! settings.isEmpty()) {
			///////
			// Check whether the image format should be changed,
			// and add it to the url if so.
			
			if (settings.imageFormat_isSet()) {
				sb.append(settings.getImageFormat().getExtension());
			}
			sb.append("/");
			
			
			///////
			// Check whether the colors should be changed, and add it to the
			// url if so.
			
			if (settings.foregroundColor_isSet() && ! settings.backgroundColor_isSet()) {
				// Here only the foregroud color has been set. It theory, it should not be possible to get into this state.
				throw new IllegalStateException("Foregound color can only be set is background color also contains a value");
			}
			
			if (settings.foregroundColor_isSet() && settings.backgroundColor_isSet()) {
				// Here, both colors have been set and will be changed.
				sb.append(getColorHexCode(settings.getBackgroundColor()));
				sb.append("/");
				sb.append(getColorHexCode(settings.getForegroundColor()));
			}
			else if (settings.backgroundColor_isSet()) {
				// Here only the background color has been set
				sb.append(getColorHexCode(settings.getBackgroundColor()));
			}
			sb.append("/");
			
			
			///////
			// Check whether the user provided custom text, and if so, add it
			// to the url.
			
			if (settings.customText_isSet()) {
				sb.append("&text=");
				sb.append(settings.getCustomText());
			}
			
		}
		
		return sb.toString();
		
	}
	
	public static String generateTag(Size size, OptionalSettings settings) {
		StringBuilder sb = new StringBuilder();
		sb.append("<img src=\"");
		sb.append(generateLink(size, settings));
		sb.append("\" />");
		
		return sb.toString();
		
	}
	
	private static boolean isSquare(Size size) {
		if (size.getAspectRatio() == 1) return true;
		else return false;
		
	}
	
	private static String getColorHexCode(Color color)	{
		String hexCode = Integer.toHexString(color.getRGB());
		hexCode = hexCode.substring(2, hexCode.length());
		return hexCode;
		
	}
	
}
