package com.ecodation.all;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ders_029_tarih {
	// Ctrl+Shift+S
	public static void main(String[] args) {
		
		try {
			
			Locale locale = new Locale("tr", "TR");
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss", locale);
			
			// tarih
			Date date = new Date();
			System.out.println(date);
			
			String cevir = dateFormat.format(date);
			System.out.println(cevir);
			
		} catch (
		
		Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
