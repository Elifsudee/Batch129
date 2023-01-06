package homework;

import java.util.Scanner;

public class Odev {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);


        // ORNEK 1 : Ogrenci ismi variable olusturup deger olarak Ali Can atayiniz.

        String student="Ali Can";
        System.out.println("student = " + student);

        //ORENEK 2: chr data type'inda ilk ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        String name= "Kadir Ekrem";
       char nameChar= name.charAt(0);
        System.out.println("nameChar = " + nameChar);


        //ORNEK 3: boolean data type'inde emeklimisin bir variable oluturun ve false degeri atayin.

        boolean emekliMisin=false;
        System.out.println("emekliMisin = " + emekliMisin);


        // ORNEK 4: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz

        byte studentAge=15;
        System.out.println("studentAge = " + studentAge);


        //ORNEK 5: short data type'inda site nufusu icin bir variable olusturun ve deger atayiniz

        short site=1234;
        System.out.println("site = " + site);

        // ORNEK 6: Ulke nufusu icin variable olusturun ve deger atayiniz

        int countryPopulation= 456778999;
        System.out.println("countryPopulation = " + countryPopulation);

        // ORNEK 7: long data type'inda insan vucundaki hucre sayisi icin variable olusturup deger atamasi yapin

        long hucreSayisi=126780000000L;
        System.out.println("hucreSayisi = " + hucreSayisi);


        // Method Creation
        // 1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz

        System.out.println("Diktortgenin iki kenarini giriniz");
       int a= input.nextInt();
       int b= input.nextInt();
        int rectangularAre=a*b;
        System.out.println("rectangularAre = " + rectangularAre);


        // 2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz

    int rectangularSize=2*(a+b);
        System.out.println("rectangularSize = " + rectangularSize);

        // 3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz

        System.out.println("Yaricapi giriniz");
        double yariCap=input.nextDouble();
        System.out.println(2*yariCap*Math.PI);

        // 4)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz

        System.out.println(Math.PI*yariCap*yariCap);


        // ORNEK 2: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdirin

       double  hucreAgirligi =0.0000023;
       double amipAgirligi=0.0000020;
       double sonuc=hucreAgirligi-amipAgirligi;
        System.out.println(sonuc);



        // ORNEK 1: Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin.

        int sehir=12345;
        System.out.println(sehir);


        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */


      String m="Kadir";
      char ch= m.charAt(0);
      char chSon=m.charAt( m.length()-1);


        for(  int i=0     ;    i<6  ;   i++   ){


            System.out.print(ch+""+chSon);


        }



       /*

    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
       // Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int number=input.nextInt();


        if( number<0||number==0){
            System.out.println("asal degil");
        }else if(number%number==0&&number%1==0){
            System.out.println("asal");
        }





        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

          /*

          int sum=0;
          for(int i=0 ; i<sentence.length() ; i++ ){
          if{
          }
          }


     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */




     /*   Scanner input = new Scanner(System.in);

        System.out.println("Lutfen positive bir sayi giriniz");

        int number = input.nextInt();

        if (number <= 0) {

            System.out.println("Lutfen gecerli bir sayi giriniz ");
        } else if (number == 1) {
            System.out.println("1 asal sayi degildir");
        } else {
            int sayac = 0;

            for (int i = 2; i < number; i++) {


                if (number % i == 0) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                System.out.println(" Asal sayıdır...");
            } else {
                System.out.println("Asal sayı değildir...");
            }
*/






    }
}
