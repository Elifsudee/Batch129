package day05typecastingstringmanipulations;

public class SwapValues {


    public static void main(String[] args) {

       //Swap:yer degistirmek demektir. 1 kapta:patates 2. kap domates==> 1. kap:domates 2. kap:patates

       int a=12;
       int b=5;// sawp ten sonra ==> a=5 ve b=12 olmali

        int temp=0;

        System.out.println("a: "+ a);//12
        System.out.println("b: "+b);//5
// 1. yol
        //I)adim
        temp=a;
        //II) adim
        a=b;
        // III) adim
        b=temp;

        System.out.println("a: "+a);//5
        System.out.println("b: "+b);//12

        // 2.yol


      int x=12;
       int y=5;
        System.out.println("x" +x);
        System.out.println("y" +y);

       x=x+y;// 12+5=17
       y=x-y;//17-5=12
       x=x-y;// 17-12=5

        System.out.println("x" +x);
        System.out.println("y"+ y);




    }
}
