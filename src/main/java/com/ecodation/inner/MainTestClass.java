package com.ecodation.inner;

public class MainTestClass {
	public static void main(String[] args) {
		DisClass disClass = new DisClass();
		disClass.getDisStr();
		
		DisClass.IcClass1 icClass1 = disClass.new IcClass1();
		icClass1.getIcStr();
		
		// DisClass.IcClass1.IcClass2 icClass2=icClass1.new IcClass2();
		DisClass.IcClass1.IcClass2 class2 = new DisClass().new IcClass1().new IcClass2();
		System.out.println(class2.getIcStr2());
	}
}
