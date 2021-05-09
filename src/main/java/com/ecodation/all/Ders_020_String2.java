package com.ecodation.all;

public class Ders_020_String2 {
	// Ctrl+Shift+S
	public static void main(String[] args) {
		
		try {
			// Kodlar buraya yazılacak
			String password = "Swing";
			String repassword = "Swing";
			
			String result = (!password.equals(repassword)) ? "şifreler birbirine uyuyor" : "Şifreler uymaz";
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
