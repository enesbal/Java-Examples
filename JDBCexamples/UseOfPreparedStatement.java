package JDBCExamples;

import java.sql.*;

/**
 * Created by enes on 11/10/2017.
 */
public class UseOfPreparedStatement{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      Class.forName("org.apache.derby.jdbc.ClientDriver");
      Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/testDb","name","pass");
      PreparedStatement updateemp = con.prepareStatement("insert into emp values(?,?,?)");
      
      updateemp.setInt(1,23);
      updateemp.setString(2,"Roshan");
      updateemp.setString(3,"CEO");
      updateemp.executeUpdate();
      
      Statement stmt = con.createStatement();
      String query = "select * form emp";
      ResultSet rs = stmt.executeQuery(query);
      System.out.println("Id name Job");
      
      while(rs.next()){
          int id = rs.getInt("id");
          String name = rs.getString("name");
          String job = rs.getString("job");
          System.out.println(id+ "  " + name + "   " + job);
      }
    }
}
