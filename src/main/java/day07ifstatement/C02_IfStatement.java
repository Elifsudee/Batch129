package day07ifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

//kullanici gun numarasini girsin kod gun ismini yazsin
        //1==>pazarr
        //2==>pazartesi 5==persembe

        Scanner input=new Scanner(System.in);

        System.out.println("lutfen gun nurasini giriniz...\n1:pazar,2:pazartesi,3:sali,4:carsamba,5:persembe,6:cuma,7:cumartesi");

            byte gunNo=input.nextByte();

            if(gunNo==1){
                System.out.println("pazar");
            }else if(gunNo==2){
                System.out.println("pazartesi");
            }else if(gunNo==3){
                System.out.println("sali");
            }else if(gunNo==4){
                System.out.println("carsamba");
            }else if(gunNo==5){
                System.out.println("persembe");
            }else if(gunNo==6){
                System.out.println("cuma");
            }else if(gunNo==7){
                System.out.println("cumartesi");
            }else{
                System.out.println("lutfen gecerli bir gun numarasi giriniz...\n1:pazar,2:pazartesi,3:sali,4:carsamba,5:persembe,6:cuma,7:cumartesi");
            }







    }


}
