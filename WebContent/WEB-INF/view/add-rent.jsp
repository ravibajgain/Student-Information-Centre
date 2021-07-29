<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Room for Rent</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<%@include file="headLayout.jsp"%>

	<h1>Loading....</h1>
	<h2>Add information about Rent</h2>
	<div id="container">
		<h3>Please Fill up form to begin with.... </h3>
		<form:form action="saveRents" modelAttribute="rents" method="POST">
			<table>
				<tbody>

					<tr>
						<td><label>State:</label>
						<td><form:select path="state">
								<form:option value="New South Wales" label="NSW" />
								<form:option value="Queensland " label="QLD" />
								<form:option value="Victoria " label="VC" />
								<form:option value="Tasmania " label="TA" />
								<form:option value="Western Australia " label="WA" />
								<form:option value="South Australia " label="SA" />
							</form:select></td>

					</tr>
					<tr>
						<td><label> Price :</label></td>
						<td><form:input path="price" /> <form:errors path="price"
								cssClass="error" /></td>
					</tr>
					<tr>
						<td><label> Bedroom :</label></td>
						<td><form:input path="bedroom" /> <form:errors
								path="bedroom" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label> Parking :</label></td>
						<td>Yes<form:radiobutton path="parking" value="Yes" /><br>
							No<form:radiobutton path="parking" value="No" />
					</tr>
					<tr>
						<td><label> suburb:</label>
						<td><form:input path="suburb" /> <form:errors path="suburb"
								cssClass="error" /></td>

					</tr>
					<tr>
						<td><label> email:</label>
						<td><form:input path="email" /> <form:errors path="email"
								cssClass="error" /></td>
					</tr>
					<tr>
						<td><label> Description:</label>
						<td><form:input path="description" /> <form:errors path="description"
								cssClass="error" /></td>
					</tr>
					<tr>
						<td><label></label>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>


				</tbody>
			</table>
		</form:form>
	</div>
	<a href="list">Click to display available room for Rents</a>
	<br>
	<a href="${pageContext.request.contextPath}/home/index">Home</a>
	<%@include file="footLayout.jsp"%>

</body>
</html>