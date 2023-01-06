package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {

       // Example 1= Bir Integer listteki 7 haric tum elemanlarin degerlerini 3 artiriniz
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(12);
        nums.add(11);

        System.out.println("nums = " + nums);

 //1.yol

        for(Integer w :nums){
            if(w==7){
                continue;
            }
            nums.set(nums.indexOf(w),w+3);//idexOf w nin ilk gorunumunun indexi

        }

        System.out.println("nums = " + nums);

        //2 yol foreach indexlerle calismadigi icin fori kullamak daha uygun
        for (int i = 0; i < nums.size(); i++) {

            int element=nums.get(i);
            if(element==7){
                continue;
            }
            nums.set(i,element+3);
        }
        System.out.println(nums);

    //not nums.indexOf() ilk gorunumun indexini verir. List tekrarli eleman sahip ise nums.indexOf risk olusturur
        //Bu yuzden  bu soruda guvenli yol "For-loop" tur.


    }
}
