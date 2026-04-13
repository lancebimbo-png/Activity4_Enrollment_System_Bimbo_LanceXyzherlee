package studentenrollmentsystem_act4;

import java.sql.*;

public class DBconnection {

    private static Connection Myconnection;
    private static final String URL = "jdbc:mysql://localhost:3306/activity4_enrollment_db";
    private static final String USER = "root";
    private static final String PASS = "@Goodkidz123";

    public static void init() {
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Class not found: " + ex.getMessage());
            }
            Myconnection = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Init Error: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        if (Myconnection != null) {
            return Myconnection;
        } else {
            try {
                Myconnection = DriverManager.getConnection(URL, USER, PASS);
            } catch (Exception ex) {
                System.out.println("Connection Error!");
                ex.printStackTrace();
            }
        }
        return Myconnection;
    }

    public static void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                System.out.println("Error closing ResultSet: " + e.getMessage());
            }
        }
    }
}
