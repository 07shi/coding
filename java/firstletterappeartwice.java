import java.util.*;

public class firstletterappeartwice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                System.out.println(s.charAt(i));
                break;
            }
            else{
                set.add(s.charAt(i));
            }
        }
        
    }
}
