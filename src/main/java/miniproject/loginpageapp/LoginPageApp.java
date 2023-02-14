package miniproject.loginpageapp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginPageApp {

    /*

Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

         menü: kullanıcıya işlem seçimi için menü gösterilir.

         üye olma(register): kullanıcıdan ad-soyad, kullanıcı adı, email ve şifre bilgileri alınız.
                             kullanıcı adı, email ve şifre birer listede tutulur.
                             aynı kullanıcı adı veya email kabul edilmez.

         giriş(login): kullanıcı adı/email ve şifre girilir.
                       kullanıcı adı veya email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
                       kullanıcı adı/email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.

         email validation: boşluk içermemeli
                         : @ içermeli
                         : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                         : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.

         password validation: boşluk içermemeli
                            : en az 6 karakter olmalı
                            : en az bir tane küçük harf içermeli
                            : en az bir tane büyük harf içermeli
                            : en az bir tane rakam içermeli
                            : en az bir tane sembol içermeli
 */
    public static void main(String[] args) {

        start();
    }//main

    public static void start(){

        Scanner input=new Scanner(System.in);
        //1 =kullaniciya islem menusu gosterelim

        int select;//secenek
        do {
            System.out.println("======TECHPROEDUCATION======");
            System.out.println("1= uye olama");
            System.out.println("2= giris yap");
            System.out.println("0 -Cikis");
            select=input.nextInt();

            switch (select){
                case 1:
                    //register uye olma

                    break;
                case 2:
                    //login yani giris
                    break;
                case 0:
                    //cikis
                    System.out.println("iyi gunler dileriz");
                    break;
                default:
                    System.out.println("hatali giris yaptiniz, tekrar deneyiniz");
            }


        }while (select!=0);

  //2-tum userlerin ortak ozellillerini tutmak icin, user classi olusturalim

    }
        }//class
