public class swapwithout {
    static void swapwtemp(int a, int b){
        System.out.println("Original value before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a = a +b;
        b = a-b;
        a =  a-b;
        System.out.println("Values after swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        swapwtemp(a,b);

    }
}
