package com.ecodation.all;

public class Ders_032_Metotlar {
	
	public void voidliParametresizMethod() {
		System.out.println("Merhabalar ben Voidli ve parametresiz metodum");
		
	}
	
	public void voidliParametreliMethod(String merhaba) {// parametre
		System.out.println("Merhabalar ben Voidli ve parametreli metodum " + merhaba);
		
	}
	
	public static void voidliParametresizMethod2() {
		System.out.println("Merhabalar ben Voidli ve parametresiz metodum");
		
	}
	
	public static int voidsizParametresizMethod() {
		int x, y, z;
		x = 10;
		y = 42;
		z = x + y;
		System.out.println(z);
		return z;
	}
	
	public static int voidsizParametreliMethod(int x, int y) {
		int z;
		z = x + y;
		System.out.println(z);
		return z;
	}
	
	// psvm olmazsa Compiler yapılmaz
	public static void main(String[] args) {
		// static method
		Ders_032_Metotlar.voidliParametresizMethod2();
		voidliParametresizMethod2();
		voidsizParametresizMethod();
		voidsizParametreliMethod(10, 20);
		
		// instance =örnekleme
		Ders_032_Metotlar ornek = new Ders_032_Metotlar();
		ornek.voidliParametresizMethod();
		ornek.voidliParametreliMethod("Hamit Mızrak"); // argüman
		
	}
}
