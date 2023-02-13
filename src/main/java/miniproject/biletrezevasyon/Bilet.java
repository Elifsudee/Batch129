package miniproject.biletrezevasyon;

public class Bilet {

    //mesafe, yolculuk tipi, fiyat ve koltuk no

    public double distance; //messafe
    public int typeNo; //yolculuk tipi
    public double price; //fiyat bilgisi
    public  int seatNo; //koltuk no

    //5=bileti yazdiralim

    public void printBilet(Bus bus){
        System.out.println("toplam tutar " +this.price);

        System.out.println("--Bilet Detayi---");
        System.out.println("otobus plaka "+bus.numberPlate);
        System.out.println("mesafe  : "+this.distance);
        System.out.println("yolculuk tipi  : "+(this.typeNo==1 ? "tek yon":"gidis-donus"));
        System.out.println("koltuk no  : "+this.seatNo);
        System.out.println("keyifli yolculuklar dileriz...");
    }
}
