package day3scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        // Kullanicidan bir diktortgenin iki kenar uzunlugu aliniz
        // Alanini hesaplayiniz==> kisakenar*kisakenar
        // Cevresini hesaplayiniz==> 2*kisakenar+2*Uzunkenar

        System.out.println("Diktortgenin kisa kenar uzunlugunu giriniz");

       double shortSide= input.nextDouble();

        System.out.println("uzun kenar uzunlugunu giriniz");

        double longSide=input.nextDouble();

        System.out.println("Alan="+(shortSide*longSide));
        System.out.println("Cevre"+(2*shortSide+2*longSide));


    }
}
