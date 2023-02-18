package zinterview;

import java.util.ArrayList;
import java.util.List;

public class Listi7Haric3Artir {
    public static void main(String[] args) {



        //7 haric digerlerini 3 artir
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(7);
        nums.add(11);
        nums.add(35);

        for(Integer w:nums){
            if(w==7){
                continue;
            }
            nums.set(nums.indexOf(w),w+3);
        }

        for (int i = 0; i <nums.size() ; i++) {
            if(nums.get(i)==7){
                continue;
            }
            nums.set(i,nums.get(i)+3);
        }

    }
}
