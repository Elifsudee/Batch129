package day19listsvarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lists03 {
    public static void main(String[] args) {
/*
                SAYI TAHMIN OYUNU
    Oyuncudan 1-10 arasi bir sayi isteyiniz
    Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
    Yoksa verdigi sayiyi listenize ekleyiniz.
    Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
    [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
    [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
    [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
*/

  // not=     List<Integer> numsList= Arrays.asList(5,8,2,9);//verdigimiz elemanlaru liste ceviren kod var list gibi list gorunumlu array
//Arrays.asList() ile list olusturuabilir ama listlerdeki eleman sayisini degistiren hic bir method bu List icin kullanilamaz

        Scanner input=new Scanner(System.in);
        List<String> numsList= new ArrayList<>();

        numsList.add("5");
        numsList.add("8");
        numsList.add("2");
        numsList.add("9");

   int counter=0;
   String num="";
           do {
               System.out.println("1 ile 10 arasinda bir tam sayi giriniz");
                num=input.next();

               if(num.equalsIgnoreCase("Q")){
                   break;
               }else if(numsList.contains(num)){
                    numsList.set(numsList.indexOf(num),"Bingo..");//numsListe git inexof ile ilk indexsi o sayyi bingo yap
                    counter++;
               }else{
                   numsList.add(num);
               }


           }while (counter!=numsList.size());

        if(!num.equalsIgnoreCase("Q")){
            System.out.println("Kazandiniz");
        }else{
            System.out.println("oyundan isteyerek ayrildiniz yine bekleriz");
        }
        System.out.println("Final report: "+numsList);


    }
}
