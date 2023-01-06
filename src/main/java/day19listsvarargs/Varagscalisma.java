package day19listsvarargs;

public class Varagscalisma {


    public static void main(String[] args) {


        m1(0);



        m1(01, 01, 2,0, 2,3);





    }

    static void m1(int... a) {



        System.out.println("***> " + a.length);



        for (int i : a) {



            System.out.print(i + " ");



        }



        System.out.println();



    }



    }


