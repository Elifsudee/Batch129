package day08nestedif;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {
        //Kullanicidan iki sayi aliniz "buyuk olamayan(kucuk ve esit olan) sayiyi yazdiriniz

        Scanner input= new Scanner(System.in);
        System.out.println("iki sayi giriniz");

        double a=input.nextDouble();
        double b=input.nextDouble();
     // 1 yol: if else
      if(a<b){
          System.out.println(a);
      }else{
          System.out.println(b);
      }
// 2 yol:Ternary
//            condition ? : condition true ise calisir  :condition false ise calisir
  double sonuc= a<b       ?          a:                          b;

        System.out.println(sonuc);

    }
}
