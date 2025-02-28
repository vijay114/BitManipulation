package basics;

public class FindSingleNumber3 {

    public static void main(String[] args) {
        
        int[] nums = new int[]{1,2,3,1,2,3,4,5};

        // find unique 2 numbers

        long XOR = 0;

        for(int num: nums) {
            XOR = XOR ^ num;
        }

        long rightMostBit = (XOR & (XOR - 1)) ^ XOR;

        long bucket1 = 0;
        long bucket2 = 0;

        for(int num: nums) {
            if((rightMostBit & num) == 0) {
                bucket1 = bucket1 ^ num;
            } else {
                bucket2 = bucket2 ^ num;
            }
        }

        System.out.println("Two non repeated numbers are: " + bucket1 + " & " + bucket2);

    }


}
