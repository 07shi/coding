import java.util.Scanner;

public class Healthchatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        System.out.println("🤖 HealthBot: Hi! I'm your health assistant. How can I help you today?");
        
        while (true) {
            System.out.print("You: ");
            userInput = scanner.nextLine().toLowerCase();

            if (userInput.contains("exit") || userInput.contains("bye")) {
                System.out.println("🤖 HealthBot: Take care! Stay healthy. Goodbye!");
                break;
            } else if (userInput.contains("fever")) {
                System.out.println("🤖 HealthBot: I'm sorry to hear that. Do you also have a cough or headache?");
            } else if (userInput.contains("cough")) {
                System.out.println("🤖 HealthBot: It could be a cold or flu. Drink warm fluids and rest.");
            } else if (userInput.contains("headache")) {
                System.out.println("🤖 HealthBot: Try to relax and stay hydrated. If it persists, consult a doctor.");
            } else if (userInput.contains("sore throat")) {
                System.out.println("🤖 HealthBot: Gargling with warm salt water may help. Do you have a fever too?");
            } else if (userInput.contains("thank")) {
                System.out.println("🤖 HealthBot: You're welcome! Let me know if you need anything else.");
            } else {
                System.out.println("🤖 HealthBot: Can you tell me more about your symptoms?");
            }
        }

        scanner.close();
    }
}
 
