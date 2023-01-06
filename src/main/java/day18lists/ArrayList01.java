package day18lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {

        List<Integer> nums=new ArrayList<>();

        nums.add(37);
        nums.add(38);
        nums.add(39);
        nums.add(40);
        nums.add(41);
        nums.add(42);
        System.out.println("nums = " + nums);

        //arraylist bosmu
      boolean bosMu=  nums.isEmpty();
        System.out.println("bosMu = " + bosMu);//false

//Example 1: nums ArrayList'indeki tum tek sayilari 11
// artirdiktan sonra ekrana yazdiriniz



//nums = [37, 38, 39, 40, 41, 42]
        for(Integer w:nums){
         if(w %2!= 0){
         nums.set(nums.indexOf(w), w+11 );//numaralardan olan listeyi degistir
         }                               //nums listesine git 37 indexsini getir indexof indexi getirir
        }
        System.out.println(nums);//[48, 38, 50, 40, 52, 42]

        //2. Yol
        int idx = 0;
        for (Integer w : nums) {
            if (w % 2 == 1) {
                nums.set(idx, w + 11);
            }
            idx++;
        }
        System.out.println(nums);


        //listlerde eleman silme
        //Example=nums Array lstten 52 rakaminin ilk gorunumunu siliniz

        nums.add(52);
        nums.add(36);
        nums.add(52);

        System.out.println("nums = " + nums);//nums = [48, 38, 50, 40, 52, 42, 52, 36, 52]

        /*
        remove() methodunun icerisine tam  sayi yazarsaniz java bunu index
        kabul eder.Silinecek eleman olarak algilamaz
        Tum tam sayilar aksi belirtilmedikce primitive(int)dir
        Primitive data type lari da ArrayList`lerin elemani olamaz.
        Primitive Data Type`larini Wrapper class`a cevirmeliyiz
         */

        Integer sayi=52;//wrapper e donusturduk
        nums.remove(sayi);
        System.out.println("nums = " + nums);//ilk 52 yi sildi[48, 38, 50, 40, 42, 52, 36, 52]


        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println("names = " + names);//names = [Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> emekliOlacaklar = new ArrayList<>();

        emekliOlacaklar.add("Thomas");
        emekliOlacaklar.add("Tahsin");
        emekliOlacaklar.add("Trump");
        System.out.println("emekliOlacaklar = " + emekliOlacaklar);//emekliOlacaklar = [Thomas, Tahsin, Trump]

        names.removeAll(emekliOlacaklar);
        System.out.println("names = " + names);//names = [Tom, Taceddin]

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println("a = " + a);//a = [Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]
        // Ex : a Listesindeki shoes elemaninin ilk gorunumunu siliniz

        a.remove("Shoes");
        System.out.println("a = " + a);//a = [TV, Radio, Laptop, Shoes, Book, Shoes]ilk shoesi sildi


        //Ayyary listte coklu data olup olmadigini nasil kontrolederiz
        //containsAll()==>bir listin icinde coklu eleman olup oladigini kontrol eder hepsi varsa true en az bir tanesi yoksa false verir.

        List<String> myNames = new ArrayList<>();

        myNames.add("Burcu");
        myNames.add("Can");
        myNames.add("Zisan");
        myNames.add("Emre");
        myNames.add("Bilal");
        myNames.add("Gul");

        System.out.println("myNames = " + myNames);//myNames = [Burcu, Can, Zisan, Emre, Bilal, Gul]

        List<String> varMi = new ArrayList<>();


        varMi.add("Burcu");
        varMi.add("Bilal");
        System.out.println("varMi = " + varMi);//varMi = [Burcu, Bilal]

     boolean result=   myNames.containsAll(varMi);
        System.out.println("result = " + result);//true

//INTERVIEW Sorusu

//Verilen bir Listteki elemanlari tekrasiz olarak yazdirma

        List<Integer> y = new ArrayList<>();
        y.add(2);
        y.add(3);
        y.add(2);
        y.add(2);
        y.add(5);

        System.out.println("y = " + y);//y = [2, 3, 2, 2, 5]

        List<Integer> yeni = new ArrayList<>();

        for(Integer w:y){
           if(!yeni.contains(w)){//yeni  w yuyu iceriyor mu ! var yani icermezse w yuyu yeniye ekle

               yeni.add(w);
           }
        }
        System.out.println("yeni = " + yeni);//yeni = [2, 3, 5]


//Example 2: Musterinizin istedigi urunun stoklarinizda olup olmadigini
//gosteren kodu yaziniz.
//Stokta varsa o urunu "Ayrildi" ya ceviriniz yoksa o urunu  List'e ekleyiniz
//           [A, K, R, S]  ==> R  ==> [A, K, Ayrildi, S]
//           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]

        Scanner input=new Scanner(System.in);

        List<String> c = new ArrayList<>();

        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        String urun="";

        do {
            System.out.println("lutfen istediginiz urunun harfini giriniz");
          urun=  input.next().substring(0,1);

          if(c.contains(urun)){
              c.set(c.indexOf(urun),"ayrildi");//c listine git eger o urun varsa ayir
          }else if(!urun.equals("Q")){
            c.add(urun);//urun yoksa ekle
          }
            System.out.println(c);
        }while (!urun.equals("Q"));//Q girdiginde birakir



//Example 1:Bir List'teki elemanlardan birbirine en yakin olan ikisini bulunuz
//              [12, 19, 15, 30, 21]  ==>  19 ve 21

        List<Integer> numbers= new ArrayList<>();

        numbers.add(12);
        numbers.add(19);
        numbers.add(15);
        numbers.add(30);
        numbers.add(21);

        System.out.println(numbers);//[12, 19, 15, 30, 21]
        Collections.sort(numbers);
        System.out.println(numbers);//[12, 15, 19, 21, 30]

        int minFark=Integer.MAX_VALUE;//default olarak max. sayiyi atadim ki iki sayi karsilastirdigindaher halkuarda listede ki sayi seilsin diye

        for (int i = 1; i <a.size()  ; i++) {

            minFark=Math.min(minFark,numbers.get(i)-numbers.get(i-1));

        }
        System.out.println(minFark);

    }
}
