import java.util.*;
public class finddistinct{
    public static void main(String args[]){
        int arr[] = {2,2,3,2};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            set.add(arr[i]);

        }
        System.out.println(set);
    }
}