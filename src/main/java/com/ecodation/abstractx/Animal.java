package com.ecodation.abstractx;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
// abstract
abstract public class Animal implements Serializable {
	private static final long serialVersionUID = -9180376751400336843L;
	// Genel ortak özellikler
	protected Long id;
	protected String animalName;
	protected String animalAge;
	protected String animalField;
	protected Date date;
	
	// overloading
	public void govdeliMetot() {
		System.out.println(this.animalAge + " " + this.animalName);
	}
	
	public void govdeliMetot(int sayi) {
		System.out.println(this.animalAge + " " + this.animalName);
	}
	
	abstract public void govdesizMetot();
	
}
