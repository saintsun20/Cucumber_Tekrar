package _JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCParent {
    private static Connection connection;
    public static Statement statement;

    public static void DBConnectionOpen() {
        String url = "jdbc:mysql://demo.mersys.io:33906/employees";
        String username = "student";
        String password = "DEkzTd3#pzPm";

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void DBConnectionClose() {
        try {
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
