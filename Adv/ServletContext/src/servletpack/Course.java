package servletpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Course
 */
public class Course extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Course() {
        super();
        // TODO Auto-generated constructor stub
    }
    private Connection connection;

	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		// TODO Auto-generated method stub
		ServletContext context = config.getServletContext();
   	 String Driver = context.getInitParameter("driver");
   	 String url = context.getInitParameter("url");
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		super.init(config);
	}
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{ 
			PrintWriter out1 = res.getWriter();
			
			
			int id1 = Integer.parseInt(req.getParameter("cid"));
			String string1 = req.getParameter("cname");
			
			//PreparedStatement preparedstatement = connection.prepareStatement();
			PreparedStatement preparedStatement2 = connection.prepareStatement("insert into course values(?,?)");
			preparedStatement2.setInt(1, id1);
			preparedStatement2.setString(2, string1);
			System.out.println("hi before");
			 
			int j =preparedStatement2.executeUpdate();
			System.out.println(" rows updated "+j);
			if(j!=0)
			{
				out1.println("sucess");
			}
			else
			{
				out1.println("fail");
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
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		super.destroy();
	}

}
