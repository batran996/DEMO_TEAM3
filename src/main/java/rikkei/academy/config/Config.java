package rikkei.academy.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306";
    private static final String USER = "root";
    private static final String PASS = "@Roba1996";
    public  static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("ket noi thanh cong");
        } catch (ClassNotFoundException e) {
            System.out.println("that bai 1");
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.out.println("that bai 2");
            throw new RuntimeException(e);
        }
        return connection;
    }
}
