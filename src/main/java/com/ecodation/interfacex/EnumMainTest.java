package com.ecodation.interfacex;

public class EnumMainTest {
	
	public static void main(String[] args) {
		RenklerOrnek renkler = RenklerOrnek.kirmizi;
		System.out.println(renkler.name());
		System.out.println(renkler.getId());
		
		for (Object temp : RenklerOrnek.values()) {
			// System.out.print(temp + " ");
		}
	}
	
}
