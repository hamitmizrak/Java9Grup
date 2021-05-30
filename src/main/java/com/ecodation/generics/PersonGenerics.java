package com.ecodation.generics;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@NonNull
// generics class
public class PersonGenerics<T> {
	
	private T personName;
	private T personSurname;
	
	// generics constructor
	public PersonGenerics(T personName, T personSurname) {
		this.personName = personName;
		this.personSurname = personSurname;
	}
	
	// genericsmethod
	public <A> void deneme(A adi, A soyadi) {
		System.out.println(adi + " " + soyadi);
	}
	
}
