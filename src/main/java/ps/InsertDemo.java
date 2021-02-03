package ps;

import util.DbUtil;

import java.io.DataInput;
import java.sql.PreparedStatement;

public class InsertDemo {
    public static void main(String[] args) {
        try{
            String SQL= "insert into emp_tbl(user_name, password)value (?,?) ";
            PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
            ps.setString(1, "Sita");
            ps.setString(2, "pass");
            ps.executeUpdate();
            System.out.println("Data Inserted: ");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
