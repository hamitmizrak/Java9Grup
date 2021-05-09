package com.ecodation.all;

import java.util.Date;

public class Ders_030_tarih2 {
	// Ctrl+Shift+S
	public static void main(String[] args) {
		
		try {
			// tarih
			Date date = new Date();
			System.out.println(date);
			System.out.println(date.getDate());
			
			// 0=pazar 1=pazartesi
			System.out.println(date.getDay());
			System.out.println(date.getMinutes());
			System.out.println("**************");
			
			System.out.println(date.getHours());
			date.setHours(21);
			System.out.println(date.getHours());
			
		} catch (
		
		Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
