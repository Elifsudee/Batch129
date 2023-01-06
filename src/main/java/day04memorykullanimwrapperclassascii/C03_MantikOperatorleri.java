package day04memorykullanimwrapperclassascii;

public class C03_MantikOperatorleri {

// javad 3 sayi kiyaslayamaz
    // 10<sayi Mantik Operatorleri<20
    // ==> esitiir, = > atama operatoru(assigment)
    /*
    java uclu karsilastirma kabul etmez. ikili karsilastirmalar yapip Mantik operatorleri ile birlestirmeliz

    && ==> ve and || or operatoru veya demek
    &&==> boolean sonucta bir tane false bulunca durur.
    &==> ise tum satiri tarar sonra durur. bu da && nin & den daha hizli calismasini saglar.


    cay  ve  Limon
    +   &&     += true
    +   &&  - = false
    -   &&    += false
    -   &&  - = false


    || veya operatoru Polyanacidir. En ufak pozitiflikten true döner.


       cay  veya  Limon
    +   ||    +  = true
    +   ||  -    = true
    -   ||    +  = true
    -   ||  -   =  false

     */

    public static void main(String[] args) {

        System.out.println(5+2==8);//false

        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2 !=8;//true
        System.out.println(sonuc1);//true

        boolean sonuc2=  5>4 && 7>9 && 6+3==9 && 5+2==7;//false
        System.out.println(sonuc2);

      int sayi1=15;
        System.out.println(10< sayi1 && sayi1<20);//true


        int sayi2=5;
        System.out.println(sayi2<10 || sayi2>20);//true



    }





}
