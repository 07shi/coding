import java.util.*;

public class insertion {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the elements in array");
        int array[] = new int[size];
        for(int i = 0; i<size; i++){
            array[i]=sc.nextInt();

        }
        System.out.println("Array after insertion");
        for(int i = 1; i<array.length; i++){
            int temp = array[i];
            int j = i-1;
            while(j>=0 && array[j]>temp){
                array[j+1]=array[j];
                j--;

            }
            array[j+1]=temp;

        }
        for(int i = 0; i<array.length; i++ ){
            System.out.println(array[i]);
        }
    }
    
}
