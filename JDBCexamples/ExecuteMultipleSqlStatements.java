package JDBCExamples;

import java.sql.*;

/**
 * Created by enes on 11/10/2017.
 */

public class ExecuteMultipleSqlStatements{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/testDb","name","pass");

        Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        String insertEmp1 = "insert into emp values(10,'jay','trainee'";
        String insertEmp2 = "insert into emp values(11,'jayes','trainee'";
        String insertEmp3 = "insert into emp values(12,'jay','trainee'";
        con.setAutoCommit(false);

        stmt.addBatch(insertEmp1);
        stmt.addBatch(insertEmp2);
        stmt.addBatch(insertEmp3);

        ResultSet rs = stmt.executeQuery("select * from emp");
        rs.last();
        System.out.println("rows before batch execution: " + rs.getRow() );
        stmt.executeBatch();
        con.commit();

        System.out.println("batch executed");
        rs = stmt.executeQuery("select * from emp");
        rs.last();
        System.out.println("rows after batch execution = " + rs.getRow());
    }
}
