package zinterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bingo_Oyun {

    public static void main(String[] args) {
        //Example 2:sayi tahmin oyunu
        //oyuncudan 1-10 arasi bir sayi isteyin
        //Elinizdeki listede kullanicinin tahmin ettigi sayi varsa "BINGO" yazdirin
        //Yoksa verdigi sayiyi listeye ekleyiniz
        //Ilk BINGO yu yapana "KAZANDINIZ" yazdirin
        //[5,8,2,9]===>2==>[5,8,BINGO ,9]
        //[5,8,2,9]===> 3==>[5,8,BINGO,9,3]
        //[5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ

        Scanner input = new Scanner(System.in);

        List<String> nums = new ArrayList<>();

        nums.add("5");
        nums.add("8");
        nums.add("2");
        nums.add("9");

 int counter=0;

 String sayi="";

        System.out.println("cikmak icin Q basiniz");
        do {
            System.out.println("1 ile 10 aras sayi giriniz");
             sayi = input.next();
            if(sayi.equalsIgnoreCase("Q")){
                break;
            }
            if(nums.contains(sayi)){
                nums.set(nums.indexOf(sayi),"Bingo");
                counter++;
            }else{
                nums.add(sayi);
            }

        } while (counter!=nums.size());


        if(!sayi.equalsIgnoreCase("Q")){
            System.out.println("kazandiniz");
        }else{
            System.out.println("kendiniz ayrildiniz");
        }

        System.out.println(nums);
    }
}
