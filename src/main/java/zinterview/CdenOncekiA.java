package zinterview;

import java.util.Scanner;

public class CdenOncekiA {
    public static void main(String[] args) {

             /*Soru 1=
       Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
       ilk 'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
    */
        // alacakaranlik==>2

        Scanner input = new Scanner(System.in);

        System.out.println("Bir ifade giriniz");
        String kelime = input.nextLine();

        int counter=0;

        for (int i = 0; i <kelime.length() ; i++) {

            if(kelime.charAt(i)=='a'){
                counter++;
            }
            if(kelime.charAt(i)=='c'){
                break;
            }

        }
        System.out.print(counter);
    }
}
