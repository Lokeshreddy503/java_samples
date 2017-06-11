
import java.io.IOException;

import javax.servlet.*;
public class app3 implements Servlet
{
	public app3()
	{
		System.out.println("object created");
	}
	
	public void destroy() 
	{
		System.out.println("destroy");
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig con) throws ServletException 
	{
		// TODO Auto-generated method stub
		System.out.println("init method");
		
	}

	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("on user request");
		
	}

	
}
