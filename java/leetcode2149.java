import java.util.*;
public class leetcode2149 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Taking the input of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Priting the array element");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int ans[] = new int[n];
        int p = 0;
        int ne = 1;
        for(int i = 0;i<n;i++){
            if(arr[i]>0){
                ans[p] = arr[i];
                p += 2;
            }
            else{
                ans[ne] = arr[i];
                ne += 2;
            }
        }
        System.out.println();
        for(int i = 0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
