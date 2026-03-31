import java.util.*;
public class sumofdiaogonal2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int column = sc.nextInt();
        int matrix[][] = new int[rows][column];
        System.out.println("Input the matrix element");
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<column;j++){
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<column;j++){
                if(i==j)
                    sum = sum+matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
