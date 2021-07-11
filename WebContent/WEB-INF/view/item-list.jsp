<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Jobs</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<%@include file="headLayout.jsp"%>


	<h1>list of Items</h1>
	<p>
		
		<input type="button"  value ="Add Item" 
		onclick = "window.location.href ='itemaddForm'; return false;" 
		class="add-button"
		/>
	<div id="wrapper">
		<div id="header">List of items</div>
	</div>

	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>product ID</th>
					<th>state</th>
					<th>price</th>
					<th>product Type</th>
					<th>Product Name</th>
					<th>Description</th>
					<th>email</th>

				</tr>

				<!--  loop over job detail -->

				<c:forEach var="tempitem" items="${items}">
					<tr>
						<td>${tempitem.id }
						<td>${tempitem.state}</td>
						<td>${tempitem.price}</td>
						<td>${tempitem.productType}</td>
						<td>${templitem.name}</td>
						<td>${tempitem.description}</td>
						<td>${tempitem.email}</td>
					</tr>
				</c:forEach>

			</table>

		</div>
	</div>
	<a href="${pageContext.request.contextPath}/home/index">Home</a>
	<%@include file="footLayout.jsp"%>

</body>
</html>