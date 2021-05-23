package com.ecodation.kalitim;

public class MainTest {
	
	public static void main(String[] args) {
		
		AnimalKalitim animal = new AnimalKalitim();
		
		Aslan aslan = new Aslan(4L, "Aslan-adi", "Afrika", "Aslan yavrusu9", "");
		System.out.println(aslan);
		
		Kurt kurt = new Kurt();
		kurt.setAnimalAge("8");
		kurt.setAnimalField("Afrika-8");
		kurt.setId(8L);
		System.out.println(kurt);
		
		Cita cita = new Cita();
		cita.setAnimalAge("7");
		cita.setAnimalField("cita-7");
		cita.setId(7L);
		System.out.println(cita);
	}
	
}
