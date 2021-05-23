package com.ecodation.designpattern;

// singleton
// Class değişkenini (private static)
// parametresiz constructor private
// getter metodunu
public class SingletonDesignPattern {
	
	private static SingletonDesignPattern instance = null;
	
	private SingletonDesignPattern() {
		// new ile oluşturamazsın
	}
	
	public static SingletonDesignPattern getInstance() {
		if (instance == null)
			instance = new SingletonDesignPattern();
		return instance;
	}
	
}
