import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class savepoint 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
           Statement statement = connection.createStatement();
           connection.setAutoCommit(false);
           String string = "insert into lokesh values(001,'pspk',1)";
           String string1 = "insert into lokesh values(002,'mb',2)";
           String string2 = "insert into lokesh values(003,'ramcharan',3)";
           String string3 = "insert into lokesh values(004,'alluarjun',4)";
           String string4 = "insert into lokesh values(005,'nani',5)";
           String string5 = "insert into lokesh values(006,'rajtarun',6)";
           
           //statement.executeUpdate(string);
          
           //statement.executeUpdate(string1);
  
          // statement.executeUpdate(string2);
           
           statement.executeUpdate(string3);
           statement.executeUpdate(string4);
           Savepoint savepoint = connection.setSavepoint();
           
           statement.executeUpdate(string5);
           
           connection.rollback(savepoint);
           connection.commit();
           System.out.println("operation are completed");
           
           connection.close();
		
	}
	
}
