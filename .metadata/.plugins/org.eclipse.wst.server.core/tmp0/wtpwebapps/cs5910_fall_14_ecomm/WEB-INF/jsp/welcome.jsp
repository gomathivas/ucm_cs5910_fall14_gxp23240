<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To Ecom Shopping Cart</title>
</head>
<body>

	${name}

	<form method="post" action="/cs5910_fall_14_ecomm/login">
		<table border="2">
			<tr>
				<td colspan="2">Login</td>
			</tr>
			<tr>
				<td>UserName</td>
				<td><input name="username" type="text"></td>
			</tr>
			<tr>
			<td>Password</td>
			<td><input type="password"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"></td>
			</tr>
			<tr>
		</table>
	</form>

	<%-- 	<form:form method="POST" action="/cs5910_fall_14_ecomm/login">
		<table>
			<tr>
				<td colspan="2"><form:label path="Login">Login</form:label></td>
			</tr>
			<tr>
				<td><form:label path="username">User Name</form:label></td>
				<td><form:input path="username" /></td>

			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input path="password"/></td>
			</tr>
			<tr>
			<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form> --%>
	<a href="/cs5910_fall_14_ecomm/login">login override</a>
</body>
</html>