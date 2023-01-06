package veriabdaytime05;

import java.util.Arrays;
import java.util.Comparator;

public class C03_KelimelriTersSiraliArray {

    public static void main(String[] args) {

        /*
Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
tersine çevirmek için kod yazınız.
Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
        */

        String str=" Kemal Can Kuzu  ";
        System.out.println(str);




        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));

      String tersStr="";

        for (int i =arr.length-1; i >=0 ; i--) {
            tersStr+=arr[i]+" ";
        }
        System.out.print("trim basta ise yaradi mi");
        System.out.print(tersStr);
        System.out.println("trim sonda ise yaradi mi");

        System.out.print("trim basta ise yaradi mi");
        System.out.print(tersStr.trim());
        System.out.println("trim sonda ise yaradi mi");



    }
}
