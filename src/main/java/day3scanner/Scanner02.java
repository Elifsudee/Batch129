package day3scanner;

import java.util.Scanner;

public class Scanner02 {


    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);

         //ornek:Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satırda yazdiriniz

        System.out.println("Ilk isminizi giriniz");
// Next method kullanicidan tek kelimeli String almak icin kullanilir.

      String firstName=  input.next();

        System.out.println("soy isminizi giriniz");

        String lastName= input.next();

        System.out.println(firstName+" "+lastName);


    }
}
