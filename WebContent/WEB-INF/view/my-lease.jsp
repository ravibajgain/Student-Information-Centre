<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lease List</title>
<%@include file="headLayout.jsp"%>

</head>
<body>


	<p>
		<input type="button" value="Click to  Add Lease"
			onclick="window.location.href ='leaseaddForm'; return false;"
			class="add-button" />
	<div id="wrapper">
		<div id="header">List of Lease</div>
	</div>

	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>Lease ID</th>
					<th>State</th>
					<th>price</th>
					<th>Bedroom</th>
					<th>parking</th>
					<th>suburb</th>
					<th>email</th>

				</tr>

				<!--  loop over job detail -->


				<tr>
					<td>${leases.id }
					<td>${leases.state}</td>
					<td>${leases.price}</td>
					<td>${leases.bedroom}</td>
					<td>${leases.parking}</td>
					<td>${leases.suburb}</td>
					<td>${leases.email}</td>

				</tr>

			</table>

		</div>
	</div>


	<!-- <a href="add">click to add new Lease</a> -->
	<br>
	<a href="${pageContext.request.contextPath}/lease/list">Go back to
		Lease list</a>
	<%@include file="footLayout.jsp"%>

</body>
</html>