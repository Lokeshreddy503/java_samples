package com.app;
import com.app.myclass.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ToDoServlet
 */
public class ToDoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ToDoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String desc = request.getParameter("description");
		String pri = request.getParameter("priority");
		String name =request.getParameter("name");
		request.setAttribute("description", desc);
		request.setAttribute("priority", pri);
		request.setAttribute("name", name);
		request.getRequestDispatcher("/ToDo.jsp").forward(request,response);
		
		
	
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request,response);
		ArrayList<Todo> collection = new ArrayList();
		String desc = request.getParameter("description");
		String pri = request.getParameter("priority");
		String name =request.getParameter("name");

		Todo td = new Todo(name,desc,pri);
		collection.add(td);
		request.getSession().setAttribute("all", collection);
		request.setAttribute("all", collection);
		request.getRequestDispatcher("ToDo.jsp").forward(request, response);
		
		/**/
	}

}
