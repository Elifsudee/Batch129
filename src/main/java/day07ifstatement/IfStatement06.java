package day07ifstatement;

import java.util.Scanner;

public class IfStatement06 {
    public static void main(String[] args) {
        /*
           kullanıcıdan yas degerini alan ve ve yasin hangi evrede oldugunu yazdiran kodu olusturunuz

         0-4 bebek, 5-12 cocuk, 12-20 genc, 21-30 yetiskin
         30 ustu  tanimlanmamiş evre, hata mesaji olarak gecerli bir yas giriniz
         */



            Scanner input= new Scanner(System.in);
            System.out.println("lutfen yasinizi giriniz");

            int age=input.nextInt();

            if(age<0){
                System.out.println("Hatali Mesaj");
            }else if(age<5){
                System.out.println("Bebek");
            }else if(age<13){
                System.out.println("Cocuk");
            }else if(age<21){
                System.out.println("Genc");
            }else if(age<31){
                System.out.println("Yetiskin");
            }else{
                System.out.println("Tanimlanmamiş....");

            }





    }


}
