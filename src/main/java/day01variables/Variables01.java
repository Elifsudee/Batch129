package day01variables;

public class Variables01 {
    public static void main(String[] args) {
        //variable olusturmak

        // Javada esittir demek : "==" dır.
        //Javada "=" "assigment operetor"(atama operatoru)dir. Sagdaki degeri alır soldaki kutuya koyar.
        // Access modifler yazmassak "accces modif" "default" demektir
        //Assigment Operator(Atama Operatoru) + Variable ==> Assigment
        // Data type+ Variable Name==> Variable  Declaration
        //Eger Variable Declaration yapar, Assigment yapmazsanız Java kendi degerini (default) koyar.
        //Default degerler sayılar icin sifirdir.
        // Java cümlesi = Statement

        //Data Type  yazmak(data tipi) Variable ismini yazınız  atama operatoru(assignment operator) (ingilzcedeki nokta gibi)
        int age = 13;


        // Ornek 1:Ogrenci  ismi için variable olusturup deger Ali Can atayınız

        //Stringlere verilen degerler cift tıranak icine alınmalı.
        // Stringler icin "default value"(javanın kendi degeri) "null" dir.
        // Data Type ve Variable arasında en az bir bosluk olamalı

        String studentName = "Ali Can";


        /*
    javada temelde iki tip data vardir;

     1) pirmiteve data type :Ilkel

     char-boolean-byte-short-int-long-float-double
     char: tek karekterler icin kullanılır: x, A, 5 ,?

     boolean: Sadece iki farkli deger alır True(dogru) false(yanlıs)

     byte:-128 den 127'e kadar tam sayı degerleri icin kullanılır.

     short: -32768 ile 32767 arasındaki tam sayılar için kullanılır.

     int: -2147483648  ile 2147483647 arasindeki sayılar icindir.

     long: -9223372036854775808 ile 9223372036854775807 arasındaki sayilar icindir.

    2) non primivite data type: Ilkel olayan gelismis

     */
        //char Ornek: Char data type'inde ilk ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayınız
        // note:char data typ'inde degereler tek tirnak icine alınır.
        char isminIlkHarf = 'A';

        //Ornek: boolean data type'inde emekli misin için bir varaible olusturunuz ve false degeri atayınız.
        boolean emeklimisin = false;

        //  örnek: byte data type'inde ogrenci yası icin bir variable olusturunuz ve bir deger atayiniz.
        byte studentAge = 23;

        // Ornek short data type'inde sitede yasayan insan sayisi ile ilgili veraible olusturun ve bir deger atayınız
        short siteNufus = 1200;

        // Ornek: Ulke nufuslari icin bir deger olusturup bir deger atayiniz.
        int ulkeNufus = 1864284648;

        // Ornek: insan vucundaki hucre sayisi icin variable olusturunuz ve bir deger atayiniz.
        long cellInHumanBody = 87654321356786L;
        // not: Bir deger long ise sonuna L veya l konulmalıdır kucuk l 1 e benzedigi icin buyuk L konulur.

        // Ornek: gunesin agirligi
        long weightOfSun = 1234567;
        // not: eger lon'a atadigiz deger int'lerin araliginda ise "L" koymaya gerek yok.  long yazsakda java int kabul eder
    }
}
