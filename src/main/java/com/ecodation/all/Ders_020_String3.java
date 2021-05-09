package com.ecodation.all;

public class Ders_020_String3 {
	// Ctrl+Shift+S
	public static void main(String[] args) {
		
		try {
			// Kodlar buraya yazılacak
			String kelime = "Javafx";
			String parcala = kelime.substring(kelime.length() - 2);
			System.out.println(parcala);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
