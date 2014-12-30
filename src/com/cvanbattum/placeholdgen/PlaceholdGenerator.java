package com.cvanbattum.placeholdgen;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class PlaceholdGenerator {

	public static void main(String[] args) {
		setLookAndFeel();
		
		GeneratorFrame frame = new GeneratorFrame();
		frame.launch();
		
	}
	
	/**
	 * Sets the swing look and feel to the current system's look and feel.
	 * Works best on Windows.
	 */
	public static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			//Failed to set look and feel, will use the default swing look and 
			//feel automatically instead.
		}
		
	}
	
}
