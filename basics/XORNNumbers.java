package basics;

public class XORNNumbers {

    public static void main(String[] args) {
        
        int n = 10;

        int xorOfN = getXOROfNumbers(n);
        System.out.println("XOR of " + n + " is: " + xorOfN);

        int xorOfRange = getXOROfRange(4,4);
        System.out.println("XOR of range 4 to 7 is: " + xorOfRange);

    }

    private static int getXOROfRange(int a, int b) {
        int xorA = getXOROfNumbers(a - 1);
        int xorB = getXOROfNumbers(b);
        return xorA ^ xorB;
    }

    private static int getXOROfNumbers(int n) {
        if(n % 4 == 1) return 1;
        if(n % 4 == 2) return n+1;
        if(n % 4 == 3) return 0;
        if(n % 4 == 0) return n;
        return 0;
    }

}
