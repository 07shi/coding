import java.util.*;
public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        int rd = 0;
        for(int i =1;i<arr.length;i++){
            if(arr[rd]!=arr[i]){
                rd++;
                arr[rd]=arr[i];
            }
        }
        int count = rd+1;
        System.out.println(count);
    }
}
