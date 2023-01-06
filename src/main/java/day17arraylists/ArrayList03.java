package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Kayseri");
        cities.add("Almaty");

        System.out.println(cities);
//remove() methodu index ile kullanilirsa o index teki elemani siler
//remove methodu index ile kullanilirsa size sildigi elemani verir.
        cities.remove(1);
        System.out.println(cities);

    String n=    cities.remove(1);
        System.out.println(n);

//remove() methodu eleman ile kullanilirsa ilk gorunumu siler.
        //remove() methodu eleman ile kullanilirsa size elemani silip silmedigini ifade eden
        //true veya false verir
       // Eger eleman List`te var ise o elemani siler ve size true der
        //Eger eleman List te yok ise o elemani silemediginden size false verir.
        cities.remove("Kayseri");
        System.out.println(cities);

     boolean p=   cities.remove("Kayseri");
        System.out.println(p);






    }
}
