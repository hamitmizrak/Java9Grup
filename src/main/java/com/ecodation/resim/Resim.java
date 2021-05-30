package com.ecodation.resim;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Resim {
	public static void main(String[] args) {
		// String css = new String( Files.readAllBytes(Paths.get("C:\\fileIO\\css.txt"),
		// Charset.forName("utf-8") ));
		
		try {
			byte[] resim = Files.readAllBytes(Paths.get("C:\\fileIO\\resim.png"));
			System.out.println(resim);
			for (Object temp : resim) {
				System.out.print(temp + " ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
