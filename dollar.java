import java.util.Scanner;

class dollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = 83.0;        
        System.out.print("Enter amount in Dollars: ");
        double dollars = sc.nextDouble();        
        double rupees = dollars * rate;
        System.out.println(dollars + " USD = " + rupees + " INR");
        
    }
}

