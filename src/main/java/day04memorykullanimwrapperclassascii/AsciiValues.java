package day04memorykullanimwrapperclassascii;

public class AsciiValues {

    //javada her karekterin bir sayısal degeri vardir.
    // Bu degerler Ascii Degerler olarak adlandirilir.
    // Bu degerlerin tamanin bulundugu tabloya ASCII Table denir

    public static void main(String[] args) {
      // herhangi bir kareketeri ascii degerini bulmak icin "int" data tipinde bir veriables icine koyunuz

        int ch='A';
        System.out.println(ch);

        int unlem='!';
        System.out.println(unlem);

        char c1= 'K';
        char c2='?';
        //javada charlari matematiksel işlemlerde kullanirsaniz java o degerlerin Ascii degerlerini kullanir.
        System.out.println(c1+c2);//138

        char space = ' ';//bosluk
        System.out.println(space+0);

        int space1=' ';
        System.out.println(space1);

        char sayi5='5';
        System.out.println(sayi5);


        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);



    }
}
