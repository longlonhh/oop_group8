package quan_ly_quan_bida;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Class_ket_noi {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Test;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "sa";
    private static final String PASSWORD = "123456"; 

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Kết nối thành công!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Kết nối thất bại!");
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Đóng kết nối thành công!");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Đóng kết nối thất bại!");
            }
        }
    }
}
