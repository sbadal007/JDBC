package ps;

import util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {
    public static void main(String[] args) {
        try{
            String SQL = "select * from emp_tbl";
            PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                System.out.println("User Id is:" + rs.getInt(1));
                System.out.println("Username is:" + rs.getString(2));
                System.out.println("Password is:" + rs.getString(3));
                System.out.println("==========================================");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
