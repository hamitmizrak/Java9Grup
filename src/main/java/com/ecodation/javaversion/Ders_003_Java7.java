package com.ecodation.javaversion;

import java.util.ArrayList;
import java.util.List;

public class Ders_003_Java7 {
	public static void main(String[] args) {
		
		// while (true) {
		// System.out.println("Sonsuz döngü");
		//
		// }
		//
		// java 7 gelen özllikler
		int a = 0b0010000000000000000000;
		System.out.println(a);
		
		// under score
		int cellPhoneNumber = 444_55_66_22;
		System.out.println(cellPhoneNumber);
		
		// Switch case String vermek
		String key = "5";
		switch (key) {
			case "5": {
				System.out.println("String  5");
				
			}
			default: {
				System.out.println("Hata");
			}
			
		}
		
		// Generics
		List<String> asd = new ArrayList<>();
		int degisken = 6;
		
	}
}
