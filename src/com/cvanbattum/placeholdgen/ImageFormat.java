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

	GIF(".gif"), 
	JPEG(".jpg"), 
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
