import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class OnlineExamSystem {
    static Scanner sc = new Scanner(System.in);
    static boolean sessionActive = true;
    static Timer timer = new Timer();

    public static void main(String[] args) {
        User user = new User("admin", "1234");

        System.out.print("Enter username: ");
        String u = sc.next();
        System.out.print("Enter password: ");
        String p = sc.next();

        if (user.login(u, p)) {
            System.out.println("Login Successful!");
            startTimer();

            while (sessionActive) {
                System.out.println("\n1. Update Profile\n2. Attempt MCQ\n3. Logout");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("New Username: ");
                        String newU = sc.next();
                        System.out.print("New Password: ");
                        String newP = sc.next();
                        user.updateProfile(newU, newP);
                        break;

                    case 2:
                        System.out.println("Q: What is Java?\nA. Programming Language\nB. Coffee\nC. OS\nD. None");
                        System.out.print("Enter answer (A/B/C/D): ");
                        String ans = sc.next().toUpperCase();
                        user.selectAnswer(ans);
                        System.out.println("Answer Selected: " + ans);
                        break;

                    case 3:
                        logout();
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            }
        } else {
            System.out.println("Login Failed!");
        }
    }

    static void startTimer() {
        System.out.println("Exam started. Timer set for 1 minute.");

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (sessionActive) {
                    System.out.println("\nTime's up! Auto-submitting your answers...");
                    logout();
                }
            }
        }, 60000); // 1 minute = 60000 milliseconds
    }

    static void logout() {
        sessionActive = false;
        timer.cancel();
        System.out.println("Session Closed. Logged out successfully.");
    }
}
