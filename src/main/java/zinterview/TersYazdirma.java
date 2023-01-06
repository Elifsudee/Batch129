package zinterview;

public class TersYazdirma {
    public static void main(String[] args) {
        // size verilen bir string i tersden yazdirin


        String s="Java guzel";

        String ters="";

        for (int i = s.length()-1; i >=0 ; i--) {

        ters=   ters+ s.charAt(i);
        }
        System.out.println("ters = " + ters);
    }
}
