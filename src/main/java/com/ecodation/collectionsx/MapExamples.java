package com.ecodation.collectionsx;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
	
	public static void main(String[] args) {
		// H H L T
		Map<String, Object> mapList = new HashMap<String, Object>();
		// Map<String, Object> mapList = new LinkedHashMap<String, Object>();
		// Map<String, Object> mapList = new TreeMap<String, Object>();
		
		// builder nesnesi üzerinden
		StudentMap studentMap = StudentMap.builder().id(10).name("Hamit").surname("Mızrak").build();
		StudentMap studentMap2 = StudentMap.builder().id(20).name("Hamit2").surname("Mızrak2").build();
		mapList.put("1", studentMap);
		mapList.put("2", studentMap2);
		
		// M.E - LES //json+servisler+database
		for (Map.Entry<String, Object> temp : mapList.entrySet()) {
			System.out.println(temp);
		}
		
		System.out.println("\n***********************************************************");
		// filter işlemleri stream
		mapList.entrySet().forEach(System.out::println);
		
		System.out.println("\n***********************************************************");
		
		for (String key : mapList.keySet()) {
			System.out.print(key + " ");
		}
		System.out.println("\n***********************************************************");
		for (Object values44 : mapList.values()) {
			System.out.println(values44 + " ");
		}
		
	}
}
