import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Authentication auth = new Authentication();
        
        System.out.println("Welcome to HAMBERT SCHOOL COMPLEX");

        boolean isAuthenticated = false;
        while (!isAuthenticated) {
            // Perform login
            isAuthenticated = auth.login();

            if (!isAuthenticated) {
                System.out.println("Login failed! Please try again or type 'exit' to quit.");
                System.out.print("Would you like to try again? (yes/exit): ");
                String choice = scanner.nextLine().trim().toLowerCase();
                if (choice.equals("exit")) {
                    System.out.println("Thank you for using HAMBERT SCHOOL COMPLEX. Goodbye!");
                    scanner.close();
                    return;
                }
            }
        }

        // After successful login
        System.out.println("Login successful!");
        System.out.println("Loading your dashboard...");

        // Fetch user details to determine role-based access
        User loggedInUser = Database.getUser(auth.getLoggedInUsername()); // Assume auth tracks logged-in user

        if (loggedInUser != null) {
            switch (loggedInUser.getRole()) {
                case "admin":
                    showAdminDashboard();
                    break;
                case "teacher":
                    showTeacherDashboard();
                    break;
                case "student":
                    showStudentDashboard();
                    break;
                case "parent":
                    showParentDashboard();
                    break;
                default:
                    System.out.println("Unknown role! Please contact support.");
            }
        } else {
            System.out.println("An error occurred. Could not retrieve user details.");
        }

        // Close scanner at the end
        scanner.close();
    }

    // Admin dashboard logic
    private static void showAdminDashboard() {
        Syste
