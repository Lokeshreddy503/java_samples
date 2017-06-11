package com.dss;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lokesh
 */
public class Lokesh extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Lokesh() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			//String uname = request.getParameter("uname");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","lokesh");
			Statement statement = connection.createStatement();
			/*int i= statement.executeUpdate("insert into local values('"+uname+"')");
			if(i==0)
			{
				writer.println("failre");
			}
			else
			{
				writer.println("sucess");
				
			}
			*/
			ResultSet set = statement.executeQuery("select name from lokesh");
			//set.getC
			//ResultSetMetaData data = set.getMetaData();
			//set.
			String string = set.getString(1);
			while(set.next())
			{
				//for(int i=0;i<=)
				writer.println(string);
				
			}
			
		}
		catch(Exception e){}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
