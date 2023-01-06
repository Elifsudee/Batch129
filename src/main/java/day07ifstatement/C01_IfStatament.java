package day07ifstatement;

import java.util.Scanner;

public class C01_IfStatament {
    public static void main(String[] args) {
        // if it rains, I will cansel the picnic
        // eger yagmur yagarsa piknigi iptal edecegim


        //Ex) verilen kararkter buyuk harf ise ekrana "Buyuk Harf" yazdıran kodu olusturunuz

        char ch='S';

        if(ch>='A'&&ch<'Z'){

            System.out.println("Buyuk Harf");
        }//if body

        //ex 2)verlen sayi cift sayi ise ekrana cift sayi yazdirin


        int sayi=78;

        if(sayi%2==0){

            System.out.println("cift");
        }//iif body


        //ex3) verilen bir sayi 300 den kucuk  veya 1200 den buyuk ise ekrana "Harika" yazdirin

        int num=229;

        if(num<300||num>1200){

            System.out.println("Harika Sayi");

        }

        //kullanicidan alinan sayinin tek mi cift mi oldugunu yazdıran kodu yazdirin

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

     int number=  input.nextInt();

        if(number%2==0){

            System.out.println("cift");
        }
      if(number%2!=0){

          System.out.println("tek");
      }
 // 2.yol
        if(number%2==0){
            System.out.println("cift");
        }else{    //diger tum ihtimaller
            //burada conditional(sart) yok tek kontrol var bu sekilde javaya az is yaptirdik
            System.out.println("tek");
        }

        //Ex 5) Verilen bir sayinin negatif, pozitif ya da notr oldugunu soyleyen kodu yaziniz

int numara =-105;
        if(numara<0){
            System.out.println("negatif");
        } else if (numara==0){
            System.out.println("notr");
        }else{
            System.out.println("pozitif");

        }


    }//main



}//class
