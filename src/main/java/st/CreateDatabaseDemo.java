package st;

import util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabaseDemo {
    public static final String SQL = "create database batch12_db";
    public static void main(String[] args) {
        try{
            Statement st = DbUtil.getConnection().createStatement();
            st.executeUpdate(SQL);
            System.out.println("Database Created:");

        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
