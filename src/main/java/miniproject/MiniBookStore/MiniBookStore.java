package miniproject.MiniBookStore;


  /*Proje: Mini Book Store
        Online bir kitap market için ürün yönetim uygulaması yapınız.
        Kitap markette kitap ve defter satışı olacak, ancak ileride yeni ürün çeşidi eklenebilir olmalı.

        Kitap özellikleri: id, isim, birim fiyat, stok, yazar adı, yayınevi,isbn no
        Defter özellikleri: id, isim, birim fiyat, stok, marka, yaprak sayısı,ürün kodu

        Kullanıcı ilgili kategorideki ürünleri listeleyebilmeli
        Kullanıcı kategoriye göre ürün ekleyebilmeli,ürün mevcutsa uyarı verilmeli
        Kullanıcı ürünleri benzersiz numaralarına göre silebilmeli.
        Kullanıcı ürünleri marka(defter) veya yayınevine(kitap) göre filtreleyip listeleyebilmeli.
        */


import java.util.Scanner;

public class MiniBookStore {
    public static void main(String[] args) {

        enter();

    }

    //1=product,book,notebook,
    public static void enter() {
        Scanner input=new Scanner(System.in);
        int select;
        System.out.println("------ Mini Book Store--------");
          do {
              System.out.println("urun yonetim paneli");
              System.out.println("1=Kitaplar");
              System.out.println("2= Defterler");
              System.out.println("0 Cikis");
              System.out.println("seciminiz");
              select=input.nextInt();
              input.nextLine();
              ProductService sevice;//interfaceyi referans olrak cagiriyoryz
              switch (select){
                  case 1:
                      sevice=new BookService();
                      sevice.processMenu();
                      break;
                  case 2:
                      sevice=new NotebookService();
                      sevice.processMenu();
                      break;
                  case 0:
                      System.out.println("iyi gunler....");
                      break;
                  default:
                      System.out.println("hatali giris");
                      break;
              }

          }while (select!=0);
    }
}
