package com.ecodation.all;

public class Ders_003_operatorler {
	
	public static void main(String[] args) {
		// aritmetik operatörler
		int sayi1, sayi2;
		sayi1 = 9;
		sayi2 = 2;
		System.out.println("1.sayı: " + sayi1 + " 2.sayı: " + sayi2);
		System.out.println("toplam: " + (sayi1 + sayi2));
		System.out.println("cikarma: " + (sayi1 - sayi2));
		System.out.println("carpma: " + (sayi1 * sayi2));
		System.out.println("bölme: " + (sayi1 / sayi2));
		System.out.println("kalan: " + (sayi1 % sayi2));
		System.out.println("");
		
		// ilişkisel operatörler
		System.out.println(sayi1 > sayi2);
		System.out.println(sayi1 >= sayi2);
		System.out.println(sayi1 < sayi2);
		System.out.println(sayi1 <= sayi2);
		
		// mantıksal operatörler
		String isim1, isim2;
		isim1 = "Ali";
		isim2 = "Veli";
		
		// System.out.println(isim1&&isim2);
		// System.out.println(isim1||isim2);
		// System.out.println(!isim1&&isim2);
		
		// Atama operatörü
		int sayi = 10;
		System.out.println((sayi + 1));
		System.out.println((sayi++));
		System.out.println((++sayi));
		
	}
	
}
