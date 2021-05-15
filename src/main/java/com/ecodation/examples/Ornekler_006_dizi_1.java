package com.ecodation.examples;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ornekler_006_dizi_1 {
	
	// konsoldan kaç elemanlı elemanlı bir dizi olacak ve bu elemanlara rastgele
	// bilgisayar tarafında sayılar girecek
	// -a) konsoldan rastgele sayı için başlangıç ve bitişi consolden kullanıcı
	// yazacak
	// -b) bu sayıları bir diziye atayalım
	// -c-) rastgele gelen sayıları küçükten büyüğe sıralıyalım ?
	// -d) ilk sayı ile son sayının toplamını alalım.
	// -e) bütün sayıların toplamı ?
	// -f) ortalaması ?
	// -g) bütün sayı toplamını metota verecem metot şunu yapacak girilen sayının 10
	// küçük olup olmadığını kontol edecek.
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int diziElamanSayisi, rastSayi, baslangic, bitis, ilkSayi, sonSayi, toplam = 0;
		double ortalama;
		
		System.out.println("Dizi eleman sayısını giriniz");
		diziElamanSayisi = klavye.nextInt();
		
		// System.out.println("Başlangıç sayı");
		// baslangic = klavye.nextInt();
		//
		// System.out.println("Bitiş sayı");
		// bitis = klavye.nextInt();
		
		int[] dizi = new int[diziElamanSayisi];
		// int rnd;
		
		for (int i = 0; i < diziElamanSayisi; i++) {
			Random rastgeleSayilar = new Random();
			rastSayi = rastgeleSayilar.nextInt(4) + 1; // 1<=x<=4
			dizi[i] = rastSayi;
			toplam += dizi[i];
		}
		
		Arrays.sort(dizi);
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
		System.out.println("");
		
		ilkSayi = dizi[0];
		System.out.println("ilk sayı: " + ilkSayi);
		
		sonSayi = dizi[dizi.length - 1];
		System.out.println("sonSayi sayı: " + sonSayi);
		System.out.println(ilkSayi + sonSayi);
		System.out.println("toplamları: " + toplam);
		ortalama = toplam / diziElamanSayisi;
		System.out.println("ortalama: " + ortalama);
		
	}
}
