package day3scanner;


import java.util.Scanner;

public class Scanner01 {

    //Kullanıcıdan data alıp kullancagız.
    //


    public static void main(String[] args) {
// 1. Adim: Scanner Class'dan obje olustur.
// 2.Adım: Kullanicidan ne istedifimize dair mesj veriniz
//3.Adim: Uygun methodu kullanarak kullanıcının verdigi datayi memorye yazdir.
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz...");
        byte age= input.nextByte();
        System.out.println(age);




    }


}
