package day3scanner;

import java.util.Scanner;

public class C03_Scanner {


    public static void main(String[] args) {
        // 1adim Scanner Classinda object olusturunuz
        Scanner input = new Scanner(System.in);
        //2
        System.out.println("Lutfen toplanacak sayiyi giriniz");

        //3
        double sayi1= input.nextDouble();
        System.out.println("Lutfen toplanacak olan ikinci sayiyi giriniz");
         double sayi2 =input.nextDouble();

        System.out.println("Toplam"+(sayi1+sayi2));
    }
}
