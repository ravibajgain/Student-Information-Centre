<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<%@include file="headLayout.jsp"%>
	<h1>Under construction ....</h1>
	<form action="Login" method="post">
		<table style="with: 50%">

			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
		</table>
		<input type="submit" value="Submit" />
	</form>

	<a href="${pageContext.request.contextPath}/user/signup">Create
		account</a>
	<br>
	<a href="${pageContext.request.contextPath}/home/index">Home</a>
	<%@include file="footLayout.jsp"%>

</body>
</html>