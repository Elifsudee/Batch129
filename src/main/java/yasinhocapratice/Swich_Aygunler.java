package yasinhocapratice;

import java.util.Scanner;

public class Swich_Aygunler {
    public static void main(String[] args) {

  /*
       Girilen yıl ve ay numarasına göre ayın kaç gün olduğunu yazdıran bir kod yazınız.
       Girdi yıl: 2000 ay: 2
       Çıktı: 29
      */



            Scanner input = new Scanner(System.in);
            System.out.println("Yılı giriniz");
            int yil = input.nextInt();
            System.out.println("Ay numarasını giriniz");
            int ay = input.nextInt();

            switch (ay) {
                case 1: case 3:
                case 5: case 7:
                case 8: case 10:
                case 12:
                    System.out.println("Girdiğiniz ayın gün sayısı: 31");
                    break;
                case 4: case 6:
                case 9: case 11:
                    System.out.println("Girdiğiniz ayın gün sayısı: 30");
                    break;
                case 2:
                    if (yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0) {//4 bolunecek 100 e bolunmeyecek 400 e bolunecek
                        System.out.println("Girdiğiniz ayın gün sayısı: 29");
                    } else {
                        System.out.println("Girdiğiniz ayın gün sayısı: 28");
                    }
                    break;
                default:
                    System.out.println("Gecerli bir ay numarası giriniz");

            }




    }
}
