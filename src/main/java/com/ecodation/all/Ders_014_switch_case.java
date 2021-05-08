package com.ecodation.all;

public class Ders_014_switch_case {
	
	public static void main(String[] args) {
		
		int key = 9;
		if (key == 9) {
			System.out.println("sayı 9 ");
		} else if (key == 0) {
			System.out.println("sayı 0 ");
		} else if (key == 1) {
			System.out.println("sayı 1 ");
		} else {
			System.out.println("Farklı bir sayı");
		}
		System.out.println("switch case");
		switch (key) {
			// if
			case 9: {
				System.out.println("sayı 9 ");
				break;
			}
			// else if
			case 0: {
				System.out.println("sayı 0 ");
				break;
			}
			// else if
			case 1: {
				System.out.println("sayı 1 ");
				break;
			}
			// else
			default:
				System.out.println("Farklı bir sayı");
				break;
		}
		
	}
	
}
