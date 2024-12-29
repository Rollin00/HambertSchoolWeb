import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/hambert_school";
    private static final String USER = System.getenv("DB_USER");  // Fetch user from environment variable
    private static final String PASSWORD = System.getenv("DB_PASSWORD");  // Fetch password from environment variable

    // Static block to load JDBC driver (optional, based on JDBC version)
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Ensure MySQL driver is loaded
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // Log or throw custom exception here if necessary
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
