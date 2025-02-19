package basics;

public class MinFlipsToTargetNumber {
    
    public static void main(String[] args) {
        int number = 10;
        int target = 7;

        int minFlipsNumber = number ^ target;

        int minFlips = 0;

        while(minFlipsNumber > 0) {
            minFlipsNumber = minFlipsNumber & (minFlipsNumber - 1);
            minFlips++;
            minFlipsNumber = minFlipsNumber >> 1;
        }

        if(minFlipsNumber == 1) minFlips++;

        System.out.println("Minimum flips required to convert " + number + " to " + target + " is: " + minFlips);

    }

}
