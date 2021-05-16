package com.ecodation.composition;

import java.io.Serializable;

// N
public class Students implements Serializable {
	private static final long serialVersionUID = 1791512711125931196L;
	
	// nesne degişkenleri
	private long studentId;
	private String studentName;
	private String studentSurname;
	
	// composition
	private Teacher teacher;
	
	// parametresiz constructor
	public Students() {
		this.studentId = 0;
		this.studentName = "isim girmediniz";
		this.studentSurname = "soyisim girmediniz";
	}
	
	// parametresli constructor
	public Students(long studentId, String studentName, String studentSurname) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSurname = studentSurname;
	}
	
	// toString
	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentName=" + studentName + ", studentSurname="
				+ studentSurname + "]";
	}
	
	// getter and setter
	public long getStudentId() {
		return studentId;
	}
	
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentSurname() {
		return studentSurname;
	}
	
	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
}
