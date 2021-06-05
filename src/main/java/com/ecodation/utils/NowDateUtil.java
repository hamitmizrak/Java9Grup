package com.ecodation.utils;

import java.util.Date;

public class NowDateUtil {

	public static String DateUtil() {
		return new Date(System.currentTimeMillis()).toString();
	}

	public static void main(String[] args) {
		String tarih = DateUtil();
		System.out.println(tarih);
	}
}
