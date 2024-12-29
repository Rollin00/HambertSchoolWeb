import org.mindrot.jbcrypt.BCrypt;

public class User {
    private String username;
    private String password; // Hashed password
    private String role; // student, teacher, parent, admin

    // Constructor
    public User(String username, String plainPassword, String role) {
        this.username = username;
        this.password = hashPassword(plainPassword); // Hash the password before storing it
        this.role = role;
    }

    // Password hashing method
    public static String hashPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

    // Method to check if the entered password matches the hashed password
    public boolean checkPassword(String enteredPassword) {
        return BCrypt.checkpw(enteredPassword, this.password);
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String plainPassword) {
        this.password = hashPassword(plainPassword); // Hash the new password before storing it
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
