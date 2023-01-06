package day11loops;

public class ForLoop03 {
    public static void main(String[] args) {

        // size verilen bir string i tersden yazdirin

        String s="Elif";
        String ters="";

        for (int i = s.length()-1; i >=0 ; i--) {
        ters=   ters+s.charAt(i);

        }

        System.out.println(ters);//filE


        // Size verilen String in "Palindrome olup olamadigini kontrol ediniz
         //   civic, nalan, kucuk====

// logic:Stirng i ters cevir sonra duz hali ile ters halini karsilastir, ayni ise "Palindrome" de.

        String duz="civic";

        String ters1="";

        for (int i = duz.length()-1; i >=0; i--) {

            ters1=ters1+duz.charAt(i);

        }

  if(duz.equalsIgnoreCase(ters)){
      System.out.println(duz +" :string Palindromedir");
  }else{

      System.out.println( duz+ " :Palindrome degildir");
  }
//tekrar bak










    }
}
