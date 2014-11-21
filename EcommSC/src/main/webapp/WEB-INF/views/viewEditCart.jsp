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

		<c:if test="${edit}">
			<c:url var="updateCart" value="/updateCart"></c:url>
		
			<form:form action="${updateCart}" commandName="scm">
				<table>
						<tr>
							<td><form:label path="product.productId">
									<spring:message text="Product Number" />
								</form:label></td>
							<td><form:input path="product.productId" readonly="true" size="8"
									disabled="true" /> <form:hidden path="product.productId" /></td>
						</tr>
					<tr>
						<td><form:label path="product.productShortDes">
								<spring:message text="Product Name" />
							</form:label></td>
						<td><form:input path="product.productShortDes"  readonly="true" /></td>
					</tr>
					<tr>
						<td><form:label path="quantity">
								<spring:message text="Quantity" />
							</form:label></td>
						<td><form:input path="quantity" /></td>
					</tr>
					<tr>
						<td colspan="2">
								<input type="submit" value="<spring:message text="Edit Product"/>" />

					</tr>
				</table>
			</form:form>

		</c:if>


			<c:if test="${!empty sclistModel.scmList}">
				<table class="tg">
					<tr>
						<th width="80">Product Number</th>
						<th width="120">Product Description</th>
						<th width="80">Price</th>
						<th width="40">Qty</th>
						<th width="80">SubTotal</th>
						<th width="60">Edit</th>
						<!-- <th width="60">Remove</th> -->
					</tr>
					<c:forEach items="${sclistModel.scmList}" var="scmodel"
						varStatus="status">
						<tr>
							<td>${scmodel.product.productId}</td>
							<td>${scmodel.product.productShortDes}</td>
							<td>${scmodel.product.newPrice}$</td>
							<td>${scmodel.quantity}<%-- <input name="scmList[${status.index}].quantity"
									value="${scmodel.quantity}" style="width: 90px;" />  --%>
							</td>
							<td>${scmodel.subTotal}$</td>
							<td><a
								href="<c:url value='/editSC/${scmodel.product.productId}' />">Edit</a>
							</td>
						<%-- 	<td><a
								href="<c:url value='/removeSC/${scmodel.product.productId}' />">Remove</a></td> --%>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="2"></td>
						<td colspan="2">Total</td>
						<td>${scListTotal} $</td>
					</tr>
				</table>

				<input type="button" onclick="location.href='/EcommSC/checkOut'"
					value="Confirm Check Out"/>
				<input type="button" onclick="location.href='/EcommSC/saveCart'"
					value="Save Cart"/>
			</c:if>

		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>