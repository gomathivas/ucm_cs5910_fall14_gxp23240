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

	<c:set var="requestingPage" value="details/${selectedProduct.productId}" scope="session"/>
			<div class="center_title_bar">${selectedProduct.productShortDes} </div>
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
							 <span class="price">${selectedProduct.newPrice}$</span>
						</div>
						<!-- <a href=""
							class="addtocart">add to cart</a>  -->
							
							<spring:url value="/addToCartConfirm/${selectedProduct.productId}"
								var="addToCartConfirmUrl" htmlEscape="true" /> 
								<a class="addtocart" href="${addToCartConfirmUrl}" >
								Add To Cart
								</a>
							<a
							href=""
							class="compare">compare</a>
					</div>
				</div>
				<div class="bottom_prod_box_big"></div>
			</div>
			<!-- 		<div class="center_title_bar">Similar products</div>
			<div class="prod_box">
				<div class="top_prod_box"></div>
				<div class="center_prod_box">
					<div class="product_title">
						<a href="details.html">Motorola 156 MX-VL</a>
					</div>
					<div class="product_img">
						<a href="details.html"><img src="images/laptop.gif" alt=""
							border="0" /></a>
					</div>
					<div class="prod_price">
						<span class="reduce">350$</span> <span class="price">270$</span>
					</div>
				</div>
				<div class="bottom_prod_box"></div>
				<div class="prod_details_tab">
					<a href=""
						title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
						src="images/cart.gif" alt="" border="0" class="left_bt" /></a> <a
						href=""
						title="header=[Specials] body=[&nbsp;] fade=[on]"><img
						src="images/favs.gif" alt="" border="0" class="left_bt" /></a> <a
						href=""
						title="header=[Gifts] body=[&nbsp;] fade=[on]"><img
						src="images/favorites.gif" alt="" border="0" class="left_bt" /></a> <a
						href="details.html" class="prod_details">details</a>
				</div>
			</div>
			<div class="prod_box">
				<div class="top_prod_box"></div>
				<div class="center_prod_box">
					<div class="product_title">
						<a href="details.html">Iphone Apple</a>
					</div>
					<div class="product_img">
						<a href="details.html"><img src="images/p4.gif" alt=""
							border="0" /></a>
					</div>
					<div class="prod_price">
						<span class="price">270$</span>
					</div>
				</div>
				<div class="bottom_prod_box"></div>
				<div class="prod_details_tab">
					<a href=""
						title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
						src="images/cart.gif" alt="" border="0" class="left_bt" /></a> <a
						href=""
						title="header=[Specials] body=[&nbsp;] fade=[on]"><img
						src="images/favs.gif" alt="" border="0" class="left_bt" /></a> <a
						href=""
						title="header=[Gifts] body=[&nbsp;] fade=[on]"><img
						src="images/favorites.gif" alt="" border="0" class="left_bt" /></a> <a
						href="details.html" class="prod_details">details</a>
				</div>
			</div>
			<div class="prod_box">
				<div class="top_prod_box"></div>
				<div class="center_prod_box">
					<div class="product_title">
						<a href="details.html">Samsung Webcam</a>
					</div>
					<div class="product_img">
						<a href="details.html"><img src="images/p5.gif" alt=""
							border="0" /></a>
					</div>
					<div class="prod_price">
						<span class="reduce">350$</span> <span class="price">270$</span>
					</div>
				</div>
				<div class="bottom_prod_box"></div>
				<div class="prod_details_tab">
					<a href=""
						title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
						src="images/cart.gif" alt="" border="0" class="left_bt" /></a> <a
						href=""
						title="header=[Specials] body=[&nbsp;] fade=[on]"><img
						src="images/favs.gif" alt="" border="0" class="left_bt" /></a> <a
						href=""
						title="header=[Gifts] body=[&nbsp;] fade=[on]"><img
						src="images/favorites.gif" alt="" border="0" class="left_bt" /></a> <a
						href="details.html" class="prod_details">details</a>
				</div>
			</div> -->
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>