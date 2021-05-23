package com.ecodation.composition;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

// 1
@Data
public class Customer implements Serializable {
	private static final long serialVersionUID = 8879250432288677487L;
	
	private int customerId;
	private String customerName;
	private String customerSurname;
	
	// composition
	private List<Computers> computerlist;
	
	public Customer() {
		this.computerlist = new ArrayList<Computers>();
	}
	
	public Customer(int customerId, String customerName, String customerSurname) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerSurname = customerSurname;
	}
	
}
