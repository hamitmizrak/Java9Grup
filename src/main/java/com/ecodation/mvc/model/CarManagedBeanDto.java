package com.ecodation.mvc.model;

// @ManagedBean
// @SessionScoped

public class CarManagedBeanDto {
	// object field (Nesne degiskenleri) üğşçöÖÇŞĞÜıİ
	private long id;
	private String carName;
	
	// Getter Setter Shift+Alt+S
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCarName() {
		return carName;
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
}
