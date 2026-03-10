package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
   // Class.forName("com.mysql.cj.jdbc.Driver");
    private static final String URL = "jdbc:mysql://localhost:3306/neolider_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Machado98@";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}