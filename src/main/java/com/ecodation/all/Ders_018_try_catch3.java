package com.ecodation.all;

public class Ders_018_try_catch3 {
	
	@SuppressWarnings("asd")
	@Deprecated
	
	public void deneme() {
		
	}
	
	public static void main(String[] args) {
		
		try {
			int sayi = 15 / 0;
			System.out.println(sayi);
			
		} catch (Exception e) {
			
			// System.out.println("getMessage() -->istisna adı: " + e.getMessage());
			// System.out.println("toString() --> istisna adı ve türü: " + e.toString());
			// e.printStackTrace();
			StackTraceElement[] dizi = e.getStackTrace();
			for (Object o1 : dizi) {
				System.out.println(o1);
			}
		}
		
	}
	
}
