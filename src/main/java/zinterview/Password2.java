package zinterview;

import java.util.Scanner;

public class Password2 {
    public static void main(String[] args) {


        /*
       Gecerli  User name="admin" Pssword="pwd123" dur
       Kulannicidan user name ve passwordu alin
       user name ve password dogru ise "Hesabiniza hos geldiniz" yazdirin
       user name ve password yanlis ise 4 kere "User name ve passwor`unuzu giriniz mesaji versin
       User name ve password 4 kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererk islemi tamamlayiniz
         */
        Scanner input=new Scanner(System.in);

        int counter=0;

        do {
            if(counter==3){
                System.out.println("hesabiniz bloke olmustur");
                break;
            }

            System.out.println("lutfen kullanici adinizi giriniz");
            String username=input.next();
            System.out.println("lutfen passwordunuzu giriniz");
            String pwd=input.next();

            if(username.equals("Admin")&&pwd.equals("pwd123")){
                System.out.println("hesabiniza hosgeldiniz");
                break;
            }else{
                System.out.println("yanlis username veya password giriniz");
                counter++;
            }

        }while (true);

    }
}
