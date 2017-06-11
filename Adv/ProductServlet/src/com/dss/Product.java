package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Product() {
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
		int i = Integer.parseInt(request.getParameter("pid"));
		String string = request.getParameter("pname");
		int j  = Integer.parseInt(request.getParameter("pcost"));
		PrintWriter printWriter = response.getWriter();
		if(j>=100)
		{
			printWriter.println("ProductId :"+i);
			printWriter.println("<br>");
			printWriter.println("ProductName :"+string);
			printWriter.println("<br>");
			printWriter.println("Productcost :"+j);
			
		}
		else
		{
			printWriter.println("product cost should me more than 100");
		}
	}

}
