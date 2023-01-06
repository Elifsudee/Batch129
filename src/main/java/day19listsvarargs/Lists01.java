package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {

     //Interwiew Example 1:Verilen List`deki elemanlari tekrarsiz olarak yazdiriniz
     //   [2,3,2,2,5] ====>[2,3,5]

          List<Integer> myList=new ArrayList<>();

        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(3);
        myList.add(5);


        List<Integer> newList = new ArrayList<>();

        for(Integer w: myList){

            if(!newList.contains(w)){//yeni listte w  yoksa ekle varsa ekleme

                newList.add(w);
            }
        }
        System.out.println(newList);//[2, 3, 5]

        //Example 2=Musteriden urun ismini aliniz
        // Musterinin ismini verdigi urun listede varsa urunun ismini yazdiriniz
        //Musterinin ismini verdigi urun listede yoksa "Out of staock" yazdrin
        //cikmak istediginde Q bassin

        Scanner input=new Scanner(System.in);
        System.out.println("urun arama sistemimize hosgeldiniz");
        System.out.println("Urunu sonlandirmak icin Q basin");

        List<String> products=new ArrayList<>();

        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobille Phone");

        /*
        for loop kurunuz product listindeki her bir elemanin tum charecterlerini set method kullanarak kucuk hafe cevirin
        kullaniidan gelen urun ismini de kucuk harfe cevirin

      for(String w:products){
    products.set(products.indexOf(w),w.toLowerCase());
         */

        do {
            System.out.println("Aradiginiz urunun ismini giriniz");


            String p=input.nextLine();
            if(p.equalsIgnoreCase("Q")){
                break;
            }else if(products.contains(p)){//eger product p iceriyorsa
                System.out.println(p +" is on stock");
            }else {
                System.out.println(p +" Out of stock....");//icermiyorsa
            }

        }while (true);

        System.out.println("sitemizi kullandiginiz icin tesekkur eder tekrar bekleriz");



















    }
}
