<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Data Retrival Form</title>
</head>
<body bgcolor="lighblue">
<table border="1" width="10%" cellpadding="2">
 <thead>
                    <tr>
                        <th colspan="2">Your Details Here</th>
                    </tr>
                </thead>
<tr>
<td><h6>FirstName:</h6></td>
<td>${fname}</td>
</tr>
<tr>
<td><h6>LastName:</h6></td>
<td>${lname}</td>
</tr>
<tr>
<td><h6>Email:</h6></td>
<td>${email}</td>
</tr>
<tr>
<td><h6>mobile:</h6></td>
<td>${mobile}</td>
</tr>

</table>
</body>
</html>