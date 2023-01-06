package day12loopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {

        // Example1= 3 den 10 a kadr tamsayilari yazdiriniz

        // 1 yol

        for (int i = 3; i <11 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        // 2 yol while-loop
        int i=3;

        while (i<11){
            System.out.print(i+" ");

            i++;
        }


// ex 2) 23 de 12 ye kadar cift tam sayilari ekrama yazdiriniz

        int k=23;

        while (k>11) {

            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
            k--;
        }


        System.out.println();

        // Example 3= Verilen bir tam sayinin rakamlari toplamini konsala yazdiran kodu yazdiriniz
//1 yol while
        int num =7578;

       num= Math.abs(num);
        int sum=0;

        while (num>0){

           sum=sum+ num%10;

            num/=10;
        }

        System.out.println(sum);

// 2 yol for loop

        int a=684;
        int toplam=0;

        for( int m=a  ; m>0   ;m/=10   ){

        toplam=    toplam+m%10;
        }
        System.out.println(toplam);

    }
}
