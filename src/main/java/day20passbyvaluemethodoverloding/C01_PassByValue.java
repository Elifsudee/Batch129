package day20passbyvaluemethodoverloding;

public class C01_PassByValue {

    public static void main(String[] args) {


        /*
        PasByValue=Methoda Value`nin bir kopyasini gonder demektir.kopyalayip gonderiyorur
        Bu nedenle Pass By Valuda orijinal parametre degismez

        Java Pass By Value kullanir
        1) Java variable`nin orijainal degerini korumak ister
        2)Java variable `nin icindeki degeri kopyalar ve methodun icine kopya degeri gonderir.
        Deger uzerine yapilan degisiklikler orijinal parametreyi etkilemez


        Pass By Referance `da ise referans kopyalanir ve methodda kullanilir.
        Yaplan degisiklikler orijinal parametryi etkiler.
        Bu tarz programlar degeri korumka istiyorsa isi developera birakmistir.
        Kendisi degeri degistirir

         */

        int gomlek=34;
        System.out.println("gomlek = " + gomlek);//100

      //  ogrenciIndirirmi(gomlek);
       // System.out.println("gomlek = " + gomlek);//100

        gomlek=ogrenciIndirirmi(gomlek);
        System.out.println("atamadan sonraki gomlek = " + gomlek);//ayni konteynarin icine atadik indirim kalici olur

    }

    private static int ogrenciIndirirmi(int gomlek) {

       int ogrenciGomlegi= gomlek-10;

        System.out.println("ogrenciGomlegi = " + ogrenciGomlegi);
          return ogrenciGomlegi;
    }
}
