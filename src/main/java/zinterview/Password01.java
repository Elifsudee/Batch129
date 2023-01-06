package zinterview;

import java.awt.*;
import java.util.Scanner;

public class Password01 {
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


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen passordunuzu giriniz");

        String pwd = input.nextLine();

        boolean pwd1 = pwd.length() > 8;
        boolean pwd2 = !pwd.contains(" ");
        boolean pwd3 = pwd.replaceAll("[^A-Z]", "").length() > 0;
        boolean pwd4 = pwd.replaceAll("[^a-z]", "").length() > 0;
        boolean pwd5 = pwd.replaceAll("[a-zA-Z0-9]", "").length() > 0;
        boolean pwd6 = pwd.replaceAll("[^0-9]", "").length() > 0;

        System.out.println(pwd1&&pwd2&&pwd3&&pwd4&&pwd5&&pwd6);
    }
}
