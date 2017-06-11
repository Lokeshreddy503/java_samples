package collection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class PasswordChecking
 */
public class PasswordChecking implements Filter {

    /**
     * Default constructor. 
     */
    public PasswordChecking() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		PrintWriter writer = response.getWriter();
		//int sid = Integer.parseInt(request.getParameter("sid"));
		String spassword = request.getParameter("spassword");
		String conformpassword = request.getParameter("sconformpassword");
		if(spassword.equals(conformpassword))
		{
			chain.doFilter(request, response);
		}
		else
		{
			//writer.println("<font color="red">");
			writer.println("<div style='text-color:red'>");
			writer.println("password not  matching");
			request.getRequestDispatcher("./Registration.html").include(request, response);
			writer.println("</div>");
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
