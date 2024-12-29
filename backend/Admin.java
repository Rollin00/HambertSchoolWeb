import java.util.List;

public class Admin {

    private String adminId;
    private String name;

    // Constructor
    public Admin(String adminId, String name) {
        this.adminId = adminId;
        this.name = name;
    }

    // Method for managing users (add/remove)
    public void manageUser(List<User> userList, String action, User user) {
        if (action.equalsIgnoreCase("add")) {
            if (!userList.contains(user)) {
                userList.add(user);
                System.out.println("User " + user.getUsername() + " added successfully.");
            } else {
                System.out.println("User " + user.getUsername() + " already exists.");
            }
        } else if (action.equalsIgnoreCase("remove")) {
            if (userList.contains(user)) {
                userList.remove(user);
                System.out.println("User " + user.getUsername() + " removed successfully.");
            } else {
                System.out.println("User " + user.getUsername() + " does not exist.");
            }
        } else {
            System.out.println("Invalid action: " + action + ". Please use 'add' or 'remove'.");
        }
    }

    // Method to handle fee management for students
    public void manageFees(Student student, double feeAmount) {
        if (feeAmount < 0) {
            System.out.println("Error: Fee amount cannot be negative.");
        } else {
            student.updateFees(feeAmount);
            System.out.println("Fee management completed for student " + student.getName() + ". Remaining arrears: " + student.getFeesArrears());
        }
    }

    // Getters and setters
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
