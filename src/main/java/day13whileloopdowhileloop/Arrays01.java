package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a=12;//bu yaninin icinde sadece bir tane data depolanabilir
        //Ama biz yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        // Bir yapinin coklu data depolayabilme icin Java "Array" yapisi olusturmustur.


        // Array nasil olusturulur?
        // Array olusturmak icin Array elemanlarinin "data type1"i ve "eleman" sayisi mutlaka yazilmalidir
        String studentNames[]=new String[5];

        //Array nasil yazdirilir
        // toString() methodu kullanmadan sadece array ismi yazdirirsaniz Java o Array1in adresini yazdirir.
        System.out.println(Arrays.toString(studentNames));//[null, null, null, null, null]


       // Array`e eleman ekleme nasil yapilir
        studentNames[0]="Cuneyt";

        studentNames[1] ="Kemal";

        studentNames[2]="Ajda";

        studentNames[3]="Ezel";


        studentNames[4]="Besir";
        System.out.println(Arrays.toString(studentNames));


        //Arry` den bir elemani alma

        System.out.println(studentNames[2]);


        //Example 1:Array deki her elemanin sonuna "!" koyarak ekrana yazdiriniz

        for (int i = 0; i < studentNames.length ; i++) {
            System.out.println(studentNames[i] + "!");
        }



    }
}
