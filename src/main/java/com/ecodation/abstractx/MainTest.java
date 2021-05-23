package com.ecodation.abstractx;

public class MainTest {
	
	public static void main(String[] args) {
		
		// Animal animal=new Animal();
		
		// polymorphism
		Animal animal = new Aslan();
		Animal animal2 = new Kurt();
		Animal animal3 = new Cita();
		
		Aslan aslan = new Aslan();
		aslan.govdesizMetot(); // polymorphism
		
		Kurt kurt = new Kurt();
		kurt.govdesizMetot(); // polymorphism
		
		Cita cita = new Cita();
		cita.govdesizMetot(); // polymorphism
	}
	
}
