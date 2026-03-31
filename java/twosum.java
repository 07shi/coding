import java.util.*;
public class twosum {
    public static void main(String args[]){
       int nums[] = {-2,-3,5,6};
       int[] ans = new int[2];
       int target = 2;
        ans[0] = ans[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    
                }
            }
        }
    
        System.out.println("Index " + ans[0]+ ", Index " + ans[1]);
    }
}

