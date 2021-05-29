package comecodation.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DosyaProjesi {
	public static void main(String[] args) {
		while (true) {
			int sec = secim();
			sonuc(sec);
		}
	}
	
	// seçim
	public static int secim() {
		int secim;
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen seçim yapınız");
		System.out.println("1-)Dosya ekle\n2-)Dosya Sil\n3-)Dosya Yaz\n4-)Dosya Oku\n5-)Dosyalar\n6-)Çıkış");
		secim = klavye.nextInt();
		System.out.println("*********************");
		return secim;
	}
	
	// sonuc
	public static void sonuc(int sayi) {
		
		switch (sayi) {
			case 1:
				System.out.println("Dosya Ekleme");
				dosyaOlustur();
				break;
			case 2:
				System.out.println("Dosya Silme");
				dosyaSil();
				break;
			case 3:
				System.out.println("Dosya yazılacak");
				dosyaYaz();
				break;
			case 4:
				System.out.println("Dosya okunacak");
				dosyaOku();
				break;
			case 5:
				System.out.println("dosyalar");
				dosyalar();
				break;
			case 6:
				System.out.println("Çıkış yapılıyor");
				System.exit(0);
				break;
			default:
				System.out.println("Lütfen belirtilen aralıkta sayı giriniz");
				
		}
	}
	
	public static String dosyaKlavye() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen dosya ismini yazınız");
		String dosyaAdi = klavye.nextLine();
		return dosyaAdi;
	}
	
	public static void dosyalar() {
		System.out.println("****************************************");
		String pathname2 = "C:\\fileIO\\";
		File file2 = new File(pathname2);
		System.out.println("********************");
		
		for (File temp : file2.listFiles()) {
			System.out.println(temp);
		}
		System.out.println("****************************************");
	}
	
	// dosya sil
	public static void dosyaSil() {
		dosyalar();
		Scanner klavye = new Scanner(System.in);
		dosyalar();
		System.out.println("Lütfen silinecek dosya adını yazınız");
		String dosyaAdi = klavye.nextLine();
		String pathname = "C:\\fileIO\\" + dosyaAdi + ".txt";
		File file = new File(pathname);
		
		System.out.println("Dosya silmek istiyor musunuz ? E veya H");
		String son = klavye.nextLine();
		if (son.equalsIgnoreCase("e")) {
			file.delete();
			System.out.println(dosyaAdi + " silindi");
		} else {
			System.out.println(dosyaAdi + " silinmedi");
		}
	}
	
	// Dosya Oluştur
	public static void dosyaOlustur() {
		dosyalar();
		String dosyaAdi = dosyaKlavye();
		String pathname = "C:\\fileIO\\" + dosyaAdi + ".txt";
		File file = new File(pathname);
		
		try {
			if (file.createNewFile()) {
				System.out.println("dosya yok dosya oluşturdum: " + pathname);
			} else {
				System.out.println("dosya zaten var");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// Dosya Yaz
	public static void dosyaYaz() {
		dosyalar();
		Scanner klavye = new Scanner(System.in);
		System.out.println("Yazılacak dosya seçiniz");
		String birseyler;
		String secilenDosya = klavye.nextLine();
		// String dosya = klavye.nextLine();
		try (BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter("C:\\fileIO\\" + secilenDosya + ".txt", true))) {
			System.out.println("Birşey yazalım");
			birseyler = klavye.nextLine();
			bufferedWriter.write(birseyler);
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//// Dosya Oku
	public static void dosyaOku() {
		dosyalar();
		Scanner klavye = new Scanner(System.in);
		System.out.println("Okunacak dosya seçiniz");
		String secilenDosya = klavye.nextLine();
		try (BufferedReader bufferedReader = new BufferedReader(
				new FileReader("C:\\fileIO\\" + secilenDosya + ".txt"))) {
			String toplamKelime = "", satir = "";
			while ((satir = bufferedReader.readLine()) != null) {
				toplamKelime += satir + "\n";
			}
			System.out.println("******************************************");
			System.out.println(toplamKelime);
			System.out.println("******************************************");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
