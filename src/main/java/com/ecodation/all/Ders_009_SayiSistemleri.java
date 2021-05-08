package com.ecodation.all;

public class Ders_009_SayiSistemleri {
	
	public static void main(String[] args) {
		
		int x, y;
		x = 10;
		y = 9;
		
		String result = (x > y) ? "büyüktür" : "küçüktür";
		System.out.println(result.toUpperCase());
		// System.out.println(((x > y) ? "büyüktür" : "küçüktür"));
		if (x > y) {
			System.out.println("büyüktür");
		} else {
			System.out.println("küçüktür");
		}
		
	}
	
}
