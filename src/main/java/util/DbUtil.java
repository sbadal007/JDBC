package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
    public static final String DRIVER ="com.mysql.cj.jdbc.Driver";
    public static final String URL ="jdbc:mysql://localhost:3306/batch10_db";
    public static final String USER_NAME ="root";
    public static final String PASSWORD ="root";
  //  public static final String SQL = "select * from emp";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        Connection con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
      //  System.out.println("Database Connected:");
        return con;
    }

    /*public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try{
            Class.forName(DRIVER);
            Statement st = DbUtil.getConnection().createStatement();
            st.executeUpdate(SQL);
            System.out.println("DB created");
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }

    }*/

}
