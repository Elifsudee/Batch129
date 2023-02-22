package homework;

import java.util.*;

public class Work {
    public static void main(String[] args) {
//Listi tekrarsiz yazdirma
        List<Integer> sayi = new ArrayList<>();
        sayi.add(2);
        sayi.add(3);
        sayi.add(2);
        sayi.add(2);
        sayi.add(5);

        List<Integer> sayi2 = new ArrayList<>();

        for (Integer w:sayi) {
           if(!sayi2.contains(w)){
               sayi2.add(w);
           }
        }
        System.out.println(sayi2);

    }

}

