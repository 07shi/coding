public class SubStringOfString {
    public static void main(String args[]){
        // String s = "Jaishankar";
        // System.out.println(s.substring(2));
        // System.out.println(s.substring(1,5));
        // System.out.println(s.substring(1,s.length()));
        // System.out.println(s.substring(1,s.length()-1));
        // String s = "gopi";
        // for(int j=1;j<=s.length();j++){
        //     System.out.println(s.substring(0,j));
        // }
        String s = "gopi";
        for(int i=0;i<s.length();i++){
            for(int j = i;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");

            }
            System.out.println();
        }
    }
}
