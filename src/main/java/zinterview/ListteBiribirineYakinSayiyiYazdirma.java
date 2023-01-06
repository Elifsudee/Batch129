package zinterview;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListteBiribirineYakinSayiyiYazdirma {
    public static void main(String[] args) {

        //Interview sorusu
        //Example 1=Integer bir list olusturunuz
        // bu list`de birbirine en yakin iki tam sayiyi yaziniz
        //[12,23,9,11,35]===>12,11

        List<Integer> a= new ArrayList<>();

        a.add(12);
        a.add(16);
        a.add(19);
        a.add(11);
        a.add(13);

        System.out.println("a = " + a);

        Collections.sort(a);

        System.out.println("a = " + a);


        int minFark=a.get(1)-a.get(0);

        System.out.println("minFark = " + minFark);

        for (int i = 1; i <a.size() ; i++) {

          minFark=  Math.min(minFark,a.get(i)-a.get(i-1));
        }

        for (int i = 1; i <a.size() ; i++) {

            if(a.get(i)-a.get(i-1)==minFark){
                System.out.println(a.get(i) +"ve"+a.get(i-1));

            }
        }
    }
}
