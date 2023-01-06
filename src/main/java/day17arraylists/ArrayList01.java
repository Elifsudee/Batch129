package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList01 {

    /*
    1-ArrayList`ler coklu data depolamak icin kullanilir.Arraylerde coklu data depolar
    2-ArrayListler non-primitive data data type`indeki coklu datalri depolamak icin kuullanilir
    list`ler "non-primitive" data kabul ederler,Array`ler"primitive" data veya "referance" konur.
    3-ArrayList`leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
    ArrayListler(List) eleman sayisinda "Flexible"(sebest) dirlar.Ama Array ler "Flexible"degildirler.
    4-Madem Array`ler eleman sayisinda flexible degil nicin Java "Array`leri iptal etmedi?
      i)Eleman sayisi belli olan datalri depolamak icin Array`ler tercih edilir
      ii)Arrayler cok hizli calisir
      iii)Array`ler memoride cok az yer kaplar

     */
    public static void main(String[] args) {

   //List nasil olusturulur

        ArrayList<Integer> ages=new ArrayList<>();

        System.out.println(ages);//[]

   // List`lere eleman nasil eklenir
//Liste eleman eklemek icin "add()" methodunu kullaniriz.add() methodu elemanlari sizin verdiginiz
        //siraya gore ekler buna Insertion Order denir.

        ages.add(12);

        ages.add(9);//bizim verdigimiz siraya gore listin icine dizer
        ages.add(10);
        ages.add(888);
//araya koymak icin

        ages.add(1,656);
        ages.add(3,777);


        System.out.println(ages);

        //Liste coklu eleman nasil eklenir veya List`e baska bir list nasil eklenir
        //Bir Liste coklu eleman eklemek icin o elemanlari once bir list`in icine koymalisiniz

        ArrayList<Integer> newAges= new ArrayList<>();

        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        System.out.println(ages);//[12, 656, 9, 777, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages);//[12, 656, 8, 9, 10, 9, 777, 10, 888, 8, 9, 10]

// Bir list deki burun elemanlari clear ile sileriz

//        ages.clear();
//        System.out.println(ages);//[]


        //contains() metdhodu bir elemanin var olup olmadigini kontrol eder.
   boolean result=     ages.contains(656);

        System.out.println(result);

//Bir Lis in baska bir List ile ayni olup oladigini nasil kontrol ederiz
 //Iki List`in esit olabilmesi icin ayni index`de ayni eleman olamli eguals

    ArrayList<String> names1=new ArrayList<>();

    names1.add("Tom");
    names1.add("Jim");
    names1.add("Kim");

        ArrayList<String> names2=new ArrayList<>();

        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s=names1.equals(names2);
        System.out.println(s);//false;


     //Example=Vrilen iki Integer List`te tamamiyle ayni elemanlarin olup olmadigini kontrol ediniz

        ArrayList<Integer> numbers1= new ArrayList<>();

        numbers1.add(12);
        numbers1.add(13);
        numbers1.add(14);
        numbers1.add(15);


        ArrayList<Integer> numbers2= new ArrayList<>();

        numbers2.add(15);
        numbers2.add(14);
        numbers2.add(13);
        numbers2.add(12);

        Collections.sort(numbers1);
        Collections.sort(numbers2);

     boolean result1=numbers1.equals(numbers2);
        System.out.println(result1);


    }
}
