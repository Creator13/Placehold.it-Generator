package com.cvanbattum.placeholdgen;

import java.awt.Color;

/**
 * The <code>OptionalSettings</code> class should be used to save optional,
 * custom settings that Placehold.it supports. Currently, Placehold.it can
 * change the color of both text and background, you can set custom text to be
 * displayed on the placeholder and you can change the format of the generated
 * image. This class can save these four settings.
 * 
 * @author Casper van Battum
 * @version 1.0
 *
 */
public class OptionalSettings {
	
	private Color backgroundColor;
	private Color foregroundColor;
	private ImageFormat imageFormat;
	private String customText;
	
	/**
	 * Creates an empty instance of this class.
	 */
	public OptionalSettings() {}
	
	/**
	 * <p>The image format is the format of the generated placeholder. The
	 * image format may be gif, jpg or png. If none is specified, Placehold.it
	 * will by default make a gif image. However if you need more colors in
	 * your image, it is recommended that you change this to either jpeg or
	 * png.</p>
	 * 
	 * <p>The background color is the color of the placeholder. By default,
	 * this is a lighter gray color.</p>
	 * 
	 * <p>The foregorund color is the color of the text dislayed in the
	 * placeholder. By default, this is a medium gray color.</p>
	 * 
	 * <p>The text parameter allows the user to display custom text in the
	 * placeholder box. The default text that is displayed are the dimensions
	 * of the placeholder box.</p>
	 * 
	 * @param format	The format of the image that is generated (either gif,
	 * 					jpeg or png).
	 * @param bgColor	The background color of the placeholder box.
	 * @param fgColor	The color of the text in the placeholder.
	 * @param text		Custom text to be displayed in the placeholder.
	 */
	public OptionalSettings(ImageFormat format, Color bgColor, Color fgColor, String text) {
		this.backgroundColor = bgColor;
		this.foregroundColor = fgColor;
		this.imageFormat = format;
		this.customText = text;
		
	}
	
	/**
	 * <p>The image format is the format of the generated placeholder. The
	 * image format may be gif, jpg or png. If none is specified, Placehold.it
	 * will by default make a gif image. However if you need more colors in
	 * your image, it is recommended that you change this to either jpeg or
	 * png.</p>
	 * 
	 * <p>The background color is the color of the placeholder. By default,
	 * this is a lighter gray color.</p>
	 * 
	 * <p>The foregorund color is the color of the text dislayed in the
	 * placeholder. By default, this is a medium gray color.</p>
	 * 
	 * @param format	The format of the image that is generated (either gif,
	 * 					jpeg or png).
	 * @param bgColor	The background color of the placeholder box.
	 * @param fgColor	The color of the text in the placeholder.
	 */
	public OptionalSettings(ImageFormat format, Color bgColor, Color fgColor) {
		this.backgroundColor = bgColor;
		this.foregroundColor = fgColor;
		this.imageFormat = format;
		
	}
	
	/** 
	 * <p>The background color is the color of the placeholder. By default,
	 * this is a lighter gray color.</p>
	 * 
	 * <p>The foregorund color is the color of the text dislayed in the
	 * placeholder. By default, this is a medium gray color.</p>
	 * 
	 * <p>The text parameter allows the user to display custom text in the
	 * placeholder box. The default text that is displayed are the dimensions
	 * of the placeholder box.</p>
	 * 
	 * @param bgColor	The background color of the placeholder box.
	 * @param fgColor	The color of the text in the placeholder.
	 * @param text		Custom text to be displayed in the placeholder.
	 */
	public OptionalSettings(String text, Color bgColor, Color fgColor) {
		this.backgroundColor = bgColor;
		this.foregroundColor = fgColor;
		this.customText = text;
		
	}
	
	/**
	 * <p>The image format is the format of the generated placeholder. The
	 * image format may be gif, jpg or png. If none is specified, Placehold.it
	 * will by default make a gif image. However if you need more colors in
	 * your image, it is recommended that you change this to either jpeg or
	 * png.</p>
	 * 
	 * <p>The text parameter allows the user to display custom text in the
	 * placeholder box. The default text that is displayed are the dimensions
	 * of the placeholder box.</p>
	 * 
	 * @param format	The format of the image that is generated (either gif,
	 * 					jpeg or png).
	 * @param text		Custom text to be displayed in the placeholder.
	 */
	public OptionalSettings(ImageFormat format, String text) {
		this.imageFormat = format;
		this.customText = text;
		
	}
	
	/**
	 * <p>The background color is the color of the placeholder. By default,
	 * this is a lighter gray color.</p>
	 * 
	 * <p>The foregorund color is the color of the text dislayed in the
	 * placeholder. By default, this is a medium gray color.</p>
	 * 
	 * @param bgColor	The background color of the placeholder box.
	 * @param fgColor	The color of the text in the placeholder.
	 */
	public OptionalSettings(Color bgColor, Color fgColor) {
		this.backgroundColor = bgColor;
		this.foregroundColor = fgColor;
		
	}
	
	/**
	 * <p>The image format is the format of the generated placeholder. The
	 * image format may be gif, jpg or png. If none is specified, Placehold.it
	 * will by default make a gif image. However if you need more colors in
	 * your image, it is recommended that you change this to either jpeg or
	 * png.</p>
	 * 
	 * @param format	The format of the image that is generated (either gif,
	 * 					jpeg or png).
	 */
	public OptionalSettings(ImageFormat format) {
		this.imageFormat = format;
		
	}
	
	/**
	 * <p>The text parameter allows the user to display custom text in the
	 * placeholder box. The default text that is displayed are the dimensions
	 * of the placeholder box.</p>
	 * 
	 * @param text		Custom text to be displayed in the placeholder.
	 */
	public OptionalSettings(String text) {
		this.customText = text;
		
	}
	
	/**
	 * @return The background color saved in these settings, or <code>null</code>
	 * if not set.
	 */
	public Color getBackgroundColor() {
		try {
			return backgroundColor;
		}
		catch (NullPointerException e) {
			return null;
		}
		
	}

	/**
	 * @return The foreground color saved in these settings, or <code>null</code>
	 * if not set.
	 */
	public Color getForegroundColor() {
		try {
			return foregroundColor;
		}
		catch (NullPointerException e) {
			return null;
		}
		
	}

	/**
	 * @return The image format saved in these settings, or <code>null</code>
	 * if not set.
	 */
	public ImageFormat getImageFormat() {
		try {
			return imageFormat;
		}
		catch (NullPointerException e) {
			return null;
		}
		
	}

	/**
	 * @return The custom text saved in these settings, or <code>null</code>
	 * if not set. Custom text will be shown in the placeholder in place of the
	 * dimensions of the box.
	 */
	public String getCustomText() {
		try {
			return customText;
		}
		catch (NullPointerException e) {
			return null;
		}
		
	}

	/**
	 * Sets or changes the current background color. This is the background 
	 * color of the placeholder box.
	 * 
	 * @param backgroundColor The color for the background of the box.
	 */
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
		
	}
	
	/**
	 * <p>Sets or changes the current background color. This is the background
	 * color of the placeholder box. Placehold.it does not support 
	 * transparency, thus no alpha value can be declared.</p>
	 * 
	 * <p>The color is most commonly provided as a hexadecimal number, in the 
	 * form of <code>0xXXXXXX</code>. However, this is not required.</p>
	 * 
	 * <p>The color should contain six digits</p>
	 * 
	 * @param rgb RGB representation of the background color.
	 */
	public void setBackgroundColor(int rgb) {
		this.backgroundColor = new Color(rgb);
		
	}
	
	/**
	 * <p>Sets or changes the current background color. This is the background
	 * color of the placeholder box. Placehold.it does not support 
	 * transparency, thus no alpha value can be declared.</p>
	 * 
	 * <p>Each component (r, g and b) should be a number between 0 and 255</p>
	 * 
	 * @param r	The red component of the background color.
	 * @param g The green component of the background color.
	 * @param b The blue component of the background color.
	 */
	public void setBackgroundColor(int r, int g, int b) {
		this.backgroundColor = new Color(r, g, b);
		
	}

	/**
	 * Sets or changes the current foreground color. The foreground color is
	 * the color of the text displayed in the placeholder.
	 * 
	 * @param foregroundColor The color for the text in the box.
	 */
	public void setForegroundColor(Color foregroundColor) {
		this.foregroundColor = foregroundColor;
		
	}
	
	/**
	 * <p>Sets or changes the current foreground color. The foreground color is
	 * the color of the text displayed in the placeholder. Placehold.it does
	 * not support ransparency, thus no alpha value can be declared.</p>
	 * 
	 * <p>The color is most commonly provided as a hexadecimal number, in the 
	 * form of <code>0xXXXXXX</code>. However, this is not required.</p>
	 * 
	 * <p>The color should contain six digits</p>
	 * 
	 * @param rgb RGB representation of the foreground color.
	 */
	public void setForegroundColor(int rgb) {
		this.foregroundColor = new Color(rgb);
		
	}
	
	/**
	 *<p>Sets or changes the current foreground color. The foreground color is
	 * the color of the text displayed in the placeholder. Placehold.it does
	 * not support ransparency, thus no alpha value can be declared.</p>
	 * 
	 * <p>Each component (r, g and b) should be a number between 0 and 255</p>
	 * 
	 * @param r	The red component of the foreground color.
	 * @param g The green component of the foreground color.
	 * @param b The blue component of the foreground color.
	 */
	public void setForegroundColor(int r, int g, int b) {
		this.foregroundColor = new Color(r, g, b);
		
	}
	
	/**
	 * Sets or changes the current image format of the generated image. The
	 * image format may be gif, jpg or png. if none is specified, Placehold.it
	 * will automatically make a gif image. However if you need more colors in
	 * your image, it is recommended that you change this to either jpeg or png.
	 * 
	 * @param imageFormat The format of the generated image (either gif, jpeg 
	 * or png)
	 */
	public void setImageFormat(ImageFormat imageFormat) {
		this.imageFormat = imageFormat;
		
	}

	/**
	 * Sets the text that will be displayed in the placeholder. By default, 
	 * Placehold.it displays the dimensions of the generated placeholder.
	 * 
	 * @param customText The text to be displayed in the placeholder.
	 */
	public void setCustomText(String customText) {
		this.customText = customText;
		
	}
	
	/**
	 * Checks if all the fields in this settings class are empty.
	 * 
	 * @return 	<code>true</code> if this class contains no settings,
	 * 			<code>false</code> otherwise.
	 */
	public boolean isEmpty() {
		if (backgroundColor_isSet() || foregroundColor_isSet() ||
				imageFormat_isSet() || customText_isSet()) return false;
		else return true;
		
	}
	
	/**
	 * Checks whether the <code>backgroundColor</code> field contains any value.
	 * 
	 * @return 	<code>true</code> if <code>backgroundColor</code> is set,
	 * 			<code>false</code> otherwise.
	 */
	public boolean backgroundColor_isSet() {
		if (! (backgroundColor == null)) return true; 
		else return false;
		
	}
	
	/**
	 * Checks whether the <code>foregroundColor</code> field contains any value.
	 * 
	 * @return 	<code>true</code> if <code>foregroundColor</code> is empty,
	 * 			<code>false</code> otherwise.
	 */
	public boolean foregroundColor_isSet() {
		if (! (foregroundColor == null)) return true; 
		else return false;
		
	}
	
	/**
	 * Checks whether the <code>imageFormat</code> field contains any value.
	 * 
	 * @return 	<code>true</code> if <code>imageFormat</code> is empty,
	 * 			<code>false</code> otherwise.
	 */
	public boolean imageFormat_isSet() {
		if (! (imageFormat == null)) return true; 
		else return false;
		
	}
	
	/**
	 * Checks whether the <code>customText</code> field contains any value.
	 * 
	 * @return 	<code>true</code> if <code>customText</code> is is,
	 * 			<code>false</code> otherwise.
	 */
	public boolean customText_isSet() {
		if (! (customText == null)) return true; 
		else return false;
		
	}

}
