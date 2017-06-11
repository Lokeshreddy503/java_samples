package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.ToDo;

/**
 * Servlet implementation class ToDoServlet
 */
@WebServlet("/ToDoServlet")
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
		ArrayList<ToDo> collection = new ArrayList<>();
		if(request.getSession().getAttribute("todos") != null) {
			collection = (ArrayList<ToDo>) request.getSession().getAttribute("todos");
		}
		request.setAttribute("todos", collection);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<ToDo> collection = new ArrayList<>();
		if(request.getSession().getAttribute("todos") != null) {
			collection = (ArrayList<ToDo>) request.getSession().getAttribute("todos");
		}
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String priority = request.getParameter("priority");
		
		ToDo td = new ToDo(name, description, priority);
		collection.add(td);
		request.getSession().setAttribute("todos", collection);
		request.setAttribute("todos", collection);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}