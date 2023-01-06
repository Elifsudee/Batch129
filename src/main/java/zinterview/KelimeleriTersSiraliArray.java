package zinterview;

import java.util.Arrays;

public class KelimeleriTersSiraliArray {
    public static void main(String[] args) {
                     /*
            Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
            Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
            tersine çevirmek için kod yazınız.
            Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
            Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
                    */


        String str="Kemal Can Kuzu";

      String arr[]=  str.split(" ");
        System.out.println(Arrays.toString(arr));

      String ters="";

        for (int i = arr.length-1; i >=0 ; i--) {
            ters+=arr[i]+" ";
        }

        System.out.println(ters);
        System.out.println(ters.trim());



    }
}
