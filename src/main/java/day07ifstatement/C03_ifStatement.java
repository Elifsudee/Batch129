package day07ifstatement;

import java.util.Scanner;

public class C03_ifStatement {
    public static void main(String[] args) {
        /*
        iki tane string data nin birbirine esit olup oladigini anlamak icin "==" bu sayisai ifaedeler icin

        stringler icin "equals" kullanilir.

        I)"equals() ==>Buyuk kucuk harf onemser
        II) "equalsIgnoreCase()metodu ==>Buyuk kucuk harf onemsemez bu yuzden kullaniciyi yonlendermeye gerek kalmaz




         */

//kullanicidan gun isimlerini aliniz hafta ici mi hafta sonu mu oldugunu yazdiran kodu ekrana yazdiriniz

        Scanner input=new Scanner(System.in);
        System.out.println("Gun isimlerinizi giriniz");

     String gunIsmi=   input.next();

     if(gunIsmi.equalsIgnoreCase("Cumartesi")||gunIsmi.equalsIgnoreCase("Pazar")){

         System.out.println("hafta sonu");

     }else if(gunIsmi.equalsIgnoreCase("Pazartesi")||

             gunIsmi.equalsIgnoreCase("sali")||

             gunIsmi.equalsIgnoreCase("carsamba")||

             gunIsmi.equalsIgnoreCase("Persembe")||

             gunIsmi.equalsIgnoreCase("cuma")){
            System.out.println("hafta içi");
     }
     else{

         System.out.println("gecerli bir gun giriniz");
     }

     //2 yol
        boolean haftaIci=gunIsmi.equalsIgnoreCase("Pazartesi")||

                gunIsmi.equalsIgnoreCase("sali")||

                gunIsmi.equalsIgnoreCase("carsamba")||

                gunIsmi.equalsIgnoreCase("Persembe")||

                gunIsmi.equalsIgnoreCase("cuma");

     boolean haftaSonu=gunIsmi.equalsIgnoreCase("Cumartesi")||gunIsmi.equalsIgnoreCase("pazar");

     if(haftaIci){
         System.out.println("hafta ici");
     }else if(haftaSonu){
         System.out.println("hafta sonu");


     }else{


         System.out.println("Gecerli bir gun giriniz");
     }//if body


    }//main



}//class
