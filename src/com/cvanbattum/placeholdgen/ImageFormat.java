package com.cvanbattum.placeholdgen;

public enum ImageFormat {

	GIF(".gif"), JPEG(".jpg"), PNG(".png");
	
	private String extension;
	
	private ImageFormat(String extension) {
		this.extension = extension;
		
	}
	
	public String getExtension() {
		return this.extension;
		
	}
	
}
