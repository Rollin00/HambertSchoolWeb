import java.util.HashMap;
import java.util.Map;

public class Database {
    // Example data stores
    private static final Map<String, User> users = new HashMap<>();
    
    static {
        // Preload users (username: password: role)
        users.put("admin", new User("admin", "admin123", "admin"));
        users.put("teacher1", new User("teacher1", "teacher123", "teacher"));
        users.put("student1", new User("student1", "student123", "student"));
        users.put("parent1", new User("parent1", "parent123", "parent"));
    }

    // Method to authenticate users
    public static User getUser(String username) {
        return users.get(username);
    }

    // Additional methods for handling database interactions (e.g., attendance, fees) can go here
}
