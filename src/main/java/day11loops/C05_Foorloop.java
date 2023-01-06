package day11loops;

import java.util.Scanner;

public class C05_Foorloop {

    public static void main(String[] args) {


        // 5'den 10'a kadar tamsayilarin toplamini bulan kodu yaziniz

        int sum=0;
        for (int i =5; i <11 ; i++) {
           // sum=sum+i; veya
            sum+=i;

        }

        System.out.println(sum);


//ornek 6 dan 3 kadar olan tam sayilarin carpimi

        int multiply=1;

        for (int i = 6; i >2 ; i--) {
           // multiply=multiply*i; veya
            multiply*=i;
        }//for body

        System.out.println("Multiply " +multiply);



        //ornek bir tam rakamlainin toplamini yazan kodu olusturunuz

        Scanner input=new Scanner(System.in);

        System.out.println("bir tam sayi giriniz");

        int num =input.nextInt();

        num = Math.abs(num);

        int sonuc =0;//toplamada sifir carpmada 1 kullanilir default degeri olarak

        for (int i = num; i >0 ; i=i/10) {

           sonuc= sonuc+i%10;

        }//for
        System.out.println(sonuc);





        // 5 den 9ye

int b=0;
        for (int i = 5; i <10 ; i++) {
            b=b+i;
        }

        System.out.println(b);

//6 dan 3 e kadr olan

        int bos=1;

        for (int i = 6; i >2 ; i--) {

            bos=bos*i;
        }

        System.out.println(bos);

        int sayi=456;
        int boss=0;

        for (int i = sayi; i <0 ; i=i/10) {
            boss=boss%10;
        }

        System.out.println(boss);


    }
}
