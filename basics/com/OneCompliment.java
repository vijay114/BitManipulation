public class OneCompliment {

    public static String getOneComplementString(String binaryString) {
        if (binaryString == null || binaryString.isEmpty()) {
            throw new IllegalArgumentException("Input must be a non-empty binary string.");
        }
    
        StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (ch == '0') {
                sb.append('1');
            } else if (ch == '1') {
                sb.append('0');
            } else {
                throw new IllegalArgumentException("Invalid character in binary string: " + ch);
            }
        }
    
        return sb.toString();
    }


    public static void main(String[] args) {

        int number = 13;
        String binaryString = Integer.toBinaryString(number);
        binaryString = getOneComplementString(binaryString);
        System.out.println("1's compliment of number " + number + " in binary is: " + binaryString);
        int result = Integer.parseInt(binaryString, 2);
        System.out.println("1's compliment of number " + number + " is: " + result);

        // using in-built Bitwise Operators
        result = ~number;
        System.out.println("1's compliment of number " + number + " is: " + result);


        
    }
}