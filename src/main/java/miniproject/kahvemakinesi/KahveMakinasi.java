package miniproject.kahvemakinesi;

import java.util.Scanner;

public class KahveMakinasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hangiKahve;
        do {
            System.out.println("Hangi Kahveyi istersiniz?");
            System.out.println("1.Türk kahvesi  2.Filtre Kahve  3.Espresso");
            hangiKahve = input.nextLine().toLowerCase().trim();
            if(hangiKahve.equals("türk kahvesi") || hangiKahve.equals("filtre kahve") || hangiKahve.equals("espresso")){
                break;
            }else{
                System.out.println("Hatalı tuşlama yaptınız.");
            }
        }while (true);
        String kahveYazdir = hangiKahve.substring(0,1).toUpperCase() + hangiKahve.substring(1);
        System.out.println( kahveYazdir + " hazırlanıyor.");
        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):  ");
        String sut = input.next();
        if(sut.equalsIgnoreCase("evet")){
            System.out.println("Süt ekleniyor...");
        }else if(sut.equalsIgnoreCase("hayır")){
            System.out.println("Süt eklenmiyor...");
        }
        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : ");
        String seker = input.next();
        if(seker.equalsIgnoreCase("evet")){
            System.out.println("Kaç şeker olsun?");
            int kacSeker = input.nextInt();
            System.out.println(kacSeker + " şeker ekleniyor.");
        }else if (seker.equalsIgnoreCase("hayır")){
            System.out.println("Şeker eklenmiyor.");
        }
        String bosKod = input.nextLine();
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) : ");
        String boyut = input.nextLine().toLowerCase().trim();
        if(boyut.equals("büyük boy") || boyut.equals("orta boy") || boyut.equals("küçük boy")){
            System.out.println("Kahveniz " + boyut + " olarak hazırlanıyor.");
        }
        System.out.println(kahveYazdir + " " +  boyut + " hazırdır. Afiyet Olsun!!!");
    }
}
