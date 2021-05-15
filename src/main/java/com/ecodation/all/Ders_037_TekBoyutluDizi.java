package com.ecodation.all;

import java.util.Arrays;

public final class Ders_037_TekBoyutluDizi {
	
	public static void main(String[] args) {
		int[] dizi = new int[10];
		dizi[5] = 5;
		dizi[6] = 6;
		dizi[0] = 0;
		dizi[3] = 90;
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(dizi);
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		
	}
	
}
