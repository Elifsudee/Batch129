package zinterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Radom_RastgeleSayi {
    public static void main(String[] args) {

        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */


        Scanner input=new Scanner(System.in);


     List<String> isimler=new ArrayList<>();

    isimler.add("ELIF");
    isimler.add("SUDE");
    isimler.add("NEZIHA");
    isimler.add("KADIR");
    isimler.add("TANER");

        System.out.println("lutfen adinizi  giriniz");

        String ad=  input.nextLine().trim().toUpperCase();


    if(isimler.contains(ad)){
        System.out.println("Bu isim zaten var");
        isimler.add(ad+(int)(Math.random()*100));

    }else{
        System.out.println("Bu isim kullaniabilir");
        isimler.add(ad);
    }


        System.out.println("isimler = " + isimler);









    }
}
