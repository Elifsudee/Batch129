package veriablepractive07;

public class HesapMakinesi {


    public void toplama(int... a){

        int toplam=0;

        for(int w:a){

          toplam=  toplam+w;

        }
        System.out.println(toplam);
    }



    public void cikarma(int ...a){
        int fark=0;

        for(int w :a){
        fark -= w;
        }

        System.out.println(fark);

    }

    public  void carpma(int ...a){
        int carpim=1;

        for(int w :a){
            carpim *= w;
        }

        System.out.println(carpim);

    }

    public  void bolme(int a,int b){

        if(b==0){
            System.out.println("Hic bir sayi sifira bolunemez");
        }else{

            System.out.println("bolme " +a/b);
        }



    }





}
