package day07ifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {
        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.

        Scanner input=new Scanner(System.in);
        System.out.println("Sayi giriniz");
      int num=  input.nextInt();

      //1yol
        if(num%2==0){
            System.out.println("Cift");
        }
        if(num%2!=0){
            System.out.println("Tek");
        }

// 2. yol

        if(num%2==0){
            System.out.println("Cift...");
        }else{
            System.out.println("Tek...");
        }



    }
}
