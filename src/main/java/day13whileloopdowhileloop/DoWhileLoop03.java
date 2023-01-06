package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {

        /*
       Gecerli  User name="admin" Pssword="pwd123" dur
       Kulannicidan user name ve passwordu alin
       user name ve password dogru ise "Hesabiniza hos geldiniz" yazdirin
       user name ve password yanlis ise 4 kere "User name ve passwor`unuzu giriniz mesaji versin
       User name ve password 4 kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererk islemi tamamlayiniz
         */


        Scanner input = new Scanner(System.in);


        int counter=0;

        do {

            if (counter == 4) {
                System.out.println("Hesabiniz bloke olmustir");
                break;
            }
                System.out.println("User name  giriniz");

                String username = input.next();


                System.out.println("Psswordunuzu giriniz");
                String password = input.next();

                if (username.equals("admin") && password.equals("pwd123")) {
                    System.out.println("Hesabiniza hosgeldiniz..");
                    break;
                }

              counter++;

            }
            while (true) ;






    }
}
