package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {

        //Ex 1) 21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tam sayilari ekrana yazdiran kodu yazdirin

        for(  int i=21    ;   i<181      ;  i++   ) {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println();

        // Ex 2) Size verilen kucuk harfle yazilmis string in idex`i cift sayi aolan character`lerini buyuk harf yapiniz
        //   ankara===> AnKaRa
// yazdiginiz code belli senaryolar icin calisiyor tum senaryolar icin calismiyorsa bu code "hard-code" denir bu code yanlis
        //yazilmistir duzeltilmelidir

        // Bir string`de son index = lengt() -1

 String s ="ankara";

 String s2="";
        for(  int i=0    ; i<s.length()     ;   i++  ){

            String ch=s.substring(i, i+1)   ;

            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }

        }







    }
}
