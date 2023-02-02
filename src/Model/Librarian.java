package Model;

import java.sql.*;

public class Librarian extends User {

    private String librarian_ID;

    public Librarian() {
    }

    public Librarian(String librarian_ID, String user_Name, String user_Username, String user_Password,
            String user_Email, boolean user_isMale, String user_Phone) {
        super(user_Name, user_Username, user_Password, user_Email, user_isMale, user_Phone);
        this.librarian_ID = librarian_ID;
    }

    public String getlibrarian_ID() {
        return librarian_ID;
    }

    public void setlibrarian_ID(String librarian_ID) {
        this.librarian_ID = librarian_ID;
    }

    public Librarian getLibrarianByUserName(String username) throws SQLException, ClassNotFoundException {
        Librarian thuThu = null;
        connectDatabase();
        PreparedStatement st = conn.prepareStatement(
                "SELECT * FROM TaiKhoan,ThuThu where TaiKhoan.MaTK = ? and TaiKhoan.MaTK = ThuThu.MaTK");
        st.setString(1, username);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            String idLibrarian = rs.getString("MaThuThu");
            String name = rs.getString("HoTen");
            String password = rs.getString("MatKhau");
            String email = rs.getString("Email");
            boolean isMale = rs.getString("GioiTinh").equalsIgnoreCase("nam");
            String phone = rs.getString("SDT");
            thuThu = new Librarian(idLibrarian, name, username, password, email, isMale, phone);
        }
        closeDatabase();
        return thuThu;
    }

}
