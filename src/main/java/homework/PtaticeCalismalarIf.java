package homework;

public class PtaticeCalismalarIf {

    public static void main(String[] args) {

    /*
    Example 1=Aralik,Ocak,Subat icin "Kis"
              Mart,Nisan,Mayis icin "Ilkbahar"
              Haziran,Temmuz,Agustos icin "yaz"
              Eylul, Ekim,Kasim icin "Sonbahar"
              Digerleri icin "Gecersiz Ay" yazdiriniz

     */


        String ayAdi = "eylul";
        boolean kisMi = ayAdi.equalsIgnoreCase("Ocak") || ayAdi.equalsIgnoreCase("Sabat")
                || ayAdi.equalsIgnoreCase("Mart");
        boolean ilkbaharMi = ayAdi.equalsIgnoreCase("Mart") || ayAdi.equalsIgnoreCase("Nisan")
                || ayAdi.equalsIgnoreCase("Mayis");
        boolean yazMi = ayAdi.equalsIgnoreCase("Haziran") || ayAdi.equalsIgnoreCase("Temmuz")
                || ayAdi.equalsIgnoreCase("Agustos");

        boolean sonbaharMi = ayAdi.equalsIgnoreCase("Eylul") || ayAdi.equalsIgnoreCase("Ekim")
                || ayAdi.equalsIgnoreCase("Kasim");

        if (kisMi) {

            System.out.println("Kis");
        } else if (ilkbaharMi) {
            System.out.println("Ilkbahar");
        } else if (yazMi) {
            System.out.println("yaz");
        } else if (sonbaharMi) {
            System.out.println("Sonbahar");
        } else {
            System.out.println("gecersiz ay");
        }


/*
Example 2=
 1=sifre bosluk karakterlerinden farkli en az 8 karakter iceriyorsa "Gecerli sifre"
 2=Herhangi bir pozisyonda sifre bosluk karakteri varsa "sifredee bosluk karakteri kullanmayiniz"
 3=a ve b kosullarindan birini saglamiyorsa "Gecersiz sifre" iaziniz

 */

        String sifre = "a1b2c3d4";//tekrar bak

        if (sifre.replaceAll("\\S ", "").length() > 0) {//
            System.out.println("sifrede bosluk karakteri kullanmayiniz");

        } else if (sifre.replaceAll("\\s ", "").length() >= 8) {
            System.out.println("Gecerli sifre");
        } else {
            System.out.println("Gecersiz sifre");
        }


// Example 3=Ay numarasi verdiginde ayin adini yazdian kodu yaziniz

        int ay = 1;

        if (ay == 1) {
            System.out.println("Ocak");

        } else if (ay == 2) {
            System.out.println("subat");

        } else if (ay == 3) {
            System.out.println("mart");
        }


  /*
  Example 4=
  a=son basamak 5 e esit ve 5 den buyukse yuvarlama "Son basamagi bir ust ondaliga yuvarla"
  b=son basamak 5 den kucukse yuvarlama "son basamagi bir alt ondaliga yuvarla"

   */
        int num = 124;

        if (num % 10 >= 5) {

            System.out.println("Son basamagi bir ust ondaliga yuvarla :" + (num / 10 + 1) * 10);
        } else {

            System.out.println("son basamagi bir alt ondaliga yuvarla :" + (num / 10) * 10);
        }

        String sonucc = num % 10 >= 5 ? "Son basamagi bir ust ondaliga yuvarla :" + (num / 10 + 1) * 10 : "son basamagi bir alt ondaliga yuvarla :" + (num / 10) * 10;
        System.out.println("sonucc = " + sonucc);

  /*
  Example 5=
   a=Bir ucgenin iki kenar uzunkugu esitse "Ikizkenar"
   b=Tum kenarlari esitse "Eskenar"
   c= a ve b yi saglamiyorsa "Cesit kenar" yazdiriniz

   */

        int a = 2;
        int b = 3;
        int c = 4;

        boolean ucgenMi = (a + b > c && c > a - c) && (b + c > a && a > b - c) && (a + c > b && b > a - c);
        boolean ikizKenarMi = a == b || b == c || a == c;
        boolean esKenarMi = a == b && b == c && a == c;


        if (ucgenMi) {

            if (ikizKenarMi) {
                System.out.println("ikiz kenar");

            } else if (esKenarMi) {
                System.out.println("es kenar");

            } else {
                System.out.println("cesit kenar");
            }

        } else {
            System.out.println("ucgen degil");
        }

        //String result= ucgenMi ? (ikizKenarMi ? "ikizkenar") :(esKenarMi ? "Eskenar"):"";

        //soru milli km,saniyeyi saate ,fahrenhayti  santigrata ceviriniz


        double mil = 10;
        double saniye = 7200;
        double fahrenayt = 83;
   
        String operator="fahreatdanSantigrata";
        
        if(operator.equalsIgnoreCase("mildenKilometreye")){
            System.out.println(mil*1.60934);
            
        }else if(operator.equalsIgnoreCase("saniyedenSaate")){
            System.out.println((saniye/60)/60);
        } else if (operator.equalsIgnoreCase("fahreatdanSantigrata")) {
            System.out.println((fahrenayt-32)*5/9);
        } 
        
        //soru dilbilgisi kurallari
        /*
        "ali Can"  ,"Ali can" veya "ali can"====>"Bas harflerinde hata"
        Tek kelime icin ====>"Ad veya Soyad eksik"
        Eger hepsi buyuk harf olursa ====>"Format hatasi"
        Bosluk varsa ====>"isim girilmedi"
        Harfler ve bosluktan baska herhangi bir karakter iceriyorsa ====>"Gecersiz ad"

         */

        String isim="ali Can";
        String adinIklhafi=isim.substring(0,1);

        System.out.println("adinIklhafi = " + adinIklhafi);

        int boslukIndex=isim.trim().indexOf("");


        System.out.println("boslukIndex = " + boslukIndex);

        String soyadiinIlkHarfi=isim.split(" ")[1].substring(0,1);

        System.out.println("soyadiinIlkHarfi = " + soyadiinIlkHarfi);

        Boolean adinIlkHarfiBuyukMu=(adinIklhafi.charAt(0)>='A'&& adinIklhafi.charAt(0)<='Z');

        Boolean soyadinIlkHarfiBuyukMu=(soyadiinIlkHarfi.charAt(0)>='A'&&soyadiinIlkHarfi.charAt(0)<='Z');


        if(boslukIndex==-1){                               //(boslukIndex!=0)
            System.out.println("Ad veya Soyad eksik");
        }

        if(!adinIlkHarfiBuyukMu||!soyadinIlkHarfiBuyukMu){
            System.out.println("Bas harflerinde hata");
        }

        if(isim.equals(isim.toUpperCase())){
            System.out.println("Format hatasi");
        }
        if(isim.replaceAll(" ","").length()==0){
            System.out.println("Isim girilmedi");
        }
        if(isim.replaceAll(" ","").replaceAll("[a-zA-Z]","").length()>0){
            System.out.println("Gecersiz Isim");
        }


  /*
  Example 6:Eyalet kisaltmalrini kontrol etmek icin
  a=Kisaltma 3 den fazla karakter iceriyorsa"Eyalet kisaltmalri 2 den fazla olamaz"
  b=Kisaltmada kucuk harf varsa"Eyalet kisaltmalrrinda kucuk harf olama"
  c=Kisaltmada farkli karakterler varsa ""Eyalet kisatmalari asadidakinden farkli karakter icermez"

   */

        String eyaletKisaltma = "FI3";

        if (eyaletKisaltma.length() > 2) {
            System.out.println("Eyalet kisaltmalri 2 den fazla olamaz");

        }
        if (eyaletKisaltma.replaceAll("[a-z]", "").length() != 0) {
            System.out.println("Eyalet kisaltmalrrinda kucuk harf olamaz");

        }

        if (eyaletKisaltma.replaceAll("[a-zA-Z]", "").length() != 0) {
            System.out.println("Eyalet kisatmalari asadidakinden farkli karakter icermez");
        }

/*
Example 7=Herhangi iki sayi ile toplama ,cikarma ,bolme,carpma yapiniz

 */

        double x = 10.2, y = 5;
        String operator1 = "*";

        if (operator1.equals("+")) {

            System.out.println(x + "+" + y + "=" + (x + y));

        } else if (operator1.equals("-")) {
            System.out.println(x + "-" + y + "=" + (x - y));

        } else if (operator1.equals("*")) {
            System.out.println(x + "*" + y + "=" + (x * y));

        } else if (operator1.equals("/")) {
            System.out.println(x + "/" + y + "=" + (x / y));

        }

    /*
   Example 8=Verilen BMI degerleri icin VucutKitle Endeksi ile ilgili mesajlari yazdirmak icin kod yaziniz
   0< ise "GEcersiz"
   <18.5 ise "Zayif"
   18.5-24.9 ise "Normal"
   25-29.9 ise "Fazla Kilolu"
   30 ve ustu "Obezite"
   */

        double bmi = 24.8;

        if (bmi < 0) {
            System.out.println("Gecersiz");

        } else if (bmi < 18.5) {
            System.out.println("zayif");
        } else if (bmi < 24.9) {
            System.out.println("Normal");
        } else if (bmi < 29.9) {
            System.out.println("fazla kilolu");
        } else {
            System.out.println("Obezite");
        }

//*****Ternay****

        //Exaple 8=Parola bosluk karakterinden farkli 8 karakter iceriyorsa "Gecerli Parola" daha az ise "Gecersiz Parola"

        String parola = "a1b2c3";
        String parola1 = parola.replaceAll("[\\s]", "");

        String sonuc = parola1.length() > 7 ? "Geceli" : "Gecersiz";

        System.out.println("sonuc = " + sonuc);


   /*
   Example  9=
   ucgenin iki kenari esitse "IKizkenar"
   ucgenin uc kenari esitse "Eskenar"
   bu ikisni saglamiyorsa "Cesitkenar"

    */

        int d = 5, e = 4, f = 3;
        boolean eskenar = d == e && e == f && d == f;
        boolean ikizkenar = d == e || e == f || d == f;

        String sonuc2 = eskenar ? "Eskenar Ucgen" : ikizkenar ? "IKizkenar ucgen" : "Cesitkenar ucgen";

        System.out.println("sonuc2 = " + sonuc2);

    /*Example 10=
    Bir yilin artik yil olup olmadigini yaziniz
    100 e tam bolunuyorsa 400 e de bolunmeli
    100 e tam bolunmuyorsa 4 e tam bolunmeli
     */

        int year = 1880;

        String year1 = (year % 100 == 0) ? (year % 400 == 0 ? "Artik yil" : "Artik yil degil") : (year % 4 == 0 ? "Artikk yil" : "Artikk yil degil");
        System.out.println("year1 = " + year1);


   /*
   Example 11= sifreyi kontrol etmek icin
   8 den fazla karakter iceriyorsa bas harfi 'i' olmali
   8 den fazla karakter icermiyorsa bas harfi 'k' olami
    */

        String w = "XXXXXXXXX";

        String ww = w.length() > 8 ? w.startsWith("i") ? "Gecerli " : "Gecersiz" : w.startsWith("k") ? "Gecersiz" : "Gecersiz";

        System.out.println("ww = " + ww);

        //Example 12=Bir sayinin mutlak degerini hesaplamak icin

        int i = -5;

        int isonuc = i < 0 ? -1 * i : i;

        System.out.println("isonuc = " + isonuc);

        //Example 13= 2 tamsayidan kucuk olani ekrana yazdiriniz

        int k = 13, l = 12;
        int s = k < l ? k : l;
        System.out.println(s);

        //Example 14=sayi 3 basamakli ise "Bu sayi 3 basamakli" ,aksi takdirde "Bu sayi 3 basamkli degil"

        int h = -150;

        h = Math.abs(h);

        String hSonuc = h > 99 && h < 1000 ? "Uc basamakli" : "uc basamakli degil";

        System.out.println("hSonuc = " + hSonuc);


        //Example 15=TErnary kullanaral tek sayi icin "Tek",cift sayi icin "Cift" yazdirin

        int u = 14;

        String uSonuc = u % 2 == 0 ? "Cift" : " Tek";
        System.out.println("uSonuc = " + uSonuc);


        //16= Ternary kullanarak sayi pozitif ise "Pozitif" negatif ise "Negatif" yazdiriniz

        int j = -23;
        String jSonuc = j > 0 ? "Pozitif" : "Poitif degil";

        System.out.println("jSonuc = " + jSonuc);

        //*********Switch*******
        //17=ay adi soyleyince hangi mevsim oldugunu soyleyen kodu yaziniz

        String month = "ocak";

        switch (month.toLowerCase()) {
            case "aralik":
            case "ocak":
            case "subat":

                System.out.println("Kis");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("ilkbahar");
                break;

            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("yaz");
                break;

            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("gecersiz ay");

        }


// 18=Ay numarasi verildiginde ayin adini veren kodu yaziniz

        int ayNo = 6;

        switch (ayNo) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;

            case 7:
                System.out.println("temmuz");
                break;

            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;
            default:
                System.out.println("Gecersiz numara");
        }

        //19=cinsiyet erkek ise"Erkek", kadin ise "Kadin"; farkli ise "Digerleri"

        String cinsiyet = "Kadin";

        switch (cinsiyet.toLowerCase()) {
            case "kadin":
                System.out.println("kadin");
                break;
            case "erkek":
                System.out.println("erkek");
                break;

            default:
                System.out.println("digerleri");


        }


    }
}
