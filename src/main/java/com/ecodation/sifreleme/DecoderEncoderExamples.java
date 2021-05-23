package com.ecodation.sifreleme;

import java.util.Base64;
import java.util.Scanner;

public class DecoderEncoderExamples {
	
	// Kullanıcıdan veri almak
	public String getScannerMethod() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		return klavye.nextLine();
	}
	
	// Encoder
	public String getEncoderMethod(String data) {
		return Base64.getEncoder().encodeToString(data.getBytes());
	}
	
	// Decoder
	public void getDecoderMethod(String data) {
		String coz = new String(Base64.getMimeDecoder().decode(data));
		System.out.println(coz);
	}
}
