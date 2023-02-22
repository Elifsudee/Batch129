package lambdapractive;

import java.util.stream.IntStream;

public class Lambda04 {
    public static void main(String[] args) {


        System.out.println(birdenXeKadarToplma(5));
        System.out.println("\n   ************");
        System.out.println(birdenXeKadarTekSayilariTopla(5));
        System.out.println("\n   ************");
        System.out.println(birdenSonsuzaKadarTekSayidanIlkXTanesiniTopla(4));
        System.out.println("\n   ************");
        System.out.println(ikidenSonsuzaKadarCiftSayidanIlkXTanesiniTopla(6));
        System.out.println("\n   ************");
        System.out.println(besdenSonsuzaGidenIlkxKuvTop(3));

    }//main
//SORU1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), toplamını bulup return ederek yazdırınız.

    public static int birdenXeKadarToplma(int x){
      int toplam=  IntStream.range(1,x+1).sum();
      return toplam;
    }

    //SORU2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    // tek sayıların, toplamını bulup return ederek yazdırınız. (x dahil olacak)

    public static int birdenXeKadarTekSayilariTopla(int x){

      int toplam=  IntStream.rangeClosed(1,x).filter(t->t%2!=0).sum();
      return toplam;

    }
    //SORU3: 1'den sonsuza kadar giden Tek sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız

    public static int birdenSonsuzaKadarTekSayidanIlkXTanesiniTopla(int x){

       int sonuc= IntStream.iterate(1,t->t+2).limit(x).sum();
       return sonuc;
    }
   // SORU4: 2'den sonsuza kadar giden Çift sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız

    public static int ikidenSonsuzaKadarCiftSayidanIlkXTanesiniTopla(int x){
     int sonuc =   IntStream.iterate(2,t->t+2).limit(x).sum();
     return sonuc;

    }
    //SORU5: 5'den sonsuza kadar giden kuvvetlerinden
    // ilk x kuvvetinin toplamını return ederek yazdırınız

    public static int besdenSonsuzaGidenIlkxKuvTop(int x){
       int sonuc= IntStream.iterate(5,t->t*5).limit(x).sum();
       return sonuc;
    }
}
