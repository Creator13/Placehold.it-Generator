package com.cvanbattum.placeholdgen;

/**
 * The <code>Size</code> class can be used to describe the size of any object 
 * in 2D. This class adds the possibility to work with aspect ratio's, to make
 * resizing easier.
 * 
 * @author Casper van Battum
 * @version 1.0
 *
 */
public class Size {

	public static final int SIDE_WIDTH = 0;
	public static final int SIDE_HEIGHT = 1;
	
	private int width;
	private int height;
	
	/**
	 * Creates a square with the given parameter as the length of the sides.
	 * 
	 * @param size	The width/height of the box in pixels.
	 */
	public Size(int size) {
		this.width = size;
		this.height = size;
		
	}
	
	/**
	 * Creates a custom sized box with the given width and height. 
	 * 
	 * @param width		The width of the box in pixels.
	 * @param height	The height of the box in pixels.
	 */
	public Size(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
	/**
	 * Creates a custom sized box following an aspect ratio.
	 * <p>The aspect ratio is given as a number, calculated by dividing the width by the height of the ratio.</p>
	 * <p>With the aspect ratio 16 x 9 (widescreen monitor), the number would be <code>16 / 9 = 1.777...</code></p>
	 * <p>The <code>sideType</code> parameter describes whether the given size describes the height or the width of the box.</p>
	 * 
	 * @param size		The size of the box, width or height as described by the <code>sideType</code> parameter.
	 * @param sideType	Describes whether the given size is the width or the height of the box.
	 * @param aspect	The aspect ratio of the box.
	 */
	public Size(int size, int sideType, float aspect) {
		if (sideType == SIDE_WIDTH) {
			this.width = size;
			this.height = (int) (size / aspect);
			
		}
		else if (sideType == SIDE_HEIGHT) {
			this.height = size;
			this.width = (int) (size * aspect);
			
		}
		
	}
	
	/**
	 * @return The aspect ratio of the box.
	 */
	public float getAspectRatio() {
		return this.width / this.height;
		
	}
	
	/**
	 * Sets the width of the box, with the possibility to keep the current aspect ratio.
	 * 
	 * @param width				The new width of the box.
	 * @param keepAspectRatio	Set to <code>true</code> to keep the current aspect ratio.
	 */
	public void setWidth(int width, boolean keepAspectRatio) {
		float aspect = getAspectRatio();
		
		this.width = width;
		
		if (keepAspectRatio) {
			this.height = (int) (width / aspect);
		}
		
	}
	
	/**
	 * Sets the height of the box, with the possibility to keep the current aspect ratio.
	 * 
	 * @param height			The new height of the box.
	 * @param keepAspectRatio	Set to <code>true</code> to keep the current aspect ratio.
	 */
	public void setHeight(int height, boolean keepAspectRatio) {
		float aspect = getAspectRatio();
		
		this.height = height;
		
		if (keepAspectRatio) {
			this.width = (int) (height * aspect);
		}
		
	}
	
	/**
	 * @return The width of this box.
	 */
	public int getWidth() {
		return this.width;
		
	}
	
	/**
	 * @return The height of this box.
	 */
	public int getHeight() {
		return this.height;
		
	}
	
}
