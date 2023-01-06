package homework;

public class PracticeCalismalarStringManipulation {

    public static void main(String[] args) {

        //Example 1= sadece bir kelimeden olusan bir sehir ismi icin bir String degisken olusturunuz
        // Sehir ismini bas harfi buyuk diger tum karaktreler kucuk olacak sekilde yaziniz

        //Cozum

        String city=" miAMi ";
      String yeniCity=  city.trim().toLowerCase();
      yeniCity=  yeniCity.substring(0,1).toUpperCase()+yeniCity.substring(1);
        System.out.println(yeniCity);


      //Kisi isimleri icin 3 String degisken olusturunuz. Bosluk karakter haric 3 isimdeki karakter sayisinin toplamini yaziniz.

      //Cozum

      String name1="Ali Can";
      String name2="Kadir Ekrem";
      String name3="Elif sude";

     name1= name1.trim().replaceAll(" ","");

     name2=   name2.trim().replaceAll(" ","");

     name3= name3.trim().replaceAll(" ","");

        System.out.println(name1.length()+name2.length()+name3.length());


//2 yol

   int s1=   name1.replaceAll("\\s","").length();
   int s2=   name2.replaceAll("\\s","").length();
   int s3=   name3.replaceAll("\\s","").length();


        System.out.println("bosluk olayan karakter sayisi " +(s1+s2+s3));

//Example 3=Bir String degiskeni olusturunuz,String deki toplam alfabetik ve sayisal karakter sayisini ekrana yazdiriniz

        String s=" Miami 33018!!!";

      int alfabetikSayisalKarakter=  s.replaceAll("\\s","").replaceAll("[^a-zA-Z0-9]","").length();

        System.out.println("alfabetikSayisalKarakter = " + alfabetikSayisalKarakter);



//Example 4=Bir String olusturunuz,Stringdeki rakam olmayan karakter sayisini konsola yazdiriniz

        String e="2a3B4?-!5";
      int rakamOlmayan=  e.replaceAll("\\d","").length();

        System.out.println("rakamOlmayan = " + rakamOlmayan);


//Example 5=Bir String olusturunuz ve String degiskeninin konsolda bosluk olamayan son karakteri yazdiriniz

        String k="Miami  ";

     int boslukOlmayanKarakterIndex=  k.replaceAll(" ","").length()-1;

       String boslukOlmayanKarakter=k.substring(boslukOlmayanKarakterIndex);

        System.out.println("boslukOlmayanKarakter = " + boslukOlmayanKarakter);


 //Example 6=Bir String degiskeni olusturunuz ve String in ilk ve son karakterlerinin ASCII degerlerinin toplamini bulunuz

    String l="Miami";

   char ilk= l.charAt(0);
        System.out.println("ilk = " + ilk);

   char son=     l.charAt(l.length()-1);
        System.out.println("son = " + son);

        System.out.println("Toplam "+ilk+son);//MI

        System.out.println("Toplam" +(ilk+son));//182

  // Example 7=Bir String degisken olusturunuz ve ilk karakteri disindaki tum karakterleri ekrana yazdiriniz

  String a="Java";

 String ilkHaric=  a.substring(1);

        System.out.println("ilkHaric = " + ilkHaric);//AVA


 //Example 8=Bir String degiskeni olusturunuz ve son karakteri disindaki tum karakterleri buyuk harfle yaziniz

    String b="Java";
     int sonKarakterIndex=b.length()-1;

     String sonKrkHaric=b.substring(0,sonKarakterIndex).toUpperCase();


        System.out.println("sonKrkHaric = " + sonKrkHaric);//JAV

//Example 9=Bir String degiskeni olusturunuz ve ekrana ilk ve son karakter haric tum karakterlri buyuk harfle yaziniz

    String c="Java";
    int sonkrk=c.length()-1;
    String ilkSonHaric=    c.substring(1,sonkrk).toUpperCase();

        System.out.println("ilkSonHaric = " + ilkSonHaric);//AV


//Example 10=Bir String in ortadaki herhangi bir konumunda yalnizca tek bir bosluk karakteri olup olmadgini kontrol etmek icin kod yaziniz

        String d="Tom Hanks ";
      String trimlenmis=  d.trim();
      boolean boslukHaricSilinmis =trimlenmis.replaceAll("\\S","").length()==1;

        System.out.println("boslukHaricSilinmis = " + boslukHaricSilinmis);//true


//Example 11= Bir String in basinda ve sonunda bosluk karaktesi olup olmadigini kontrol etmek icin kod yaziniz

        String m="Tom";
      String trim=  m.trim();
     boolean sonuc=   m.equals(trim);// eguals ile m ve trimlenmis hali karsilstiriliyor ayni mi diye soruluyor
        System.out.println("sonuc = " + sonuc);



  //Example 12=Bir String in basinda buyuk harf ve sonunda nokta olup olmadigini kontrol etmek icin bir kod yaziniz


    String  h="Tom Hanks.";

     char ilkharf=h.charAt(0); char sonHarf=h.charAt(h.length()-1);
     boolean ilkHarfBuyukMu=ilkharf>='A'&&ilkharf<='Z';

        boolean  sonHarfNoktaMi=sonHarf=='.';

        boolean ilkHarfbuyukSonHarfNoktaMi=ilkHarfBuyukMu&&sonHarfNoktaMi;

        System.out.println("ilkHarfbuyukSonHarfNoktaMi = " + ilkHarfbuyukSonHarfNoktaMi);


     /*
     Example 13= bir parola olusturun
     bosluk icermesin
     8 karakter olsun
     en az bir sembol olsun
      */


        String sifre="!1a23b4?es";

       boolean sifre1= sifre.length()>9;
      boolean sifre2= !sifre.contains(" ");
      boolean sifre3= sifre.replaceAll("[a-zA-Z0-9]","").length()>0;

        System.out.println(sifre1&&sifre2&&sifre3);


     //Example 14=Bir String in belli bir tek karaktere sahip olup olmadigini bulmak

     String f="Java";
  boolean sonuc1=   f.contains("v");
        System.out.println("sonuc1 = " + sonuc1);


   //Example 14=kitap ve gomlek fiyatlarini toplami
        String gomlekFiyat="$12.99";
        String kitapFiyat="$35.99";

     String gFiyat=   gomlekFiyat.replaceAll("[^0-9]","");
        System.out.println(gFiyat);
     String kFiyat=     kitapFiyat.replaceAll("[^0-9]","");
        System.out.println(kFiyat);


  double x=Double.valueOf(gFiyat);
  double y=Double.valueOf(kFiyat);

        System.out.println("toplam" +(x+y));

   // Examle 15=size verilen bir String ismin adinin ve soyadinin bas harflerini aliniz

   String u="Tom Hanks";
    char  ch1=  u.charAt(0);
   char ch2=   u.split(" ")[1].charAt(0);
        System.out.println(" "+ch1+ch2);


   // Example 16=Bir String de kullanilan noktalama isaterlerinin sayisini bulmak icin bir kod yaziniz

   String p="Vay be! Ali 13 yasinda ama universite ogrencisi.";

  int kacTane= p.trim().replaceAll("[a-zA-Z-0-9]","").replaceAll(" ","").length();

        System.out.println("kacTane = " + kacTane);



         /*
        soru 17)Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
         */
        String str="omer faruk ";
        int sonkarakterindex=str.trim().length()-1;
        String sonkarakter=str.substring(sonkarakterindex,sonkarakterindex+1);
        System.out.println("son karakter : " +sonkarakter);





    }

}
