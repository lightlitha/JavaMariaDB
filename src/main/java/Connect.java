import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Connect
{
  public static void main(String[] args) {
    Connection conDB = null;
    Statement statement = null;
    ResultSet query = null;

    try {
      conDB = DriverManager.getConnection("jdbc:mysql://localhost/db_phiscus_747", "faceless", "24685");
      statement = conDB.createStatement();
      query = statement.executeQuery("SELECT * FROM Persons");
      while(query.next()) {
        System.out.println(
          query.getInt("PersonID") + ". " + query.getString("LastName") + " " + query.getString("FirstName")
        );
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    finally {
      try {
        query.close();
      } catch (Exception e) {
        //TODO: handle exception
      }
      try {
        statement.close();
      } catch (Exception e) {
        //TODO: handle exception
      }
      try {
        conDB.close();
      } catch (Exception e) {
        //TODO: handle exception
      }
    }
  }
}