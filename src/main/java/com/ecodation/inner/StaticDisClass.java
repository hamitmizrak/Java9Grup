package com.ecodation.inner;

public class StaticDisClass {
	int sayi = 44;
	
	public static class IcStaticClass {
		int sayi2 = 55;
		
		public int getSayi2() {
			return sayi2;
		}
		
		public void setSayi2(Integer sayi2) {
			
			this.sayi2 = sayi2;
		}
		
	}
	
	public int getSayi() {
		return sayi;
	}
	
	public void setSayi(int sayi) {
		this.sayi = sayi;
	}
}
