package day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

  //MultiDimensional Array nasil olusturulur

        int a[][] =new int[3][2];

  //MultiDimensional Array ler nasil olusturulur.
        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]]

  //MultiDemensional Array lere eleman nasil eklenir.

      a[0][0]=5;
      a[0][1]=12;
      a[1][0]=81;
      a[1][1]=45;
      a[2][0] =123;
      a[2][1]=0;

        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //Array lere non-primitive data konulamaz.
        // Array lere primitive data veya reference konulur.
        // ama siz bir Array i yazdirmak istediginizde Java adres`ler yardimi ile non primitive dataya ulasir
        // ve non-primitive data yi sanki array in icindeymis gibi gosterir.


        //MultiDimensoinal Array`deki belli elemanlara nasil ulasilir.

        System.out.println(Arrays.toString(a[2]));//[123, 0]

        System.out.println(a[1][0]);

        System.out.println(Arrays.toString(a[0]));//[5,12]

        System.out.println(a[2][1]);//0







    }
}
