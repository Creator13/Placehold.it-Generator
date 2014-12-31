package com.cvanbattum.placeholdgen;

/**
 * The <code>ImageFormat</code> enum provides the several image formats 
 * supported by Placehold.it. The extension of each image format can be 
 * requested using the method <code>getExtension()</code>.
 * 
 * @author Casper van Battum
 * @version 1.0
 *
 */
public enum ImageFormat {

	/**
	 * GIF is a lightweight image format, with support for animations, but it
	 * cannot contain every 24-bit color.
	 */
	GIF(".gif"),
	/**
	 * JPEG is the lightest image format with a high compression rate, and it
	 * can contain all 24-bit colors.
	 */
	JPEG(".jpg"),
	/**
	 * PNG is the heaviest image format with a low compression rate, but it can
	 * contain all 24-bit colors, opposed to a GIF image.
	 */
	PNG(".png");
	
	private String extension;
	
	private ImageFormat(String extension) {
		this.extension = extension;
		
	}
	
	/**
	 * @return The extension commonly associated with this image format.
	 */
	public String getExtension() {
		return this.extension;
		
	}
	
}
