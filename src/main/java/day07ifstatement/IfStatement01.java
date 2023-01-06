package day07ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {



        //Example 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kucuk harf ise
        // ekrana "kucuk harf" yazdıran kodu olusturunuz
        Scanner input=new Scanner(System.in);

        System.out.println("Karakter giriniz");

      char ch=  input.next().charAt(0);
      //1 yol
     // if(ch>='A'&&ch<='Z') {
      //    System.out.println("Buyuk Harf...");
     // }
     // if(ch>='a'&&ch<='z'){
      //    System.out.println("Kucuk Harf...");
     // }


        if(ch>='A'&&ch<='Z') {
            System.out.println("Buyuk Harf...");
        }else if(ch>='a'&&ch<='z'){
            System.out.println("kucuk harf");
        }else{

            System.out.println("harf degil");
        }







    }
}
