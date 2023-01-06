package zinterview;

import java.util.Scanner;

public class Whiletoplam {
    public static void main(String[] args) {


        /* soru 4=
    Interwiew Questions
     Kullanicidan toplanmak uzere sayilar isteyin
     sayi adedi 10'u gecerse veya toplam 500 'u gecerse
     bu kadar sayi yeter
     ".... adet sayi girdiniz , toplami..." yazdirin
     */

        Scanner input=new Scanner(System.in);

        int toplam=0;
        int sayi=0;
        int sayac=0;
        while (sayac<11&&toplam<501){
            System.out.println("toplamak icin sayi giriniz");
            sayi= input.nextInt();

          toplam=toplam+ sayi;
           sayac++;

        }

        if(toplam>500){
            System.out.println(toplam +" kadar sayi toplami yeter");
        }else{
            System.out.println(sayac +" kadar sayi girdiniz" +toplam);
        }

    }
}
