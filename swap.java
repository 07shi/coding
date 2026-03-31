public class swap {
static void swap(int a, int b){
        System.out.println("Original value before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        
    }
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //swap(a,b);
        //System.out.println("Original value before swap");
        //System.out.println("a: "+a);
        //System.out.println("b: "+b);
        swap(a,b);
        //System.out.println("Values after swap");
        //System.out.println("a: "+a);
        //System.out.println("b: "+b);
    }
}
