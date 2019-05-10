<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="C:\Users\admin\Downloads\images.jpg">

	<form action="loginregistration" method="post">
		<table
			style="background-color: lightblue; margin-left: 20px; margin-left: 20px;">
			<tr>
			<td><h3 style="color:red;">${message}</h3>
			<h3 style="color:green;">${successmessage}</h3>
			</td>
			</tr>
			<tr>
				<td><h3 style="color: red;">Login Page!!!</h3></td>
			</tr>
			<tr>
				<td>Username :</td>
				<td></td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td></td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				
				<td><input type="submit" name="submit" value="login"></td>
				<td><a href="registration.jsp">Registration</a></td>
			</tr>

		</table>
	</form>


</body>
</html>