package com.ecodation.composition;

import java.io.Serializable;
import java.util.List;

// 1 (sınıf ogretmeni)
public class Teacher implements Serializable {
	private static final long serialVersionUID = 2539920868861632075L;
	
	// nesne degişkenleri
	private long teacherId;
	private String teacherName;
	private String teacherSurname;
	
	// composition
	List<Students> studentList;
	
	// parametresiz constructor
	public Teacher() {
		this.teacherId = 0;
		this.teacherName = "isim girmediniz";
		this.teacherSurname = "soyisim girmediniz";
	}
	
	// parametresli constructor
	public Teacher(long teacherId, String teacherName, String teacherSurname) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherSurname = teacherSurname;
	}
	
	// toString
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherSurname="
				+ teacherSurname + "]";
	}
	
	// getter and setter
	public long getTeacherId() {
		return teacherId;
	}
	
	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}
	
	public String getTeacherName() {
		return teacherName;
	}
	
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	public String getTeacherSurname() {
		return teacherSurname;
	}
	
	public void setTeacherSurname(String teacherSurname) {
		this.teacherSurname = teacherSurname;
	}
	
	public List<Students> getStudentList() {
		
		return studentList;
	}
	
	public void setStudentList(List<Students> studentList) {
		this.studentList = studentList;
	}
	
}
