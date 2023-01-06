package day08nestedif;

import java.util.Scanner;

public class C03_NestedIf {

    /*
    kullanicida 0 dan kucuk ve 120 den buyuk deger giremeyecek sekilde datalari aliniz
    Eger calisan "kadin" ise 60 yasinda buyukse "emekli olabilir"
    Eger calisan erkek ise 65 yasindan buyukse "emekli olabilir"  yazdiran kodu yaziniz

     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Cinsiyetini giriniz \n kadin icin 'K', \nerkek 'E' giriniz");
      char cinsiyet=  input.next().toUpperCase().charAt(0);//kullanicinin verdigi harfi kucuk harfe cevirdik
        System.out.println("Yasinizi giriniz");
      int yas=  input.nextInt();

        if(cinsiyet=='K'){
            if(yas<0||yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            }else if(yas>60){
                System.out.println("Emekli Olabilir");
            } else{
                System.out.println("Emekli Olamazsin"+"K"+(60-yas)+ "daha yil calişman var");
            }
        }else if(cinsiyet=='E'){
            if(yas<0||yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            }else if(yas>65){
                System.out.println("Emekli Olabilir");
            }else{
                System.out.println("Emekli Olamazsin"+"K"+(65-yas)+ "daha yil calişman var");
            }
        }else{
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
        }
















    }

}
