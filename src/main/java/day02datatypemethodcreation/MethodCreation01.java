package day01variables.day02datatypemethodcreation;

public class MethodCreation01 {
     /* java'da method nasıl olusturulur.

       1- main methodun dıdsında olusturulur.
       2-Access Modifler+ Return Type+ Method Ismi + () + {}


       // olusturulan methodlar nasıl kullanilir
       1- main methodun icinden kullanılır
       2 method'un ismi+ () yaziniz.
       3-Islem yapacaginiz sayilari parantezin icine yaziniz.
        */

    public static void main(String[] args) {

     int sonuc =add(30,50);
     System.out.println(sonuc);

     long carpmaSonuc = multiply(3,6);
        System.out.println(carpmaSonuc);

      int ucluSonuc2= firtsTwoMultiplyThirtAdd(2 ,5,8);
        System.out.println(ucluSonuc2);

       double kup= getCube(5);
        System.out.println(kup);
    }

    public static int add(int a,int b){
        return a+b;

    }

    protected static long multiply(int a, int b){

        return a*b;
    }

    // Ornek: verilen uc sayıda ilk ikisini carpan ve sonucu ucuncu sayı ile topayan methodu olusturunuz ve kullaniniz.

    private static int firtsTwoMultiplyThirtAdd(int a,int b,int c){
        return a*b+c;


    }

   // Ornek: verilen bir ondalik sayının kupunu heaplayan methodu olusturup kullaniniz.
// Not: access modifleri default yapmak icin access modifi(yani default) yazmayiniz.

    static double getCube(double a){
        return a*a*a;


    }
    // Ornek 1: Diktortgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
    // Ornek 2: Diktortgenin cevresi hesaplayan methodu olsturunuz ve kullaniniz.
    // Ornek 3: Dairenin cevresi hesaplayan methodu olusturunuz ve kullaniniz
    // Ornek 5: Dairenin alanı hesaplayan methodu olusturunuz ve kullaniniz


}
