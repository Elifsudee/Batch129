package zinterview;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysKarakterSayisi {
    public static void main(String[] args) {
      /*  INTERWIEW QUESTIONS
        Kullanicidan bir String aliniz.
        String'de var olan her character'in sayisini ekrana yazdiriniz.
        Ornek: ==> a = 3, l = 1, c = 1, n = 1
        abaa   ==> a=3  b=1
                */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");

       String s= input.nextLine();
      String arr[]=  s.split("");

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int counter=0;

        for (int i = 1; i <arr.length ; i++) {

            if(arr[i-1].equals(arr[i])){
                counter++;
            }else{


                System.out.println(arr[i-1] +" harf "+(counter+1)+" kadar tekrarlandi");
                counter=0;
            }

            if(i==arr.length-1){
                System.out.println(arr[i] + " harf " + (counter+1) +" kez tekrarlandi");
            }

        }

    }
}
