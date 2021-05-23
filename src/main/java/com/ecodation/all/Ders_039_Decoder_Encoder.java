package com.ecodation.all;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Ders_039_Decoder_Encoder {
	
	public static void main(String[] args) {
		String adi = "hamitmizrak@gmail.com";
		
		// Encoder ==> şifreleme
		Encoder encoder = Base64.getEncoder();
		String cevir = encoder.encodeToString(adi.getBytes());
		System.out.println(cevir);
		
		// Decoder
		Decoder decoder = Base64.getMimeDecoder();
		String str = new String(decoder.decode(cevir));
		System.out.println(str);
		
	}
	
}
