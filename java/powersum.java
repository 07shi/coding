public class powersum {
    static int func(int a, int b){
        if(b==0){
            return 1;

        }
        else{
            return a * func(a,b-1);
        }
    }
    public static void main(String args[]){
        int a = 2, b = 3;
        int result = func(a,b);
        System.out.println(result);
    }
}
