package com.ecodation.examples;

import java.util.Arrays;

public class Ornekler_007_dizi_2 {
	
	// S1-) 0,5,3,2,1,4 bu sayıları bir diziye atayın bu diziniden clonelanmış dizi
	// elde edilecektir.
	// s2-) bu sayıları küçükten büyüğe doğru sıralayın
	// s3-) Bunların içinde çift sayı toplamları ,tek sayı toplamı
	
	public static void main(String[] args) {
		int[] original = new int[6];
		original[0] = 0;
		original[1] = 5;
		original[2] = 3;
		original[3] = 2;
		original[4] = 1;
		original[5] = 4;
		
		// 1
		int[] clone = new int[original.length];
		for (int i = 0; i < original.length; i++) {
			clone[i] = original[i];
		}
		
		// 2
		Arrays.sort(clone);
		int cift = 0, tek = 0;
		for (int temp : clone) {
			System.out.print(temp + " ");
			if (temp % 2 == 0) {
				cift += temp;
			}
			if (temp % 2 == 1) {
				tek = tek + temp;
				
			}
		}
		// 0 1 2 3 4 5
		System.out.println("\ntek sayı toplamları: " + tek);
		System.out.println("çift sayı toplamları: " + cift);
		
	}
}
