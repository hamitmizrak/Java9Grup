package com.ecodatiion.interfacex;

public enum RenklerOrnek {
	beyaz(4), kirmizi(8), yesil(12), mavi(16);
	private final int id;
	
	public int getId() {
		return id;
	}
	
	private RenklerOrnek(int id) {
		this.id = id;
	}
	
}
