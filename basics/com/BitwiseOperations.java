public class BitwiseOperations {

    public static void main(String[] args) {
        
        int number1 = 13;
        int number2 = 7;
        
        // AND
        System.out.println(String.format("%d & %d = %d", number1, number2, number1 & number2));

        // OR
        System.out.println(String.format("%d | %d = %d", number1, number2, number1 | number2));

        // XOR
        System.out.println(String.format("%d ^ %d = %d", number1, number2, number1 ^ number2));

        // NOT
        System.out.println(String.format("~ %d = %d", number1, ~number2));

        int shift = 2;
        // LEFT SHIFT
        System.out.println(String.format("%d << %d = %d", number1, shift, number1 << shift));

        // RIGHT SHIFT
        System.out.println(String.format("%d >> %d = %d", number1, shift, number1 >> shift));



    }
    
}
