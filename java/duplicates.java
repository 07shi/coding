import java.util.*;
public class duplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++)
            if(set.contains(arr[i])){
                System.out.println("Duplicate "+arr[i]);
            }
            else{
                set.add(arr[i]);
            }

    }
}
