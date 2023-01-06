package yasinhocapratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_Ekle_Cikar {

    public static void main(String[] args) {
        //Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen, list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.

        List<Integer> list=new ArrayList<>();

        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("Ekleme yapmak icin : 'add'\n "+
                    "guncellemek icin 'set' \n"+ "silmek icin 'remove' \n"+"cikmak icin break giriniz");

            String komut= input.next();
            if(komut.equalsIgnoreCase("add")){
                System.out.println("eklemek istediginiz sayiyim giriniz");

                int num=  input.nextInt();
                list.add( num);
            }else if(komut.equalsIgnoreCase("set")){
                System.out.println("guncellemek sayiyi giriniz");

                int sayiGuncellenecekIndex=input.nextInt();

                System.out.println("yerine eklemek istediginiz sayiyi giriniz");

                int yeniSayi=    input.nextInt();
                list.set(sayiGuncellenecekIndex,yeniSayi);

            }else if(komut.equalsIgnoreCase("remove")){
                System.out.println("silmek isteginiz sayiyi giriniz");
                Integer silinecek=input.nextInt();
                list.remove(silinecek);
            }else if(komut.equalsIgnoreCase("break")){
                break;
            }else{
                System.out.println("gecerli bir komut giriniz");
            }

            System.out.println(list);
        }
        System.out.println("gule gule");

    }
}
