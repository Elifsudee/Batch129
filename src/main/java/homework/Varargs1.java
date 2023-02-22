package homework;

public class Varargs1 {

    public static void main(String[] args) {

        ikiSayiTopla(3,5);
        add(3,4,5);
    }
    //iki sayiyi toplayan method
    public static void ikiSayiTopla(int a,int b){
        System.out.println(a+b);
    }

    public static void add(int...a){
        int sum=0;
        for(int w:a){
            sum=sum+w;
        }
        System.out.println(sum);
    }
}
