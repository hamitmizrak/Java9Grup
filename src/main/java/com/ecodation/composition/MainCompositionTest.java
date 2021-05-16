package com.ecodation.composition;

import java.util.ArrayList;

public class MainCompositionTest {
	
	public static void main(String[] args) {
		// kim olmazsa olmaz
		Teacher teacher = new Teacher(100, "Hamit", "Mızrak");
		teacher.setStudentList((new ArrayList<>()));
		
		Students students1 = new Students(200, "Özgür", "Baykal");
		students1.setTeacher(teacher);
		students1.getTeacher().getStudentList().add(students1);
		
		Students students2 = new Students(400, "Birce", "Alptekin");
		students2.setTeacher(teacher);
		students2.getTeacher().getStudentList().add(students2);
		
		Students students3 = new Students(600, "İrfan", "Can");
		students3.setTeacher(teacher);
		students3.getTeacher().getStudentList().add(students3);
		//////////////////////////////////////////////////////////////////
		System.out.println(teacher);
		System.out.println("***********************************");
		
		for (Object temp : teacher.getStudentList()) {
			System.out.println(temp);
			
		}
		System.out.println("***********************************");
		for (Students temp : teacher.getStudentList()) {
			System.out.println(temp.getStudentId() + " " + temp.getStudentName());
			
		}
		
	}
	
}
