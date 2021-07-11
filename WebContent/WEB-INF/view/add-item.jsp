<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second hand Sale</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<%@include file="headLayout.jsp"%>

	<h1>Please Enter What you want to Sale ....</h1>
	<form:form action="saveItems" modelAttribute="items" method="POST">
		<table style="with: 50%">
			<tr>
				<td><label>Item Name</label></td>
				<td><form:input path="name" /> <form:errors path="name"
						cssClass="error" /></td>
			</tr>
			<tr>
				<td><label>Item Description</label></td>
				<td><form:input path="description" /> <form:errors
						path="description" cssClass="error" /></td>

			</tr>
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
				<td><label>Price</label></td>
				<td><form:input path="price" /> <form:errors path="price"
						cssClass="error" /></td>
			</tr>

			<tr>
				<td><label>Product Type</label></td>
				<td><form:input path="productType" /> <form:errors
						path="productType" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><form:input path="email" /> <form:errors path="email"
						cssClass="error" /></td>
			</tr>
			<tr>
				<td><label></label>
				<td><input type="submit" value="Save" class="save" /></td>
			</tr>
		</table>
	</form:form>

	<a href="${pageContext.request.contextPath}/home/index">Home</a>
	<%@include file="footLayout.jsp"%>

</body>
</html>