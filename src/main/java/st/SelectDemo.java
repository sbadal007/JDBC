package st;

import util.DbUtil;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {
    public static void main(String[] args) {
        try {
            Statement st = DbUtil.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from emp_tbl");

            while(rs.next()){
                System.out.println("Id is :"+ rs.getInt(1));
                System.out.println("UserName is :"+ rs.getString(2));
                System.out.println("Password :"+ rs.getString(3));
                System.out.println("============================================");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
