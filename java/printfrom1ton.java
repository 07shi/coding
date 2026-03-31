import java.util.*;
public class printfrom1ton {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1,n);
    }
    public static void print(int x,int n){
        if(x>n) return;// stopping condition
        System.out.println(x);
        print(x+1,n);
    }

    
}
