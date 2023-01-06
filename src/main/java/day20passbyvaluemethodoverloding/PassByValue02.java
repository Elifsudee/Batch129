package day20passbyvaluemethodoverloding;

public class PassByValue02 {
    public static void main(String[] args) {


        String name="Tom Hanks";

        updateName(name,"Jr");
        System.out.println("name = " + name);//Tom Hank

        String updetName= updateName(name,"Jr");
        System.out.println("updetName = " + updetName);//Tom Hanks Jr

        name= updateName(name,"Jr");//orjinal degere degistrirlmis degeri atatik artik orijinal degeri degistirdik


    }//main

    public static String updateName(String name, String add){
        name=name+""+add;
        return name;
    }

}
