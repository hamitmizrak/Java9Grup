package com.ecodation.lambdax;

public class LambdaMainTest {
	public static void main(String[] args) {
		Ekran deneme1 = new Ekran() {
			@Override
			public void ekran() {
				System.out.println("Ekranda göster uzun olanı");
			}
		};
		deneme1.ekran();
		
		Ekran deneme2 = () -> System.out.println("Ekranda göster");
		deneme2.ekran();
	}
}
