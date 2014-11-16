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
			<div class="registerNewCustomerForm">
				<h2>Please fill the form and submit</h2>

				<c:url var="regNewCusAction" value="/registerNewUser"></c:url>

				<form:form action="${regNewCusAction}" commandName="customerModel">
					<table>
						<tr>
							<td><form:label path="firstName">
									<spring:message text="First Name" />
								</form:label></td>
							<td><form:input path="firstName"
									placeholder="Enter a First name here" /></td>
							<td><form:errors path="firstName" cssStyle="color: #ff0000;" /></td>
						</tr>
						<tr>
							<td><form:label path="middleName"></form:label> <spring:message
									text="Middle Name" /></td>
							<td><form:input path="middleName" /></td>
							<td></td>
						</tr>
						<tr>
							<td><form:label path="lastName">
									<spring:message text="Last Name" />
								</form:label></td>
							<td><form:input path="lastName" /></td>
							<td><form:errors path="lastName" cssStyle="color: #ff0000;" /></td>
						</tr>
						<tr>
							<td><form:label path="gender">
									<spring:message text="Gender" />
								</form:label></td>
							<td><form:input path="gender" /></td>
							<td><form:errors path="gender" cssStyle="color: #ff0000;" /></td>
						</tr>
						<tr>
							<td><form:label path="email">
									<spring:message text="Email" />
								</form:label></td>
							<td><form:input path="email" /></td>
							<td><form:errors path="email" cssStyle="color: #ff0000;" /></td>
						</tr>
						<tr>
							<td><form:label path="password">
									<spring:message text="Password" />
								</form:label></td>
							<td><form:input path="password" /></td>
							<td><form:errors path="password" cssStyle="color: #ff0000;" /></td>
						</tr>
						<tr>
							<td><form:label path="confirmPassword">
									<spring:message text="Re-Type Password" />
								</form:label></td>
							<td><form:input path="confirmPassword" /></td>
							<td><form:errors path="confirmPassword"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						<tr>
							<td><form:label path="address.addressLineOne">
									<spring:message text="Address Line One" />
								</form:label></td>
							<td><form:input path="address.addressLineOne" /></td>
							<td><form:errors path="address.addressLineOne"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						<tr>
							<td><form:label path="address.addressLineTwo">
									<spring:message text="Address Line Two" />
								</form:label></td>
							<td><form:input path="address.addressLineTwo" /></td>
							<td><form:errors path="address.addressLineTwo"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						<tr>
							<td colspan="3"><input type="submit"
								value="<spring:message text="Submit"/>" /></td>
						</tr>
					</table>
				</form:form>
			</div>

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>