package day11loops;

public class C04_ForLoop {

    public static void main(String[] args) {
        //Ex: 1 den 100 e kadar 6 ile bolunenler haric yazdirin

        for (int i = 1; i < 101; i++) {
            if(i%6!=0){
                System.out.print(i);

            }

        }


 //2.yol
        System.out.println();
        for (int i = 1; i <101 ; i++) {
            if(i%6==0){
                continue;//bosver
            }//if body
            System.out.print(i+" ");
        }//for body

 //Example intewiew size verilen bir string in ters ceviren kodu yaziniz==rivors order
        System.out.println();

        String str="Elif";//filE

        String ters="";//hiclik//yeni konteynar olusturduk

        for (int i = str.length()-1; i >-1 ; i--) {
            char harf=str.charAt(i);
           // ters=ters+harf;

            ters+=harf;

        }

        System.out.println(ters);


        String k="Kadir";
        String t="";

        for (int i = k.length()-1; i >-1 ; i--) {

            char h=k.charAt(i);
            t=t+h;

        }

        System.out.println(t);





















    }
}
