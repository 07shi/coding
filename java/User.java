import java.util.Scanner;
public class User {
    String username;
    String password;
    String selectedAnswer;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String user, String pass) {
        return this.username.equals(user) && this.password.equals(pass);
    }

    public void updateProfile(String newUsername, String newPassword) {
        this.username = newUsername;
        this.password = newPassword;
        System.out.println("Profile updated successfully.");
    }

    public void selectAnswer(String answer) {
        this.selectedAnswer = answer;
    }
}

