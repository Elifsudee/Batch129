package day19listsvarargs;

public class Varargs01 {
    public static void main(String[] args) {

        addTwoNumbers(3,5);
        addThreeNumbers(4,7,2);

        add(4,5,6,7,8,9,11);


    }//main

    //ikisayiyi toplayan merhod
    public static void addTwoNumbers(int a,int b){
        System.out.println(a+b);
    }
    //uc sayiyi toplayan method
    public static void addThreeNumbers(int a, int b,int c){
        System.out.println(a+b+c);
    }

    //Istediginiz sayida sayiyi toplamak icin bir method olusturunuz
    /*
    Varags`lar method olustururken bize  esneklik saglar
Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar
Method'un parantezleri icine yazilanlara "parametre" denir
Method'u cagirirken kullanilan sayilara da "argument" denir.
**
not =Bir methotta birden fazla varargs parametre kullanilmaz cunku ikincisi "unreachable code" olur
not= varargs`lar varargs disindaki parametrelerle kullanilabilir ama varags her zaman son parametre olmalidir
public static void add(String s,int... a) gibi
 */


    public static void add(int... a){// ya ismin oncesi yada data type sonrasi ...

        int sum=0;
        for(int w :a){
           sum=sum+w;
        }
        System.out.println(sum);
    }

}//class
