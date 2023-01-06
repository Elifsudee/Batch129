package day09incrementdecrementternaryswitch;

public class NestedTernary01 {

    public static void main(String[] args) {

        //example1: verilen yilin "artik yil"(Leap yil interviv sorusu) olup olmadigini kontrol eden kodu yaziniz
        // 1) yil 100 e bolunuyorsa 400 e de bolunmeli  1600===>leap  1800===> Leap degil

        // 2) yil 100 bolunmuyorsa  4 e bolunmeli  2004===> leap 5005==> Leap degil

        int year=1600;

       String result= year%100 ==0 ?(year%400==0) ?  "Leap"  :  "Not Leap" : (year%4==0  ?  "Leap ": "Leap degil");

        System.out.println(result);






  int yil=1600;

     String result8= yil%100==0  ?  (yil%400 ==0 ? "leap yil"  : "leap yil degil")  :(yil%4 ==0 ? "leap yil"  :"leap yil degil");


        System.out.println(result8);


      String dayName="Sali";


    if(dayName.equalsIgnoreCase("Pazar")){
        System.out.println(1);
    }else if(dayName.equalsIgnoreCase("Pazartesi")){

        System.out.println(2);
    }else if(dayName.equalsIgnoreCase("Sali")){
        System.out.println(3);
    }else if(dayName.equalsIgnoreCase("Carsamba")) {
        System.out.println(4);
    }else if(dayName.equalsIgnoreCase("Persembe")) {
        System.out.println(5);
    }else if(dayName.equalsIgnoreCase("cuma")) {
        System.out.println(6);
    }else if(dayName.equalsIgnoreCase("cumartesi")) {
        System.out.println(7);
    }else
        System.out.println("gecerli gun ismi giriniz");

  switch (dayName){
      case"Pazar":
          System.out.println(1);
          break;

      case "Pzartesi":
          System.out.println(2);
          break;
      case "Sali":
          System.out.println(3);
          break;

      case "Carsamba":
          System.out.println(4);
          break;
      case "Persembe":
          System.out.println(5);
         break;
      case "cuma":
          System.out.println(6);
         break;
      case "Cumartesi":
          System.out.println(7);
         break;
      default:
          System.out.println("Gecerli gun ismi giriniz");

  }








    }
}
