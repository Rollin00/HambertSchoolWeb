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
        if (action.equals("add")) {
            userList.add(user);
            System.out.println(user.getUsername() + " added successfully.");
        } else if (action.equals("remove")) {
            userList.remove(user);
            System.out.println(user.getUsername() + " removed successfully.");
        }
    }

    // Method to handle fee management for students
    public void manageFees(Student student, double feeAmount) {
        student.updateFees(feeAmount);
        System.out.println("Fee management completed for student " + student.getName());
    }

    // Getters and setters
    public String getAdminId() {
        return adminId;
    }

    public String getName() {
        return name;
    }
}
