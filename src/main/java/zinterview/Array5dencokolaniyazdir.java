package zinterview;

import java.util.Arrays;

public class Array5dencokolaniyazdir {
    public static void main(String[] args) {

        // Example 1 = String bir array olusturunuz, 6 tane eleman yerlestiriniz, character sayisi 5 den cok olan elemanlari siliniz
        String colors[]=new String[6];

        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

     int elemanSyisi=0;

       for(String w :colors){

           if(w.length()<=5){
               elemanSyisi++;
           }

       }

        System.out.println("elemanSyisi = " + elemanSyisi);

        String newColor[]= new String[elemanSyisi];

        int idx=0;

        for(String w :colors){
            if(w.length()<=5){
                newColor[idx]=w;
                idx++;
            }
        }

        System.out.println(Arrays.toString(newColor));





    }
}
