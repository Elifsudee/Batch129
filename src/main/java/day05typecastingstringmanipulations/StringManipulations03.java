package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {


    public static void main(String[] args) {
        /*

        Example 1:Asagidaki kurallara göre kullanicini girdigi password u kontrol ediniz
          ı) En az 8 karakter olsun
          ıı) Space characteri password de olmasin
          ııı) En az bir tane buyuk harf olsun
          ıv) En az bir tane kucuk harf olsun
          v)En az bir tane sembol olsun
          vi)En az bir tane rakam olsun

         */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");

        String pwd=   input.nextLine();


        //ı) En az 8 karakter olsun

        boolean first=pwd.length()>7;
        System.out.println(first);

        //ıı) Space characteri password de olmasin
        boolean second=!pwd.contains(" ");
        System.out.println(second);

       // ııı) En az bir tane buyuk harf olsun
        // Note: buyuk harf olmayanlari sil sonra kalan karakter sayisina bak ,
        //karakter sayisi sifir ise buyuk harf yok demektir sifirdan buyk ise hafrf var demektir

        boolean third= pwd.replaceAll("[^A-Z]","").length()>0;// methodlari ayni satirda yan yana kullanmaya
        System.out.println(third);                                             // "method chain" denir.


        //ıv) En az bir tane kucuk harf olsun

        boolean fourth=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(fourth);

       // v)En az bir tane sembol (harf ve rakam harici her sey)olsun

      boolean fifth=  pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);

       // vi)En az bir tane rakam olsun

      boolean sixths=  pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixths);
        System.out.println(" pasword gecer li mi "+(first&&second&&third&&fifth&&sixths));

    }
}
