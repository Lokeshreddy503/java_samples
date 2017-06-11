

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registaration
 */
public class Registaration extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registaration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	public void service(ServletRequest req, ServletResponse rep) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
			

			
			
				// TODO Auto-generated method stub
				String fname = req.getParameter("FirstName");
				String lname = req.getParameter("LastName");
				String Email = req.getParameter("Emailid");
				String Address = req.getParameter("Address");
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
					
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


