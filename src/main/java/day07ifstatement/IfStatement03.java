package day07ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        //Example 3: verieln bir sayinin pozitif negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int num=  input.nextInt();

        if(num>0){
            System.out.println("Pozitif...");
        }else if(num<0){
            System.out.println("Negatif..");
        }else{
            System.out.println("Notr");
        }




    }
}
