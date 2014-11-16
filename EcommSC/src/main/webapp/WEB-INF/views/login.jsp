<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="center_content">

			<div class="htmlLoginForm">
				<h2>Please Login In</h2>

				<c:url var="loginAction" value="/login"></c:url>

				<form:form action="${loginAction}" commandName="loginModel">
					<table>
						<tr>
							<td><form:label path="userName">
									<spring:message text="User Name" />
								</form:label></td>
							<td><form:input path="userName" /></td>
							<td><form:errors path="userName" cssStyle="color: #ff0000;" /></td>
						</tr>
						<tr>
							<td><form:label path="password"></form:label> <spring:message
									text="Password" /></td>
							<td><form:password path="password" /></td>
							<td><form:errors path="password" cssStyle="color: #ff0000;" /></td>
						</tr>
						<tr>
							<td colspan="3"><input type="submit"
								value="<spring:message text="Login"/>" /></td>
						</tr>
					</table>
				</form:form>
			</div>

			<div class="loginHelpLinks">
				<table>
					<tr>
						<td><spring:url value="/registerNewUser"
								var="registerNewUserUrl" htmlEscape="true" /> <a
							href="${registerNewUserUrl}">Register As New User</a></td>
						<td style="width: 12px;"></td>
						<td><spring:url value="/forgotPassword"
								var="forgotPasswordUrl" htmlEscape="true" /> <a
							href="${forgotPasswordUrl}">Forgot Password</a></td>
					</tr>
				</table>
			</div>

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
