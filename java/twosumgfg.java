import java.util.*;
public class twosumgfg {
    static boolean twosum(int arr[], int target){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            int rem = target - arr[i];
            if(set.contains(rem)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean result = twosum(arr, target);
        System.out.println(result);

    }
}
