package day01variables.day02datatypemethodcreation;

public class Practice {

    public static void main(String[] args) {
        long diktortgenAlan = rectangularArea(30,50);
        System.out.println("diktortgenAlan = " + diktortgenAlan);


       long diktortgenCevre = rectanglePerimeter(20,40);
        System.out.println("diktortgenCevre = " + diktortgenCevre);

       double dairecevre = circlePerimeter( 20);
        System.out.println("dairecevre = " + dairecevre);


        double daireAlan= circleArea(10);
        System.out.println("daireAlan = " + daireAlan);

    }

// Ornek 1:
 public static long rectangularArea(int kisakenar,int uzunkenar){

        return kisakenar*uzunkenar;

 }
 //Ornek 2:
    private static long rectanglePerimeter( int kisakenar, int uzunkenar){
        return (kisakenar+uzunkenar)*2;

    }
    // Ornek 3:

    public static double circlePerimeter(double yaricap ){
        return 2*yaricap*Math.PI;

    }

    //Ornek 4:

    protected static double circleArea(int yaricap){
        return Math.PI * yaricap * yaricap;

    }
}
