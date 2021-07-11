<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Rents</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<%@include file="headLayout.jsp"%>
	<h1>list of Rents</h1>
	<p>
		<input type="button" value="Add Item"
			onclick="window.location.href ='rentaddForm'; return false;"
			class="add-button" />
	<div id="wrapper">
		<div id="header">List of Rents</div>
	</div>

	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>ID</th>
					<th>state</th>
					<th>price</th>
					<th>Bedroom</th>
					<th>parking</th>
					<th>suburb</th>
					<th>email</th>
					<th>Description</th>

				</tr>

				<!--  loop over job detail -->

				<c:forEach var="temprent" items="${rents}">
					<tr>
						<td>${temprent.id }
						<td>${temprent.state}</td>
						<td>${temprent.price}</td>
						<td>${temprent.bedroom}</td>
						<td>${temprent.parking}</td>
						<td>${temprent.suburb}</td>
						<td>${temprent.email}</td>
						<td>${temprent.description}</td>

					</tr>
				</c:forEach>

			</table>

		</div>
	</div>
	<a href="${pageContext.request.contextPath}/home/index">Home</a>
	<%@include file="footLayout.jsp"%>

</body>
</html>