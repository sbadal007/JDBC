package st;

import util.DbUtil;

import java.sql.Statement;

public class deletedemo {
    public static void main(String[] args) {
        try{
            Statement st = DbUtil.getConnection().createStatement();
            st.executeUpdate("delete from emp_tbl where id=4 ");

            System.out.println("Data has been Deleted:");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
