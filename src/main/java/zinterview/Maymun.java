package zinterview;

public class Maymun {
    public static void main(String[] args) {
        /*soru 3=
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
            System.out.println("***Aymun yasamak icin 4 muz yer");
            numberofBananas-=4;
            System.out.println("kalan muz sayisi " +numberofBananas);

            survialDays++;

            if(numberofBananas<4){
                mankeyAlive=false;
                System.out.println("bugun "+survialDays+" maymun oldu");

            }else{
                System.out.println("maymun "+survialDays +" gun kadar yasadi");
            }

        }while (mankeyAlive);


    }
}
