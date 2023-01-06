package day3scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        //Ornek Kullanicidan adresini ve ekrana yazdiriniz

        System.out.println("Lutfen adresini giriniz..");

// nextLine methodu kullanicidan cok kelimeli Stringler icin kulanilir.

        String address = input.nextLine();

        System.out.println(address);

    }
}
