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

			<h3>Shopping Cart</h3>
			<c:if test="${!empty sclistModel.scmList}">

				<c:url var="updateCart" value="/updateCart"></c:url>

				<form:form action="${updateCart}" commandName="sclistModel">

					<table class="tg">
						<tr>
							<th width="80">Product Number</th>
							<th width="120">Product Description</th>
							<th width="80">Price</th>
							<th width="40">Qty</th>
							<th width="80">SubTotal</th>
							<th width="60">Remove</th>
						</tr>
						<c:forEach items="${sclistModel.scmList}" var="scmodel" varStatus="status">
							<tr>
								<td>${scmodel.product.productId}</td>
								<td>${scmodel.product.productShortDes}</td>
								<td>${scmodel.product.newPrice}$</td>
								<td>
									<%-- <form:label path="scList[${status.index}].count">
										<spring:message text="count" />
									</form:label>  --%> <input name="scmList[${status.index}].quantity"
									value="${scmodel.quantity}" /> <%-- <a href="<c:url value='/edit/${person.id}' />">Edit</a> --%>
								</td>
								<td> ${scmodel.subTotal}$
							<%-- 	<input name="scList[${status.index}].subTotal"
									value="${scm.subTotal}" />
									 --%>
									</td>
								<td><a
									href="<c:url value='/remove/${scmodel.product.productId}' />">Remove</a></td>
							</tr>
						</c:forEach>
						<tr>
							<td colspan="2"></td>
							<td colspan="2">Total</td>
							<td>
								${scListTotal} $
							</td>
						</tr>
					</table>
					<input type="submit" value="<spring:message text="Update Cart"/>" />
				</form:form>



			</c:if>

		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>