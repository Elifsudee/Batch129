package day10switchloops;

public class Loops01 {

    public static void main(String[] args) {


        /*
        code standart
        1) tekrar(repetition) olammali
        2) Dynamic olamli
        3) Tamir(Fix) ve Update(Gelistirme) kolay olamli
         */

        // Exaple 1: Ekrana 5 kere "Hi" yazdirin
// 1 yol tavsiye edilmez

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2 yol
        //Ayni adimlar tekrar tekrar yapilmasi gerktiginde loop`lar kullanilir
        // 4 tane loop var: 1) for-loop 2)while-loop 3) do-while-loop 4)for-each-loop


        //1) for-loop
        //  Baslangic degeri  Loop `un calisma sarti    Increment/Decrement
        for ( int i=1        ;    i<6       ;             i++            ){

            System.out.println("Hi");

        }


// Ex 2) 11 den 44 e kadar tum sayilari ekrana yazdirininz

        for(  int i=11    ; i<45         ;i++    ){

            System.out.println(i);

        }


        //Ex3) 40 dan 23 e kadar tum cift sayilari ekrana yazdiran kodu yaziniz


  for(  int i=40   ; i>22      ;   i--  ){

      if(i%2==0){
          System.out.println(i);
      }

  }

  // ex 4) 18 den 56 ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz
        for(  int i=18 ; i<57    ;  i++  ){

            if(i%2!=0){

                System.out.print(i +" ");
            }
        }






    }
}
