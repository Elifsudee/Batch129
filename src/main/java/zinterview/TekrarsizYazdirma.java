package zinterview;

public class TekrarsizYazdirma {

    public static void main(String[] args) {


        // 4=Example 9: Bir strig deki tekrarsiz karakterleri ekrana yazdirin
        // abbccdc==>ad******onemli soru

        String s="abb";
      char ch=  s.charAt(0);

      if(s.indexOf(ch)==s.lastIndexOf(ch)){
          System.out.println(ch);
      }

      char ch1=s.charAt(1);
      if(s.indexOf(ch1)==s.lastIndexOf(ch1)){
          System.out.println(ch1);
      }

        char ch2=s.charAt(2);

      if(s.indexOf(ch2)==s.lastIndexOf(ch2)){
          System.out.println(ch2);
      }




    }
}
