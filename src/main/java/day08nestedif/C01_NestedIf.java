package day08nestedif;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class C01_NestedIf {
    /*
    Task: kullanicida 3 pozitif bir tam sayi aliniz
    bu uc sayinin ucgen olusturma durumunu kontroledeniz
    Eger ucgen ise es kenar ucgen olam durumunu kontrol ediniz

    INFO : ucgen ola sarti :herhangi iki kenar toplami ucuncu kenardan buyuk olmali
    herhangi iki kenar farki ucuncu kenardan kucuk olamli
    a+b>c>a-b
    a+c>b>a-c
    b+c>a>b-c

    a=b=c ise eskenar ucgen
java nested kolari calistitiken cok zaman harciyot buna "time comlexity"denir.mumkunse nested ile ilgili kod yaziniz.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ucgenin uc kenar uzunlugunu giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {//buyuk if ucgen ola durumu

            if (a == b && b == c && a == c) {
                System.out.println("eskenar ucgen");
            } else {
                System.out.println("ucgen amaes keanr ucgen degil");
            }

        } else {//ucgen olmama durumu
            System.out.println("ucgen degil");
        }




        //kullanıcıdan bir ucgenin kenar uzunlugunu aliniz.Uc kenari biribirine esit ise "es kenar ucgen" yazdiriniz
        //sadece iki kenar uzunlugu biribirine esit ise "ikizkenar ucgen"yazdirin
        //tum kenarlari birbirinden farkli ise "cesit kenar" ucgen yazdiriniz.

        System.out.println("Ucgenin uc kenarini giriniz");

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if(x+y>z&&x-y<z&&x+z>y&&x-z<y&&y+z>x&&y-z<x){
            if(x==y&&y==z){
                System.out.println("Eskenar Ucgen");
            }else if(x==y||y==z||x==z){
                System.out.println("Ikizkenar Ucgen");
            }else{
                System.out.println("Cesitkenar Ucgen");
            }
        }else{
            System.out.println("Ucgen degil");
        }









    }//main


}//class
