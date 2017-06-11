package statements;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class staementsinjdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
		//System.out.println(connection);
		Statement statement = connection.createStatement();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Table name");
		String string = scanner.next();
		String string2 = "create table "+string+"(sno number,sname varchar2(10),smarks number)";
		statement.executeUpdate(string2);
		System.out.println("table "+string+" is successfully created ");
		
		 PreparedStatement preparedStatement = connection.prepareStatement("insert into "+string+" values(?,?,?)");
		 System.out.println("insertion started");
		 while(true)
		 {
			
			 System.out.println("enter the "+string+" number");
			 int i = scanner.nextInt();
			 System.out.println("enter the "+string+" name");
			 String string3 = scanner.next();
			 System.out.println("enter the "+string+" marks ");
		     int j  = scanner.nextInt();
			 
			 preparedStatement.setInt(1,i );
			 preparedStatement.setString(2, string3);
			 preparedStatement.setInt(3, j);
			 preparedStatement.executeQuery();
			 System.out.println("you want to enter one more record(yes/no)");
			 String string4 = scanner.next();
			 if(string4.equals("no"))
			 {
				 break;
			 }

			 
			 
			 
		 }
		 System.out.println("insertion completed");
		 String string7 = "select * from  "+string ;
		 ResultSet set = statement.executeQuery(string7);
		 System.out.println("retriving started");
		 while(set.next())
		 {
			 System.out.println(set.getInt(1)+ "------ " +set.getString(2)+ "--------" +set.getInt(3));
		 }
		 System.out.println("retriving stopped");
		 
		 
		 System.out.println("enter the table name you want to drop");
		 String string5 = scanner.next();
		 String string6 ="drop table "+string5+" ";
		 statement.executeUpdate(string6);
		

	}

}
