class Myclass {

    int sum, diff, multi, div;

    // Constructor
    Myclass(int a, int b) {
        //int sum, diff, multi, div;

        sum = a + b;
        diff = a - b;
        multi = a * b;
        div = a / b;
    }

    public static void main(String[] args) {

        Myclass obj = new Myclass(10, 5);

        System.out.println("Sum = " + obj.sum);
        System.out.println("Difference = " + obj.diff);
        System.out.println("Multiplication = " + obj.multi);
        System.out.println("Division = " + obj.div);
    }
}

