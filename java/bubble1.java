import java.util.*;
public class bubble1  {
    public static void main(String args[]){
        int[] arr = {7,1,2,8,-4};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr);// built in sort
        for(int ele : arr){
            System.out.print(ele+" ");

        }
        System.out.println();
    }
}
