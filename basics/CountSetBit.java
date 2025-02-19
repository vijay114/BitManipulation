package basics;

public class CountSetBit {
    
    public static void main(String[] args) {
        
        int originalNumber = Integer.MAX_VALUE;
        int number = originalNumber;

        int count = 0;

        // BRUTE FORCE
        while(number > 1) {
            count += number & 1;
            number = number >> 1;
        }

        if(number == 1) count++;

        System.out.println(originalNumber + " has " + count + " set bits.");

        // Better way
        int n = originalNumber;

        int bitCount = 0;
        while(n != 0) {
            n = n & (n-1);
            bitCount++;
        }

        System.out.println(originalNumber + " has " + bitCount + " set bits.");


    }

}
