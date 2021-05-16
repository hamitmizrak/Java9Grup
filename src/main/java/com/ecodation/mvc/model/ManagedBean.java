package com.ecodation.mvc.model;

// @javax.faces.bean.ManagedBean
// @SessionScoped
public class ManagedBean {
	private long id;
	private String name;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
