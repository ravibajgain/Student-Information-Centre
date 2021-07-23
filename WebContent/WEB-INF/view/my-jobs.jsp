<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Jobs</title>
<%@include file="headLayout.jsp"%>
</head>
<body>
	<h1>list of Jobs</h1>
	<p>
		<input type="button" value="Click to  Add Jobs"
			onclick="window.location.href ='jobaddForm'; return false;"
			class="add-button" />
	 	
			<table>
				<tr>
					<th>Job ID</th>
					<th>Job Type</th>
					<th>Pay Rate</th>
					<th>Email</th>
					<th>Description</th>
					<th>Location</th>
					<th> Job Posted date</th>
				</tr>

			

				<c:forEach var="tempJob" items="${jobs}">
					<tr>
						<td>${tempJob.id }
						
						<td>${tempJob.jobType}</td>
						<td>${tempJob.payRate}</td>
						<td>${tempJob.email}</td>
						<td>${tempJob.description}</td>
						<td>${tempJob.location}</td>
						<td>${tempJob.date}</td>
					</tr>
				</c:forEach>

			</table>

		<div>
	</div>
	<a href="${pageContext.request.contextPath}/job/list">Jobs</a>
	<%@include file="footLayout.jsp"%>

</body>
</html>