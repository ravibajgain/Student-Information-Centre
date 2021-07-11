<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Information about service</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<%@include file="headLayout.jsp"%>
	<h1>Add Information about Service</h1>
	<div id="container">
		<h2>Save Jobs</h2>
		<form:form action="saveInfos" modelAttribute="infos" method="POST">
			<table>
				<tbody>

					<tr>
						<td><label> Email ID :</label></td>
						<td><form:input path="email" /> 
						<form:errors path="email" cssClass="error" /></td>

					</tr>
					<tr>
						<td><label> Service Type:</label></td>
						<td><form:input path="serviceType" /> 
						<form:errors path="serviceType" cssClass="error" /></td>
					</tr>
					<tr>
						<td><label> Contact NO :</label></td>
						<td><form:input path="mobile" /> <form:errors path="mobile"
								cssClass="error" /></td>
					</tr>

					<tr>
						<td><label> Description :</label></td>
						<td><form:input path="description" />
						<form:errors path="description"	cssClass="error" /></td>
					</tr>
					<tr>
						<td><label> Service Name:</label></td>
						<td><form:input path="name" />
						<form:errors path="name" cssClass="error" />
						</td>

					</tr>
					<tr>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>


				</tbody>
			</table>
		</form:form>
	</div>
	<div >
		<a href="help">Click to display Information</a> <br> <a
			href="${pageContext.request.contextPath}/home/index">Home</a>
	</div>

	<%@include file="footLayout.jsp"%>
</body>
</html>