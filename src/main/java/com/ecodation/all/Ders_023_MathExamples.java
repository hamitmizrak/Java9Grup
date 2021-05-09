package com.ecodation.all;

import java.util.Scanner;

public class Ders_023_MathExamples {
	// Ctrl+Shift+S
	public static void main(String[] args) {
		
		try {
			// Kodlar buraya yazılacak
			// System.out.println(Math.E);
			// System.out.println(Math.PI);
			// System.out.println(Math.abs(-5));
			// System.out.println(Math.pow(2, 4));
			// System.out.println(Math.sqrt(16));
			// System.out.println(Math.min(1, -100));
			// System.out.println(Math.max(100, 2));
			// System.out.println(Math.log10(10));
			// System.out.println(Math.floor(4.9));
			// System.out.println(Math.ceil(4.0001));
			// System.out.println(Math.round(6.5));
			// System.out.println(Math.round(6.4));
			
			Scanner klavye = new Scanner(System.in);
			int sayi1, sayi2;
			System.out.println("Lütfen 1.sayıyı giriniz");
			sayi1 = klavye.nextInt();
			System.out.println("Lütfen 2.sayıyı giriniz");
			sayi2 = klavye.nextInt();
			
			System.out.println(Math.pow(2, Math.round(Math.sqrt(Math.abs(sayi2)))));
			System.out.println(Math.max(sayi1, Math.pow(2, Math.round(Math.sqrt(Math.abs(sayi2))))));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
