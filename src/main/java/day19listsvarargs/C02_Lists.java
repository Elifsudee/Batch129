package day19listsvarargs;

import java.util.*;

public class C02_Lists {

    public static void main(String[] args) {

        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
                *  1. Kullanicidan ismini isteyelim
                *  2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
                *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
                *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
                *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
                */


        List<String> databaseIsim=new ArrayList<>();


      databaseIsim.add("Ayse");
      databaseIsim.add("Ahmet");
      databaseIsim.add("Serdar");
      databaseIsim.add("Okan");
      databaseIsim.add("Betul");

        System.out.println("databaseIsim = " + databaseIsim);


        Scanner input=new Scanner(System.in);

        //1.Adim kullanmak istedigini kullanici adinini aliriz

        System.out.println("Kullanici adinizi giriniz");


        //2 adimda bosluklari sildim ve hepsinini buyuk yaptim
        String username=   input.nextLine().toUpperCase().trim();


     //3. adimda adininin kullanilabilir olup olamdigini databaseile kiyalayacagizz

        if(databaseIsim.contains(username)){

            System.out.println("Kullanici adi zaten alinmis");
        }else{

            System.out.println("Bu kullanici adini alabirsiniz");
        }

       if(databaseIsim.contains(username)){

           int rastgeleSayi =new Random().nextInt(100);//random methodu ile rastgele bir sayi uretiyor

          username= username+""+rastgeleSayi;//conkat yapmasi icin ""

           System.out.println("Yeni kullanici adi olarak bunu kullanabilirsin "+username);

       }else{

           System.out.println("Yeni kullanici adi : " +username);
       }


    }
}
