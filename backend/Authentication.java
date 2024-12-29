import java.util.Scanner;

public class Authentication {

    private static Scanner scanner = new Scanner(System.in);

    // Simple login logic
    public boolean login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Fetch user from the database (or any other storage mechanism)
        User user = Database.getUser(username);

        // Check if user exists and password matches
        if (user != null && user.checkPassword(password)) { // Use User's checkPassword method
            System.out.println("Login successful!");
            System.out.println("Welcome, " + user.getRole() + ": " + user.getUsername());
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    // Example logout method
    public void logout() {
        System.out.println("Logged out successfully.");
        // Clear session data if needed (e.g., invalidate session or remove tokens)
    }

    // Close scanner at the end of the program
    public static void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
