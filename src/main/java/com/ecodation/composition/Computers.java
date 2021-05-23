package com.ecodation.composition;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

// N
@Data
@NoArgsConstructor
public class Computers implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int computerId;
	private String computerName;
	private String computerSerial;
	
	// composition
	private Customer customer;
	
	public Computers(int computerId, String computerName, String computerSerial) {
		this.computerId = computerId;
		this.computerName = computerName;
		this.computerSerial = computerSerial;
	}
	
}
