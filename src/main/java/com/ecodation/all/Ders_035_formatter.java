package com.ecodation.all;

public final class Ders_035_formatter {
	
	public static void main(String[] args) {
		
		String str = "Hamit Mızrak";
		int sayi = 44;
		float virgul = 44.35f;
		
		System.out.printf("%s  %10d %1.1f", str, sayi, virgul);
		System.out.println("\n-----------\n");
		
		System.out.printf("%s %n %10d %1.1f", str, sayi, virgul);
		
		System.out.println();
		
	}
	
}
