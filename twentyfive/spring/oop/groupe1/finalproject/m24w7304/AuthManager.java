package twentyfive.spring.oop.groupe1.finalproject.m24w7304;

import org.jetbrains.annotations.Nullable;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthManager {

    // Admin login check
    public static boolean adminLogin(String username, String password) {
        try {
            String sql = "SELECT password FROM admins WHERE username=? AND deleted=0";
            Boolean storedPassword = getaBoolean(username, password, sql);
            if (storedPassword != null) return storedPassword;
        } catch (Exception e) {
            System.out.println("Error during admin login: " + e.getMessage());
        }
        return false;
    }

    // Student login check
    public static boolean studentLogin(String username, String password) {
        try {
            String sql = "SELECT student_id, password FROM students WHERE username=? AND deleted=0";
            Boolean storedPassword = getaBoolean(username, password, sql);
            if (storedPassword != null) return storedPassword;
        } catch (Exception e) {
            System.out.println("Error during student login: " + e.getMessage());
        }
        return false;
    }

    @Nullable
    private static Boolean getaBoolean(String username, String password, String sql) throws SQLException {
        PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(sql);
        stmt.setString(1, username);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            String storedPassword = rs.getString("password");
            return PasswordEncoder.matches(password, storedPassword);
        }
        return null;
    }
}
