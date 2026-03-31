import java.util.*;
public class searchin2darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking the input of the row");
        int rows = sc.nextInt();
        System.out.println("Taking the input of column");
        int colum = sc.nextInt();
        System.out.println("Taking the input of 2d array");
        int nums[][] = new int[rows][colum];
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<colum;j++){
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println("Taking the input of target element");
        int x =sc.nextInt();
        for(int i = 0;i<rows;i++){
            for(int j=0;j<colum;j++){
                if(nums[i][j]==x){
                    System.out.println("Element found at position: "+ i +" "+ j);
                }
            }
        }
    }
}
