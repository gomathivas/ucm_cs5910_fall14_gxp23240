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

			<div class="center_title_bar">Add this product to Cart?  ${selectedProduct.productShortDes}
			</div>
			<div class="prod_box_big">
				<div class="top_prod_box_big"></div>
				<div class="center_prod_box_big">
					<div class="product_img_big">
						<a href="javascript:popImage('images/big_pic.jpg','Some Title')"
							title="header=[Zoom] body=[&nbsp;] fade=[on]"><img
							src="images/laptop.gif" alt="" border="0" /></a>
						<div class="thumbs">
							<a href="" title="header=[Thumb1] body=[&nbsp;] fade=[on]"><img
								src="images/thumb1.gif" alt="" border="0" /></a> <a href=""
								title="header=[Thumb2] body=[&nbsp;] fade=[on]"><img
								src="images/thumb1.gif" alt="" border="0" /></a> <a href=""
								title="header=[Thumb3] body=[&nbsp;] fade=[on]"><img
								src="images/thumb1.gif" alt="" border="0" /></a>
						</div>
					</div>
					<div class="details_big_box">
						<div class="product_title_big">My Cinema-U3000/DVBT, USB 2.0
							TV BOX External, White</div>
						<div class="specifications">
							Disponibilitate: <span class="blue">In stoc</span><br />
							Garantie: <span class="blue">24 luni</span><br /> Tip transport:
							<span class="blue">Mic</span><br /> Pretul include <span
								class="blue">TVA</span><br />
						</div>
						<div class="prod_price_big">
							<span class="reduce">${selectedProduct.oldPrice}$</span> <span
								class="price">${selectedProduct.newPrice}$</span>
						</div>
							<spring:url value="/addToConfirmOK/${product.productId}"
									var="addToConfirmOKUrl" htmlEscape="true" /> <a
								href="${addToConfirmOKUrl}" class="addtocart" >Add</a>
								
						<!-- 	<a href="" class="addtocart">Add</a>  -->
							
							<spring:url value="/addToConfirmCancel/${product.productId}"
									var="addToConfirmCancelUrl" htmlEscape="true" /> <a
								href="${addToConfirmCancelUrl}" class="compare" >Cancel</a>
								
							<a href="" class="compare">Cancel</a>
					</div>
				</div>
				<div class="bottom_prod_box_big"></div>
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>