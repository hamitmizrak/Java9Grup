package com.ecodation.mvc.model;

import java.io.Serializable;
import java.util.Date;

// @Named(value = "bean2")
// @ApplicationScoped
//
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
public class CdiBean2 implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private String surname;
	private String age;
	private Date date;
	
}
