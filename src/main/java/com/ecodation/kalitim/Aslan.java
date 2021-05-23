package com.ecodation.kalitim;

public class Aslan extends AnimalKalitim {
	private static final long serialVersionUID = -5109930859135499282L;
	
	private String aslanYavrusu;
	
	public Aslan() {
		
	}
	
	public Aslan(Long id, String animalName, String animalAge, String animalField, String aslanYavrusu) {
		super(id, animalName, animalAge, animalField);
		this.aslanYavrusu = aslanYavrusu;
	}
	
	public String getAslanYavrusu() {
		return aslanYavrusu;
	}
	
	public void setAslanYavrusu(String aslanYavrusu) {
		this.aslanYavrusu = aslanYavrusu;
	}
	
}
