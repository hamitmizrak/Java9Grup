package com.ecodation.examples;

public class Ornekler_005_sayidegeri {
	public static void main(String[] args) {
		// switch case haftanın günleri
		
		String day = "pazartesi";
		switch (day) {
			case "sali":
				System.out.println("Günlerden: salı");
				break;
			case "pazar":
				System.out.println("Günlerden: pazar");
				break;
			case "çarşamba":
				System.out.println("Günlerden: çarşamba");
				break;
			case "perşembe":
				System.out.println("Günlerden: perşembe");
				break;
			case "pazartesi":
				System.out.println("Günlerden: pazartesi");
				break;
			case "cumartesi":
				System.out.println("Günlerden: cumartesi");
				break;
			case "cuma":
				System.out.println("Günlerden: cuma");
				break;
			
			default:
				System.out.println("Lütfen belirtilen günü giriniz");
				
				break;
		}
	}
}
