package zinterview;

public class Palindrome {
    public static void main(String[] args) {

        // Size verilen String in "Palindrome olup olamadigini kontrol ediniz
        //   civic, nalan, kucuk====

        String str="nalan";
        String ters="";

        for (int i = str.length()-1; i >=0 ; i--) {

        ters=   ters+ str.charAt(i);

        }

        if(str.equals(ters)){
            System.out.println("Palindromedir");
        }else{
            System.out.println("Palindrome degildir");
        }

    }
}
