package day08nestedif;

import java.util.Scanner;

public class NestedIf04 {
    public static void main(String[] args) {


/*
   Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
   Eger calisan kadinsa
   60 yasindan buyukse “Emekli Olabilir “yazdirin

   Eger calisan erkek ise
   65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz
    */


        Scanner input=new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz...Erkek'Kadin'Digerleri");

        String gender= input.next();

        System.out.println("yasinizi giriniz...");
         int age=input.nextInt();
        if(age<0||age>120){
            System.out.println("Lutfen 0 ile 120 arasinda giriniz");
        }else if(gender.equalsIgnoreCase("Kadin")){
             if(age>60){
                 System.out.println("Emekli olabilir");
             }else{
                 System.out.println("Calismali....");
             }

         }else if(gender.equalsIgnoreCase("Erkek")){
             if(age>65){
                 System.out.println("Emekli olabilir");
             }else{
                 System.out.println("Kesinlikle Calismali");
             }

         }else{
             System.out.println("Tanimli degil");
         }









    }










}
