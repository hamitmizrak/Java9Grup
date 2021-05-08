package com.ecodation.all;

public class Ders_015_do_while {
	
	public static void main(String[] args) {
		
		// sayınının negatif mi pozitif mi olduğunu bulan bir algoritmanı ?
		
		int sayi = 0;
		if (sayi < 0) {
			System.out.println("negatif sayısıdır");
		} else if (sayi > 0) {
			System.out.println("pozitif sayıdır");
		} else {
			System.out.println("sayı sıfır");
		}
		
		String result = (sayi >= 0) ? "sayı pozitif" : "sayı negatiftir";
		System.out.println(result);
		
	}
	
}
