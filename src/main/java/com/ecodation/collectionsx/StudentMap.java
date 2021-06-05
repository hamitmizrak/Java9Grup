package com.ecodation.collectionsx;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class StudentMap {
	
	private int id;
	private String name;
	private String surname;
}
