package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Clara1Ptatice {
    public static void main(String[] args) {

     /* 1=  Kullanıcıdan bir tamsayı girmesini isteyin.
                Tamsayı 100'den küçükse, kullanıcıya "Kazandı!" deyin.
        Aksi takdirde kullanıcıya "Kayıp!" deyin.
                */
        Scanner input=new Scanner(System.in);

   int num=0;
        do {
            System.out.println("Bir sayi giriniz");
          num=  input.nextInt();

          if(num<=100){
              System.out.println("Kazandiniz");
          }

        }while (num<=100);

        System.out.println("kaybettiniz");

     //soru2=   Belirli bir sayının bir arrayde kaç kez tekrarlandığı  bulan Java programını oluşturun.

        int numbers[]={0,7,6,5,5};
        int number=5;
   int counter=0;
        for(int w: numbers){

            if(w==number){
                counter++;
            }

        }

        System.out.println(counter);


      /*  kullanıcının girdigi bir array'in en buyuk elemani ile
        en kucuk elemanının  farkını bulan bir method create ediniz.

        */
        System.out.println("lutfen eleman sayini giriniz");
          int a=input.nextInt();

        int arr[]=new int[a];

        for (int i = 1; i <=a; i++) {

            System.out.println("Lutfen" +i +". rakami giriniz");

            int eleman=input.nextInt();

            arr[i-1]=eleman;

        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0]+arr[arr.length-1]);

/*
        create one int
        do while int is less then 100
        print the number
        increment by 5
        for example: 0   5   10  15  20

        bir int oluştur, int 100'den küçükken yap, sayıyı 5 artır, örneğin: 0 5 10 15 20
     */

      do{
          System.out.println("bir sayi giriniz");
          num=input.nextInt();

              for (int i = num; i < 96; i += 5) {
                  num += 5;
                  System.out.println(num + " ");
              }



      }while (num<96);

        System.out.println("Yapilacak islem yok");

        /*
         * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
         * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
         */





    }
}
