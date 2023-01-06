package day19listsvarargs;

public class C06_Varargs {
    public static void main(String[] args) {

        /*
        Farkili sayida datadar ile calisabilmek icin varargs1lar olusturulmustur
        Farkli parametreler ile calisabilen methodlar olusturmak icin vararg`lar kullanilr

        Varargs1larin arka tarainda Array`ler calisir

        Varargs`lar nasil olusturulur=( Dat type...varargsismi)veya(Data type ...varags ismi)
        varargs en sonda olamak sartiyla bir method olusturulurken farkli data type leri kullanilabili***interview
        varargs `lar bir methodda birden fazla kullanilamaz==unreachable code olur
         */

        ikiSayiyiTopla(2,3);

        ucSayiyiTopla(6,8,14);

        dotrSayininToplami(56,96,40,30);











}

    private static int dotrSayininToplami(int i, int i1, int i2, int i3) {
        return i+i1+i2+i3;
    }

    private static int ucSayiyiTopla(int i, int i1, int i2) {
       return i+i1+i2;
    }

    private static int ikiSayiyiTopla(int i, int i1) {
        return i+i1;
    }

private static int add(int...a){
        int sum=0;
        for(int w:a){

            sum=sum+w;
        }
        return sum;
}

}
