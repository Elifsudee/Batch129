package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ClaraPractive {

    public static void main(String[] args) {


    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */

      /*  Bir tamsayı bağımsız değişkenini kabul eden isEven adında bir method yazın.
                Argüman çift ise yöntem true, aksi takdirde false döndürmelidir.
                */

        System.out.println(isEven(5));
        System.out.println(isEven(-8));
    }


    public static boolean isEven( int a){
    return (a%2)==0;
    }


}
