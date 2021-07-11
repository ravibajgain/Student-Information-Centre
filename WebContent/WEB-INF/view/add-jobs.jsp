<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Jobs</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<%@include file="headLayout.jsp"%>
	<h1>Loading....</h1>
	<h2>Add jobs</h2>
	<div id="container">
		<h3>Save Jobs</h3>
		<form:form action="saveJobs" modelAttribute="jobs" method="POST">
			<table>
				<tbody>

					<tr>
						<td><label> Job Type :</label></td>
						<td><form:input path="jobType" /> 
						<form:errors path="jobType" cssClass="error" /></td>

					</tr>
					<tr>
						<td><label> Pay Rate :</label></td>
						<td><form:input path="payRate" /> 
						<form:errors path="payRate" cssClass="error" /></td>
					</tr>
					<tr>
						<td><label> Email :</label></td>
						<td><form:input path="email" /> <form:errors path="email"
								cssClass="error" /></td>
					</tr>

					<tr>
						<td><label> Description :</label></td>
						<td><form:input path="description" />
						<form:errors path="description"	cssClass="error" /></td>
					</tr>
					<tr>
						<td><label> Location:</label></td>
						<td><form:input path="location" />
						<form:errors path="location" cssClass="error" />
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
		<a href="list">Click to display jobs</a> <br> <a
			href="${pageContext.request.contextPath}/home/index">Home</a>
	</div>

	<%@include file="footLayout.jsp"%>
</body>
</html>