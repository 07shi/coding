import java.util.Scanner;
public class palindromicstring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            int temp = s.charAt(i);
            s.charAt(i) = s.charAt(j);
            s.charAt(j) = temp;
            i++;
            j--;
        }
        System.out.println(s);
    }
    
}
