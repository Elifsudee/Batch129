package day23dayttimestringbuldier;

public class StringBuilder01 {
    /*
    Java`da  "String Class" kullanilarak veya StringBuilder Class kullanilrark olusturabiliriz
    "String Class" kullanarak urettiginiz String`ler "Immutable"(degistirilimez) dir.
    "StringBuilder" Class kullanarak urettigimiz Stringler "MUtable"(degistirilibilir) dir

     */
    public static void main(String[] args) {

        //Immutable
        String s = "Java";
        String t = s + "!";//burada her biri icin ayri konteyner olusturdu.
        String w = t + "?";

        //String`i degistirdikten ayni String e assign(atama) edersiniz,Java yine yeni bir cointainer olusturur, degismis degeri bu
        // container icine koyar ve eski container`i gosteren oku yeni container`a yonlendirir. Dolayisiyla eski container agressiz kalir
        //"Garbage Collector" adresiz olan counntainer`lari siler

        String a = "Money";

        a = a + "More";//

        //Mutable
        //1.yol:StringBuilder kullanak String ueretmenin 1. yolu
        StringBuilder sb1 = new StringBuilder("Payton");
        System.out.println(sb1);//Payton

        sb1.append("!").append("?").append(".");//ayni konteynre unlem ekledi concat gibi method zinciri
        System.out.println(sb1);//Payton!?.

        //2.yol:StringBuilder kullanak String ueretmenin 2. yolu

        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0

        //StringBuldier kullandiginizda baslangic kapasitesi 16`dir
        //Kapasite asildiginda varolan kapasitenin iki fazlasi kadar varolan kapasiteye ekleme yapilir.

        System.out.println(sb2.capacity());//16//kutu sayisi

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34 var olan kutu sayisini 2 katini 2 fazlasi

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70//var olan kadar ekler 2 fazla vrir


        //3.yol:StringBuilder kullanak String ueretmenin 3. yolu

        StringBuilder sb3 = new StringBuilder(2);//tam sayi koyaraksak capasity 2 deriz.

        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6

        sb3.insert(2, "XXXXX");//2 karakteri es gec araya x koy
        System.out.println(sb3);//FlXXXXXo

        //toString() methodu StringBuilder`i String`e cevirir
        //String Class da var olan ama StringBuilder Class da var olmata(split gibi) methodlara ihiyac duydugumuzda toString()
        //kullanarak String Classa gecer ve o methodlari kullaniriz

        sb3.toString().split("l");//
        StringBuilder sb4 = new StringBuilder(sb3);//String i StringBuildere cevirme

        //reverse() methodu Strigleri ters cevirir
        sb3.reverse();//var olan Stringi tersine cevirir
        System.out.println(sb3);//oXXXXXlF

        // deleteCharAt()
        sb3.deleteCharAt(1);//index 1 deki karakteri sil
        System.out.println(sb3);

        //delete(1,5) index 1 deki character`den index 5( 6 dahil degil olamadigi icin 5 yazdim ) deki karakterleri siler
        sb3.delete(1, 5);
        System.out.println(sb3);

        StringBuilder sb5 = new StringBuilder("Java");

        StringBuilder sb6 = new StringBuilder("Java");

        // compareTo() alfabetik olrak karsilastirir. once ise negatif olur sonra ise pozitif olur
        System.out.println(sb5.compareTo(sb6));//0 alfabetik olarak karsilastirilir

        sb6.setCharAt(2, 'm');//2 karakteri m ile degistir
        System.out.println(sb6);//Jama

        sb6.replace(1, 3, "xyz");//1 ile 2 ye xyz koy

        System.out.println(sb6);//Jxyza

        //StringBuilder Class`da kullanmamiza izin verilen bazi String Class methodlari vardir(substring() method gibi)
        // Bu methodlari String Bulilder ustunde kullaninca orijinal degeri degizmez

        sb6.substring(1, 3);
        System.out.println(sb6);//Jxyza String in methodu orjinal degeri degistiremez

        String s7 = sb6.substring(1, 3);//ayri kontainere koyduk


    }
}
