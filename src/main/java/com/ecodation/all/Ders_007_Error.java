package com.ecodation.all;

public class Ders_007_Error {
	
	public static void main(String[] args) {
		// Referans türler 9+1 tanedir.
		// f L
		// tam sayılar b < s < i < l
		Byte b1 = new Byte((byte) 127);
		Short s1 = new Short((short) 555);
		Integer i1 = new Integer(4444);
		Long l1 = new Long(55521);
		
		b1 = null;
		
		// virgüllü f < d
		Float f2 = new Float(44.23);
		Double d2 = new Double(556.555);
		
		// boolean
		// boolean b3 = true;
		Boolean b3 = new Boolean(3 > 1);
		
		// ASCII Unicode
		Character c4 = new Character('\u4523');
		System.out.println(c4);
		
	}
	
}
