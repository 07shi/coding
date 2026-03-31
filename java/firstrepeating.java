import java.util.*;
public class firstrepeating {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashSet <Integer> set = new HashSet<>();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println("First Repeating Element: "+arr[i]);
                return;

            }
            set.add(arr[i]);
        }
        System.out.println("Non repeatng element");
    }
}
