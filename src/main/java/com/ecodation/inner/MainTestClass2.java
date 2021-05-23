package com.ecodation.inner;

import com.ecodation.inner.StaticDisClass.IcStaticClass;

public class MainTestClass2 {
	public static void main(String[] args) {
		StaticDisClass staticDisClass = new StaticDisClass();
		System.out.println(staticDisClass.getSayi());
		
		// StaticDisClass.IcStaticClass icStaticClass=new StaticDisClass().new
		// IcStaticClass();
		IcStaticClass icStaticClass = new IcStaticClass();
		System.out.println(icStaticClass.sayi2);
	}
}
