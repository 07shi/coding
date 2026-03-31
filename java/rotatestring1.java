import java.util.*;
public class rotatestring1 {
    public static boolean rotate(String s, String goal){
        if(s.length()!=goal.length()) return false;
        return (s+s).contains(goal);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.dxcnextLine();
        String goal = sc.nextLine();
        //String s = "abcde";
        //String goal = "cdeab";
        System.out.println(rotate(s,goal));

        
    }
}
