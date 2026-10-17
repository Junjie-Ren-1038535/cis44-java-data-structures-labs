import java.util.Arrays;
import java.util.Random;

public class SortingTester {

    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 25000, 50000, 100000};

        System.out.println("--- The Sorting Race ---");

        for (int n : sizes) {
            System.out.println("\n--- Testing for array size n = " + n + " ---");
            int [] average = generateRandomArray(n);
            int [] best = generateSortedArray(n);
            int [] worst = generateReverseSortedArray(n);

            System.out.println("Average Case: ");
            runAndTimeAllSorts(average);
            System.out.println();

            System.out.println("Best Case: ");
            runAndTimeAllSorts(best);
            System.out.println();

            System.out.println("Worst Case: ");
            runAndTimeAllSorts(worst);
            System.out.println();

            // TODO: Call your test methods for Average, Best, and Worst cases.
        }
    }

    // TODO: Implement the runAndTimAllSorts helper method.
    public static void runAndTimeAllSorts(int [] arr){
        int [] arr1 = arr.clone();
        int [] arr2 = arr.clone();
        int [] arr3 = arr.clone();

        System.out.println("Running Selection Sort: ");
        long timeBefore1 = System.currentTimeMillis();
        SortingAlgorithms.selectionSort(arr1);
        long timeAfter1 = System.currentTimeMillis();
        System.out.println("It took " + (timeAfter1 - timeBefore1) + "ms to run!" );

        System.out.println("Running Insertion Sort: ");
        long timeBefore2 = System.currentTimeMillis();
        SortingAlgorithms.insertionSort(arr2);
        long timeAfter2 = System.currentTimeMillis();
        System.out.println("It took " + (timeAfter2 - timeBefore2) + "ms to run!" );

        System.out.println("Running Merge Sort: ");
        long timeBefore3 = System.currentTimeMillis();
        SortingAlgorithms.mergeSort(arr3);
        long timeAfter3 = System.currentTimeMillis();
        System.out.println("It took " + (timeAfter3 - timeBefore3) + "ms to run!" );

    }
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int [] newArr = new int[size];
        for (int i = 0; i < newArr.length; i++){
            newArr[i] = rand.nextInt(10000);
        }
        // Implementation provided in previous response
        return newArr;
    }

    public static int[] generateSortedArray(int size) {
        // Implementation provided in previous response
        int [] newArr = new int[size];
        for (int i = 0; i < newArr.length; i++){
            newArr[i] = i;
        }
        // Implementation provided in previous response
        return newArr;
    }

    public static int[] generateReverseSortedArray(int size) {
        // Implementation provided in previous response
        int [] newArr = new int[size];
        for (int i = 0; i < newArr.length; i++){
            newArr[i] = size - i;
        }
        // Implementation provided in previous response
        return newArr;
    }
}