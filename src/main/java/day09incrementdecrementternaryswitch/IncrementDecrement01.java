package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {

        int a=5;
        System.out.println(a);//5

//increment
        a=a+2;// veya a+=2 ayni sey

        System.out.println(a);//7

// ex 1) int olusturun ve onu iki sekilde 5 artirin

        int x=10;
        System.out.println(x);//10
        x=x+5;
        System.out.println(x);//15
        x+=5;
        System.out.println(x);//20

        //carpma ile artirma

        int d=6;
        System.out.println(d);
        d=d*2;
        System.out.println(d);
        d *=2;
        System.out.println(d);

//decrement

        int c=8;
        System.out.println(c);//8

        c=c-3;
        System.out.println(c);//5

        c-=3;
        System.out.println(c);//2

// bolme ile azaltma

        int e=24;
        System.out.println(e);//24

       e= e/2;
        System.out.println(e);//12

        e/=2;
        System.out.println(e);//6

// 1 ile increment ve decrement
        int f=12;
        f=f+1;
        f+=1;
        f++;//sadece birler icin kullanilir 1 ile olan artirmada bu kullanilir




        int h=10;

        h=h-1;
        h-=1;
        h--;// sadece birler icin kullanilir 1 ile olan eksiltmelerde bu kullanilir



        //"post-increment"(sonra artirma) ve "pre-increment"(once-artirma)


        int i=10;
        int k=i++;//post-increment cunku increment veriable `in isminden sonra geliyor
        System.out.println(i);//11 ===> "i"i satir sonunda artirildigi icin "i" degeri 11 olur
        System.out.println(k);//10  ==> "i" artirilmadan"k" ya konuldugu icin k nin degeri 10 olur


        int m=15;
        int n=++m;//pre-increment cunku increment veriable isminden once yazildi
        System.out.println(m);// 16 "m" satir sonunda artirildigi icin "m" degeri 16 olur
        System.out.println(n);//16  "m" artirildiktan sonra "n" ye koudugu icin 'n" degeri 16 olur


        //"post-decrement"(sonra artirma) ve "pre-decrement"(once-artirma)

        int p=17;//  p :16
        int r=p--;// r 17:

        System.out.println(p);
        System.out.println(r);

        int s =20;//19
        int t=--s; //19

        System.out.println(s);
        System.out.println(t);




    }
}
