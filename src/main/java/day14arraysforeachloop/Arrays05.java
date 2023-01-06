package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //note: short() methodu sayisal data type lerini kucukten buyuge siralar(asendig order)
        //note: short() methodu String data type lerini alfabetik olarak siralar(alphabetical order)

        // note: asceding order+ alphabetical order====>Natural Order
      // sorth() methodu arrray elemanlarini "Natural Order" agore siralar

        //binarySearch() methodu bir elemanin bir array de olup olamadigini kontrol etmek icin kullanilir
        // binarySearch() methodunu kullanmadan once "short" methodunu kullanmak zorundayiz
        // sort() methodunu kullanmazsaniz buldugunuz sonuc guvenilir olmaz


        String colors[]=new String[6];

        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";


              Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));//[Blue, Brown, Green, Orange, Red, Yellow]


         int num=     Arrays.binarySearch(colors,"Blue");

        System.out.println(num);//0 ==> var hem de indexi sifir

        int num1=     Arrays.binarySearch(colors,"Orange");

        System.out.println(num1);//3 == var hem de indexi 3


        int num2=     Arrays.binarySearch(colors,"Elif");

        System.out.println(num2);//-3 =="-" bu eleman yok olsaydi 3 eleman olurdu




    }
}
