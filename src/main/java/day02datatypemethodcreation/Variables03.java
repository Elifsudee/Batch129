package day01variables.day02datatypemethodcreation;

public class Variables03 {
    // primitive data type--> char, boolean, byte, short, int, long, float, double

    // float :virgüllü sayılar icin kullanılır( ondalık sayılar-Decimal number) icin kullanılır(fiyatlandirmada 12.99)
    // double :virgüllü sayılar icin kullanılır( ondalık sayılar-Decimal number) icin kullanılır.(hucre agirlıgi 0,000012)

    // Not :Primitive data typ'larini Java olusturmustur, biz olusturmayiz.
    // Not: primitive data type 'larin ismleri kucuk harf kullanilir.
    // Not: primitive data'lar data typ'lara göre fakli farkli yer kaplar.
    // Not: primitive data'lar icinde sadece sizin atadıgınız deger barindirirlar.


    //Note: primitive data type'ların isimleri sadece kücük harfle başlar.
    // Note: primitive data'lar type'lara göre  memory de farklı yer kaplar.
    // note : primitive data'lar icinde sadece sizin atadıgınız degerleri barindirirlar.

    // Note:Java ondalık sayıları "Decimal Numbers"ı otomatik olarak "double" kabul eder.
    // Siz data type'ni "float" yaparsaniz hata verir.
    //float olmasında israr ediyorsaniz sonuna buyuk "F" veya kucuk "f         " koymalisiniz.
    // Not: float memory de 4 byte yer kaplar, doubleble 8 byte'lik yer kaplar.

    public static void main(String[] args) {

        //Ornek 1: gömlek ve ayakkabı fiyatlari için iki tane variable olusturup toplam fiyati ekrana yazınız

        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;

        //System.out.println() ekrana yazdirir ve bir sonraki satira koyar.
        //System.out.print() ekrana yazdirir ve ayni satirda tutar
        //System.out.println() kısa yolu== sout yaz Enter e bas

        System.out.println("shirtPrice = " + shirtPrice);



        //Ornek 2: Hucre agirligi ve Amip' in agirligi icin iki tane variables olusturun ve agırliklari farkini ekrana yazdirin.

        double weightCell = 0.000000000000112;
        double weightAmip = 0.000000000000023;

        System.out.println("weightCell = " + weightCell);


     //Ornek 3: Dort kisinin yaslarinı topla ve ikiye bol

        byte ageTaner=35;
        byte ageElif=36;
        byte ageNeziha=10;
        byte ageKadir=7;

        System.out.println(ageTaner+ageElif+ageNeziha+ageKadir);

    }

}
