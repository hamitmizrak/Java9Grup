package com.ecodation.composition;

import java.util.ArrayList;

public class MainTestCustomerComputers {
	public static void main(String[] args) {
		
		Customer customer = new Customer(10, "Hamit", "Mizrak");
		customer.setComputerlist(new ArrayList<Computers>());
		
		Computers computers = new Computers(100, "Msi-Gl75", "Xsda85");
		computers.setCustomer(customer);
		customer.getComputerlist().add(computers);
		
		System.out.println(customer.getCustomerId() + customer.getCustomerName());
		
		for (Computers temp : customer.getComputerlist()) {
			System.out.println(temp.getComputerId() + " " + temp.getComputerName());
			
		}
	}
}
