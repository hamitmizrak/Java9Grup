package com.ecodation.all;

public class Ders_016_try_catch {
	
	public static void mailSend() {
		System.out.println("Mail gönderildi.");
		
	}
	
	public static void main(String[] args) {
		System.out.println("1.satır");
		
		try {
			int sayi = 3 / 0;
			System.out.println(sayi);
		} catch (ArithmeticException ar) {
			System.out.println("Hata var: " + ar.hashCode());
			ar.printStackTrace();
		} catch (Exception e) {
			System.out.println("Hata var: " + e.hashCode());
			e.printStackTrace();
		} finally {
			System.out.println("Mutlaka burası çalşacak");
			// Log.info("hata var");
			mailSend();
		}
		System.out.println("10.000 satır");
	}
	
}
