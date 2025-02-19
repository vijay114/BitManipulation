package basics;

public class ClearBit {
    
    public static void main(String[] args) {
        
        int number = 13;
        int bit = 2;

        int result = number & ~(1 << bit);
        System.out.println("Result: " + result);

    }

}
