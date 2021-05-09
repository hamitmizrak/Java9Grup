package com.ecodation.all;

public class Ders_025_cast {
	// Ctrl+Shift+S
	public static void main(String[] args) {
		
		try {
			// Boxing
			// primitive types
			int primitive = 44;
			// primitive = null;
			
			// referans (Wrapper)
			Integer referans = primitive;
			referans = null;
			
			// unBoxing
			// referans (Wrapper)
			Integer referans2 = new Integer(55);
			int primitive2 = referans2;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
