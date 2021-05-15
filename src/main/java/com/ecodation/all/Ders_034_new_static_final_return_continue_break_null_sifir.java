package com.ecodation.all;

public final class Ders_034_new_static_final_return_continue_break_null_sifir { // extends edemem
	public int globalDegisken = 5;
	public final double PI = 3.141519;
	
	public int getGlobalDegisken() {
		return globalDegisken;
	}
	
	public void setGlobalDegisken(int globalDegisken) {
		this.globalDegisken = globalDegisken;
	}
	
	public final void deneme() {
		int localDegisken;
		// this.globalDegisken
	}
	
	// new = hafızada benim için yer ayırmak artık elle tutulur bir nesnem var
	// demektir. eğer new yapmazsak nullpointerException istisna durumunu yaşarız
	
	// static= new oluşturmadan gerkli ölçüde nesneleri çağırmak için kullanıyoruz.
	// Class.ObjeAdi
	
	// return = Metotu kırmak için kullanabiliriz. Recursive işlemlerimizde
	// kullanabiliriz.
	
	// this= global değişkenlere yani herkesin erişmesini istediği yere erişmek
	// super= üst atadan gelen verilere erişmek için kullanırız. metotlar,field
	
	// final= değişkenlerde sabit olur.
	// final= metotlarda override edemezsiniz, Classlarda
	// final= kullanırsam override edemem.
	
	// constructor= kurucu metotlardır.
	
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i == 5)
				continue; // şarttaki alanda es geçti sonra devam etti.
				
			if (i == 8) {
				break; // donguyu kırdı çalışmaını izin vermedi
			}
			
			System.out.print(i + " ");
		}
		
		Ders_032_Metotlar ders_032_Metotlar = null;
		
	}
	
}
