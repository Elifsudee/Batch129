package day17arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        //ArrayList olusturulurken sag tarafa(constructor) ArrayList yazmak zorundayiz
        //Ama sol tarafa ister "ArrayList" yazin isterseniz de"List" yazin, ikisi de calisir.


        //   ArrayList<Character> initials = new ArrayList<>();

        List<Character> initials = new ArrayList<>();//boyle de yapilir

        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');//listlerin icine ayni elemanlari koyabiliriz

        //Bir list`de kac eleman oldugunu nasil anlariz

        int numOfElement = initials.size();//eleman sayisi
        System.out.println(numOfElement);//4

        //not=Arraylerden bahsederken "Length" kullanin
        //not= List`lerde bahsederken "size" kullanin

        //Bir List`ten istenen bir eleman nasil alinir

        char u = initials.get(2);
        System.out.println(u);//u


        //Example 1=Verilen bir String Lis`deki tum elemanlarin toplam character sayisini bulan kodu yaziniz

        List<String> cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        //1.yol
        int sum = 0;
        for (String w : cities) {
            sum = sum + w.length();

        }
        System.out.println(sum);

        //2 yol

        int toplam = 0;
        for (int i = 0; i < cities.size(); i++) {

            toplam = toplam + cities.get(i).length();
        }

        System.out.println(toplam);


        //Bir list`deki istenen bir elemani nasil degistirebilir

        cities.set(0, "New York");
        System.out.println(cities);//Miami giiti New York geldi

        //Example 2:Maas list`i olusturunuz ve maaslara %20 zam yapiniz 1.20 ile

        List<Double> salary = new ArrayList<>();

        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);
        int idx=0;
        for(Double w : salary){

          salary.set(idx , w*1.20);

          idx++;
        }
        System.out.println(salary);


        for (int i = 0; i <salary.size() ; i++) {

            salary.set(i, salary.get(i)*1.20);
        }
        System.out.println(salary);



    }


}
