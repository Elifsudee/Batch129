package day04memorykullanimwrapperclassascii;

public class C04_WrapperClass {

/*
 Non-primitiv Dta turleri sadece data barındırmak icin degil ayni zamanda methodlar da bulundurur.
 Primitiv data turleri sadece deger saaklar.
 java bu duruma bir cozum uretmistir.
 her primitiv data turunu Non primitiv olarak kullanabilmek icin ozel calasslar olusturmustur.
 Oracle firmasinin urunu olan java primitivlere method ekleyerek olusturduklari bu yapiya Wrapper Class adini vermiştir.

 Primitive      Wrapper(kapladiklari alan ayni)
 byte            Byte
 short            Short
 int             Integer******
 long            Long
 float           Float
 double          Double
 boolean         Boolean
 char            Character*****



 */
public static void main(String[] args) {
   byte primitiveByte=12; //primiv data type larina nokta koydugumuzda hic bir method gelmez.
   Byte wrapperByte= 12;// wrapper classlarda nokta koydugumuzda bir cok method kullanabiliriz.


    // Ex: Byte data type inin en kucuk ve en buyuk degerini ekrana yazdiriniz

   System.out.println(Byte.MIN_VALUE);
   System.out.println(Byte.MAX_VALUE);

   // short
   System.out.println(Short.MIN_VALUE);
   System.out.println(Short.MAX_VALUE);


   //int
   System.out.println(Integer.MIN_VALUE);
   System.out.println(Integer.MAX_VALUE);

   //long
   System.out.println(Long.MIN_VALUE);
   System.out.println(Long.MAX_VALUE);

   //********** Primitivler Wrapper Classlara Nasil Cevrilir( Autoboxing)******

   float f1=13.99F;// primitive kucuk kutu

   Float wrapperF1 =f1;// Autoboxing

   //********Wrapper Classlari Primitive Data typelarin nasil cevrilir( Unboxing)*****

   Character wrapper1='s';
   char primitiveWrapper1= wrapper1;

   // note: Autoboxing ve Unboxing java tarafinda otomatik yapilir extra kod yazmaya gerek yok

   //Or: Verilen iki string datanin toplamini veren kodu yaziniz

   String str1="12345";
   String str2 ="6789";

   System.out.println(str1+str2);
   System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));








}


}
