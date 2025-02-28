package basics;

public class XORNNumbers {

    public static void main(String[] args) {
        
        int n = 10;

        int xorOfN = getXOROfNumbers(n);
        System.out.println("XOR of " + n + " is: " + xorOfN);






    }

    private static int getXOROfNumbers(int n) {
        if(n % 4 == 1) return 1;
        if(n % 4 == 2) return n+1;
        if(n % 4 == 3) return 0;
        if(n % 4 == 0) return n;
        return 0;
    }

}
