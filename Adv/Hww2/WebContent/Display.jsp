<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String username;
String password;%>
<%


username = request.getParameter("uname");
password = request.getParameter("upassword");

if(username.equals("ratan") && password.equals("ratan"))
{
	//set header mechanism
	/* response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
	response.setHeader("location", "http://www.facebook.com"); */
	
	//send redirect mechanism
response.sendRedirect("http://www.facebook.com"); 
	
}else if(username.equals("RATAN")&& password.equals("RATAN"))

{
	response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
	response.setHeader("location", "http://www.facebook.com");
	
}
else
{
	response.sendError(404, "username and password is incorrect");
}

%>
</body>
</html>