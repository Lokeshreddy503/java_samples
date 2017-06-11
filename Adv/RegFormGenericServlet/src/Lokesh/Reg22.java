package Lokesh;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class Reg
 */
public class Reg22 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		String fname = req.getParameter("FirstName");
		String lname = req.getParameter("LastName");
		String Email = req.getParameter("Emailid");
		String Address = req.getParameter("Address");
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			System.out.println("hi");
            PreparedStatement preparedstatement = connection.prepareStatement("insert into lokesh22 values(?,?,?,?)");
            	preparedstatement.setString(1, fname);
            	preparedstatement.setString(2, lname);
            	preparedstatement.setString(3, Address);
            	preparedstatement.setString(4, Email);
            	int i = preparedstatement.executeUpdate();
            	System.out.println("the rows updated :"+i);
            	connection.close();

			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
	}

    
    

}
