package Model;

import java.sql.*;

public class DataAccessHelper {

    public Connection conn = null;
    
    /**
     * Hàm này để tạo kết nối với cơ sở dữ liệu
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */
    public void connectDatabase() throws ClassNotFoundException, SQLException {
//        String url = "jdbc:sqlserver://192.168.1.7:1433;encrypt=true;databaseName=QuanLyThuVien_10;integratedSecurity=true;";
        String user = "sa";
        String pass = "01012001";
//        Class.forName("com.mysql.jdbc.Driver");
//        conn = DriverManager.getConnection(url, user, pass);
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
    	String url = "jdbc:sqlserver://192.168.1.7:1433;databaseName=QuanLyThuVien_3;integratedSecurity=false;trustServerCertificate=true;";
		conn = DriverManager.getConnection(url, user, pass);
		Statement sta = conn.createStatement();
		String Sql = "select * from NhaPhatHanh";
		ResultSet rs = sta.executeQuery(Sql);
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
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
