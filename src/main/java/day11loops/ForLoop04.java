package day11loops;

public class ForLoop04 {

    public static void main(String[] args) {
        // 5 den 8 e kadar tam sayilarin toplanini yaziniz


        int sum=0;//toplamada sonucu etkilemez bu yeni degeri koymak icin

        for (int i = 5; i <9 ; i++) {
         sum=   i+sum;

        }
        System.out.println(sum);//sorulacak sorulardan biri


//Example 2: 7 den 9 a kadar tam sayilarin carpimini verilen kodu yaziniz

        int multiply=1;

        for (int i = 7; i < 10 ; i++) {

          multiply=  multiply*i;
        }

        System.out.println(multiply);






    }
}
