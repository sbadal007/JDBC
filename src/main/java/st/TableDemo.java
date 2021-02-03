package st;

import util.DbUtil;

import java.sql.Statement;

public class TableDemo {
    public static void main(String[] args) {
        try{
            Statement st = DbUtil.getConnection().createStatement();
            st.executeUpdate("create table emp_tbl(id int not null auto_increment, user_name varchar (45), password varchar (45), primary key (id))");
            System.out.println("Table Created: ");
        }catch ( Exception e){
            e.printStackTrace();
        }
    }
}
