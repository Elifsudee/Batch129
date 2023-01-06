package day11loops;

public class C03_ForLoop {
    public static void main(String[] args) {


        //   interwiew sorusu
        //String karakterleri teker teker yazdiran eger 'a' kararkterini gorurse yazdirmayi durduran kodu yaziniz
        
        String cumle= "Ogrenmek yasamin tek kanitidir";

        for (int i = 0;    i <cumle.length()   ;   i++) {

            if(cumle.charAt(i)=='a'){
                break;
            }//if body

            System.out.print(cumle.charAt(i)+" ");
        }//for

        //   interwiew sorusu
        //String karakterleri teker teker yazdiran eger 'a' kararkterini gorurse yazdirmayi durduran kodu yaziniz



        String d="Elif cok guzel java calisti";


        for (int i = 0; i <d.length() ; i++) {

           if(d.charAt(i)=='a'){
               break;
           }
            System.out.print(d.charAt(i));
        }


        System.out.println();





        String c="Hayatta her sey zor";

        for (int i = 0; i < c.length(); i++) {
            if(c.charAt(i)=='s'){
                break;
            }
            System.out.print(c.charAt(i )+" ");
        }













































    }


}
