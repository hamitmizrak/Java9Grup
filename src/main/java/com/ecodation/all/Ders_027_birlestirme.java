package com.ecodation.all;

public class Ders_027_birlestirme {
	// Ctrl+Shift+S
	public static void main(String[] args) {
		
		try {
			// Birleştirme-1 (artı operant)
			String birlestir1 = "Malatya " + "Battalgazi " + "Yeşilyurt ";
			System.out.println(birlestir1);
			
			// Birleştirme-2(String)
			String birlestir2 = "Malatya ".concat("Battalgazi ").concat("Yeşilyurt ");
			System.out.println(birlestir2);
			
			// Birleştirme-3(StringBuffer) Güvenlik olsun
			StringBuffer birlestir3 = new StringBuffer();
			birlestir3.append("Malatya ").append("Battalgazi ").append("Yeşilyurt ");
			String cevir3 = birlestir3.toString();
			System.out.println(cevir3);
			
			// Birleştirme-4(StringBuilder)
			StringBuilder birlestir4 = new StringBuilder();
			birlestir4.append("Malatya ").append("Battalgazi ").append("Yeşilyurt ");
			String cevir4 = birlestir4.toString();
			System.out.println(cevir4);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
