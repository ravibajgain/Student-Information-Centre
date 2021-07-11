<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add jobs</title>
</head>
<body>
	<%@include file="headLayout.jsp"%>

	<!--  <h1>Loading....</h1>
	<ol>
		<li><a href="${pageContext.request.contextPath}/user/login">Click
				to login</a></li>
		<li><a href="${pageContext.request.contextPath}/user/signup">Register</a></li>
		<li><a href="${pageContext.request.contextPath}/job/list">Display
				Jobs</a></li>
		<li><a href="${pageContext.request.contextPath}/lease/list">Display
				List of Lease</a></li>
		<li><a href="${pageContext.request.contextPath}/rent/list">Display
				List of Rents</a></li>
		<li><a href="${pageContext.request.contextPath}/secondhand/list">Marketplace</a></li>


-->




	</ol>
	<hr>
	<input type="button" value="Login" id="bt"
		onclick="window.location.href='${pageContext.request.contextPath}/user/login';return false"
		class="add-button" />
	<input type="button" value="Signup" id="bt"
		onclick="window.location.href='${pageContext.request.contextPath}/user/signup';return false"
		class="add-button" />
	<input type="button" value="Display Jobs" id="bt"
		onclick="window.location.href='${pageContext.request.contextPath}/job/list';return false"
		class="add-button" />
	<br>
	<br>
	<input type="button" value="Lease List" id="bt"
		onclick="window.location.href='${pageContext.request.contextPath}/lease/list';return false"
		class="add-button" />
	<input type="button" value="Rent List" id="bt"
		onclick="window.location.href='${pageContext.request.contextPath}/rent/list';return false"
		class="add-button" />
	<input type="button" value="Nepali Marketplace" id="bt"
		onclick="window.location.href='${pageContext.request.contextPath}/secondhand/list';return false"
		class="add-button" />
	<input type="button" value="Information/Services" id="bt"
		onclick="window.location.href='${pageContext.request.contextPath}/info/help';return false"
		class="add-button" />
	<hr>


	<%@include file="footLayout.jsp"%>



</body>
</html>