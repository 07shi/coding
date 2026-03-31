import java.util.Arrays;

public class Countsort {
    public static int[] countSort(int[] inputArray) {
        int N = inputArray.length;
        int max = 0;

        // Step 1: Create the count array
        int[] countArray = new int[max + 1];

        // Step 2: Count the occurrences of each element
        for (int num : inputArray) {
            countArray[num]++;
        }

        // Step 3: Modify countArray to store cumulative counts
        for (int i = 1; i <= max; i++) {
            countArray[i] += countArray[i - 1];
        }

        // Step 4: Create the output array and sort the elements
        int[] outputArray = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }

        return outputArray;
    }

    public static void main(String[] args) {
        int[] inputArray = {4, 3, 12, 1, 5, 5, 3, 9};
        int[] outputArray = countSort(inputArray);

        // Print the sorted output array
        System.out.println("Sorted Array: " + Arrays.toString(outputArray));
    }
}
