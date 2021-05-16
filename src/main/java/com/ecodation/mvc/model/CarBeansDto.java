package com.ecodation.mvc.model;

import java.io.Serializable;
import java.util.Objects;

public class CarBeansDto implements Serializable {
	private static final long serialVersionUID = -6474411244376234667L;
	
	// object field (Nesne degiskenleri) üğşçöÖÇŞĞÜıİ
	private long id;
	private String carName;
	
	// parametresiz constructor
	public CarBeansDto() {
		// TODO Auto-generated constructor stub
	}
	
	// parametreli constructor
	public CarBeansDto(long id, String carName) {
		super();
		this.id = id;
		this.carName = carName;
	}
	
	// hashCode
	@Override
	public int hashCode() {
		return Objects.hash(carName, id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarBeansDto other = (CarBeansDto) obj;
		return Objects.equals(carName, other.carName) && id == other.id;
	}
	
	// toString
	@Override
	public String toString() {
		return "CarBeansDto [id=" + id + ", carName=" + carName + "]";
	}
	// getter and setter
	
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
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
