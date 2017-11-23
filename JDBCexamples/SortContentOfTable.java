package SimpleGui;

import java.sql.*;

/**
 * Created by enes on 11/21/2017.
 */
public class SortContentOfTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/testDb","name","pass");
        
        Statement stmt = con.createStatement();
        String query = "select * from emp order by name";
        String query1 = "select * from emp order by name, job";
        
        ResultSet rs = stmt.executeQuery(query);
        System.out.println("Table contents sorted by Name");
        System.out.println("Id name job");
        
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String job = rs.getString("job");
            System.out.println(id + " " + name + "  " + job);
        }
        
        rs = stmt.executeQuery(query1);
        System.out.println("table contents after sorted by name & job");
        System.out.println("Id name Job");

        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String job = rs.getString("job");
            System.out.println(id + " " + name + "  " + job);
        }
    }


}
