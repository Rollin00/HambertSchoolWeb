import java.util.Scanner;

public class Authentication {

    private static Scanner scanner = new Scanner(System.in);

    // Simple login logic
    public boolean login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = Database.getUser(username);
        if (user != null && user.getPassword().equals(password)) {
            // Handle successful login (store session, etc.)
            return true;
        }
        return false;
    }

    // Example logout method
    public void logout() {
        System.out.println("Logged out successfully.");
        // Clear session data if needed
    }
}
