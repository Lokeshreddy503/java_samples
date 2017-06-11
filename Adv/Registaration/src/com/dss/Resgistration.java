package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Resgistration
 */
public class Resgistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Resgistration() {
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
		String string=request.getParameter("uname");
		String string2=request.getParameter("upwd");
		String string3=request.getParameter("gender");
		String[] string4=request.getParameterValues("qual");
		String string5=request.getParameter("Address");
		String string6=request.getParameter("email");
		if(string3.equals("male"))
		{
			string3="male";
		}
		else
		{
			string3="female";
		}
		response.setContentType("text/css");
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println("username:" +string);
		printWriter.println("Password:" +string2);
		printWriter.println("geneder:" +string3);
		
		printWriter.println("Address:" +string5);
		printWriter.println("email:" +string6);
		printWriter.println("Qualification");
		for( String ss: string4)
		{
			System.out.println("<li>" +ss+ "</li>");
		}
		
		
	}

}
