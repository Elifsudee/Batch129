package veriabledaytime8;

public class C01_Varargs {

    public static void main(String[] args) {

        // varags kullanarak verilen String datalri birlestiren kodu yaziniz

        String str1="Safran";
        String str2="bolu";
        String str3="Evlri";
        String str4="cok";
        String str5="Guzel";

        concat(str1,str2,str3,str4,str5);

    }//main

    private static void concat(String ...str) {
        String sonuc="";
        for(String w :str){

            sonuc+=w +" ";
        }
        System.out.println(sonuc);
    }//method


}//class
