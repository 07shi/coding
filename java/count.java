import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int x= sc.nextInt();
        int arr[] = {2,3,2,4,2};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;

            }
        }
        System.out.println("Number of occurences");
        System.out.println(count);
    }
}
