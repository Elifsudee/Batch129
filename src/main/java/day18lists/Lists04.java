package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {

        List<String> name= new ArrayList<>();

        name.add("Ajda");
        name.add("Cuneyt");
        name.add("Mahsun");
        name.add("Muslum");
        name.add("Orhan");

        List<String> females= new ArrayList<>();

        females.add("Ajda");
        females.add("Emel");

        // containsAll(females) "name" listinde "females" listindeki "tum elemanlarin" var olup olamdigini kontrol eder
        //Tamami varsa"true" verir, herhangi biri yoksa size"false" verir.
     boolean r=   name.containsAll(females);//name methodunda femals da olanlar var mi

        System.out.println(r);//false ajda var ama emel yok


//name.subList(1,4) "names" Listindeki indexi 1,2 ve 3 olan elemanlari bir listin icinde size verir
        //ikinci index olan 4 u vermez

      List<String> subList=  name.subList(1,3);// 1 dahil 3 dahil degil ayni subsitring deki gibi

        System.out.println("subList = " + subList);


        name.retainAll(females);

        System.out.println("name = " + name);//name = [Ajda]
        System.out.println("females = " + females);//females = [Ajda, Emel]



        //Example 1=Elektronik ve ev aletleri listler olusturunuz ve elektronik ve ev aletlerini lisyeleyiniz


        List<String> electronic= new ArrayList<>();

        electronic.add("TV");
        electronic.add("Radio");
        electronic.add("Refrigeretor");
        electronic.add("Phone");
        electronic.add("Notebook");
        System.out.println("electronic = " + electronic);// [TV, Radio, Refrigeretor, Phone, Notebook]


        List<String> homeGoods= new ArrayList<>();

        homeGoods.add("Carpet");
        homeGoods.add("Radio");
        homeGoods.add("Fork");
        homeGoods.add("Chair");
        homeGoods.add("TV");

        System.out.println("homeGoods = " + homeGoods);//homeGoods = [Carpet, Radio, Fork, Chair, TV]

        //
        homeGoods.retainAll(electronic);

        System.out.println("homeGoods = " + homeGoods);//homeGoods = [Radio, TV]

        //isEmpty listte hic eleman yoksa true verir 1 veya daha fazla eleman varsa size false verir
        // isEmpty() ile "name.size()==0" ayni anlama gelir

        name.isEmpty();//hic eleman yoksa true verir bos mu


        //replaceAll()

        System.out.println( name.hashCode());//2041509 javanin urettigi bir data



    }
}
