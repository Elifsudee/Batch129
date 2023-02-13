package day37lambda;

import day36lambda.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda002 {
    public Lambda002() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        //1-Lambda text file dosyasi icndeki metni consala yazdiran kodu yaziniz

        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).forEach(System.out::println);


        //LambdaTextFile dosyasi icindekki her characteri uppercase yapiniz

        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).forEach(System.out::println);


        //3)Lambbda text file dosyasi icinde herhangi bir kelimenin var olup olamdigini gosteren kodu yaziniz

        boolean result1 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).//line yani satirlari kelimeye cevirdik stream icinde kelime arraylerim var
                        flatMap(Arrays::stream).// Arrayleri kelimleri dumduz yapar icinde kelime olan streamler olacal
                        anyMatch(t -> t.contains("Java"));// herhandi biri bunnunla eslesiyor mu//herhangi bir kelime Java ise true olur

        System.out.println(result1);


//4 Lamda text file dosyasi icindeki her kelimenin "a" icerip icermedigini gosteren kodu yaziniz

        boolean result2 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).//line yani satirlari kelimeye cevirdik stream icinde kelime arraylerim var
               flatMap(Arrays::stream).
                allMatch(t -> t.contains("a"));//Her kelime a harfini icerirse sonuc true olur aksi halde false olur
        System.out.println(result2);//false


        //5 Lamda text file dosyasi icindeki her kelimenin en az iki harf icerip icermedigin gosteren kodu yaziniz

        boolean result3 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).//line yani satirlari kelimeye cevirdik stream icinde kelime arraylerim var
              flatMap(Arrays::stream).
                allMatch(t -> t.length() > 2);
        System.out.println(result3);//true


        //Lamda text file dosyasi icindeki hic bir kelimenin "x" icermedigini gosteren kodu yaziniz

        boolean result4 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).//line yani satirlari kelimeye cevirdik stream icinde kelime arraylerim var
                 flatMap(Arrays::stream).
                noneMatch(t->t.contains("x"));
        System.out.println(result4);


    // LambdaTextFile dosyasi icinde "r" ile biten kelimeleri sayan kodu yaziniz

        long result5 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).//line yani satirlari kelimeye cevirdik stream icinde kelime arraylerim var
                flatMap(Arrays::stream).filter(t-> t.endsWith("r")).//r ile bitenleri bul
                count();//say
        System.out.println(result5);

        //2 yol

        int result6 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).//line yani satirlari kelimeye cevirdik stream icinde kelime arraylerim var
                        flatMap(Arrays::stream).filter(t-> t.endsWith("r")).//r ile bitenleri bul
                        collect(Collectors.toList()).size();//sonucu listin icine koyup size ile bakiyoruz
        System.out.println(result6);



    }
}