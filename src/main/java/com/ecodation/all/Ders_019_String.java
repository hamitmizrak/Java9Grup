package com.ecodation.all;

public class Ders_019_String {
	
	public static void main(String[] args) {
		
		try {
			// Kodlar buraya yazılacak
			String kelime = "Java Ecodation ";
			System.out.println("Kelime sayısı:" + kelime.length());
			System.out.println("Kelime sayısı:" + kelime.trim().length());
			System.out.println("Kelime küçük:" + kelime.toLowerCase());
			System.out.println("Kelime büyük:" + kelime.toUpperCase());
			System.out.println("Kelime harf:" + kelime.charAt(0));
			System.out.println("Kelime sayı:" + kelime.indexOf("E"));
			System.out.println("Kelime sayısı:" + kelime.lastIndexOf("E"));
			System.out.println("Kelime sayısı:" + kelime.replace("Java", "Java SE"));
			System.out.println("Kelime substring:" + kelime.substring(5));
			System.out.println("Kelime substring:" + kelime.substring(0, 4)); // 0<=x<=4 (5-1)
			System.out.println("Kelime empty:" + kelime.isEmpty());
			System.out.println("Kelime startsWith:" + kelime.startsWith("J"));
			System.out.println("Kelime startsWith:" + kelime.endsWith(" "));
			
			System.out.println("****************************************");
			
			String[] dizi = kelime.split(" ");
			for (String temp : dizi) {
				System.out.println(temp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
