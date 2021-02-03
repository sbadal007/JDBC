package st;

import util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) {
        try{
            Statement st = DbUtil.getConnection().createStatement();
            st.executeUpdate("insert into emp_tbl(id, user_name, password)value (1,2,3)");
            System.out.println("Data inserted: ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
