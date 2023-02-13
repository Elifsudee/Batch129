package miniproject.biletrezevasyon;

import java.util.Scanner;

/*
Project: mesafeye ve şartlara göre otobus bileti fiyatı hesaplayan uygulama
         Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
         koltuk no  bilgilerini alın.
         Mesafe başına ücret 1 Lira / km olarak alın.(Gidiş-Dönüş için *2)
         Tekli Koltuk ücreti:Koltuk numarası 3 veya 3 ün katı ise bilet fiyatı %20 daha fazladır(1.2 Lira).
         İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki kuralları uygulayın ;
         koltuk numarlari 1 den 31 ye kadar

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

       1- Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise son bilet fiyatı üzerinden %20 indirim uygulanır.
       2-Yaş indirimi:
        Kişi 12 yaşından küçükse son bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise son bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise son bilet fiyatı üzerinden %30 indirim uygulanır.


 */
public class BiletRezervasyon {
    public static void main(String[] args) {

   //1-bilet rezervasyonu icin otobus objesi olusturalim

        Bus bus =new Bus("38 PU 848"); //"1","2"..

 //4=bilet objesi olusturalim

        Bilet bilet =new Bilet();


    }
    public static void start(Bus bus){

        Scanner scan=new Scanner(System.in);

        do {
            //6-kullanicidan bilgileri alalim
            System.out.println("---Bilet rezervasyon sistemine hosgeldiniz");
            System.out.println("lutfen gidilecek mesafeyi KM olarak giriniz");
            double distance=scan.nextDouble();

            System.out.println("lutfen yolculuk tipini seciniz" );
            System.out.println("1. Tek yon");
            System.out.println("2.Gidis-Donus");
            int type=scan.nextInt();

            System.out.println("lutfen yasinizi giriniz");
            int age=scan.nextInt();

            System.out.println("lutfen koltuk no seciniz");
            System.out.println("(Tekli koltuk ucreti %20 daha fazladir)");
            System.out.println(bus.seats);
            int seat=scan.nextInt();//koltuk no secildi

            //7-secilen koltuk noyu listeden kaldir
            bus.seats.remove(String.valueOf(seat));//alinan koltuk noyu kaldir

            //8-kullanicidan alinan degerler gecerli mi

            boolean check=type ==1 ||type ==2;
            if(distance>0 &&age >0&& check){

                //9- bilet fiyatini hesaplayalim
            }else{
                System.out.println("hatali giris yaptiniz...");

            }


        }while (false);
    }

}
