package com.ecodation.all;

import java.util.Random;

public class Ders_024_RandomExamples {
	// Ctrl+Shift+S
	public static void main(String[] args) {
		
		try {
			System.out.println(Math.round(Math.random() * 4 + 1));
			System.out.println("************");
			
			Random random = new Random();
			int sayi = random.nextInt(4) + 1;
			System.out.println(sayi);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
