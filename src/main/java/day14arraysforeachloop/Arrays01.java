package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //Ex) 1= Strin array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin icerdigi
        // karakter sayisi toplamini ekrana yzdirin


        String arr[]=new String[5];

        arr[0]="Math";
        arr[1]="Sience";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";


        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length()+arr[arr.length-1].length());//7


        //Ex) 2= Strin array olusturun, icine 5 tane eleman ekleyin, tum  elemanlain icerdigi
        // karakter sayisi toplamini ekrana yzdirin

        String brr[]=new String[5];

        arr[0]="Miami";
        arr[1]="Istanbul";
        arr[2]="Frankfurt";
        arr[3]="Dhaka";
        arr[4]="Atina";


     //1.yol
        int totalChar=0;

        for (int i = 0; i <brr.length ; i++) {

        totalChar=    totalChar+ brr[i].length();

        }

        System.out.println(totalChar);


        //2 yol for-each-loop(enhanced loop)===> baslangic degeri, loopun calisma arti ve increment ve decrement kismini kendisi halleder
        // "array" lerde ve "collection"larda kullanilir
        // Index kullanmaniz gerektiginde bazen for-each-loop caresiz kalir mecbueren diger looplari kullaniriz

        int sum=0;
        //Miami,Istanbul, Frankfurt,Dhaka,Athena

        for(String w: brr ){

          sum=  sum+w.length();
        }

        System.out.println();


    }
}
