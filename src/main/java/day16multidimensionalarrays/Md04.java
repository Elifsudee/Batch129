package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {

   //Bir multi-dimensional array olusturunuz ve bir dimensionalli array donusturunuz.
   // [[2,5],[3],[4,7,11]]==>[2,5,3,4,7,11]

  int a[][]={{2,5},{3},{4,7,11}};

        System.out.println(Arrays.deepToString(a));
//a array indeki toplam eleman sayisi
       int totalEleman=0;
        for(int[] w :a){
       totalEleman=     totalEleman+a.length;
        }
        System.out.println(totalEleman);

        // "b" isimli tek dimensional`li bir array olusturunuz

        int b[]=new int[totalEleman];
        System.out.println(Arrays.toString(b));

    // "a" array indeki elemanlari "b" arrayine transfer ediniiz
    int idx=0;

    for(int[] w :a) {

        for(int k:w){
           b[idx]=k;
           idx++;
        }

    }
        System.out.println(Arrays.toString(b));


    }
}
