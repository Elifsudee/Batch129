package variablesdatetime01;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class C02_Veriables {
    /*
TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
salona devam edeceği ay süresi
bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
 */
    public static void main(String[] args) {



        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen ilk adinizi giriniz");
        String fristName=input.nextLine();
        System.out.println(fristName);

        System.out.println("Luften Soyadinizi giriniz");
        String lastName=input.nextLine();
        System.out.println(lastName);


        System.out.println("yasinizi giriniz");
       int age= input.nextInt();
        System.out.println(age);

        System.out.println("boyunuzu giriniz");
      int boy=  input.nextInt();
        System.out.println(boy);
        System.out.println(boy);

        System.out.println("kilonuzu giriniz");
      double kilo=  input.nextDouble();
        System.out.println(kilo);


        System.out.println("kac ay devam edecegizi giriniz");

        int ay=input.nextInt();
        System.out.println(ay);

int ucret =20;
        System.out.println("ucret = " + ucret);

        int toplam_tutar= ucret*ay;

        System.out.println();




    }
}
