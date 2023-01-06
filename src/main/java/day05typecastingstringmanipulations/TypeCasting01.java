package day05typecastingstringmanipulations;

public class TypeCasting01 {

    public static void main(String[] args) {
        /*
        Numeric primitive data type lerin birbirlerine donusturulmesine "Type Casting" denir(numeric)
        Numeric(sayisal) data typelarr byte-short-int-long-float-double



        Note:Kucuk data type'leri buyuk data type cevirmeyi java otomatik olarak yapabilir.Bu işleme
        "AutoWidening"(otomatik genişleme) denir.

       Note2: buyuk data typelerini kucuk data typelerine cevirmek riskli bir istir.java bu isi otomatik olarak
       yapmaz bu islemi kod yazanlar yapar.
       Bu işleme "ExplicitNarrowing"(Acıktan daratma) denir.




         */
        //byte data tpe ni int data tyene cevirme
        byte age=13;
        int ageInt=age;
        System.out.println(ageInt);
        //long data type ni short data typene cevirme

        long weight=234;
        short weightShort=(short)weight;


        System.out.println(weightShort);
       // int data typeni floata cevirin

       int population=123;
       float populationFloat=population;

        System.out.println(populationFloat);

        //duoble dat typeni short dataya ceviriniz

        double number=13.0000;
        short numberFloat=(short) number;
        System.out.println(numberFloat);


        //*****Dikkat*********
      // donusum yaptiginiz sayi(260), donuseceginiz data type nin sinirlari disinda ise java
        // sayi ile "mod" islemi yapar ve mod isleminin sonucu sizin yeni degeriniz olur.

        short num=260;
        System.out.println(num);//260

        byte numByte=(byte)num;
        System.out.println(numByte);//4

        //ornek:

        short n=1023;
        System.out.println(n);//1023
        byte nByte=(byte)n;
        System.out.println(nByte);//-1





    }
}
