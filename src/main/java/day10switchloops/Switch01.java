package day10switchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /*
        Example 1) Ay numarsini soyleyince, numarasi verilen ay`dan baslayip 12. aya kadar tum aylarin isimlerini yazdiran kodu yaziniz

        8===> Agust-September- october-November

         */

        Scanner input=new Scanner(System.in);

        System.out.println("Baslangic ayinin kacinci ay oldugunu giriniz");

        int numOfMonth=input.nextInt();


        switch(numOfMonth){
            case 1:
                System.out.println("Junuary");
            case 2:
                System.out.println("Febuary");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");

            case 5:
                System.out.println("May");

            case 6:
                System.out.println("June");

            case 7:
                System.out.println("July");

            case 8:
                System.out.println("August");

            case 9:
                System.out.println("September");

            case 10:
                System.out.println("October");

            case 11:
                System.out.println("November");

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Gecerli ay numarasi giriniz");


        }


//Not: i)Switch de String kullanilabilir
 //       ii) int,byte,short char kullanilir
//       iii) long, boolean, float, double kullanilmaz//interviv sorulabilir


    }
}
