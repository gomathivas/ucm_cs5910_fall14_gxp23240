<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="edu.ucmo.ase.ecomm.sc.model.ShoppingCartModel"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="true"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page import="edu.ucmo.ase.ecomm.sc.model.SessionModel"%>
<%@page import="edu.ucmo.ase.ecomm.sc.model.HeaderModel"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="center_content">
			<div class="paymentAndShipping">
				<h3>Payment And Shipping</h3>
				<c:url var="paymentConfirmation" value="/paymentConfirmation"></c:url>

				<form:form action="${paymentConfirmation}" commandName="paymentModel">
					<table>
						<tr>
							<td><form:label path="cardType">
									<spring:message text="Card Type" />
								</form:label></td>
							<td><form:select path="cardType" placeholder="Select a type" >
									<form:option value="" label="...." />
					  				<form:options items="${cardTypeOptions}" />
								</form:select>
									</td>
							<td><form:errors path="cardType" cssStyle="color: #ff0000;" /></td>
	                                
						</tr>
						<tr>
							<td><form:label path="cardNumber"></form:label> 
							<spring:message
									text="Card Number" /><span style="color: #ff0000;">*</span> </td>
							<td><form:input path="cardNumber" /></td>
							<td></td>
						</tr>
						<tr>
							<td><form:label path="expireMonth">
									<spring:message text="Expires Month" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:select path="expireMonth"  >
									<form:option value="" label="...." />
					  				<form:options items="${expireMonthOption}" />
								</form:select>
									</td>
							<td><form:errors path="expireMonth" cssStyle="color: #ff0000;" /></td>
						</tr>
						<tr>
							<td><form:label path="expireYear">
									<spring:message text="Expires Year" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:select path="expireYear"  >
									<form:option value="" label="...." />
					  				<form:options items="${expireYearOption}" />
								</form:select>
									</td>
							<td><form:errors path="expireYear" cssStyle="color: #ff0000;" /></td>
						</tr>
						
						<tr>
							<td><form:label path="securityCode">
									<spring:message text="Security Code" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="securityCode" /></td>
							<td><form:errors path="securityCode" cssStyle="color: #ff0000;" /></td>
						</tr>
						
						<tr>
							<td colspan="2">
							<label><span style="color: #ff0000;">Billing Address </span></label>
							</td>
						</tr>
						
						<tr>
							<td><form:label path="nameOnCard">
									<spring:message text="Name On Card" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="nameOnCard" /></td>
							<td><form:errors path="nameOnCard" cssStyle="color: #ff0000;" /></td>
						</tr>
						
						<tr>
							<td><form:label path="billingAddress.addressLineOne">
									<spring:message text="Address Line One" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="billingAddress.addressLineOne" /></td>
							<td><form:errors path="billingAddress.addressLineOne"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						<tr>
							<td><form:label path="billingAddress.addressLineTwo">
									<spring:message text="Address Line Two" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="billingAddress.addressLineTwo" /></td>
							<td><form:errors path="billingAddress.addressLineTwo"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						
						<tr>
							<td><form:label path="billingAddress.apt">
									<spring:message text="Apt / Unit" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="billingAddress.apt" /></td>
							<td><form:errors path="billingAddress.apt"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						
						<tr>
							<td><form:label path="billingAddress.city">
									<spring:message text="City" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="billingAddress.city" /></td>
							<td><form:errors path="billingAddress.city"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						
						
						<tr>
							<td><form:label path="billingAddress.state">
									<spring:message text="State" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="billingAddress.state" /></td>
							<td><form:errors path="billingAddress.state"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						
						<tr>
							<td><form:label path="billingAddress.country">
									<spring:message text="Country" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="billingAddress.country" /></td>
							<td><form:errors path="billingAddress.country"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						
						<tr>
							<td><form:label path="billingAddress.zipCode">
									<spring:message text="Zip Code" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="billingAddress.zipCode" /></td>
							<td><form:errors path="billingAddress.zipCode"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						
						<tr>
							<td><form:label path="phNo">
									<spring:message text="Phone " /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="phNo" /></td>
							<td><form:errors path="phNo" cssStyle="color: #ff0000;" /></td>
						</tr>
						
						<tr>
							<td><form:label path="email">
									<spring:message text="Email" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="email" /></td>
							<td><form:errors path="email" cssStyle="color: #ff0000;" /></td>
						</tr>
						
						<tr>
							<td colspan="2">
							<label><span style="color: #ff0000;">Shipping Address </span></label>
							</td>
						</tr>
						
						<tr>
							<td><form:label path="shippingAddress.addressLineOne">
									<spring:message text="Address Line One" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="shippingAddress.addressLineOne" /></td>
							<td><form:errors path="shippingAddress.addressLineOne"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						<tr>
							<td><form:label path="shippingAddress.addressLineTwo">
									<spring:message text="Address Line Two" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="shippingAddress.addressLineTwo" /></td>
							<td><form:errors path="shippingAddress.addressLineTwo"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						
						<tr>
							<td><form:label path="shippingAddress.apt">
									<spring:message text="Apt / Unit" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="shippingAddress.apt" /></td>
							<td><form:errors path="shippingAddress.apt"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						
						<tr>
							<td><form:label path="shippingAddress.city">
									<spring:message text="City" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="shippingAddress.city" /></td>
							<td><form:errors path="shippingAddress.city"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						
						
						<tr>
							<td><form:label path="shippingAddress.state">
									<spring:message text="State" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="shippingAddress.state" /></td>
							<td><form:errors path="shippingAddress.state"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						
						<tr>
							<td><form:label path="shippingAddress.country">
									<spring:message text="Country" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="shippingAddress.country" /></td>
							<td><form:errors path="shippingAddress.country"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						
						<tr>
							<td><form:label path="shippingAddress.zipCode">
									<spring:message text="Zip Code" /><span style="color: #ff0000;">*</span>
								</form:label></td>
							<td><form:input path="shippingAddress.zipCode" /></td>
							<td><form:errors path="shippingAddress.zipCode"
									cssStyle="color: #ff0000;" /></td>
						</tr>
						<tr>
							<td colspan="3"><input type="submit"
								value="<spring:message text="Process Transaction Now"/>" /></td>
						</tr>
					</table>
				</form:form>
				<span style="color: #ff0000;">*</span>Required 
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>