package zinterview;

import java.util.ArrayList;
import java.util.List;

public class ListtekiElemanlariTekrarsizYazdirma {
    public static void main(String[] args) {


        //INTERVIEW Sorusu

        //Verilen bir Listteki elemanlari tekrasiz olarak yazdirma
        //[2,3,2,2,5] ==>[2,3,5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> b = new ArrayList<>();

        for (Integer w : a) {

            if(!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);

    }
}
