import java.util.*;

public class buteforce2149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int pos[] = new int[n / 2];
        int neg[] = new int[n / 2];

        int p = 0, ne = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                pos[p++] = nums[i];
            } else {
                neg[ne++] = nums[i];
            }
        }

        int result[] = new int[n];
        int i = 0;
        p = 0;
        ne = 0;

        while (i < n) {
            result[i++] = pos[p++];
            result[i++] = neg[ne++];
        }

        for (int j = 0; j < n; j++) {
            System.out.print(result[j] + " ");
        }
    }
}