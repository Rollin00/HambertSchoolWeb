import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Authentication auth = new Authentication();
        
        System.out.println("Welcome to HAMBERT SCHOOL COMPLEX");
        
        // Perform login
        if (auth.login()) {
            System.out.println("Login successful!");
            // Show dashboard options
            System.out.println("Welcome to the dashboard!");
            // Logic to display the appropriate user dashboard (admin, teacher, student, etc.)
        } else {
            System.out.println("Login failed! Please try again.");
        }

        scanner.close();
    }
}
