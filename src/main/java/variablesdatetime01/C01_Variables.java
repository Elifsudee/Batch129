package variablesdatetime01;

public class C01_Variables {

    public static void main(String[] args) {

        // bte; short; int; long; double; float; data type larinin max ve min degerlerini yazdiran kodu yaziniz.

        byte byteMax = Byte.MAX_VALUE;// B yi buyuk yazmamizin nedeni methodlarin ortaya cikmasi icin

        byte byteMin = Byte.MIN_VALUE;

        System.out.println("byteMax = " + byteMax);//127

        System.out.println("byteMin = " + byteMin);//-128



        short shortMax = Short.MAX_VALUE;

        short shortMin = Short.MIN_VALUE;

        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMin = " + shortMin);



        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;

        System.out.println("longMax = " + longMax);
        System.out.println("longMin = " + longMin);



        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;


        System.out.println("doubleMax = " + doubleMax);// "" icine alma nedeni yazdirinca altta ismin gorunmesi
        System.out.println("doubleMin = " + doubleMin);



        float floatMax= Float.MAX_VALUE;
        float floatMin= Float.MIN_VALUE;

        System.out.println("floatMax = " + floatMax);
        System.out.println("floatMin = " + floatMin);
}
}