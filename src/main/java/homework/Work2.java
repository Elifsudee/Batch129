package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Work2 {
    /*
    Musteriden urun ismi al
    urun listede varsa ismini yazdir
    yoksa "out of stock" yazdir
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        List<String> urunler=new ArrayList<>();
        urunler.add("Bilgisayar");
        urunler.add("TV");
        urunler.add("Tablet");
        urunler.add("Telefon");
        System.out.println("Urun arama sistemimize hos geldiniz.....");
        System.out.println("Cikmak icin Q basiniz");
        do {
            System.out.println("Aradiginiz urunu girinz");
            String urunIsmi=input.next().toLowerCase();
            if(urunIsmi.equalsIgnoreCase("Q")){
                break;
            }
            if(urunler.contains(urunIsmi)){
                System.out.println("aradiginiz urun :"+urunIsmi+" stokta var");
            }else{
                System.out.println("aradiginiz urun "+urunIsmi +" stokta yok");
            }


        }while (true);




    }
}
