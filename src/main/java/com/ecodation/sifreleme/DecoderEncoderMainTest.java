package com.ecodation.sifreleme;

public class DecoderEncoderMainTest {
	
	public static void main(String[] args) {
		DecoderEncoderExamples sinif = new DecoderEncoderExamples();
		String klavye = sinif.getScannerMethod();
		String encoder = sinif.getEncoderMethod(klavye);
		sinif.getDecoderMethod(encoder);
		System.out.println("********************");
		System.out.println("girdiğiniz kelime: " + klavye);
		System.out.println("encoder kelime: " + encoder);
		
	}
	
}
