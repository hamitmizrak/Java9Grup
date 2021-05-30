package com.ecodation.generics;

public class MainTest {
	
	public static void main(String[] args) {
		
		PersonNormal normal = new PersonNormal("ad", "Soyad");
		System.out.println(normal);
		normal.deneme("adi", "soyadi");
		System.out.println("******************************");
		
		PersonNormal normal2 = PersonNormal.builder().personName("personName").personSurname("soyadi").build();
		System.out.println(normal2);
		normal2.deneme("adi", "soyadi");
		System.out.println("******************************");
		
		PersonGenerics<Integer> personGenerics = new PersonGenerics<>(44, 55);
		System.out.println(personGenerics);
		personGenerics.deneme(44, "soyadi");
		
	}
	
}
