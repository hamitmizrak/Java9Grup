package com.ecodation.all;

import java.util.Scanner;

public class Ders_021_ScannerExamples {
	// Ctrl+Shift+S
	public static void main(String[] args) {
		
		try {
			// Kodlar buraya yazılacak
			// java.util.Scanner
			String password, repassword;
			Scanner klavye = new Scanner(System.in);
			
			System.out.println("lütfen parolanızı giriniz");
			password = klavye.nextLine();
			
			System.out.println("lütfen parolanızı tekrar giriniz");
			repassword = klavye.nextLine();
			
			String result = (password.equals(repassword)) ? "şifreler birbirine uyuyor"
					: "Şifreler birbirine uymuyor...";
			System.out.println(result);
			
			klavye.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
