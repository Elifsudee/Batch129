package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

        //Example1= Integer list olusturunuz, 5 eleman ekleyiniz , bu elemanlardan 12 yi siliniz

        List<Integer> ages = new ArrayList<>();

        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(40);

        System.out.println(ages);//[10, 25, 12, 8, 40]

        //Siz java da tam sayi yazdigimnizda ,Java o tam sayinin data typeni otomatik olarak int kabul eder
        //Bu yuzden remove() methodunun icine yazdiginiz tam sayiyi eleman olrak degil index olarak kabul edilir
        //  Tam sayiyi eleman olarak gostermenin birkac yolu vardir
        //bu yuzden ages.remove(12)== seklinde silemayiz 12 nin index olamadigini anlatmaliyiz wrapper cevirmeliyiz

        //1.yol
        Integer nonPrimitive = 12;
        ages.remove(nonPrimitive);
        System.out.println(ages);//[10, 25, 8, 40]
//
//        //2.yol
//        ages.remove((Integer) 12);//tavsiye edilen recomemmended
//
//        //3 yol
//        ages.remove(Integer.valueOf(12));
//
//        //4 yol
//        ages.remove(ages.indexOf(12));
//        //remove methodu sadece ilkini siler iki tane 12 olsa ilk 12yi siler


          //Example 2 tum 12 leri silelim


        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);

        System.out.println("nums = " + nums);//nums = [10, 25, 12, 8, 12]

        List<Integer> silinecek=new ArrayList<>();
        silinecek.add(12);

        //Not=RemoveAll() methodu list ile calisir.
        // removeAll() methodu bir veya birden fazla elemanin elemanin tum gorunumlerini silmek icin kullanilir

        nums.removeAll(silinecek);

        System.out.println("nums = " + nums);//nums = [10, 25, 8]



    }
}
