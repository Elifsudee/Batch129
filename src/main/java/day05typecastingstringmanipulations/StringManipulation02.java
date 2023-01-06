package day05typecastingstringmanipulations;

public class StringManipulation02 {

    public static void main(String[] args) {

        String s="Learn Java earn money";

        // example 1: "s" string inin "money ile bitip bitmedigini kontrol ediniz

     boolean isEnd=   s.endsWith("money");
        System.out.println(isEnd);//true

        //Ezample 2: "s" string indeki many kelimesini "dolar" kelimesini ceviriniz


      String s1=  s.replace("money ","dolar");
        System.out.println(s1);
 // Example 3:

      s.replace("earn","win");


      //Example 4

      String s3=  s.replace("a","*");
        System.out.println(s3);

// Note replace() metodunda coklu karakter ile calisirsaniz mecbur cift tirnak kullanacsiniz
        //Ama tek caharacter ile calisirsaniz cift veya tek tirnak kullanabilirsiniz

        //Note**:ama ikisi ya cift tirnak olali ya da ikisi tek tirnak olmali

      String s4=  s.replace("n","xxx");
        System.out.println(s4);


        // Example 6: "s" strin indeki tum "e" harflerini siliniz

       String s5=s.replace("e","");
        System.out.println(s5);


        // Note: hic bir sey char data type nde yok, bu yuzden replace() methodu kullanaraksilme islemi
        // yaparsaniz mutlaka cift tirnak kullaniniz


        String t="Ali 13 yasindadir!...";

        //Example 7: "t" String indeki tum rakamlari
        // "*" ceviriniz
        // Note bir grup datayi degiştirmek icin replace() kullanilir
        //Note: Bir grop data yi ifade etmek icin "Regular Expressions"(Regex)

       String t1= t.replaceAll("[0-9]","*");

        System.out.println(t1);
/*
Mesgur Regex ler
1) Tum rakamlar ==>[0-9]
2)Tum kucuk harfler==>[a-z]
3) Tum buyuk harfler==> [A-Z]
4)Tum kucuk harfler tum buyuk harfler==[a-zA-Z]
5)Tum harfler ve rakamlar ==>[a-zA-Z0-9]
6) Tum noktalama isaretleri==> \\p{Punct}
7) Tum seli harfler ==> [aeiouAEIOU]
x,q,w  ==>[xyq]
8) kucuk harflerden farkli tum character==>[^a-z]

9) tum harflerden farkli tum character ler [


 */

//Example 8: "t" String indeki tum rakamlari ve harfleri "!" ceviriniz

    String t2=    t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);

        // Example "t" string indeki tum sesli harfleri "?" ceviriniz

     String t3=   t.replaceAll("[aeiouAEIOU]","!");
        System.out.println(t3);

        // Example 9: "t" String indeki tum kucuk harfler disindaki tum character leri <> e ceviriniz


    String t4= t.replaceAll("[^a-z]","<>");

        System.out.println(t4);

        // Exapmle 10

      String t5=  t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);

        // Example "t" strindeki tum space ler disindaki tum character leri"TL" ceviriniz

      String t6=  t.replaceAll("[^ ]","TL");
        System.out.println(t6);

       // Example 13: "t" String indeki sesli harfler disindaki tum karakterleri "&" ceviriniz

  String t7=t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(t7);

    }
}
