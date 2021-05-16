package com.ecodation.mvc.model;

public class ThisExamples {
	
	private long id;
	private String name;
	private String surName;
	
	private ThisExamples() {
		// this(1, "", "");
		// this(1, "");
	}
	
	public ThisExamples(long id, String name, String surName) {
		
		this.id = id;
		this.name = name;
		this.surName = surName;
	}
	
	public ThisExamples(long id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
}
