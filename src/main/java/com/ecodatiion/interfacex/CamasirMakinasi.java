package com.ecodatiion.interfacex;

import java.util.Random;

public class CamasirMakinasi extends AyniOrtakOzellikler implements FarkliOrtakOzellikler {
	
	@Override
	public void motoru() {
		
		Random random = new Random();
		int sayi = random.nextInt(10) + 1;
		System.out.println("çamaşır motoru" + " SLF" + sayi);
		
	}
	
	@Override
	public void frekans() {
		System.out.println("çamaşır  frekansı ASDSAD845148Xm");
		
	}
	
	@Override
	public void renkler() {
		System.out.println(BuzdolabiMakinasi.class + " :Renkler: " + Renkler.MAVI);
		
	}
	
	@Override
	public void govdesizMetot(String renk) {
		System.out.println(renk);
		
	}
	
}
