package yasinhocapratice;

import java.util.Scanner;

public class Do_While_TahminOyunu {

    public static void main(String[] args) {
        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?

        Scanner input=new Scanner(System.in);
        int rastgeleSayi=(int)(Math.random()*101);

        int sayi;
        int sayac=10;

        System.out.println("0-100 arasi(dahil) bir sayi giriniz");
        do{

            sayac--;
       sayi=  input.nextInt();

       if(sayi<rastgeleSayi){
           System.out.println(sayac+"hakkiniz kaldi");
           System.out.println("daha buyuk sayi giriniz");

       }else if(sayi>rastgeleSayi){
           System.out.println(sayac+"hakkiniz kaldi");
           System.out.println("daha kucuk sayi giriniz");
       }else{

           System.out.println("tebrikler!!!"+(10-sayac)+"tahminde bulundunuz");
           System.out.println("puaniniz:"+(sayac+1)*10);
       }

       if(sayac==0){
           System.out.println("hakkiniz bitti");
           break;
       }
        }while (sayi!=rastgeleSayi);













    }
}
