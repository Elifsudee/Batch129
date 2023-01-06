package day04memorykullanimwrapperclassascii;

public class Operators01 {

    public static void main(String[] args) {
        /*

1) +,-;*,/ islemleri matemaikte kullanildigi kullanilir
Note: int/int==>int olur
Note2: double/int==> double olur.Cunku javada matematiksel islemlerde farkli data typelari kullanilirsa sonuc buyuk data type'inda olur.
Note3:javada "mantik operator"(logical operator)
     i) AND(&&) ve OR(||) islemleri logical operator'lardir.
      AND isleminde true almak icinher sey true olmali, mukemmelliyetcidir(perfectionist)'tir.
      AND isleminde bir tane false sonucu false yapar.

      ii) OR isleminde bir tane true sonucu true yapmaya yeter.
          OR isleminde sonucun false olasi icin her sey false olamali
          OR islemi "polyana" gibidir.

       iii) NOT operator==> true olani false, false olani true yapar.
         !true==>false
         !false==>true
         !!true==>true
   Note4:Karsilaştirma operator
     <,>,<=,>=,==,!=
     Karsilastirma operatorlerini kulladiginida kesinlikle boolean(true-false)alinir

 Note :Biz AND islemi icin "&&" kullaniriz ama "&" kullanimd da gecerlidir.
       Farklari:&&  ilk ifade false oldugunda digerlerini kontrol etmez,daha hizli calisir,
        & hepsini kontrol eder o yuzden yavas calısır.

         */


       boolean frist=3<5;//true

       boolean second= 2+3 !=5;


        boolean third=2+3*5 >=19;

        System.out.println(frist+"   "+second+"    "+third);

        System.out.println(frist&&second);//false
        System.out.println(frist||second||third);//true


        boolean four= 3*6/8 >= 10;
        System.out.println(four);

        boolean five =4*5+9>=19;
        System.out.println(five);




    }
}
