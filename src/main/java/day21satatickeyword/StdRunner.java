package day21satatickeyword;

import java.util.List;

public class StdRunner {
    public static void main(String[] args) {

        /*
        stdName satic oldugundan, ona ulasmak icin object olusturmadim
        Sadece class ismini yazmak yeterlidir
         */
        System.out.println(Student.stdName);//obje olusturmaya gerek tok class ismi ile ulastim

        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz
        Student std1 = new Student();
        System.out.println(std1.age);//obje olusturark ulastim

        Student std2 = new Student();
        System.out.println(std2.age);


       String initials= Student.getInitial("Tom Cruse");
        System.out.println(initials);//TC


      int vowels=  std1.countVawels("Tom Cruese");

        System.out.println(vowels);

        //static olanlari obje ile cagirmak tavsiye edilmez

        //list olusturma kisa yontem

      List<String> names=  List.of("Ali","Veli","Can");//static method eleman yerlestirir
        System.out.println(names);


    }
}
