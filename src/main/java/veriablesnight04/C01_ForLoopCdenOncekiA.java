package veriablesnight04;

import java.util.Scanner;

public class C01_ForLoopCdenOncekiA {
    public static void main(String[] args) {

 /*
   Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
ilk 'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
*/
      // alacakaranlik==>2

        Scanner input=new Scanner(System.in);

     System.out.println("Lutfen c ve a harflrini iceren bir ifade giriniz");

      String str=  input.nextLine().toLowerCase();

     int sayac=0;//+==>0 *==>1 str==>"" boolean==>true

        if(str.contains("a")&&str.contains("c")){


            for (int i = 0; i <str.length() ; i++) {

                if(str.charAt(i)=='a'){

                    sayac++;

                }else if(str.charAt(i)=='c'){
                    break;

                }//else if
            }//for
            System.out.println(" c den onceki a larin sayisi :" +sayac);//forun disinda yazdiracagiz islemleri gormemek icin

        }else{
            System.out.println("Lutfen 'c' ve 'a' harflerini iceren bir cumle giriniz");
        }

        //2 yol

        int counter=0;
        for (int i = 0; i <str.indexOf("c") ; i++) {
            if (str.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println(counter);








    }
}
