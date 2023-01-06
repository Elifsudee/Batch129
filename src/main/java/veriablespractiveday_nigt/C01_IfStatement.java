package veriablespractiveday_nigt;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        /*
        kullanicida bir gun alin
        eger cuma ise muslumanlar icin "mubarek gun"
        Eger gun cumartesi ise "yahudiker icin kutsal gun"
        Eger gun pazar ise "Hristiyanlar icin kutsal gun" yazdiran kodu olusturunuz
        Haricindeki her sey icin kutsal gun degildir.

         */


        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen gun ismi giriniz");

        String gun= input.nextLine().toLowerCase();//kucuk harfe cevirdik

        if(gun.equals("cuma")){

            System.out.println("Muslumanlar icin mubarek gun");

        }else if(gun.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");

        }else if(gun.equals("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");

        }else

            System.out.println("kutsal gun degil");

















    }


}
