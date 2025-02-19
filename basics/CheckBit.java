package basics;

public class CheckBit {
    
    public static void main(String[] args) {
        int number1 = 13; // 1101
        int bit = 2;

        // Using Left Shift
        if((number1 & (1 << bit)) == 0) {
            System.out.println("Bit is not set");
        } else {
            System.out.println("Bit is set");
        }

        // Using Right Shift

        if(((number1 >> bit) & 1) == 0) {
            System.out.println("Bit is not set");
        } else {
            System.out.println("Bit is set");
        }
    }

}
