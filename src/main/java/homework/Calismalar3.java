package homework;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Calismalar3 {
    public static <List> void main(String[] args) {
//multidimensionalarrays

   //Example 1 Multidimensional array olustur, eleman ekle ve ve belli bir elemana nasil ulasan kodu yaziniz

      int n[][]={{3,4},{5},{7,8}};


  //Example 2=Bir integer multi-dimensional array olusturunuz toplam eleman sayisini konsola yazdiriniz


    //Example 3: Bir tane integer multidimensional array olusturunuz
     //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.


  // Example 4 = Bir multi-dimensional array olusturunuz ve bir dimensionalli array donusturunuz.
  // [[2,5],[3],[4,7,11]]==>[2,5,3,4,7,11]

            int a[][]={{4,5},{3},{4,7,11}};

  //Example 5: Bir integer multi-dimensional array olusturunuz
  //    Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz


  //Example 6= Bir multi dimensional array deki en buyuk ve en kucuk sayinin toplamini yazdiriniz



        //list nasil olusturulur **Lisstler**

       ArrayList<Integer> fiyat=new ArrayList<>();

//1=Eleman ekle, araya eleman ekle

        fiyat.add(12);
        fiyat.add(13);
        fiyat.add(15);
        fiyat.add(9);


//2=Liste coklu eleman nasil eklenir veya List`e baska bir list nasil eklenir


//3=listteki elemani silme




//4=contains() metdhodu bir elemanin var olup olmadigini kontrol eder.



//Bir Lis in baska bir List ile ayni olup oladigini nasil kontrol ederiz



 //6=Example=Vrilen iki Integer List`te tamamiyle ayni elemanlarin olup olmadigini kontrol ediniz




//7=Bir list`de kac eleman oldugunu nasil anlariz



 //8=Bir List`ten istenen bir eleman nasil alinir


//9=Example 1=Verilen bir String Lis`deki tum elemanlarin toplam character sayisini bulan kodu yaziniz

  ArrayList<String> name=new ArrayList<>();
  name.add("Elif");
  name.add("Taner");



 //11=Bir list`deki istenen bir elemani nasil degistirebilir



 //12=Example 2:Maas list`i olusturunuz ve maaslara %20 zam yapiniz 1.20 ile carp



//Example13= Integer list olusturunuz, 5 eleman ekleyiniz , bu elemanlardan 12 yi siliniz

        fiyat.remove((Integer) 7);
  //Example 13= tum 12 leri silelim
//yeni blir

//14=Interview sorusu
        //Example 1=Integer bir list olusturunuz
        // bu list`de birbirine en yakin iki tam sayiyi yaziniz
        //[12,23,9,11,35]===>12,11

        java.util.List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);






        // Example 14= Bir Integer listteki 7 haric tum elemanlarin degerlerini 3 artiriniz

          //nums =[9, 11, 12, 23, 35]

      ArrayList<Integer> sayi=new ArrayList<>();
        sayi.add(9);
        sayi.add(11);
        sayi.add(7);
        sayi.add(23);
        sayi.add(35);



        //Example 1=Elektronik ve ev aletleri listler olusturunuz
        // elektronik  ev aletlerini lisyeleyiniz

        //retinal


        //Example 2: Musterinizin istedigi urunun stoklarinizda olup olmadigini
//gosteren kodu yaziniz.
//Stokta varsa o urunu "Ayrildi" ya ceviriniz yoksa o urunu  List'e ekleyiniz
//           [A, K, R, S]  ==> R  ==> [A, K, Ayrildi, S]
//           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]



        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */


        Scanner input=new Scanner(System.in);

        System.out.println("kullanici adinizi giriniz");
       String isim= input.nextLine().trim().toLowerCase();

       ArrayList<String> isimList=new ArrayList<>();

       isimList.add("Ali");
       isimList.add("Veli;");
       isimList.add("Telli;");


       if(isimList.contains(isim)){
           System.out.println("bu isim var");
           isimList.add(isim+(int)(Math.random()*100));
       }else{
           System.out.println("bu isim kullanilabilir");
           isimList.add(isim);
       }

   /*     SAYI TAHMIN OYUNU
        Oyuncudan 1-10 arasi bir sayi isteyiniz
        Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
        Yoksa verdigi sayiyi listenize ekleyiniz.
                  Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
                  [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
                   [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
                  [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
                */


        java.util.List<String> numsList= new ArrayList<>();
        System.out.println("cikmak icin Q basiniz");
        numsList.add("5");
        numsList.add("8");
        numsList.add("2");
        numsList.add("9");




        //Interwiew Example 1:Verilen List`deki elemanlari tekrarsiz olarak yazdiriniz
        //   [2,3,2,2,5] ====>[2,3,5]

        ArrayList<Integer> num=new ArrayList<>();
        num.add(2);
        num.add(3);
        num.add(2);
        num.add(3);
        num.add(5);

        ArrayList<Integer> yeniList=new ArrayList<>();



        //Example 2=Musteriden urun ismini aliniz
        // Musterinin ismini verdigi urun listede varsa urunun ismini yazdiriniz
        //Musterinin ismini verdigi urun listede yoksa "Out of staock" yazdrin
        //cikmak istediginde Q bassin










    }
}
