package com.ecodation.collectionsx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// add size get
public class ListExamples2 {
	public static void main(String[] args) {
		
		List<String> listeler2 = new ArrayList<String>();
		listeler2.add("Adana");
		listeler2.add("Malatya");
		listeler2.add("Ankara");
		listeler2.add("İstanbul");
		
		System.out.println("\n***********iterative********************");
		// iterative for
		for (int i = 0; i < listeler2.size(); i++) {
			System.out.print(listeler2.get(i) + " ");
		}
		
		System.out.println("\n***********forEach********************");
		
		// forEach
		for (String temp : listeler2) {
			System.out.print(temp + " ");
		}
		
		System.out.println("\n*************iterator******************");
		
		Iterator ite = listeler2.iterator();
		while (ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}
		
	}
}
