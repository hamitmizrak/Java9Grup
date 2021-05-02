package com.ecodation.all;

public class Ders_006_DataType_referans {
	
	public static void main(String[] args) {
		// Error
		// 1-)Syntax error
		// intb sayi;
		
		// 2-)Logic Error
		int sayi = 44;
		String sayi2 = "44";
		System.out.println(sayi + sayi2);
		
		// 3-)Runtime error
		// En çok kortuğumuz hata türüdür.
		int sayi4 = 3 / 0; // tanımsız
		System.out.println(sayi4);
		
	}
	
}
