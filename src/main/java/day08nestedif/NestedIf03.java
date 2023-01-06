package day08nestedif;

import java.util.Scanner;

public class NestedIf03 {

    public static void main(String[] args) {

     /*
        Password'un ilk harfi buyuk harf ise

        'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin

        Passwordun ilk harfi kucuk harf ise
        'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
        A ==> gecerli
        B C Ç D E F G Ğ H İ I J K L M N O Ö P R S Ş T U Ü V Y Z==> gecersiz
        a b c ç d e f g ğ h i ı j k l m n o ö p r s ş t u ü v y ==> gecersiz
        z ==>gecerli

*/

        Scanner input = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz");
        String pwd = input.nextLine();
      char firstChar= pwd.charAt(0);

        if (firstChar >= 'A' && firstChar <= 'Z') {
            if (firstChar == 'A') {
                System.out.println("gecerli");
            } else {
                System.out.println("gecersiz");
            }
        } else if (firstChar >= 'a' && firstChar <= 'z') {
            if(firstChar=='z'){
                System.out.println("gecerli");
            }else{
                System.out.println("gecersiz");
            }

        }else{
            System.out.println("ilk karakter olmali");
        }










    }
}
