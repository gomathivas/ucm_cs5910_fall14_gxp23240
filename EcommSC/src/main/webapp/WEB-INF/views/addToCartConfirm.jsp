<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="true"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="center_content">

			<div class="center_title_bar">Add this product to Cart?  ${selectedProduct.productShortDes}
			</div>
			<div class="prod_box_big">
				<div class="top_prod_box_big"></div>
				<div class="center_prod_box_big">
					<div class="product_img_big">
						<a href="javascript:popImage('images/big_pic.jpg','Some Title')"
							title="header=[Zoom] body=[&nbsp;] fade=[on]"><img
							src="<c:url value='/imageDisplay?productId=${selectedProduct.productId}'/>" alt="" border="0" /></a>
						<div class="thumbs">
							
						</div>
					</div>
					<div class="details_big_box">
						<div class="product_title_big">${selectedProduct.productLongDes}</div>
						<div class="specifications">
							
						</div>
						<div class="prod_price_big">
							<span
								class="price">${selectedProduct.newPrice}$</span>
						</div>
							<spring:url value="/addToConfirmOk/${selectedProduct.productId}"
									var="addToConfirmOkUrl" htmlEscape="true" /> <a
								href="${addToConfirmOkUrl}" class="addtocart" >Add</a>
								
						<!-- 	<a href="" class="addtocart">Add</a>  -->
							
							<spring:url value="/addToConfirmCancel/${selectedProduct.productId}"
									var="addToConfirmCancelUrl" htmlEscape="true" /> <a
								href="${addToConfirmCancelUrl}" class="compare" >Cancel</a>
								
							<!-- <a href="" class="compare">Cancel</a> -->
					</div>
				</div>
				<div class="bottom_prod_box_big"></div>
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>