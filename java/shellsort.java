public class shellsort {
    
    // Shell Sort function
    public static void shellSort(int[] arr) {
        int n = arr.length;
        int gap = n / 2;
        
        // Start with a large gap, then reduce the gap
        while (gap > 0) {
            // Perform insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                
                // Shift elements that are gap positions apart
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                
                arr[j] = temp;
            }
            
            gap /= 2;  // Reduce the gap
        }
    }
    
    // Function to print array
    
    
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        int n =arr.length;
    
        
        
        shellSort(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

    

