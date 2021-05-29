package com.ecodatiion.interfacex;

// interface
public interface FarkliOrtakOzellikler {
	
	public int sayi = 5;
	public final static int sayi2 = 5;
	
	public void motoru();
	
	public void frekans();
	
	public void renkler();
	
	// govdeli
	default void interfaceGovdeliMetot() {
		System.out.println("Gövdeli metot interface");
	}
}
