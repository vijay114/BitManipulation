public class Base10toBinary {

    public static String convertBase10toBinary(int number) {

        int n = number;
        StringBuilder sb = new StringBuilder();

        while(n != 1) {
            if(n % 2 == 0) sb.append("0");
            else sb.append("1");
            n = n/2;
        }
        sb.append(1);

        sb.reverse();

        return sb.toString();

    }


    public static void main(String[] args) {

        int number = 13;
        String result = convertBase10toBinary(number);
        System.out.println("Binary of " + number + " is:" +result);

        // using in-built functions
        result = Integer.toBinaryString(number);
        System.out.println("Binary of " + number + " is:" +result);
        
    }
}