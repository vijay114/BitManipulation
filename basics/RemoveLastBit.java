package basics;

public class RemoveLastBit {
    
    public static void main(String[] args) {
        int number = 13;
        int result = number & (number-1);
        System.out.println("Result: " + result);
    }
}
