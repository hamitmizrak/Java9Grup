package com.ecodation.all;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Ders_031_CalendarExample {
	// Ctrl+Shift+S
	public static void main(String[] args) {
		
		try {
			
			// calendar
			Locale locale = new Locale("tr", "TR");
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss zzzz ", locale);
			
			// tarih
			Calendar date = Calendar.getInstance();
			System.out.println(date.getTime());
			
			String cevir = dateFormat.format(date.getTime());
			System.out.println(cevir);
		} catch (
		
		Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
