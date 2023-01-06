package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {

        //Exaple 1: Verilen bir String de 'a' karakteri haric tum karakterleri yazdiriniz

        // "Madagaskar===> Mdgskr
        String s = "Madagaskar";

        // 1.yol

        String t = s.replace("a", "");

        System.out.println(t);

        //2 yol

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != 'a')
                System.out.print(ch);
        }

        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                continue;// continue keywordu bazi sartlar icin loopun adaimlarini atlamamizi saglar
            }//if
            System.out.print(ch);

        }//for









    }






}