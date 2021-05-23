package com.ecodation.kalitim;

import java.io.Serializable;
import java.util.Date;

// inheritance
public class AnimalKalitim implements Serializable {
	private static final long serialVersionUID = -9180376751400336843L;
	// Genel ortak özellikler
	protected Long id;
	protected String animalName;
	protected String animalAge;
	protected String animalField;
	protected Date date;
	
	// parametresiz constructor
	public AnimalKalitim() {
		this.date = new Date(System.currentTimeMillis());
	}
	
	// parametreli constructor
	public AnimalKalitim(Long id, String animalName, String animalAge, String animalField) {
		this.id = id;
		this.animalName = animalName;
		this.animalAge = animalAge;
		this.animalField = animalField;
		
	}
	
	// toString
	@Override
	public String toString() {
		return "Animal [id=" + id + ", animalName=" + animalName + ", animalAge=" + animalAge + ", animalField="
				+ animalField + ", date=" + date + "]";
	}
	
	// getter setter
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAnimalName() {
		return animalName;
	}
	
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
	public String getAnimalAge() {
		return animalAge;
	}
	
	public void setAnimalAge(String animalAge) {
		this.animalAge = animalAge;
	}
	
	public String getAnimalField() {
		return animalField;
	}
	
	public void setAnimalField(String animalField) {
		this.animalField = animalField;
	}
	
	public static void main(String[] args) {
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date);
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
}
