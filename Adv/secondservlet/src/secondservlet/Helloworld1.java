package secondservlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class Helloworld1 implements Servlet
{
	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String name = req.getParameter("username");
		
		PrintWriter out = res.getWriter();
		out.println("welcome to "+name+" world ");
	} 
	


}
