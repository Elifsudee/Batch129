package day08nestedif;

import java.util.Scanner;

public class C04_NestedIf {
    public static void main(String[] args) {

        //Exaple 1) Verilen bir character buyuk harf ise ekrana buyuk harf yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
   int sayi1=input.nextInt();
   int sayi2=input.nextInt();


if(sayi1<sayi2){
    System.out.println(sayi1);
}else{
    System.out.println(sayi2);
}


     int sayi3=   sayi1<=sayi2 ? sayi1 : sayi2;
        System.out.println(sayi3);



    }
}