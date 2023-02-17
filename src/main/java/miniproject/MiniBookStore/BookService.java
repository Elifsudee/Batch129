package miniproject.MiniBookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2-a : book ile ilgili islemler
public class BookService implements ProductService {
    Scanner input=new Scanner(System.in);

    //3=booklari saklamak icin list olusturalim
    List<Book> books=new ArrayList<>();

    //4=Baslangicta sistemde mevcut kitaplar olsun:test etmek icin
    public BookService(){
        Book book1=new Book("Fareler ve Insanlar","120 Lira",15,"J.Stenbeck","Penguin","A111");
        Book book2=new Book("Sefiller","150 Lira",5,"Hugo","Penguin","A222");
        Book book3=new Book("Suc ve Ceza","120 Lira",15,"Dostoyevski","Dream","A333");
        this.books.add(book1);
        this.books.add(book2);
        this.books.add(book3);
    }




    @Override
    public void processMenu() {
        int choice;
        do {
            System.out.println("-----------------------------");
            System.out.println("1-Kitaplari listeleme");
            System.out.println("2-Kitap ekleme");
            System.out.println("3-Kitap  silme");
            System.out.println("4-yayin evine gore filtrelme");
            System.out.println("0 -geri don");
            System.out.println("seciminiz");
             choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:
                    listProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    System.out.println("yayin evi :");
                    String publisher=input.nextLine();
                    filterProduct(publisher);
                    break;
                case 0:
                    System.out.println("Ana menuye yonlendiriliyorsunuz");
                    break;
                default:
                    System.out.println("Hatali Giris....");
                    break;
            }


        }while (choice!=0);
    }
    //kitaplari formatla yazdir
    @Override
    public void listProduct() {
        System.out.println("--------------------------------------------");
        System.out.printf("%-2s | %-20s |%-15s |%-10s |%-4s | %-10s | %-3s\n","ID","Kitap Adi","YayinEvi","ISBN","Brim Fiyat","Stock");
        System.out.println("----------------------------------------------");
        this.books.forEach(book -> System.out.printf("%-2s | %-20s |%-15s |%-10s |%-4s | %-10s | %-3s\n",
                book.getId(),book.getName(),book.getAuthorName(),book.getPublisher(),book.getIsbn(),book.getPrice(),book.getStock()));
        System.out.println("-----------------------------------------------");

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterProduct(String filter) {

    }
}
