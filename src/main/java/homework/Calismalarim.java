package homework;

import java.util.Scanner;

public class Calismalarim {

    public static void main(String[] args) {

        //Kullanicidan ismini ve soyismini girmesini isteyin
//Sonrasinda kullanici nasil girerse girsin konsole'da buyuk harfle yan yana concat ileyazilmasini saglayin


        //Kullanicidan
        // isim ve soyisim girmesini isteyin hangisinin daha
        // uzun oldugunu yazdiran kodu olusturunuz


        //Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
//           tum karakterlerin sayisini bulan kodu yaziniz
        String str3="Learn Java earn 9000000 money, !...";



        /* soru1= Ornek:Kullanicidan alacaginiz 5 basamakli sayi aliniz
        ilk iki ve son iki basamagindaki rakamlarin toplamini yazdirin*/

        // soru 2= Kullanicidan aldiniz sekille asagıdaki gibi bir görsel olusturunuz
        /*

            A
          A    A
        A    A    A
         */

        String s = "Java is easy";
        //soru 1 =tum karakterleri buyuk harf yap

        //soru 2= example "s" stringdeki tum character leri kucuk harfe cevir

        //soru 3="s" s strigdeki  ilk characteri aliniz

        //soru 4=or: "s" string inde ikinci ve sondan ikici karakterleri aliniz ve ekrana yan yana yazdiriniz

        // soru 5=exaple "s" stringinde bulunan character sayisini bulunuz

        // soru 6=examle "s" Strindeki ilk dort karakteri aliniz

        // soru 7="s" string indeki "is" kelimesini aliniz


        // soru 8ornek "s" string indeki "easy" aliniz


        //soru 10=Example "s" string inde "money" olup oladigini kontrol ediniz

        //Example 11:"s" string inin belli bir harf ile baslayip baslamadigini kontrol ediniz


        //Example "s" string inin 6. karakterden itibaren belli bir harften baslayip baslamadiğini kontrolediniz


        String s1 = "Learn Java earn money";

        // example 1: "s1" string inin "money ile bitip bitmedigini kontrol ediniz


        //Ezample 2: "s1" string indeki many kelimesini "dolar" kelimesini ceviriniz


        // Example 3: "s" strin indeki tum "e" harflerini siliniz

        String t = "Ali 13 yasindadir!...";

        //Example 7: "t" String indeki tum rakamlari
        // "*" ceviriniz


        //Example 8: "t" String indeki tum rakamlari ve harfleri "!" ceviriniz

        // Example 9= "t" string indeki tum sesli harfleri "?" ceviriniz

        // Example 9: "t" String indeki tum kucuk harfler disindaki tum character leri <> e ceviriniz


        // Example 10 ="t" strindeki tum space ler disindaki tum character leri"TL" ceviriniz

        // Example 11: "t" String indeki sesli harfler disindaki tum karakterleri "&" ceviriniz


        /*

        Example 1:Asagidaki kurallara göre kullanicini girdigi password u kontrol ediniz
          ı) En az 8 karakter olsun
          ıı) Space characteri password de olmasin
          ııı) En az bir tane buyuk harf olsun
          ıv) En az bir tane kucuk harf olsun
          v)En az bir tane sembol olsun
          vi)En az bir tane rakam olsun

         */
// 1 =Example1:Bir string in bas ve sonuna space character i varsa siliniz
        //    "   Ali Can  " ==> "Ali Can"


        String s2 = "  Ali Can  ";

        // Example 2: asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        // String tv="$456.99";
        // String laptop="$875.99"; ikisinin toplami bulmak


        String tv = "$456.99";

        String laptop = "$875.99";


        //Example 3:Verilen ismin ilk ismin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz

        //   "Ali Can"==> AC

        String name = "  ali cAN  ";

        //Example4: Bir string in hic character icermedigini(bos string) kontrol eden kodu yaziniz

        String str = "";

        //Example 5: Bir string in Space haric hic bir karakter icermedigini kontrol eden kodu yaziniz

        String m = "      ";


        //Examle 6:Bir string de a,e,i characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //   "Java is easy to learn"==> 1+5+8=14

        String r = "Java is easy to learn";


        // Example 7: Bir String de "java" kelimesinin ilk olarak  kacinci indexlerde kullanildigini gosteren kodu yaziniz
        // "Ah Java vah Java sensiz olmuyor Java"


        String u = "Ah Java vah Java sensiz olmuyor Java";


        //Example 8: Bir string de "a,i.e" character lerinin "son" gorunumlerinin indexleri toplamini ekrana yaziniz
        //     "Java is easy to learn"==>18+5+17=40


        //Example 9: Bir strig deki tekrarsiz karakterleri ekrana yazdirin
        // abbccdc==>ad******onemli soru

//**************ifler

        //Example 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kucuk harf ise
        // ekrana "kucuk harf" yazdıran kodu olusturunuz

        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.


        //Example 3: verieln bir sayinin pozitif negatif veya notr oldugunu kontrol eden kodu yaziniz


        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz

//1:Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.

 /*
           kullanıcıdan yas degerini alan ve ve yasin hangi evrede oldugunu yazdiran kodu olusturunuz

         0-4 bebek, 5-12 cocuk, 12-20 genc, 21-30 yetiskin
         30 ustu  tanimlanmamiş evre, hata mesaji olarak gecerli bir yas giriniz
         */


        // Example 1: Kullanicidan 3 tane pozitif bir tamsayi aliniz.
        //          Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
        //          Eger ucgen ise "eskenar"
        //          Ucgen olma durumunu
        //          kontrol ediniz.
        //          INFO :
        //          Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
        //                           herhangi iki kenar farki ucuncu kenardan kucuk olmali
        //           a+b>c>a-b
        //           a+c>b>a-c
        //           b+c>a>b-c
        //           a=b=c ise eskenar ucgen
// kullanici yanlislikla negatif girdiyse kodu boyle yazabiliriz


        //Kullanicidan bir ucgenin kenar uzunlugunu aliniz
        // Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
        //Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
        //Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz


     /*
        Password'un ilk harfi buyuk harf ise

        'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin

        Passwordun ilk harfi kucuk harf ise
        'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
        A ==> gecerli
        B C Ç D E F G Ğ H İ I J K L M N O Ö P R S Ş T U Ü V Y Z==> gecersiz
        a b c ç d e f g ğ h i ı j k l m n o ö p r s ş t u ü v y ==> gecersiz
        z ==>gecerli

*/

/*
   Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
   Eger calisan kadinsa
   60 yasindan buyukse “Emekli Olabilir “yazdirin

   Eger calisan erkek ise
   65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz
    */

        /*
        kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islem ile
        isleme koyup yazdiriniz


         */

        //******* ternary

        //Kullanicidan iki sayi aliniz "buyuk olamayan(kucuk ve esit olan) sayiyi yazdiriniz


        //example1: verilen yilin "artik yil"(Leap yil interviv sorusu) olup olmadigini kontrol eden kodu yaziniz
        // 1) yil 100 e bolunuyorsa 400 e de bolunmeli  1600===>leap  1800===> Leap degil

        // 2) yil 100 bolunmuyorsa  4 e bolunmeli  2004===> leap 5005==> Leap degil


          /*
        kullanicida bir gun alin
        eger cuma ise muslumanlar icin "mubarek gun"
        Eger gun cumartesi ise "yahudiker icin kutsal gun"
        Eger gun pazar ise "Hristiyanlar icin kutsal gun" yazdiran kodu olusturunuz
        Haricindeki her sey icin kutsal gun degildir.

         */

               /*
 TASK :
 Kullanicidan bir character girmesini isteyiniz
 Character harf ise kucuk harf olup olmadigini kontrol ediniz
 Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
 Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
 Harf degilse ekrana "Harf degil" yazdiriniz
 97:a  122:z ascii değeri
 */

//swicht
        // Example 1: gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz


  /*
        Example 1) Ay numarsini soyleyince, numarasi verilen ay`dan baslayip 12. aya kadar tum aylarin isimlerini yazdiran kodu yaziniz

        8===> Agust-September- october-November

         */

        //Example: Kullanicidan iki sayi ve yapilacak islemi alan ve +,-,*,/ ,% islemlerini


        //   Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
        //   Type code to print abbreviation(kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

        //  Kullanicidan bir ulke ismi aliniz.Alinan ulke adina gore kisaltmalari yazdiriniz


        //loop for
        // Exaple 1: Ekrana 5 kere "Hi" yazdirin


        // Ex 2) 11 den 44 e kadar tum sayilari ekrana yazdirininz


        // ex 4) 18 den 56 ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz



  //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J




        //Exaple 1: Verilen bir String de 'a' karakteri haric tum karakterleri yazdiriniz



        // Example 2: verilen bir String de son a dan sonraki tum karakterleri ters sirada  yazdiriniz
        //  "Germany" ==> yn





        // size verilen bir string i tersden yazdirin





        // Size verilen String in "Palindrome olup olamadigini kontrol ediniz
        //   civic, nalan, kucuk====




        // 5 den 8 e kadar tam sayilarin toplanini yaziniz


        //Example 2: 7 den 9 a kadar tam sayilarin carpimini verilen kodu yaziniz


        /*
    Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
*/




/*
             Kullanicidan baslangic ve bitis degerlerini alin
           Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari
          ekrana yazdirin.
 */



        /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X

*/



        /*
                Example 1: Asagidaki sekli cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
         */





/*
    Example 1: Asagidaki sekli cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
 *
 */

        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun

/*


^
^^
^^^
^^^^
^^^^^
|||
|||
|||
|||
|||
*/






        // Example 1=hic sayi kullanmadan birden yuze kadar olan sayilari yazdiriniz


//While loop
        // Example1= 3 den 10 a kadr tamsayilari yazdiriniz




        // ex 2) 23 de 12 ye kadar cift tam sayilari ekrama yazdiriniz




        // Example 3= Verilen bir tam sayinin rakamlari toplamini konsala yazdiran kodu yazdiriniz





    }
}