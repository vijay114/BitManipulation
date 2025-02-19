public class BinarytoBase10 {

    private static int convertBinarytoBase10(String binaryString) {
        int power2 = 1;
        int number = 0;

        for(int i = binaryString.length() - 1; i >= 0 ; i--) {
            if(binaryString.charAt(i) == '1') {
                number += power2;
            }
            power2 *= 2;
        }

        return number;

    }


    public static void main(String[] args) {
        String binaryString = "1101";
        int result = convertBinarytoBase10(binaryString);
        System.out.println("Base10 of " + binaryString + " is: " + result );
    }
}
