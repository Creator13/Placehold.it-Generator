package com.cvanbattum.placeholdgen;

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
