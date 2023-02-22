package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        /*

         */

        Scanner input=new Scanner(System.in);
        List<String> isim=new ArrayList<>();
        isim.add("Elif");
        isim.add("Taner");
        isim.add("Neziha");
        isim.add("Kadir");


            System.out.println("Aradiginiz ismi girelim");
            String arananIsim=input.next().trim();

            if(!isim.contains(arananIsim)){
                System.out.println("Bu isim kullanilabilir");
                isim.add(arananIsim);
            }else{
                System.out.println("Bu isim zaten var");
                isim.add(arananIsim+(int)(Math.random()*100));
            }


    }
}
