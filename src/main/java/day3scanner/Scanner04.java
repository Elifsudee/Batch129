package day3scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        // Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonucunu ekrana yazdiran kodu yaziniz

        System.out.println("iki sayi giriniz");

       double firstNumber= input.nextDouble();
      double secondNumber =input.nextDouble();

        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);

    }
}
