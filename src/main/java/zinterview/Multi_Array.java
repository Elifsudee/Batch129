package zinterview;

import java.util.Arrays;

public class Multi_Array {
    public static void main(String[] args) {



        // /Bir multi-dimensional array olusturunuz ve bir dimensionalli array donusturunuz.
        // [[2,5],[3],[4,7,11]]==>[2,5,3,4,7,11]

        int a[][]={{2,5},{3},{4,7,11}};

        int num=0;
        for(int[] w :a){
         num= num+  w.length;
        }
        System.out.println(num);

        int idx=0;
        int b[]=new int[num];

        for (int[] w :a){
            for(int k :w){
                b[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));



    }
}
