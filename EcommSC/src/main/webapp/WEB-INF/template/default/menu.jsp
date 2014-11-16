<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="menu">
	Menu
	<ul>
		<li><spring:url value="/welcome" var="welcomeUrl" htmlEscape="true" />
			<a href="${welcomeUrl}">welcome</a></li>
		<li><spring:url value="/login" var="loginUrl" htmlEscape="true" />
			<a href="${loginUrl}">Login</a></li>
	</ul>
</div>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html> -->