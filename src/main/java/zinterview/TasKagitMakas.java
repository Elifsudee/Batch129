package zinterview;

import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {
 /* TASK:
     tas >makas
     makas >kagit
     kagit >tas
Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
While dongumuzun icerisinde kullanicidan aldigimiz secimi "secim" isimli degiskene atiyoruz.
Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
 */

        Scanner input=new Scanner(System.in);
        do {
            System.out.println("Lutfen tas icin 0, kagit icin 1 ,makas icin 2 sayisini giriniz");
            byte secim=input.nextByte();

            int pc=(int)(Math.random()*3);

            System.out.println(pc);

            if(secim<0 ||secim>2){
                System.out.println("gecerli bir sayi giriniz");

            }else if ((secim==0 && pc==2)||(secim==1 && pc==0) ||(secim==2&& pc==1) )
            {
                System.out.println("Kazandiniz");
            }else if(secim==pc){

                System.out.println("berabere");
            } else {
                System.out.println("Kaybettiniz");
            }
            System.out.println("Devam etmek Istiyor musunuz");
            String karar=input.next();
            if (karar.equalsIgnoreCase("Hayir")){
                break;
            }
        }while (true);






    }
}
