package day20passbyvaluemethodoverloding;

public class PassByValue01 {
    public static void main(String[] args) {

      /*
      1)Java "pss-by-value" sayesinde veriable`larin orijinal degerini koruma altina alir

       */



        double shirt=100;

        discount("student",shirt);//method

        double studentShirtPrice=  discount("student",shirt);

        System.out.println("shirt = " + shirt);//100.0

        System.out.println("studentShirtPrice = " + studentShirtPrice);//90.0


        discount("gazi",shirt);//method
        double veteranShirtPrice=  discount("gazi",shirt);

        System.out.println("veteranShirtPrice = " + veteranShirtPrice);//80.0


        discount("senior",shirt);//method

        double seniorShirtPrice=discount("senior",shirt);
        System.out.println("seniorShirtPrice = " + seniorShirtPrice);//95.0

        shirt= discount("gazi",shirt);//gazilere yaptigimiz indirimi herkese yapmak isterek gazi indirimini asil fiyata ekleriz

        System.out.println("shirt = " + shirt);//80.0


    }//main
    public static double discount(String state, double price){
        switch (state){
            case "student":
                price=price*0.90;
                break;

            case "gazi":
                price=price*0.80;
                break;

            case "senior":
                price=price*0.95;
                break;
            default:
                price=price;

        }//swictch
             return price;
    }//method


}
