<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<form action="saveUser" method="POST">

		<table style="with: 50%">
			<tr>
				<td><label>First Name: </label> <form:errors path="firstName"
						cssClass="error" /></td>
				<td><input type="text" name="first_name" /></td>
			</tr>
			<tr>
				<td><label>Last Name: </label></td>
				<td><input type="text" name="last_name" /></td>
			</tr>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>Contact No</td>
				<td><input type="text" name="contact" /></td>
			</tr>
		</table>
		<input type="submit" value="Submit" />
	</form>
	<a href="${pageContext.request.contextPath}/user/login">Already
		have account?</a>
	<br>
	<a href="${pageContext.request.contextPath}/home/index">Home</a>
	<%@include file="footLayout.jsp"%>

</body>
</html>