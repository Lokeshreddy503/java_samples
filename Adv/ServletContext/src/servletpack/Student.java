package servletpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student
 */
public class Student extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    private Connection connection;
     public void init(javax.servlet.ServletConfig config) throws ServletException 
     {
    	 ServletContext context = config.getServletContext();
    	
    	 String Driver = context.getInitParameter("driver");
    	 String url = context.getInitParameter("url");
    	 String username = config.getInitParameter("username");
    	 String password = config.getInitParameter("password");
    	 System.out.println(Driver);
    	 try
    	 {
    		 Class.forName(Driver);
    		 connection=DriverManager.getConnection(url,username,password);
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    		 
    	 }
    	 super.init(config);
     };
    

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//int id=0;
		//String name="";
		//String marks ="";
		try
		{ 
			PrintWriter out = res.getWriter();
			
			
			int id = Integer.parseInt(req.getParameter("sid"));
			String string = req.getParameter("sname");
			int marks =Integer.parseInt(req.getParameter("smarks"));
			PreparedStatement preparedstatement = connection.prepareStatement("insert into student values(?,?,?)");
			preparedstatement.setInt(1, id);
			preparedstatement.setString(2, string);
			preparedstatement.setInt(3, marks);
			int i =preparedstatement.executeUpdate();
			System.out.println(" rows updated "+i);
			if(i!=0)
			{
				out.println("sucess");
			}
			else
			{
				out.println("fail");
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
		
	}
@Override
public void destroy() {
	// TODO Auto-generated method stub
	try
	{
		connection.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	super.destroy();
}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
