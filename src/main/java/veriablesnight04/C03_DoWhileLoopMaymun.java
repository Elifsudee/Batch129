package veriablesnight04;

public class C03_DoWhileLoopMaymun {
    public static void main(String[] args) {
/*
interwiew sorusu
    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

    */
        int numberofBananas=165;//4   8  12   ...164 geriye 1 muz kaldi
        int survialDays=1;//       1  2  3     ..41 ==>42 gun oldu           default olarak 1 atadik
        boolean mankeyAlive=true;//default olarak atadik

   do {
       System.out.println("*******maymunlar yasamak icin gunde 4 muz yer********");

       numberofBananas-=4;//numberofBananas=numberofBananas-4

       System.out.println("kalan muz saysi"+numberofBananas);

       survialDays++;

       if(numberofBananas<4){
           mankeyAlive=false;

           System.out.println("bugun"+survialDays+".gun yeterli muz kalmadi.Maymun oldu");
           System.out.println("kalan muz"+survialDays+".gun oldu");

       }else{
           System.out.println("bugun"+survialDays+".gun yasadi");
       }

   }while (mankeyAlive);
























    }
}
