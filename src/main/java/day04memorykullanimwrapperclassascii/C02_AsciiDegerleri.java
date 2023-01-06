package day04memorykullanimwrapperclassascii;

import com.sun.security.jgss.GSSUtil;

public class C02_AsciiDegerleri {
    /*
    ASCII==>Amerikan Standart Kodlama Sistemi
    Uluslararasi kabul görmüs degerlerdir.
    Klavyemizde kullandigimiz harf ve sembollerin matematiksel karsiligi char data tpipnde isleme alinirsa o char
    degerinin Ascii Table'de karsiligini isleme alir.
    Harf ve sembollere deger atar.
    Karakterlerin cebirsel karsiligini bulmak icin ortaya cikmistir.Cunku bilgisayarda her sey 10010010 den olusur
    bu yapiyi cevirmek icin Ascii Table olusturulmustur.
    Buyuk harflerin
     Ascii degeri kucuk

     */


    public static void main(String[] args) {

        // Bir tam sayi ile bir harfi toplayiniz.

        int deger = 20;
        char harf = 'a';

        //1.yol
        int toplam = deger + harf;
        System.out.println("bir tam sayi ile harfin toplami" + toplam);

        //2.yol
        System.out.println("ikinci yol toplam " + (deger + harf));


        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1);

        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2);

        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);

        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4 " + rakam1 + rakam2 + rakam3 + rakam4);// 1234 ascii
        System.out.println("rakam1+rakam2+rakam3+rakam4 " + (rakam1 + rakam2 + rakam3 + rakam4));//202 ascii


        char kh = 'a';
        char bh = 'A';
        System.out.println("a nin ascii degeri " + (kh + 0));// 97 (0 ile toplama nedeni degri degiştirmez)
        System.out.println("A nin ascii degeri " + (bh + 0)); //65


        System.out.println("kh> bh==>" + (kh > bh));// karsilastirma islemlerinin somucu true yad false doner

        // herngi bir karakterin ascii degerini hesaplayalim
        //1.yol
        char space = ' ';//bosluk

        System.out.println("space ascii degeri=" + (space + 0));//32


        // char data type'lere java karakterlerine int deger de  atanabilir
        // Cunku char data type'nin bir resim degeri bir de ascii 'den gelen degeri vardir.
        //bu sekilde ascii degerini bulabiliriz

        // 2.yol

        int hrf = 'm';


        System.out.println("int harf in ascii degeri" + hrf);//109

        //***** Ascii Degerlerinde yaralanarak karsilastirma yapabiliriz****

        byte b=125;
        float f=2.4564F;
        long l= 54565122511178L;
        char ch= 'h';

        System.out.println(l>ch);// true

        System.out.println(b<f);//false

        System.out.println(b<ch);//false





    }


}
