package basics;

import java.util.List;

public class FindSingleNumber {
    
    public static void main(String[] args) {
        
        List<Integer> nums = List.of(4,1,2,1,2,3,3,4,12);

        int xor = 0;

        for(int num: nums) {
            xor ^= num;
        }

        System.out.println("Single Number is: " + xor);

    }
}
