package zinterview;

public class ArtikYil {
    public static void main(String[] args) {


        //example1: verilen yilin "artik yil"(Leap yil interviv sorusu) olup olmadigini kontrol eden kodu yaziniz
        // 1) yil 100 e bolunuyorsa 400 e de bolunmeli  1600===>leap  1800===> Leap degil
        // 2) yil 100 bolunmuyorsa  4 e bolunmeli  2004===> leap 5005==> Leap degil


        int yil=2400;
       String result= (yil%100==0) ? (yil%400==0 ? "Leap yil" : "Leap yil degil") :(yil%4==0 ? "Leap yil" :" Leap degil");
        System.out.println("result = " + result);


    }
}
