package miniproject.marktProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market {
	
	
	static List <String> gunler=new ArrayList <String>(Arrays.asList("PAZARTESI","SALI","CARSAMBA","PERSEMBE","CUMA","CUMARTESI","PAZAR"));
	static List <Double> gunlukKazanc=new ArrayList <>();
    static double getOrtalama=0;
    static List <String> ortalamaUstuGunler=new ArrayList <>();
    static List <String> ortalamaAltiGunler=new ArrayList <>();
    
    

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		* Bir bakkalin 7 gunluk tam kazanalarini g�nl�k olarak g�steren bir program yaz�n�z.
     * Ayr�ca bakkal�n bu hafta ortalama kazand��� miktar� g�steren bir method yaz�n�z.
     * Ayr�ca bakkal�n hangi g�nler ortalaman�n �st�ne kazand���n� g�steren bir method yaz�n�z.
     * Ayr�ca bakkal�n hangi g�nler ortalaman�n alt�nda kazand���n� g�steren bir method yaz�n�z.
     *
     * 1. Ad�m : G�nleri i�eren bir tane ArrayList olu�turun. (gunler)     ****
     * 2. Ad�m : G�nl�k kazan�lar� ekleyece�imiz bir tane ArrayList olu�turun. (gunlukKazanclar)**********
     * 3. Ad�m : While d�ng�s� ile kullan�c�dan 7 g�nl�k kazan�lar� tekek teker al�p gunlukKazanclar ArrayList'e ekle.*******
     * 4. Ad�m : getOrtalamaKazanc() adl� method ile ortalama kazanc� al�n.  ******
     * 5. Ad�m : getOrtalamaninUstundeKazancG�nleri() adl� method olu�turun.
     * 			 for d�ng�s� ile t�m g�nleri ortalama kazan� ile kar��la�t�r
     * 			 ortalama kazan�tan y�ksekse o g�nleri return yap.
     * 6. Ad�m : getOrtalamaninAltindaKazancG�nleri() adl� method olu�turun.
     * 			 for d�ng�s� ile t�m g�nleri ortalama kazan� ile kar��la�t�r
     * 			 ortalama kazan�tan a�a��ysa o g�nleri return yap.
		 * */
		

		
    System.out.println(        "     ********************GUNLUK KAZANC PROGRAMINA HOSGELDINIZ********************     "   );
		
		   System.out.println("                 **********ISLEMLERINIZ ARTIK DAHA KOLAY!************             ");
		
		System.out.println("\n    //// KAZANC GIRISI ////\n                         ");
		
		
		
		
		Scanner scan=new Scanner(System.in);
		
		double kazanc=0;       // gUnlUk kazanc alacam
		int gunIndex=0;     // gUnleri getirmek iCin, gUnlerin indexini bulacam
		
        do {
			
        	System.out.println("LUtfen " + gunler.get(gunIndex) + " gunu icin elde edilen kazancc giriniz: "  );
        	kazanc=scan.nextDouble();
			
			gunlukKazanc.add(kazanc);  // her d�ng�de s�ras� ile ayn� indexe atacak
        	
			System.out.println("" + gunler.get(gunIndex)+" gunu icin elde edilen kazanc: " + kazanc+"$\n" );
			
			
			gunIndex++;
			
		} while (gunIndex<7);
		
        
        
		getOrtalamaKazanc();
		getOrtalamaninUstundeKazancGunleri();
		getOrtalamaninAltindaKazancGunleri();
	

		
	}

	private static List<String> getOrtalamaninAltindaKazancGunleri() {
		
		
        for (int i = 0; i < gunlukKazanc.size(); i++) {
			
			if (gunlukKazanc.get(i)<getOrtalama) {
			 
			ortalamaAltiGunler.add(gunler.get(i));	
		}
		
        }
        System.out.println("Ortalama kazancin altinda olan gunler: " + ortalamaAltiGunler);
        
        return ortalamaAltiGunler;
	}

	
	
	private static List<String> getOrtalamaninUstundeKazancGunleri() {
		

		
		for (int i = 0; i < gunlukKazanc.size(); i++) {
			
			if (gunlukKazanc.get(i)>getOrtalama) {
			 
			ortalamaUstuGunler.add(gunler.get(i));
			}
			
		}
		
		System.out.println("Ortalama kazancin uzerinde olan gunler: " + ortalamaUstuGunler);
		
		return ortalamaUstuGunler;
		
	}

	
	
	public static double getOrtalamaKazanc() {
	
		double toplam=0;
	
	
		for (int i = 0; i < gunlukKazanc.size(); i++) {
		
			toplam+=gunlukKazanc.get(i);
			
		}
		
		getOrtalama=toplam/7;
		
		System.out.println("\nBir haftalik ortalama kazanc: \n" + getOrtalama + "\n");
		
		return getOrtalama;
		
	}

}
