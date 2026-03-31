class Cricketer{
    static String country = "NZ";
    int nums;
    String name;
    double avg;

}
public class finalstatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        c1.country = "England";
        System.out.println(c1.country);
    }
    
}
