package zinterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirbirineYakinTamSayi {

    public static void main(String[] args) {

        // soru 1=birbirine en yakin farklari veren sayilari yazdiriniz

        List<Integer> sayi=new ArrayList<>();
        sayi.add(12);
        sayi.add(23);
        sayi.add(9);
        sayi.add(11);
        sayi.add(35);
        Collections.sort(sayi);
        int min=sayi.get(1)-sayi.get(0);

        for (int i = 1; i <sayi.size() ; i++) {
            min=  Math.min(min,sayi.get(i)-sayi.get(i-1));
        }
        for (int i = 1; i <sayi.size() ; i++) {
            if(sayi.get(i)-sayi.get(i-1)==min){
                System.out.println(sayi.get(i)+"ve"+sayi.get(i-1));
            }
        }

    }
}
