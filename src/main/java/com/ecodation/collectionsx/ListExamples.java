package com.ecodation.collectionsx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// add size get
public class ListExamples {
	public static void main(String[] args) {
		
		// LinkedList<String> listeler2 = new LinkedList<String>();
		// List<String> listeler = new LinkedList<String>();
		
		List<String> listeler3 = new ArrayList<String>();
		listeler3.add("3");
		listeler3.add("4");
		listeler3.add("5");
		
		List<String> listeler2 = new ArrayList<String>();
		listeler2.add("Malatya");
		listeler2.add("Ankara");
		listeler2.add("İstanbul");
		
		// iterative for
		for (int i = 0; i < listeler2.size(); i++) {
			System.out.print(listeler2.get(i) + " ");
		}
		
		// get
		System.out.println(listeler2.get(listeler2.size() - 1));
		
		// addAll
		listeler2.addAll(listeler3);
		
		// Collections.sort
		Collections.sort(listeler2);
		
		System.out.println("binary Search: " + Collections.binarySearch(listeler2, "Ankara"));
		
		// forEach
		for (String temp : listeler2) {
			System.out.print(temp + " ");
		}
		
		// listeler2.remove(index)
		System.out.println("\n" + listeler2.contains("Malatya"));
		System.out.println("boş mu  ? " + listeler2.isEmpty());
		System.out.println("indexOf: " + listeler2.indexOf("Malatya"));
		System.out.println("array: " + listeler2.toArray());
		
		System.out.println("subLists: " + listeler2.subList(0, 1));
		
		// listedeki verileri çıkartıyor
		// listeler2.clear();
		
	}
}
