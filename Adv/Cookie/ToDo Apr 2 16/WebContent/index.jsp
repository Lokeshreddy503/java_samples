<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,entities.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage ToDo List</title>
</head>
<body>
	<form action="ToDoServlet" method="post">
		<label>Name</label>
		<input type="text" name="name" />
		<br />
		<label>Description</label>
		<input type="text" name="description" />
		<br />
		<label>Priority</label>
		<input type="text" name="priority" />
		<br />
		<input type="submit" name="Submit" />
	</form>
	<br />
	<%
		ArrayList<ToDo> collection = new ArrayList<>();
		if(request.getSession().getAttribute("todos") != null) {
			collection = (ArrayList<ToDo>) request.getSession().getAttribute("todos");
		}
		if(collection.size() > 0) {
			%>
				<table>
					<tr>
						<th>Name</th>
						<th>Description</th>
						<th>Priority</th>
					</tr>
					<%
						for(ToDo td : collection) {
							%>
								<tr>
									<td><%=td.getName() %></td>
									<td><%=td.getDescription() %></td>
									<td><%=td.getPriority() %></td>
								</tr>
							<%
						}
					%>
				</table>
			<%
		}
	%>
</body>
</html>