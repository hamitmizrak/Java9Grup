package com.ecodation.collectionsx;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
	public static void main(String[] args) {
		// Set<String> sayiList = new HashSet<>();
		// Set<String> sayiList = new LinkedHashSet<>();
		Set<String> sayiList = new TreeSet<>();
		
		sayiList.add("Malatya");
		sayiList.add("Malatya");
		sayiList.add("Ankara");
		sayiList.add("Ankara");
		sayiList.add("Ankara");
		sayiList.add("Ankara");
		sayiList.add("Ankara");
		sayiList.add("Ankara");
		sayiList.add("Ankara");
		sayiList.add("Van");
		
		Iterator list = sayiList.iterator();
		while (list.hasNext()) {
			System.out.print(list.next() + " ");
		}
		
	}
}
