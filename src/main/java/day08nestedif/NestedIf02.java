package day08nestedif;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin kenar uzunlugunu aliniz
        // Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
        //Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
        //Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz

        Scanner input= new Scanner(System.in);
        System.out.println("ucgenin uc kenarini giriniz");

        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        boolean ucgenMi= (a+b>c&&c>Math.abs(a-b))&&(a+c>b&&b>Math.abs(a-c))&& (b+c>a&&a>Math.abs(b-c));




     if(a<=0||b<=0||c<=0){
         System.out.println("geceli kenar uzunlugu giriniz");
     }else if(ucgenMi){
        if(a==b&&b==c&&a==c){
            System.out.println("Eskenar");
        }else if(a==b||b==c||a==c){
            System.out.println("ikiz kenar");
        }else{
            System.out.println("cesit kenar");
        }

    }else{
        System.out.println("ucgen degil");
    }





    }




}
