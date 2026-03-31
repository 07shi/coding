import java.util.Scanner;

public class lastoccurrences {
    static int lastoccurrences(int arr[], int x){
        int lastIndex =-1;
        for(int i =0; i<arr.length;i++){
            if(arr[i]==x){
                lastIndex = i;
            }
        }
        return lastIndex;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            

        }
        System.out.println("The array is");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("last occurrences x:");
        System.out.println(lastoccurrences(arr,x));
    }
    
}


