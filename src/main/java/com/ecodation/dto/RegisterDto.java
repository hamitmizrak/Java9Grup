package com.ecodation.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto implements Serializable {
	private static final long serialVersionUID = -8659121833802061043L;

	private long registerId;
	private String registerName;
	private String registerSurname;
	private String registerEmailAddress;
	private String registerPassword;
	private Date creationDate;

}
