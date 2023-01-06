package veriablepractive07;

import java.util.Arrays;
import java.util.Scanner;

public class HackerLanguage {
    public static void main(String[] args) {

            /*
            Interwiew
            Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren kodu yazınız.
            Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar.
             Genellikle çevirdikleri harfler şu şekilde:
            s -> 5
            a -> 4
            e -> 3
            t -> 1
            o -> 0

            OUTPUT :
             hackerDili("java ile hersey guzel")
             h4ck3rd1l1("j4v4 1l3 h3r53y guz3l")

             */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");

        String cumle = input.nextLine().toLowerCase();

        String arr[] = new String[cumle.length()];


        for (int i = 0; i < cumle.length(); i++) {
            arr[i] = cumle.substring(i, i + 1);
            System.out.print(arr[i]);//araye donusturduk
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));//[j, a, v, a,  , i, l, e,  , g, u, z, e, l,  , d, u, n, y, a]













    }
}