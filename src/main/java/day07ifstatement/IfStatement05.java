package day07ifstatement;

import java.util.Scanner;

public class IfStatement05 {

    public static void main(String[] args) {
        //1:Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Ay ismi giriniz");

        String montName = input.next();

        if (montName.equalsIgnoreCase("Ocak")) {
            System.out.println(" 1.ay");
        } else if (montName.equalsIgnoreCase("Subat")) {
            System.out.println("2. ay");
        } else if (montName.equalsIgnoreCase("Mart")) {
            System.out.println("3. ay");
        } else if (montName.equalsIgnoreCase("Nisan")) {
            System.out.println("4. ay");
        } else if (montName.equalsIgnoreCase("Mayis")) {
            System.out.println("5. ay");
        } else if (montName.equalsIgnoreCase("Haziran")) {
            System.out.println("6. ay");
        } else if (montName.equalsIgnoreCase("Temmuz")) {
            System.out.println("7. ay");
        } else if (montName.equalsIgnoreCase("Agustos")) {
            System.out.println("8. ay");
        } else if (montName.equalsIgnoreCase("Eylul")) {
            System.out.println("9. ay");
        } else if (montName.equalsIgnoreCase("Ekim")) {
            System.out.println("10. ay");
        } else if (montName.equalsIgnoreCase("Kasim")) {
            System.out.println("11. ay");
        } else if (montName.equalsIgnoreCase("Aralik")) {
            System.out.println("12. ay");
        } else {
            System.out.println("Gecerli bir ay adi giriniz");
        }

        /*
Stack Memory'de
1)Primitive Data'lar depolanir
2)Non-primitive'lerin adresleri depolanir.(Reference)
Heap Memory'de Non-primitive'ler depolanir.

Primitive Data: char,boolean,byte,short,int,long,float,double
Non-primitive Data: String,Wrapper Class,sizin olusturdugunuz Class'lar
 */

        /*
        not:Stringlerinesitliklerini kontrolederken "==" yerine "equals()"kullaniriz.Cunku "==" senbolu iki Strig i
        karsilaştirirken hem adreslerine hem de degerlerine bakar, ikisi de ayni ise siz Stringler icin esittir der ama
        biz kod yazarken adreslerine degil degerleri ile ilgileniriz. Bu yuzden String karsilastirmalrina "=="
        kullanmayiz

    "equals()" metho'u ise iki String'i karsilastirirken sadece degerlerine bakar, degerler ayni ise
      bu iki String esittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken
      ihtiyac duydugumuz seydir.

         */
String s="Tom";
String t="Terry";
String r=new String("Tom");
String m="Tom";
        System.out.println(s==t);//false cunku adresler ve degerler farkli
        System.out.println(s.equals(t));//flse cunku degerler farkli

        System.out.println(s==r);//false cunku adres farkli
        System.out.println(s.equals(r));//true cunku equals() method degerlerine bakar. s ve r nin degeri ayni
        System.out.println(s==m);//true verir
        System.out.println(s.equals(m));//true

    }
}
