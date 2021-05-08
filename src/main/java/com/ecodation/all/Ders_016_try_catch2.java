package com.ecodation.all;

import java.io.IOException;

public class Ders_016_try_catch2 {
	
	public static void mailSend() throws ArithmeticException {
		System.out.println("Mail gönderildi.");
		int sayi = 3 / 0;
		System.out.println(sayi);
		
	}
	
	public static void main(String[] args) {
		
		try {
			int sayi = 3 / 0;
			System.out.println(sayi);
			throw new ArithmeticException("Sıfıra böme hatası var");
		} catch (ArithmeticException ar) {
			System.out.println("Hata var: " + ar.hashCode());
			ar.printStackTrace();
			// System.out.println(throw.ar);
		} catch (IOException io) {
			System.out.println("Hata var: " + io.hashCode());
			io.printStackTrace();
			// System.out.println(throw.ar);
		} catch (Exception e) {
			System.out.println("Hata var: " + e.hashCode());
			e.printStackTrace();
		} finally {
			System.out.println("Mutlaka burası çalşacak");
			// Log.info("hata var");
			mailSend();
		}
		
	}
	
}
