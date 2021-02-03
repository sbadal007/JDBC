package st;

import util.DbUtil;

import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) {
        try{
            Statement st = DbUtil.getConnection().createStatement();
            st.executeUpdate("update emp_tbl set User_name= 'ram', Password= 'pass' where id = 2 ");

            System.out.println("Data has been updated:");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
