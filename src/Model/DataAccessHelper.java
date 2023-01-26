package Model;

import java.sql.*;

public class DataAccessHelper {

    public static Connection conn = null;
    
    /**
     * Hàm này để tạo kết nối với cơ sở dữ liệu
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */
    public void connectDatabase() throws ClassNotFoundException, SQLException {
        // String url = "jdbc:mysql://localhost:3306/tkxdpm";
        // String user = "root";
        // String pass = "1996";
        String url = "";
        String user = "";
        String pass = "";
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);
    }

    /*Hàm này để đóng kết nối cơ sở dữ liệu
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */
    public void closeDatabase() throws SQLException {
        conn.close();
    }

}
