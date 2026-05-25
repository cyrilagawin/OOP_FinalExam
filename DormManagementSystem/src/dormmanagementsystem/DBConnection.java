
package dormmanagementsystem;

import java.sql.*;

//this class is responsible for letting the user access the database for CRUD operations
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/dorm_management";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    public static Connection getConnection() throws SQLException {       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver not found: " + e.getMessage());
        }
        return DriverManager.getConnection(URL, USER, PASSWORD); //the main function that will be used to do the queries in the first place
    }
}