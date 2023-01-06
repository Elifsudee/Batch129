package day16multidimensionalarrays;

public class Md05 {
    public static void main(String[] args) {

   //Example 1: Bir integer multi-dimensional array olusturunuz
      //    Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz

    int s[][]={{2,3},{4,5}};
int multiply=1;

    for( int[]w:s){

        for(int k:w){

         multiply= multiply*k;
        }
    }

        System.out.println(multiply);









    }
}
