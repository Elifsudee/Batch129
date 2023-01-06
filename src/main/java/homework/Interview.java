package homework;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Interview {
    public static void main(String[] args) {

//soru1=

           int sayi=341;
           int toplam=0;
           while (sayi>0){

           toplam=  toplam + sayi%10;
               sayi/=10;
           }

        System.out.println(toplam);



//soru2=Carpimtablosu

        int carpim=1;
        int num=5;

        while(carpim<11){

            System.out.println(num+"x"+carpim+"="+(num*1));
           carpim++;
        }

/*
soru 3=

    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    12345678910

 */

        for (int i = 1; i <=10 ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


/*
soru4
Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *


 */




        for (int i = 1; i <=6 ; i++) {

            for (int bosluk =6; bosluk >=i ; bosluk--) {
                System.out.println(" ");
            }
            for (int j = i; j <=6 ; j++) {
                System.out.print("* ");
            }
        }

        for (int i = 1; i <= 6; i++) {

            for (int bosluk = 1; bosluk < i; bosluk++) {//Boşluk Kontrolü
                System.out.print(" ");
            }

            for (int j = i; j <= 6; j++) {//Sütun Kontrolü
                System.out.print("* ");
            }

            System.out.println();//Satır Kontrolü
        }































}

    }