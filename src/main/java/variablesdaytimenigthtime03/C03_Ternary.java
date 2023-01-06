package variablesdaytimenigthtime03;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

        /*
TASK :
 Kullanicidan bir character girmesini isteyiniz
 Character harf ise kucuk harf olup olmadigini kontrol ediniz
 Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
 Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
 Harf degilse ekrana "Harf degil" yazdiriniz
 97:a  122:z ascii değeri
 */

    /*
    Ascii degerler verilmeseydi
    char a='a';
    System.out.println(a+0);
     */

        Scanner input=new Scanner(System.in);
        System.out.println("Bir karakter giriniz");

        char ch=input.next().charAt(0);

        System.out.println("******Ternary cozum*****");

        boolean harfMi=(ch<='z' && ch>='a') || (ch<='Z' && ch>= 'A');
        boolean kucukHarf=(ch<='z' && ch>='A');

        String result=(harfMi) ?  kucukHarf ?   "Kucuk harf" : "Buyuk harf"      :       "Harf degil";


        System.out.println("result = " + result);


        if(harfMi){
            if(kucukHarf){
                System.out.println("kucuk harf");
            }else{
                System.out.println("kucuk harf degil");
            }

        }else{
            System.out.println("harf degil");
        }










    }
}
