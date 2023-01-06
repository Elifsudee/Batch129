package day06Stringmanipulationsifstatement;

public class StringManipulations04 {

    public static void main(String[] args) {
        // Example1:Bir string in bas ve sonuna space character i varsa siliniz
        //    "   Ali Can  " ==> "Ali Can"


        String s = "  Ali Can  ";

        System.out.println(s);

        //Not:trim() methodu bir String in bas ve somundaki sapace characterleri siler aradakilere dokunmaz.

        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        // Example 2: asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        // String tv="$456.99";
        // String laptop="$875.99"; ikisinin toplami bulmak


        String tv = "$456.99";

        String laptop = "$875.99";

        String tv2 = tv.replace("$", "");
        System.out.println(tv2);//456.99 string

        String laptop1 = laptop.replace("$", "");

        System.out.println(laptop1);//875.99 string

        double toplam = Double.valueOf(tv2) + Double.valueOf(laptop1);
        System.out.println(toplam);

        // ondalik sayilar javad otomatik olarak double kabul edilir.

        //Example 3:Verilen ismin ilk ismin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz

        //   "Ali Can"==> AC

        String name = "  ali cAN  ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);//A

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);//C

        System.out.println("" + first + second);//AC

        //Example4: Bir string in hic character icermedigini(bos string) kontrol eden kodu yaziniz

        String str = "";
        //1.yol lengt() kullan
        boolean result1 = str.length() == 0;//== karsilastirma operatoru
        System.out.println("string bos mu " + result1);//true

        //2.yol
        //not: java bir kunda method uretmisse o methodu kullanmak en  iyisidir

        boolean result2 = str.isEmpty();
        System.out.println("String bos mu " + result2);//****** bu kullnilir

        //Example 5: Bir string in Space haric hic bir karakter icermedigini kontrol eden kodu yaziniz

        String t = "      ";
        //1.yol
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println("Sadece space mi var" + result3);

        //2.yol
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println(" Sadece space mi var"+result4);

        //3yol
        // isBlank() metodu sadece sapace iceren String ler icin true veriri, sapace disinda bir character icerirse false verir.
        // isBlank () methodu bos stringler icin true verir.
        //isBlank ===>space+ hic bir sey    isEmpty==> hic bir sey icin true

        boolean result5 = t.isBlank();
        System.out.println(" Sadece space mi var" + result5);

        //Examle 6:Bir string de a,e,i characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //   "Java is easy to learn"==> 1+5+8=14

        String r= "Java is easy to learn";

       int idxA= r.indexOf('a');
        System.out.println(idxA);//1

       int idxI= r.indexOf('i');
        System.out.println(idxI);//5

      int idxE=  r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println("Indexler toplami "+ (idxA+idxI+idxE));

        // Example 7: Bir String de "java" kelimesinin ilk olarak  kacinci indexlerde kullanildigini gosteren kodu yaziniz
        // "Ah Java vah Java sensiz olmuyor Java"


      String u= "Ah Java vah Java sensiz olmuyor Java";
// indexof("java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index ini almis oluruz

     int idxJava= u.indexOf("Java");
        System.out.println(idxJava);//3

      // Not: indexOf() methodu olmayan character ler icin kullanilirsa her zaman "-1" verir.

        int idxOfXyz= u.indexOf("xyz");
        System.out.println(idxOfXyz);//-1

        //Example 8: Bir string de "a,i.e" character lerinin "son" gorunumlerinin indexleri toplamini ekrana yaziniz
        //     "Java is easy to learn"==>18+5+17=40


        String v= "Java is easy to learn";

      int idxOfA=   v.lastIndexOf('a');//18
        System.out.println(idxOfA);

       int idxOfI= v.lastIndexOf('i');
        System.out.println(idxOfI);//5

       int idxOfE=  v.lastIndexOf('e');
        System.out.println(idxOfE);//17

        System.out.println(idxA+idxI+idxE);//40

//note: lastIndexOf() String olayan bir character icin kullanilirsa her zaman -1 verir.

        //Example 9: Bir strig deki tekrarsiz karakterleri ekrana yazdirin
        // abbccdc==>ad******onemli soru

     //note:***Bazi kodlarin bazi sartlara bagli olarak calışmasi gerkir.
        // bazı kodlari bazi sartlara aktive etmek icin "if statement"
        // if you study hard,you will learn Java

        String y="abb";
        char ch1=y.charAt(0);

        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){

            System.out.println(ch1);
        }
        char ch2=y.charAt(1);
        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);

            char ch3=y.charAt(2);
            if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
                System.out.println(ch3);


            }


        }







        // Example 10: sayi pozitif  ise ekrana pozitif yazdirin
        int num=12;
        if(num>0){
            System.out.println("pozitif");

            //Example 11: Sayi -1 ile 10 arasinda ise ekrana rakam yazdirin
            int num1=3;
            if(num1>-1&& num1<10){
                System.out.println("Rakam");


            }

            // Example 12:sayi uc basamakli ise ekrana "Wooow" yazdırın

            int numTree=-123;
          numTree=  Math.abs(numTree);

            if(numTree>99&&numTree<1000){
                System.out.println("Wooow");

            }

        }




    }










    }




