package day20passbyvaluemethodoverloding;

public class MethodOverloading01 {
    public static void main(String[] args) {


        /*
        1) Method Overloding yaparken method ismi degistirirlmez
        2) Method Overloding yaparken parametreler degistirilir
           i)Parametre degistirilrken,parametrelerin data type`lerini degistirilebilir
           ii)Parametre degistirilirken, parametrelerin data ttype`leri farkli ise yerleri degistirilir
           iii)Parametre degistirilirken, parametrlerin sayisi degistirilebilir
        3)Java icin ismi ve parametrleri ayni olan iki method tamamiyle aynidir.
        bu yuzden isi ve parametre "method Signature" olarak adlandirilir

       4)Method Overloding olusturuken return type degistirmenin hicbir etkisi yoktur.
       4)Method Overloding olusturuken acces modifieri degistirmenin hicbir etkisi yoktur.
       4)Method Overloding olusturuken methodu static  veya non-static yapmanin hicbir etkisi yoktur.
       4)Method Overloding olusturuken method bodyi degistirmenin hicbir etkisi yoktur.

       5)"private" methodlar overlood edilebilirCunku method overloding sadece bir classsin icinde olur.
       "private" olamak ise baska class`lara gidildiginde problem olur.

       6)Static methodlar overlod edilebilirler.
         */

        add(3,5);

    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void add(double a, double b){
        System.out.println(a+b);
    }

    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
