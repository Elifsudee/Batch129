package day3scanner;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ornek:Kullanicidan alacaginiz 5 basamakli sayi aliniz
        //ilk iki ve son iki basamagindaki rakamlarin toplamini yazdirin
        //Note: Bir sayinin son rakamini alabilmek icin 10'a bolun ve kalana bakin.
        //Note: Java sonucu nasıl tam sayi yapar==> ondalik kismi iptal eder, yuvarlama yapmaz.

        System.out.println("5 basmaklı bir sayi giriniz");

        int number = input.nextInt();
        //son rakam al
        int lastDigit = number % 10;// sayiyi böler kalani verir.Son rakam verdi.
        number = number / 10;//sayiyi kucultmek icin

        //sondan ikinci rakami al
        int lastSecondDigit = number % 10;
        number = number / 10;

        // sondan ucuncu rakam

        int lastThirtDigit = number % 10;
        number = number / 10;

        // sondan dortuncu rakam
        int lastFourthDigit = number % 10;
        number = number / 10;

        //sondan besinci rakam al
        int lastFiveDigit = number % 10;

        System.out.println(lastDigit + lastSecondDigit + lastFourthDigit + lastFiveDigit);


    }
}
