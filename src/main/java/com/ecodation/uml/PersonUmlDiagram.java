package com.ecodation.uml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class PersonUmlDiagram {
	
	private int id;
	private String name;
	private String surname;
	public String address;
	public boolean sehir;
	private static int sabitSayi;
	
	public void fullName() {
	}
	
	public abstract void fullName2();
}
