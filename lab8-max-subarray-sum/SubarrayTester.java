import java.util.Random;

public class SubarrayTester {

    public static void main(String[] args) {
        int[] sizes = {5000, 10000, 50000, 100000, 500000};

        System.out.println("--- Maximum Subarray Sum Algorithm Comparison ---");

        for (int n : sizes) {
            System.out.println("\n--- Testing for array size n = " + n + " ---");
            int [] arr = generateRandomArrayWithNegatives(n);
            testAlgo(arr);
            // TODO: Generate a random array and time both algorithms.
        }
    }
    public static void testAlgo(int [] arr){
        System.out.println("Brute Force: ");
        long start1 = System.currentTimeMillis();
        MaxSubarraySolver.bruteForceMaxSum(arr);
        long end1 = System.currentTimeMillis();
        System.out.println("It took " + (end1-start1) + "ms to run!");
        long start2 = System.currentTimeMillis();
        MaxSubarraySolver.kadanesAlgorithmMaxSum(arr);
        long end2 = System.currentTimeMillis();
        System.out.println("It took " + (end2-start2) + "ms to run!");
    }

    public static int[] generateRandomArrayWithNegatives(int size) {
        // Implementation provided in previous response
        Random rand = new Random();
        int [] newarr = new int[size];
        for (int i = 0; i < newarr.length; i++) newarr[i] = rand.nextInt(-10000,10000);
        return newarr;
    }
}