package basics;

public class Swap2Num {
    public static void main(String[] args) {
        int number1 = 13;
        int number2 = 7;

        number1 = number1 ^ number2;
        number2 = number1 ^ number2;
        number1 = number1 ^ number2;

        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);
    }
}
