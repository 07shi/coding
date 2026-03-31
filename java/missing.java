import java.util.*;
public class missing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = new int[n + 1];
        int repeated = 0, missing = 0;
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                repeated = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }
        System.out.println(repeated);
        System.out.println(missing);
    }
}
