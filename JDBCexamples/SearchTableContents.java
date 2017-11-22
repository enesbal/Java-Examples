
import java.sql.*;

/**
 * Created by enes on 11/21/2017.
 */
public class SearchTableContents {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection(
                "jdbc://derby://localhost:1527/testDb",
                "username","password"
        );

        Statement stmt = con.createStatement();
        String query[] = {
                "Select * from emp where id =1",
                "select name from emp where name like 'ravi_'",
                "select name from emp where name like 'ravi%'"
        };

        for(String q : query){
            ResultSet rs = stmt.executeQuery(q);
            System.out.println("Names for query " + q + " are");

            while(rs.next()){
                String name = rs.getString("name");
                System.out.println(name + "  ");
            }
            System.out.println();
        }

    }


}
