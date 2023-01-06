package day08nestedif;

import java.util.Scanner;

public class NestedIf01 {

    public static void main(String[] args) {
        // Example 1: Kullanicidan 3 tane pozitif bir tamsayi aliniz.
        //          Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
        //          Eger ucgen ise "eskenar"
        //          Ucgen olma durumunu
        //          kontrol ediniz.
        //          INFO :
        //          Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
        //                           herhangi iki kenar farki ucuncu kenardan kucuk olmali
        //           a+b>c>a-b
        //           a+c>b>a-c
        //           b+c>a>b-c
        //           a=b=c ise eskenar ucgen
// kullanici yanlislikla negatif girdiyse kodu boyle yazabiliriz
        Scanner input= new Scanner(System.in);
        System.out.println("ucgenin uc kenarini giriniz");


       // double a=Math.abs(input.nextDouble());
       // double b=Math.abs(input.nextDouble());
       // double c=Math.abs(input.nextDouble());

        //kullanicinin negatif girmesini affetmiyorsaniz


        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
       boolean ucgenMi= (a+b>c&&c>Math.abs(a-b))&&(a+c>b&&b>Math.abs(a-c))&& (b+c>a&&a>Math.abs(b-c));

        if (a <= 0 || b <= 0 || c <= 0){
            System.out.println("ucgen nagatif olamaz");

        }else if(ucgenMi){
            if(a==b&&b==c&&a==c){
                System.out.println("ucgen hem de eskenar...");

            }else{
                System.out.println("ucgen ama eskenar degil");
            }
        }else{
            System.out.println("ucgen degilsin");
        }


        System.out.println("Lutfen ucgenin uc kenarini giriniz");
        double x=input.nextDouble();
        double y=input.nextDouble();
        double z=input.nextDouble();
       boolean ucgenMii= (x+y>z&&z>Math.abs(x-y))&&(y+z>x&&x>Math.abs(y-z))&&(x+z>y&&y>Math.abs(x-z));

       if(x<=0||y<=0||z<=0){
           System.out.println("ucgenin kenari negatif olamaz");
       }else if(ucgenMii){
          if(a==b&&b==c&&a==c){
              System.out.println("ucgen hemde eskenar");
          }else{
              System.out.println("ucgen ama eskenar degil");
          }
        }else{
            System.out.println("sen ucgen degilsin");
        }




















    }
}
