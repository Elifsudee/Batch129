package variablesdaytimenigthtime03;

import java.util.Scanner;

public class C01_StringManipulation {


    /*
                1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
    ii)equals() method'u "boolean" return eder.

            2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf
    kucuk harfe dikkat etmeden anlamamiza yarar.

    ii) equalsIgnoreCase() method'u "boolean" return eder.
            3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.

    ii) toLowerCase() method'u "String" return eder
            4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.

         ii) toUpperCase() method'u "String" return eder
            5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.

            ii) charAt() method'u "char" return eder.

            6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir

          ii) length() method'u "int" return eder.

            7)contains(): i)Bir String'de belli bir characterin veya
    characterlerin var olup olmadigini anlamak icin
    kullanilir

         ii) contains() method'u "boolean" return eder.

      8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar

          ii)split() method'u "Array" return eder.

            9)replace () i)Metin icerisindeki karakter ya da karakterlerin,
    istenilen karakter ya da metinle degistirilmesini saglar.
    Sonuc String'dir..

            10)replaceFirst()
    i) Replace ile aynı sadece ilk bulunan karakteri değiştirir
     */
         /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
         1) \\d    ==> tum rakamlar (digit)
             \\D    ==> tum rakam disi character ler
         2) \\w   ==> A->Z        a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
             \\W  ==> A->Z        a->z         0->9    _ disindaki hersey
         3) \\s   ==> space tum bosluklar
             \\S   ==> space disindaki hersey

               12) + Concat: Bir stringe diğerini ekler.
            Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
            her ikisi String ise Java toplama degil BIRLESTIRME==YANYANA yazdirma yapar.
        ONEMLI NOT=JAVA YUKARIDAN ASAGI SOLDAN SAGA CALISIR.

         */

    public static void main(String[] args) {
        System.out.println(15+20+"Merhaba");//35merhaba
        System.out.println("Merhaba" +(15+20));//merhaba35
        System.out.println("Merhaba" +15+20);//merhaba1520
        System.out.println("Merhaba" +15*20);//merhaba300 parantez icinde olasa da carpma ve bolmenin islem onceligi var


//Kullanicidan ismini ve soyismini girmesini isteyin
//Sonrasinda kullanici nasil girerse girsin konsole'da buyuk harfle yan yana concat ileyazilmasini saglayin


        Scanner input=new Scanner(System.in);
       /* System.out.println("Isim ve soy isiminizi giriniz");
      String isim=  input.nextLine(),soyAd=input.nextLine();//elif sutcu// multiple declaration==coklu tanimlama araya virgul konur sununa noktali virgul
        String tamIsim=isim.concat(" "+soyAd).toUpperCase();

        System.out.println("tamIsim = " + tamIsim);


        //rakam haricindekileri silin
        String str= "45.99 $";
        str=str.replaceAll("\\D","");
        System.out.println("str = " + str);//4599

        //Verilen bir cumleyi * ile gizleyin, 10.karakterden sonrasini yazdirin

        String cumle="Her dert Java gibi olsa";
        System.out.println(cumle.replaceAll("\\w","*")+cumle.substring(10));
        // *** **** **** **** ****ava gibi olsa

        // a harfi yerine @ isareti yerlestiriniz
        String kelime="olaganustu";

        System.out.println(kelime.replace("a","@"));
        String txt="Merhaba Dunya";

        //txt deki butun 'a'lari  'e' ile degistirin
        System.out.println(txt.replace("a","e"));//Merhebe Dunye

        // txt'deki ilk bulunan 'a'yi 'e ' yapin
        System.out.println(txt.replaceFirst("a","e"));//Merheba Dunya

        // "Kalem " yerine "biber" yazdirin
        String str2 = "Dolma Kalem ile bir Dunya kaleme aldik";
        System.out.println(str2.replaceAll("Kalem","biber"));//Dolma biber ile bir Dunya kaleme aldik

        String str3 = "bugun hava yagmurlu";
        System.out.println(str3.length());//19

        String str4="";
        System.out.println("str4.length() = " + str4.length());//0
        String str5=" ";
        System.out.println("str5.length() = " + str5.length());//1

        //Kullanicidan
        // isim ve soyisim girmesini isteyin hangisinin daha
        // uzun oldugunu yazdiran kodu olusturunuz

        System.out.println("Lutfen isim ve soyisminizi giriniz: \n isim :");
        String name = input.next();
        System.out.println("soyisim : ");
        String surName = input.next();


        if(name.length()>surName.length()){
            System.out.println("isminiz daha uzun");
        }else if(name.length()==surName.length()){
            System.out.println("Uzunluklari esit");
        }else{
            System.out.println("soy isminiz isminizden uzun");
        }*/

/*
        System.out.println("Lutfen isminizi giriniz");
       String name= input.nextLine(),soyad=input.nextLine();
       String tamIsim=name.concat(" "+soyad).toUpperCase();
        System.out.println("tamIsim = " + tamIsim);*/


        String str="$45..99";
        String str1=str.replaceAll("\\D","");
        System.out.println(str1);


        String cumle="Her dert Java gibi olsa";
       cumle = cumle.replaceAll("\\w","*")+cumle.substring(10);

        System.out.println(cumle);

      String ders="olaganustu";
     ders= ders.replace("a","@");

        System.out.println(ders);


        //Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
//           tum karakterlerin sayisini bulan kodu yaziniz


      String str3="Learn Java earn 9000000 money, !...";
       int sonuc=str3.replaceAll("[0-9]","").
               replaceAll(" ","").
               replaceAll("\\p{Punct}","").
               length();

        System.out.println(sonuc);
    }
}

