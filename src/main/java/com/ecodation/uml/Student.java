package com.ecodation.uml;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Student extends PersonUmlDiagram implements CoronaTest {
	private int id;
	private String hescode;
	private String dersler;
	
	public void studentName() {
	}
	
	@Override
	public void fullName2() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void coronaTest() {
		// TODO Auto-generated method stub
		
	}
	
}
