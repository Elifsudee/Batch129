package day05typecastingstringmanipulations;

import java.sql.SQLOutput;

public class StringManipulations01 {

    // String non primitive data tipidir ayni zamanda bir class'tir.

    public static void main(String[] args) {

        // Kullanicidan aldiniz sekille asagıdaki gibi bir görsel olusturunuz
        /*

            A
          A    A
        A    A    A
         */


       String s="Java is easy";

       //soru 1 =tum karakterleri buyuk harf yap
        String sUpper = s.toUpperCase();//JAVA İS EASY
        System.out.println(sUpper);

        // example "s" stringdeki tum character leri kucuk harfe cevir

        String sLower = s.toLowerCase();
        System.out.println(sLower);// java is easy


        //"s" s strigdeki  ilk characteri aliniz

        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J


        //or: "s" string inde ikinci ve sondan ikici karakterleri aliniz ve ekrana yan yana yazdiriniz

        char secondChar = s.charAt(1);
        char secondLast = s.charAt(10);
        //1 yol ayni satira yazdirmak icin
        System.out.print(secondChar);
        System.out.println(secondLast);
        // 2 yol ayni satira yazdirmak icin
        System.out.println("" + secondChar + secondLast);//( "") concatination yani onu sayi gibi gormez


        // exaple "s" stringinde bulunan character sayisini bulunuz
        int sLengt = s.length();
        System.out.println(sLengt);//12


        //examle "s" Strindeki ilk dort karakteri aliniz

        // substring(0,4)==> "0" yani ilk indexs dahil, yani ikinci index haric dir

        String sub1 = s.substring(0, 4);
        System.out.println(sub1);//java

        // "s" string indeki "is" kelimesini aliniz

        String sub2 = s.substring(5, 7);
        System.out.println(sub2);//is

        //ornek "s" string indeki "easy" aliniz

        String sub3 = s.substring(8, 12);
        System.out.println(sub3);//easy

        //Not==> Bir character den baslayip String in sonuna kadar almak isterseniz, ikinci indez i yazmayiz.


        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Example "s" string inde "money" olup oladigini kontrol ediniz

        boolean isExist = s.contains("money");
        System.out.println(isExist);//false

        /*
        bir method ogrenirken 3 sey mutlaka ogrenin:
        ı) bu method ne is yapar
        ıı)
        bu methodun farkli kullanimlari nasildir.
        ııı)
        bu metod size ne verir(return eder)

         */

        //Example 10:"s" string inin belli bir harf ile baslayip baslamadigini kontrol ediniz

        boolean isStart = s.startsWith("Java"); //Java kelimesi ile baslar
        System.out.println(isStart);

        //Example "s" string inin 6. karakterden itibaren belli bir harften baslayip baslamadiğini kontrolediniz

        boolean isBegin = s.startsWith("i", 5);
        System.out.println(isBegin);//true



    }
}
