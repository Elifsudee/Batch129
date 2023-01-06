package veriablespractiveday_nigt;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        /*
        kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islem ile
        isleme koyup yazdiriniz


         */


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen \ntoplama yapmak icin 1 \ncikarma yapmak icin 2 \ncarpma yapmak icin 3 \nbolme yapmak icin 4 \ngiriniz");

        int islem = input.nextInt();

        System.out.println("lutfen 2 tam sayi giriniz");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();


        if (islem == 1) {
            System.out.println("toplama isleminin sonucu " + num1 + "+" + num2 + "=" + (num1 + num2));

        } else if (islem == 2) {

            System.out.println("cikarma isleminin sonucu " + num1 + "-" + num2 + "=" + (num1 - num2));

        } else if (islem == 3) {

            System.out.println("carpma isleminin sonucu " + num1 + "*" + num2 + "=" + (num1 * num2));

        } else if (islem == 4) {
            System.out.println("bolme isleminin sonucu " + num1 + "/" + num2 + "=" + (num1 / num2));

        } else
            System.out.println("hatali secim girdiniz tekrar deneyiniz");


    }

}
