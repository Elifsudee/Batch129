package zinterview;

public class Sekiller {
    public static void main(String[] args) {


        // asagdaki sekli nestedsiz loop ile yazdiran bir program yaziniz.
        /*

               ^ ^ ^ ^ ^
               ^ ^ ^ ^ ^
               ^ ^ ^ ^ ^
               ^ ^ ^ ^ ^
               ^ ^ ^ ^ ^


         */

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print("^" + " ");
            }
            System.out.println();
        }
        System.out.println();
      /*     soru 1)  Asagidaki sekil cizen kodu yaziniz

                * * * * 1
                * * *  2
                * *  3
                *  4
                  5
                               
                */

        for (int symbol = 1; symbol <= 5; symbol++) {

            for (int i = 1; i <= (-1 * symbol + 5); i++) {
                System.out.print("* ");

            }

            System.out.println(symbol);
        }
        System.out.println();

        /*

         *
         * *
         * * *
         * * * *
         * * * * *

          // nested for loop ya diktorgen veya ucgen formatinda olabilir
           diktorgen istedigimizde iki loop icin de bagimsiz end point belirleriz
           ucgen sekli vermek icin inner loop’un end point’ini olarak outer degiskene bagli yapariz
         */


        int input = 5;
        for (int i = 1; i <= input; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();


        int input1 = 5;
        for (int i = 1; i <= input1; i++) {

            for (int j = 0; j <= input1; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();

/*
        1
        22
        333
        4444
        55555


 */
        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

/*
            a
            a b
            a b c
            a b c d
            a b c d e
       şeklini yazdırınız.
       */

        char harf = 'f';
        for (char i = 'a'; i <= harf ; i++) {

            for (char j = 'a'; j < i; j++) {
                System.out.print(j + " ");

            }
            System.out.println("");

        }


        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *


         */



        int input2 = 5;
        for (int i = 1; i <= input2; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }


        for (int i = 1; i <= input2; i++) {

            for (int j = 0; j <=input2-i; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }





    }
}
