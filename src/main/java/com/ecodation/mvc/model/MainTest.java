package com.ecodation.mvc.model;

public class MainTest {
	
	public static void main(String[] args) {
		CarPojoDto car1 = new CarPojoDto();
		car1.setId(100);
		car1.setCarName("BMV");
		//System.out.println(car1);
		//System.out.println("******************");
		
		CarBeansDto car2 = new CarBeansDto();
		car2.setId(200);
		car2.setCarName("Mercedes");
		//System.out.println(car2);
		
		if(car1 instanceof CarPojoDto) {
			System.out.println("Evet instacedir");
			
		}else {
			System.out.println("Hayır");
			
		}
		
	}
	
}
