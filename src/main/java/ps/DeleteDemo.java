package ps;

import util.DbUtil;

import java.sql.PreparedStatement;

public class DeleteDemo {
    public static void main(String[] args) {
        try{
            String SQL = "delete from emp_tbl where id =?";
            PreparedStatement ps= DbUtil.getConnection().prepareStatement(SQL);
            ps.setInt(1, 2);
            ps.executeUpdate();
            System.out.println("data is deleted:");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
