package day18lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {

        //Interview sorusu
        //Example 1=Integer bir list olusturunuz
        // bu list`de birbirine en yakin iki tam sayiyi yaziniz
        //[12,23,9,11,35]===>12,11


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);

        System.out.println("nums = " + nums);//nums = [12, 23, 9, 11, 35]

        Collections.sort(nums);//***Kucukten buyuge sirala***

        System.out.println("nums = " + nums);//nums = [9, 11, 12, 23, 35]

     //indexi 1 olan ve indexi 0 olan elemani getir
        int minDiff=nums.get(1)-nums.get(0);// 1 ile 0 indexi sayilari karsilastirdik fark 2 bulduk

        for (int i = 1; i <nums.size() ; i++) {//farklari almak icin 0 degil 1 den baslanir 2 elemandan 1 elemani cikariyoruz bir sonrakindn bir oncekini cikariyoruz

          minDiff=  Math.min(minDiff,nums.get(i)-nums.get(i-1));
        }

        System.out.println("minDiff = " + minDiff);


        for (int i = 1; i <nums.size() ; i++) {

            if(nums.get(i)-nums.get(i-1)==minDiff){

                System.out.println(nums.get(i)+" and "+nums.get(i-1));
            }
        }















    }
}
