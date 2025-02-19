package basics;

public class ToggleBit {
    
    public static void main(String[] args) {
        int number = 13;
        int bit = 1;

        int result = number ^ (1 << bit);
        System.out.println("Result: " + result);
    }

}
