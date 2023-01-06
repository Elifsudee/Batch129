package veriablespractive4;

import java.util.Scanner;

public class C01_Nesdetloop {
    public static void main(String[] args) {


        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun

/*


^
^^
^^^
^^^^
^^^^^
|||
|||
|||
|||
|||
*/


        Scanner input= new Scanner(System.in);

        System.out.println("Agacin tac uzunlugunu giriniz");

        int tac= input.nextInt();

        String yaprak ="";

        for (int i = 1; i <tac ; i++) {//satir kontrolu

            yaprak+="^";
            System.out.println(yaprak);

        }

        for (int i = 1; i <5 ; i++) {
            System.out.println("|||");

        }









    }
}
