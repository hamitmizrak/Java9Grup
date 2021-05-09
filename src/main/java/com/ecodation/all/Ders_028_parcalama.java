package com.ecodation.all;

import java.util.StringTokenizer;

public class Ders_028_parcalama {
	// Ctrl+Shift+S
	public static void main(String[] args) {
		
		try {
			// parçalama
			String kelime = "JavaSE JavaEE JavaJakarta Servlet JSP-JSF SpringBoot Html& Css&JS Bootstrap ";
			StringTokenizer stringTokenizer = new StringTokenizer(kelime, "&- ");
			while (stringTokenizer.hasMoreTokens()) {
				System.out.println(stringTokenizer.nextToken());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
