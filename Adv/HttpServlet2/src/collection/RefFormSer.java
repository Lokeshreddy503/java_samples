package collection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RefFormSer
 */
public class RefFormSer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RefFormSer() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String fno=request.getParameter("fno");
		HttpSession httpSession = request.getSession();
		
		if(fno.equals("1"))
		{
			String string = request.getParameter("fname");
			String string1 = request.getParameter("lname");
			String string2 = request.getParameter("email");
			httpSession.setAttribute("fname",string);
			httpSession.setAttribute("lname", string1);
			httpSession.setAttribute("email", string2);
			response.sendRedirect("http://localhost:9999/HttpServlet2/WebContent/f2.html");
		}
		if(fno.equals("2"))
		{
			String string3 = request.getParameter("cnt");
			int i = Integer.parseInt(request.getParameter("pno"));
			String string4 = request.getParameter("Address");
			httpSession.setAttribute("cnt", string3);
			httpSession.setAttribute("pno", i);
			httpSession.setAttribute("Address", string4);
			response.sendRedirect("Form3.html");
		}
		if(fno.equals("3"))
		{
			response.setContentType("text/css");
			PrintWriter printWriter = response.getWriter();
			String string5 = request.getParameter("qual");
			String string6 = request.getParameter("per");
			httpSession.setAttribute("qual", string5);
			httpSession.setAttribute("per", string6);
			String string = (String)httpSession.getAttribute("fname");
			String string1 = (String)httpSession.getAttribute("lname");
			String string2 = (String)httpSession.getAttribute("email");
			String string3 =(String)httpSession.getAttribute("cnt");
			String string4 = (String)httpSession.getAttribute("Address");
			int i = (Integer)httpSession.getAttribute("pno");
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@loclahost:1521:xe","system","lokesh");
				
				PreparedStatement preparedStatement = con.prepareStatement("insert into lokesh values(?,?,?,?,?,?,?,?)");
				preparedStatement.setString(1, string);
				preparedStatement.setString(2, string1);
				preparedStatement.setString(3, string2);
				preparedStatement.setInt(4, i);
				preparedStatement.setString(5, string3);
				preparedStatement.setString(6, string4);
				preparedStatement.setString(7, string5);
				preparedStatement.setString(8, string6);
				int k=preparedStatement.executeUpdate();
				if(k!=0)
				{
					printWriter.println("fname:"+string);
					printWriter.println("lname:"+string1);
					printWriter.println("email:"+string2);
					printWriter.println("number:"+i);
					printWriter.println("Addtress"+string3);
					printWriter.println(string4);
					printWriter.println(string5);
					printWriter.println(string6);
					
					
				}
				else
					
				{
					printWriter.println("hi");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
