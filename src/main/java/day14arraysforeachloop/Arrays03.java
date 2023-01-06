package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

       // Example 1 = String bir array olusturunuz, 6 tane eleman yerlestiriniz, character sayisi 5 den cok olan elemanlari siliniz



   String colors[]=new String[6];

   colors[0]="Red";
   colors[1]="Orange";
   colors[2]="Blue";
   colors[3]="Yellow";
   colors[4]="Green";
   colors[5]="Brown";


        System.out.println(Arrays.toString(colors));//[Red, Orange, Blue, Yellow, Green, Brown]

        // Logic= Yeni bir array olusturup, charcter sayisi 5 ve 5 den kucuk olan elemanlari yeni arry e transfer edecegiz
        // Boylelikle yeni arrray de character sayisi 5 den buyuk olan hic bir eleman olmayacak

        //soru: Hocam, array olusturmak icin iki sey belirlenmelidir:
        // 1=Elemenlari data type `i
        // 2= Yeni array de kac tane eleman olacak


      // Verilen array de eleman sayisi 5 ve 5 den kucuk olan kac eleman var bulmaliyiz

        int counter=0;//[Red, Orange, Blue, Yellow, Green, Brown]

        for(String w: colors){

            if(w.length()<=5){
                counter++;
            }

        }

        System.out.println(counter);
//yeni array olustur
    String newColors[]=new  String[counter];

    //transfer et
    int idx=0;

    for(String w:colors){

        if(w.length()<=5){
            newColors[idx]=w;
            idx++;

        }
    }

        System.out.println(Arrays.toString(newColors));//[Red, Blue, Green, Brown]


    }
}
