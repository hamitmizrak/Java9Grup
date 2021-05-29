package comecodation.files;

import java.io.File;

public class GenelDosya {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// global değişkenler
		String pathname = "C:\\fileIO\\9grup.txt";
		File file = new File(pathname);
		
		try {
			
			if (file.createNewFile()) {
				System.out.println("böyle bir dosya yok oluşturuldu" + " path adi:" + file.toPath());
			} else {
				System.out.println("Dosya var !!!!!!!!!!!!!!!!\n");
				// file.setExecutable(true);
				if (file.isFile() && !file.isHidden() && file.canExecute() && file.canRead() && file.canWrite()) {
					
					// can izinler
					System.out.println(file.canExecute());
					System.out.println(file.canRead());
					System.out.println(file.canWrite());
					System.out.println("İznim var");
					
					System.out.println("*********************************************************************");
					
					// is
					System.out.println("bu bir dizin mi dir?  " + file.isDirectory());
					System.out.println("bu bir dosya mıdır ?" + file.isFile());
					System.out.println(file.isAbsolute());
					System.out.println(file.isHidden());
					
					System.out.println("*********************************************************************");
					// get
					System.out.println(file.getAbsolutePath());
					System.out.println(file.getCanonicalPath());
					System.out.println(file.getPath());
					System.out.println(file.getFreeSpace());
					System.out.println(file.getTotalSpace());
					System.out.println(file.getName().substring(0, 5));
					System.out.println(file.getParent());
					System.out.println("*********************************************************************");
					
					// to
					System.out.println("harf sayısı: " + file.length());
					System.out.println(file.toPath());
					System.out.println(file.toURI());
					System.out.println(file.toURL());
					System.out.println(file.toString());
					System.out.println("*********************************************************************");
					
					// System.out.println(file.);
					// System.out.println(file.);
					// System.out.println(file.);
					// System.out.println(file.);
					// System.out.println(file.);
					// System.out.println(file.);
					// System.out.println(file.);
					//
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
