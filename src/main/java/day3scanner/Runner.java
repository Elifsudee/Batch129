package day3scanner;

public class Runner {
    public static void main(String[] args) {

        //Object nasil olusturlur.
        // Class ismi  + Object Ismi +Atama Operatoru+new keyword + Constructor

        Car             myCar           =               new          Car();

        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);

        myCar.hareket();// zaten yazdır oldugundan tekrardan sout yapmaya gerek yok

        myCar.dur();


        Student tomHanks= new Student();
        System.out.println(tomHanks.name);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.address);

        tomHanks.study();

        tomHanks.feed();









    }
}
