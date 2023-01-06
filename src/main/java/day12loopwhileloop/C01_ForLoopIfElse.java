package day12loopwhileloop;

import java.util.Scanner;

public class C01_ForLoopIfElse {
    public static void main(String[] args) {


        /*
        kullanicidan baslangic ve bitis degerlerini alin
        baslangic deegrinden baslayip bitis degerine kadar tum tam sayilari ekrana yazdiriniz

         */

        Scanner input= new Scanner(System.in);
        System.out.println("lutfen baslangic  degerlerini giriniz");
        int baslangic= input.nextInt();;

        System.out.println("lutefn bitis degerini giriniz");
        int bitis=input.nextInt();

        if(baslangic>bitis){
            System.out.println("verdiginiz baslangic degeri bitis degerinden kucukk olamli");
        }else {

            for (int i = baslangic; i <= bitis; i++) {
                System.out.print(i + " ");

            }//for
        }//else













    }
}
