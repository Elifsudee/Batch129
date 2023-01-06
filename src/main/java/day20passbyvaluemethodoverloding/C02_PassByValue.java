package day20passbyvaluemethodoverloding;

public class C02_PassByValue {
    public static void main(String[] args) {


/*

  Gomlek            = 100 TL
  Ogrenci           = -10 TL indirim =90 TL
  Gazi              = -20 TL indirim =80 TL
  Yaslilara         = -5  tL indirim =95 TL

 */

        int gomlek=100;

        System.out.println(  indirim("ogrenci",gomlek));//90


        System.out.println(  indirim("gazi",gomlek));//80


        System.out.println(   indirim("yasli",gomlek));//95


        String kutlama="Wooow";

        System.out.println("kutlama = " + kutlama);

        System.out.println( kutlamaUnlemIle(kutlama));





    }//main

    private static String kutlamaUnlemIle(String kutlama) {

        return kutlama+"!";
    }

    private static int indirim(String durum, int gomlek) {

        switch (durum){
            case "ogrenci":
             gomlek=   gomlek-10;
             break;

            case "gazi":
             gomlek=   gomlek-20;
             break;

            case "yaslilar":
                gomlek=gomlek-5;
                break;

            default:
                gomlek=gomlek;
        }
        return  gomlek;
    }
}
