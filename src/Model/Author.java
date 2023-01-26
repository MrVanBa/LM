package Model;

import java.sql.*;
import java.util.*;

public class Author extends DataAccessHelper {

    private int author_ID;
    private String author_Name;

    private final String GET_LIST_AUTHOR = "SELECT * FROM tkxdpm.tacgia";
    private final String GET_MAX_ID = "SELECT Max(maTacGia) FROM tkxdpm.tacgia";
    private final String ADD_AUTHOR = "INSERT INTO tkxdpm.tacgia VALUES (?,?)";

    public Author() {
    }

    public Author(int author_ID, String author_Name) {
        this.author_ID = author_ID;
        this.author_Name = author_Name;
    }

    public int getauthor_ID() {
        return author_ID;
    }

    public void setauthor_ID(int author_ID) {
        this.author_ID = author_ID;
    }

    public String getauthor_Name() {
        return author_Name;
    }

    public void setauthor_Name(String author_Name) {
        this.author_Name = author_Name;
    }

    /**
     * Hàm này lấy ra tên tác giả từ mã tác giả
     * 
     * @param idAuthor mã tác gải bạn muốn lấy tên
     * @return tên tác giả
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public String getNameAuthorByIdAuthor(int idAuthor) throws ClassNotFoundException, SQLException {
        String nameAuthor = "";
        connectDatabase();
        PreparedStatement st = conn.prepareStatement("SELECT * FROM tkxdpm.tacgia where maTacGia =?");
        st.setInt(1, idAuthor);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            nameAuthor = rs.getString("tenTacGia");
        }
        closeDatabase();
        return nameAuthor;
    }

    /**
     * Hàm này lấy ra danh sách các tác giả có trong hệ thống.
     * 
     * @return danh sách các tác giả có trong hệ thống
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public ArrayList<Author> getListAuthor() throws ClassNotFoundException, SQLException {
        ArrayList<Author> authors = new ArrayList<>();
        connectDatabase();
        PreparedStatement ps = conn.prepareStatement(GET_LIST_AUTHOR);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int idAuthor = rs.getInt("maTacGia");
            String nameAuthor = rs.getString("tenTacGia");
            authors.add(new Author(idAuthor, nameAuthor));
        }
        closeDatabase();
        return authors;
    }

    /**
     * Hàm này lấy ra mã lớn nhất của các tác giả có trong hệ thống.
     * 
     * @return mã lớn nhất của tác giả có trong hệ thống
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int getMaxIdAuthor() throws ClassNotFoundException, SQLException {
        int maxId = 0;
        connectDatabase();
        PreparedStatement ps = conn.prepareStatement(GET_MAX_ID);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            maxId = rs.getInt(1);
        }
        closeDatabase();
        return maxId;
    }

    /**
     * Hàm này thêm mới một tác giả vào trong hệ thống.
     * 
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void addAuthor() throws ClassNotFoundException, SQLException {
        connectDatabase();
        PreparedStatement ps = conn.prepareStatement(ADD_AUTHOR);
        ps.setInt(1, author_ID);
        ps.setString(2, author_Name);
        ps.executeUpdate();
        closeDatabase();
    }

}
