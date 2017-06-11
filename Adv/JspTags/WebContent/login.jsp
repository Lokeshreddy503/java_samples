<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%! String username;
String password;
int sid;
String sname;%>
<jsp:useBean id="eb" type="com.dss.Studentbean" scope="application"/>
<jsp:setProperty property="id" name="eb" value="<%=sid %>"/>
<jsp:setProperty property="name" name="eb" value="<%=sname %>"/>	
student id:<jsp:getProperty property="id" name="eb"/>
student name:<jsp:getProperty property="name" name="eb"/>
<%username = request.getParameter("uname");
password = request.getParameter("upassword");
sname=request.getParameter("sname");
sid= Integer.parseInt(request.getParameter("sid"));
if(username.equalsIgnoreCase("ratan") && password.equalsIgnoreCase("ratan"))
{
	%>
	
	<jsp:include page="Success.jsp"></jsp:include>
	
	
<%

}
else
{
%>
<jsp:include page="Failure.jsp"></jsp:include>
	<%
}
%>

</body>
</html>