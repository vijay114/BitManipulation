package basics;

public class SetBit {
    
    public static void main(String[] args) {
        
        int number = 9;
        int bit = 2;

        int result = number | (1 << bit);
        System.out.println("Result: " + result);

    }

}
