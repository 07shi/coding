
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks for subject 1: ");
        double subject1Marks = scanner.nextDouble();

        System.out.print("Enter the marks for subject 2: ");
        double subject2Marks = scanner.nextDouble();
        double averageMarks = (subject1Marks + subject2Marks) / 2;

        if (averageMarks > 80) {
            System.out.println("Grade A");
        } else {
            System.out.println("Grade B");
        }
        scanner.close();
    }
}
