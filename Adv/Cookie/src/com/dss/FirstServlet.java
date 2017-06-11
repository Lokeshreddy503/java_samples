package com.dss;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthTreeUI;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String sid = request.getParameter("sid");
		String spassword = request.getParameter("spaaasword");
		String sconformpassword = request.getParameter("sconformpassword");
		String sname = request.getParameter("sname");
		String smarks = request.getParameter("smarks");
		String saverage = request.getParameter("saverage");
		String sclassteacher = request.getParameter("sclassteacher");
		String sage = request.getParameter("sage");
		String sfee = request.getParameter("sfee");
		Cookie cookie1 = new Cookie("sid", sid);
		Cookie cookie2 = new Cookie("spassword", spassword);
		Cookie cookie3 = new Cookie("sconformpassword", sconformpassword);
		Cookie cookie4 = new Cookie("sname", sname);
		Cookie cookie5 = new Cookie("smarks", smarks);
		Cookie cookie6 = new Cookie("saverage", saverage);
		Cookie cookie7 = new Cookie("sclassteacher", sclassteacher);
		Cookie cookie8 = new Cookie("sage", sage);
		Cookie cookie9 = new Cookie("sfee", sfee);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		response.addCookie(cookie4);
		response.addCookie(cookie5);
		response.addCookie(cookie6);
		response.addCookie(cookie7);
		response.addCookie(cookie7);
		response.addCookie(cookie8);
		response.addCookie(cookie9);

		
		request.getRequestDispatcher("login.html").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
	}

}
