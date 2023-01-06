package day3scanner;

import java.util.Scanner;

public class C02_Scanner {


    // Scanner classi kullanici ile etkilesim kurmamizi saglar
    // Scanner bir class'tir. Java util kütüphanesinden getirildiği icin import ister

    public static void main(String[] args) {
         // kullanicidan Data almak
        // 1. Adim Scanner clas'indan object oluturun

        Scanner  input = new Scanner(System.in);
        // Scanner scan = new Scanner (System.in)

        //2. adim kullaniciya ne yapacagini söyle

        System.out.println("lutfen yasinizi giriniz");

        //3. adım kullanicidan aldiniz datayi verables icine koyunuz

        byte age=input.nextByte();


        //ornek kullaniciya ad soyad memleket yas boy
        //yasadigi yeri sevip sevmedigini soran bir program yaziniz.

        Scanner scan= new Scanner(System.in);
        System.out.println( "Lutfen isminizi giriniz.");
         String isim = scan.nextLine();// kullanicidan string bir deger istedik tum ssatiri almai için nexline

        System.out.println("Lutfen memleketini giriniz");
        String memleket = scan.nextLine();

        System.out.println("Lufen yasinizi giriniz");
        int yas= scan.nextInt();

        System.out.println("Lutfen boyunuzu giriniz");
        short boy=scan.nextShort();

        System.out.println("Lutfen yasadiniz yeri sevip sevmediginizi yaziniz");
        boolean seviyorMu= scan.nextBoolean();

        System.out.println("*************");
        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);
    }
}
