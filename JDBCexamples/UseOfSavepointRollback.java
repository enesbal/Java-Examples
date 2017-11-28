package JDBCExamples;

import java.sql.*;

/**
 * Created by enes on 11/10/2017.
 */
public class UseOfSavepointRollback{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/testDb","name","pass");

        Statement stmt = con.createStatement();
        String query1 = "insert into emp values(5,'name','job'";
        String query2 = "select * from emp";
        
        
        con.setAutoCommit(false);
        Savepoint spt1 = con.setSavepoint("svpt1");
        stmt.execute(query1);
        ResultSet rs = stmt.executeQuery(query2);
        int no_of_rows = 0 ;
        
        while(rs.next()){
            no_of_rows++;
        }
        
        System.out.println("rows before rollback statement = " + no_of_rows);
        con.rollback(spt1);
        con.commit();
        no_of_rows=0;
        rs = stmt.executeQuery(query2);
        
        while(rs.next()){
            no_of_rows++;
        }
        
        System.out.println("rows after rollback statement = " + no_of_rows);
        
        
    }
}
