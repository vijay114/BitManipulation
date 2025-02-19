package basics;

public class CheckNumberPowerOf2 {
    
    public static void main(String[] args) {
        int number = 16;

        if((number & (number - 1)) == 0) {
            System.out.println(number + " is a power of 2");
        } else {
            System.out.println(number + " is not a power of 2");
        }
    }

}
