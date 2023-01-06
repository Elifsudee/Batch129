package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lists02 {
    public static void main(String[] args) {

/*
    Rastgele kullanici adi olusturan JAVA kodu yaziniz.
       1. Kullanicidan ismini isteyelim
       2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
       3. Kullanici adinin alinabilir olup olmadigina bakalim.
       4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
       5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
 */
        Scanner input=new Scanner(System.in);

        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");

        System.out.println("Kullanici adini giriniz..");
        String userName=input.nextLine().toUpperCase().trim();

        if(databaseIsim.contains(userName)){//datbase de username var ni
            System.out.println("Bu username databasede var tekrar kullanilamz");
            databaseIsim.add(userName+(int)(Math.random()*100));// 0 ile 100 arasinda rastgele sayi verir
        }else{                                                  //username varsa sonuna rastgele sayi ekliyor yeni username yapiyor
            System.out.println("Bu username kullanilabilir");
            databaseIsim.add(userName);
        }

        System.out.println(databaseIsim);

//Math.random()==> 0 ile 1 arasinda rastgele sayi verir, mesela==>0.2
//Math.random()==> 0'da dahil tum sayilari verir, fakat "1" haric
//Math.random()*100==> bununla ise verilen o sayisi yuz ile carpiyor
// rastegele sayilar hep double geliyor, onu integer'a cevirmek icin "int" koydu


//Random olusturma

        int random=new Random().nextInt(100);

        //1.Yol: Random tamsayi bulmak icin
        //int random = (int)(Math.random()*100);






    }
}
