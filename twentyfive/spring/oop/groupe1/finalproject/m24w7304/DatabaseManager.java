package twentyfive.spring.oop.groupe1.finalproject.m24w7304;

import java.sql.*;

public class DatabaseManager {
    private static Connection connection;

    // Connect to MySQL DB (adjust URL, user, pass for your setup)
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            String url = "jdbc:mysql://localhost:3306/scms_db"; // your DB name
            String user = "root";  // your DB user
            String pass = "";      // your DB password
            connection = DriverManager.getConnection(url, user, pass);
        }
        return connection;
    }

    public static ResultSet executeQuery(String query) throws SQLException {
        Statement stmt = getConnection().createStatement();
        return stmt.executeQuery(query);
    }
}
