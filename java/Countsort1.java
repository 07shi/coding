import java.util.*;
public class Countsort1 {
        public static void main(String[] args) {
            // Example input array
            int[] arr = {4, 2, 2, 8, 3, 3, 1};
    
            // Step 1: Find the maximum value in the array
            int max = arr[0]; // Assume the first element is the maximum
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i]; // Update max if a larger value is found
                }
            }
            System.out.println("Maximum value in the array: " + max);
    
            // Step 2: Create a count array to store the frequency of elements
            int[] count = new int[max + 1]; // Size is max + 1 to include index for the max value
    
            // Step 3: Count the occurrences of each element
            for (int num : arr) {
                count[num]++;
            }
    
            // Step 4: Reconstruct the sorted array
            int index = 0;
            for (int i = 0; i < count.length; i++) {
                while (count[i] > 0) {
                    arr[index++] = i;
                    count[i]--;
                }
            }
    
            // Step 5: Output the sorted array in more steps
            System.out.println("Sorted array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" "); // Newline after printing the array
        }
    }
}     
    
    

