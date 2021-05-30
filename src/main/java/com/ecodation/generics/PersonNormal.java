package com.ecodation.generics;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@NonNull
@Builder
// normal class
public class PersonNormal {
	
	private String personName;
	private String personSurname;
	
	// normal constructor
	public PersonNormal(String personName, String personSurname) {
		this.personName = personName;
		this.personSurname = personSurname;
	}
	
	// normal method
	public void deneme(String adi, String soyadi) {
		System.out.println(adi + " " + soyadi);
	}
	
}
