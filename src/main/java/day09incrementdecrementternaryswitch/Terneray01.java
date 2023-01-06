package day09incrementdecrementternaryswitch;

public class Terneray01 {
    public static void main(String[] args) {

        //example 1
        int a = 10;

        int b = 20;

        int result = a < 7 ? a++ : b++;

        System.out.println(result);//20 post-increment

        System.out.println(a);//10

        System.out.println(b);//21

       // example 2 : verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        // -4 ===> -1*4     4===>4     0===>0 ****Mutlak deger****

        int c=-4;

        int result2=c<0 ?  -1*c  :  c;

        System.out.println(result2);//4


        //exampe3 : iki sayinin isreti ayni ise bu sayilari carpan, isaretleri farkli ise "Farki isaretli sayilari carpamiyorum" yazan
        //kodu yaziniz


   int m=5;
   int n=-6;
      // object javada butun non-primitive data type(class) nin  ortak "Parent"(baba) dir.
        // "object" in Parrent i yoktur;
        // Farkli data type`leri icin ortak variables olusturmak istedigimizde data type olarak object kullanilir
        // javada "object", insanlik alemi icin "Hz. Adem" e benzer



      Object resul3=  (m>0 && n>0) || (m<0 && n<0) ?  a*b : "Farki isaretli sayilari carpamiyorum";

        System.out.println(resul3);

        //Example 4: size verilen bir sayini uc basamakli olup olamdigini kontrol eden kodu yaziniz

        int number=-123;


      int  r=Math.abs(number);


       String result4= r>99 && r<1000   ? number + " uc basamakli" :  number + " uc basakli degil";

        System.out.println(result4);



      int p =123;
     int k =Math.abs(p);

     String result6= k>99 && k<1000  ? p + "uc basamakli" : p + "uc basamakli degil";













    }
}
