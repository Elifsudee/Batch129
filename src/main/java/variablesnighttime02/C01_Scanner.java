package variablesnighttime02;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        // TecProEd spor salonu için isim soyisim,yas,kilo boy salona devam edecegi ay suresi bilgilerini
        // alip aylik toplam ucreti yazdiriniz

        System.out.println("TecProEd spor soluna hoş geldiniz...");

        System.out.println("Lutfen adinizi ve soyadinizi giriniz....");

        String name=  input.nextLine();

        System.out.println("yasinizi giriniz");

      int age=  input.nextByte();

        System.out.println("kilonuzu giriniz");
     double kilo=   input.nextDouble();

        System.out.println("boyunuzu giriniz");
       double boy= input.nextDouble();

        int aylik_ucret=20;
        System.out.println("aylik_ucret = " + aylik_ucret+" $");


        System.out.println("kac ay devem edceginizi giriniz");
       int aylik= input.nextInt();

       int toplam_tutar=aylik_ucret*aylik;
        System.out.println("toplam_tutar = " + toplam_tutar+" $");

        System.out.println("Isminiz : " + name + "\t" + "Yasiniz : " + age +
                "\t"+" Kilo" + kilo + " Boyunuz : " + boy+ "  Odemeniz gereken toplam tutar : " +
                toplam_tutar + "$");


        System.out.println("isminiz :"+name+"\n"+" yas :" +age+"\n"+"kilo  :" +kilo+"\n"+"boy: " +boy+"\n"+"odenecek tutar: " +toplam_tutar);





    }




}
