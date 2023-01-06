package day3scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //Kullanicidan bir dikdörtgenin en ve bounu alan ve diktortgenin alanini ve cevresini hesaplayan kodu yaziniz.


        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen diktortgenin alanini giriniz");

        int en= input.nextInt();

        System.out.println("Lutfen diktortgenin uzun kenarini giriniz");
        int boy= input.nextInt();


        System.out.println("Alan==>"+(en*boy));

        System.out.println("Cevre==>"+(2*(en+boy)));

    }
}
