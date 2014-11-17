<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page import="edu.ucmo.ase.ecomm.sc.model.SessionModel"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="center_content">
		
	<c:set var="requestingPage" value="home" scope="session"/>
	
			<div class="center_title_bar">Latest Products</div>

			<c:if test="${!empty productList}">
				<c:forEach items="${productList}" var="product">

					<div class="prod_box">
						<div class="top_prod_box"></div>
						<div class="center_prod_box">
							<div class="product_title">
								
								<spring:url value="/details/${product.productId}"
								var="productDetailsUrl" htmlEscape="true" /> <a
							href="${productDetailsUrl}">${product.productShortDes}</a>
							
								<!-- <a href="details.html">Motorola 156 MX-VL</a> -->
							</div>
							<div class="product_img">
								<a href="${productDetailsUrl}"><img src="images/laptop.gif" alt=""
									border="0" /></a>
							</div>
							<div class="prod_price">
								<span class="reduce">${product.oldPrice}$</span> <span class="price">${product.newPrice}$</span>
							</div>
						</div>
						<div class="bottom_prod_box"></div>
						<div class="prod_details_tab">
						
						<spring:url value="/addToCartConfirm/${product.productId}"
								var="addToCartConfirmUrl" htmlEscape="true" /> 
								<a href="${addToCartConfirmUrl}" >
								<img
								src="images/cart.gif" alt="" border="0" class="left_bt" />
								</a>
							<!-- <a href=""
								title="header=[Add to cart] body=[&nbsp;] fade=[on]"></a>  -->
																
							<a href="${productDetailsUrl}" class="prod_details">details</a>
						</div>
					</div>

				</c:forEach>
			</c:if>


		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>
