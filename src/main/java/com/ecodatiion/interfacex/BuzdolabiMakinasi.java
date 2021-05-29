package com.ecodatiion.interfacex;

import java.util.Random;

// main test
public class BuzdolabiMakinasi extends AyniOrtakOzellikler implements FarkliOrtakOzellikler {
	
	@Override
	public void motoru() {
		Random random = new Random();
		int sayi = random.nextInt(10) + 1;
		System.out.println("buzdolabı motoru" + " SLF" + sayi);
		
	}
	
	@Override
	public void frekans() {
		System.out.println("buzdolabı  frekansı: XLKsdfısdfk985");
		
	}
	
	@Override
	public void renkler() {
		System.out.println(BuzdolabiMakinasi.class + " :Renkler: " + Renkler.KIRMIZI);
		
	}
	
	@Override
	public void govdesizMetot(String renk) {
		System.out.println(renk);
		
	}
	
}
