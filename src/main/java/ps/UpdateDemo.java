package ps;

import util.DbUtil;

import java.sql.PreparedStatement;

public class UpdateDemo {
    public static void main(String[] args) {
        try{
            String SQL= "update emp_tbl set id= ? where id =5";
            PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
            ps.setInt(1,4);
            ps.executeUpdate();
            System.out.println("Data is updated");
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
