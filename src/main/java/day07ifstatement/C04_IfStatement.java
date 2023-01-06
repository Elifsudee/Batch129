package day07ifstatement;

import java.util.Scanner;

public class C04_IfStatement {
    //kullanıcıdan yas degerini alan ve ve yasin hangi evrede oldugunu yazdiran kodu olusturunuz

    //0-4 bebek, 5-12 cocuk, 12-20 genc, 21-30 yetiskin tanimlanmamiş evre, hata mesaji olarak gecerli bir yas giriniz

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");

      byte yas=  input.nextByte();

      if(yas<0){
          System.out.println("Gecerli bir yas giriniz");
      }else if(yas<5){
          System.out.println("bebek");
      }else if(yas<13){
          System.out.println("cocuk");
      }else if(yas<21){
          System.out.println("genc");
      }else if(yas<31){
          System.out.println("yetiskin");
      }else{
          System.out.println("Tanimlamamis evre");
      }





    }



}
