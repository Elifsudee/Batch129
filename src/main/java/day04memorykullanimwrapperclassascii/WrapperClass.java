package day04memorykullanimwrapperclassascii;

public class WrapperClass {

    public static void main(String[] args) {
        // primitivler: char,    boolean, byte, int,   float,  long, double
        //wrapper:     Character,Boolean, Byte, Integer,Float,Long, Double
        // wrapper calsslar non primitivlerdir o yuzden de cok yer kaplar. o yuzden sart degilse kullanilmaz.

        int n = 12;//"n" yazip nokta koyarsaniz hiç nokta koyamazsiniz

        Integer m = 12;//"m" yazip nokta koyarsaniz bir cok method görursunuz cunku "wrapper classlar method icerir.

        byte p = 23;
        Byte r = 43;


        //or1: short

        short max = Short.MAX_VALUE;
        System.out.println(max);
        short min = Short.MIN_VALUE;
        System.out.println(min);


        //or2:

        int min1 = Integer.MIN_VALUE;

        byte max1 = Byte.MAX_VALUE;
        System.out.println(min1 + max1);

        //Exaple3: Primitive int'i wrapper int cevir(Autoboxing)

        int num = 22;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);//22

        //wrapper Byte 'i primitive cevirme(Unboxing)

        Byte k = 43;
        byte primitiveK = k;
        System.out.println(primitiveK);

        //exaple4: Primitive char'i Wrappere ceviriniz
        //         Wrapper boolean primitive cevir

        char ch = 'C';
        Character wrapperCh = 'C';
        System.out.println(wrapperCh);

        Boolean isOld = true;
        boolean isOldWrapper = isOld;

        System.out.println(isOld);

        //Example : size String olarak verilen iki fiyatin toplamini ekrana yazdiriniz

        String shirt = "2300";

        String shoes = "5200";

        //javada "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" yapar
        // javada"+" sembolu iki string arasinda veya bir string ve bir sayi arasinda
        // kullanilirsa "concatenation" olur
        //Concatenation islemlerinde java matematik kurallarini kullanir.

        System.out.println(shirt + shoes);//23005200

        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);

        System.out.println(toplamFiyat);//7500


//oernek6: size String olarak verilen iki fiyatin toplami
//Note :valueOf() methodu tum karekterleri rakam olan Stringleri sayilara ceviriri.
        //      Eger valueOf() methodu kullanirken String'in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz.
        //      Bu hatayi duzeltmeyi ileride ogrenecegiz.

        String tv="11000";
        String radio="3000";

        int toplam=Integer.valueOf(tv)+Integer.valueOf(radio);

        System.out.println(toplam);



    }
}
