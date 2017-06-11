package com.dss;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Regsistration
 */
public class Regsistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Regsistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("next");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		String address = request.getParameter("address");
		PrintWriter printWriter = response.getWriter();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@loclahost:1521:xe","system","lokesh");
			
			PreparedStatement preparedStatement = con.prepareStatement("insert into loki values(?,?,?)");
		    preparedStatement.setString(1, name);
		    preparedStatement.setString(2, email);
		    preparedStatement.setString(3, address);
		    int i = preparedStatement.executeUpdate();
		    if(i!=0)
		    {
		    	printWriter.println("registartion success");
		    }
		    else
		    {
		    	printWriter.println("registartion failure");
		    }
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
