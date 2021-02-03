package st;

import util.DbUtil;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnectionDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try{
            Statement st = DbUtil.getConnection().createStatement();
            System.out.println("Connection Succeed:");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Connection failed");
        }


    }
}
