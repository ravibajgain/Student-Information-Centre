<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Information</title>
<%@include file="headLayout.jsp"%>
</head>
<body>
	<h1>list of Services and Information</h1>
	<p>
		<input type="button"  value ="Add new " 
		onclick = "window.location.href ='infoaddForm'; return false;" 
		class="add-button"
		/>
	<!-- 	<a href="add">click to add jobs</a><br>
	<div id="wrapper">
		<div id="header">List of Jobs</div>
	</div> -->

	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>Service ID</th>
					<th>Email Id</th>
					<th>Service Type</th>
					<th>Contact no</th>
					<th>Name</th>
					<th>Description</th>
				</tr>

				<!--  loop over job detail -->

				<c:forEach var="tempInfo" items="${infos}">
					<tr>
						<td>${tempInfo.id }
						<td>${tempInfo.email}</td>
						<td>${tempInfo.serviceType}</td>
						<td>${tempInfo.mobile}</td>
						<td>${tempInfo.name}</td>
						<td>${tempInfo.description}</td>
					</tr>
				</c:forEach>

			</table>

		</div>
	</div>
	<a href="${pageContext.request.contextPath}/home/index">Home</a>
	<%@include file="footLayout.jsp"%>

</body>
</html>