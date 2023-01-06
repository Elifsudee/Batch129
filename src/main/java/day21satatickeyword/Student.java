package day21satatickeyword;

public class Student {

       /*
       1)satatic variable vaya satatic methodlar(calss member) tum objectler icin ortak elemandir.
       2)static calss member`ler uzerinde yapilan tum degisikler tum object`leri etkiler
       3)satatic class member`ler Class`a , non-sataic class member`lar object`lere monte edilir.
       Mesela bir class`dan 100 tane object olusturdugunuzda nan-static olanlar 100 kere olusturulur.
       Ama static olanlar object sayisindan bagimsiz olarak bie kere olusturulur
       4)static class member`lara ulasmak icin object olusturmaya gerek duyulmaz,ama non static class member`lara ulasmak
       icin object olusturmak sarttir.
       5)satic variablelerin diger adi "Class Variable" dir
       non-static Variable`nin diger adi "Instance Variable" vaya "Object Variable"dir.
        */

    public static String stdName = "Tom Hanks";

    public int age = 13;

    //ogrenci isminin ilk harflerini veren methodu olusturunuz

    public static String getInitial(String name){
        String first=name.substring(0,1);
      String second=  name.split(" ")[1].substring(0,1);

      return first+second;
    }


    //ogrenci ismindeki sesli harfleri(a,e,i,o,u) sayan method olusturunuz

     public  int countVawels(String name){

      int counter=0;
         for (int i = 0; i <name.length() ; i++) {

         char ch=    name.toLowerCase().charAt(i);
             switch(ch){
                 case 'a':
                 case 'e':
                 case 'i':
                 case 'o':
                 case 'u':
                     counter++;
                     break;
             }

         }

        return counter;
     }

}
