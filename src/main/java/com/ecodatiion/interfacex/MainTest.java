package com.ecodatiion.interfacex;

public class MainTest {
	
	public static void main(String[] args) {
		
		// AyniOrtakOzellikler ayniOrtakOzellikler = new AyniOrtakOzellikler();
		
		BuzdolabiMakinasi buzdolabiMakinasi = new BuzdolabiMakinasi();
		buzdolabiMakinasi.frekans();
		buzdolabiMakinasi.renkler();
		buzdolabiMakinasi.motoru();
		buzdolabiMakinasi.getMarka();
		buzdolabiMakinasi.setRenk("turuncu");
		System.out.println(buzdolabiMakinasi.getRenk());
		System.out.println("**************");
		CamasirMakinasi camasirMakinasi = new CamasirMakinasi();
		camasirMakinasi.frekans();
		camasirMakinasi.renkler();
		camasirMakinasi.motoru();
		camasirMakinasi.getMarka();
		camasirMakinasi.setRenk("eflatun");
		System.out.println(camasirMakinasi.getRenk());
		
	}
	
}
