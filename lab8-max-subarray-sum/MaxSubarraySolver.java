public class MaxSubarraySolver {

    /**
     * Finds the maximum subarray sum using a brute-force approach.
     * Theoretical Complexity: O(n^2)
     */
    public static int bruteForceMaxSum(int[] arr) {
        // TODO: Implement the O(n^2) brute-force algorithm.
        int maxSubArr = arr[0];
        //set the arr[0] as the max sub array (we will assume that that is the
        // highest subarray first)

        for(int i = 0; i <arr.length; i++){
            int sumsub = 0;
            //set the sub array sum to 0 everytime that it exclude the elem
            // at the very first element.
            for(int j = i; j <arr.length; j++){
                // add up the sum from j =i till j is equal to last element
                sumsub += arr[j];

                if (sumsub > maxSubArr) maxSubArr = sumsub;
                // if at anytime the sum of the sub array till element j
                // is greater than the max sum, we will preserve that number
            }

        }
        return 0; // Placeholder
    }

    /**
     * Finds the maximum subarray sum using Kadane's Algorithm.
     * Theoretical Complexity: O(n)
     */
    public static int kadanesAlgorithmMaxSum(int[] arr) {
        // TODO: Implement the O(n) Kadane's Algorithm.
        int RunningCount = arr[0];
        int AbsMax = arr[0];

        for (int i = 0; i < arr.length; i++){
            RunningCount = Math.max(arr[i], RunningCount + arr[i]);
            // for each index in array, we are checking if it is
            // better to start counting the subarray at index [i]
            // if the thing at index [i] is greater than the previous sub array + arr[i]
            // then arr[i] is greater than arr[x to i] combined
            // meaning that arr[i] is a more optimal sub array to start with

            if (AbsMax < RunningCount) AbsMax = RunningCount;
            // we will update the absMax if the runningCount is greater than the cur absMax
            // meaning that the algorithm found a better solution.
        }
        return AbsMax; // Placeholder
    }
}