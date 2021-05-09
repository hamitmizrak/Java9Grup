package com.ecodation.all;

public class Ders_026_boxing_UnBoxing {
	// Ctrl+Shift+S
	public static void main(String[] args) {
		
		try {
			// cast=dönüştüm
			// f-L
			float f1 = 23.44f;
			System.out.println(f1);
			
			float f2 = (float) 23.44;
			System.out.println(f2);
			
			long l2 = 414411141144L;
			
			// tam sayıdan String'e çevir
			int sayi = 44;
			String kelime = String.valueOf(sayi); // Object
			String kelime2 = Integer.toString(sayi); // String düzeyinde
			System.out.println(sayi + 16);
			System.out.println(kelime + 16);
			System.out.println(kelime2 + 16);
			
			// String'ten tam sayıya cevir
			String s2 = "20";
			System.out.println(20 + 10);
			System.out.println(s2 + 10);
			
			int castSayi = Integer.valueOf(s2);// Object
			System.out.println(castSayi + 10);
			int castSayi2 = Integer.parseInt(s2);// int düzeyinde
			System.out.println(castSayi2 + 10);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
