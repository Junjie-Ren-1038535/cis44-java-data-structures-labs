public class SortingAlgorithms {

    /**
     * Implements the Selection Sort algorithm.
     * Theoretical Complexity: O(n^2)
     */
    public static void selectionSort(int[] arr) {
        // TODO: Implement the Selection Sort algorithm.
        for(int i = 0; i < arr.length; i++){
            int minimumIndex = i;
            // select the index with the smallest number

            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[minimumIndex]){
                    minimumIndex = j;
                    //find the index with the minimum amount
                }
            }

            int temp = arr[i];
            arr[i] = arr[minimumIndex];
            arr[minimumIndex] = temp;
            // swap the smallest element with the next index to be sorted,
            // now the array is sorted till the index.
        }
    }

    /**
     * Implements the Insertion Sort algorithm.
     * Theoretical Complexity: O(n^2) / Best-Case: O(n)
     */
    public static void insertionSort(int[] arr) {
        // TODO: Implement the Insertion Sort algorithm.
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            //select the index that have not been sorted yet
            while(j >= 0 && arr[j] > key){
                // we go check if arr[j] is greater than key, if yes that means they
                // belong to later of the array
                // so we will shift them right
                arr[j+1] = arr[j];
                // at max j, j+1 = i, which is our key, so it can be safely overridden
                j--;
            }
            // we reach here if arr[j] < key
            arr[j+1] = key; // j+1 is where it should go
        }
    }

    /**
     * Implements the Merge Sort algorithm. Public-facing method.
     * Theoretical Complexity: O(n log n)
     */
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Already sorted
        }
        int[] temp = new int[arr.length];
        mergeSortRecursive(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSortRecursive(int[] arr, int[] temp, int left, int right) {
        // TODO: Implement the recursive logic for Merge Sort.
        if(left >= right) return;
        // a list is fully sorted when its element is -1 or 0 elements long

        int mid = (left + right)/2;
        // we want to calc the mid point so we can split the problem into 2 sections each time

        mergeSortRecursive(arr, temp, left, mid);
        // recursively call on the left part to sort
        mergeSortRecursive(arr, temp, mid + 1, right);
        // recursively call on the right part to sort
        merge(arr, temp, left, mid, right);
        // combine the sorted left and right part
        }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        // TODO: Implement the merge logic for Merge Sort.
        for(int i = left; i <= right; i++){
            temp[i] = arr[i];
            //copy the part of the arr that belongs to this sort
        }

        int l = left;
        //assign left part of the res from mergesort
        int r = mid + 1;
        //assign left part of the res from mergesort but right part

        for(int i = left; i <= right; i++ ){
            // we start from the first element that this sort have access to
            // and stop when we reach the last element that we have access to
            if(l > mid){
                //if l > mid then it means that the left part of the merge sort
                // is all completed being placed in the array
                // all we have to do is to put the right part of the array in the
                // order that it was recieved because of the magic of recursion
                arr[i] = temp[r];
                r++;
            } else if (r > right){
                // same to case 1 but vice versa
                arr[i] = temp[l];
                l++;
            } else if (temp[l] <= temp[r]){
                // here if we still have things to compare
                // places which ever is smaller to arr[i]
                // the next part is the same, except that the next part
                // will place temp[r] instead
                arr[i] = temp[l];
                l++;
            } else {
                arr[i] = temp[r];
                r++;
            }
        }


    }
}
