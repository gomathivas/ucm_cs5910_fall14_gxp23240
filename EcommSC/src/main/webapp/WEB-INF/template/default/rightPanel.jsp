<%@page import="edu.ucmo.ase.ecomm.sc.model.ShoppingCartModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page import="edu.ucmo.ase.ecomm.sc.model.SessionModel"%>
<%@page import="edu.ucmo.ase.ecomm.sc.model.HeaderModel"%>

<div class="right_content">
	<div class="shopping_cart">
		<div class="cart_title">Shopping cart</div>
		<div class="cart_details">
		<%
			ShoppingCartModel scModel = null;
			Integer count = 0;
			Double total = 0d;
		    SessionModel sessionModel = ((edu.ucmo.ase.ecomm.sc.model.SessionModel)request.getSession().getAttribute("sessionModel"));
  			
		    if(sessionModel != null){
		    	scModel = sessionModel.getShopppingCartModel();
		    }
		    
		    if(scModel != null)	{
		    	count  = scModel.getSCProductCount();
		    	total = scModel.getTotal();
		    }
			
			out.print(count + " items"); 
		%>
		<br /> <span class="border_cart"></span> 
		Total: <span
				class="price"><%out.print(total); %> $ </span>
		</div>
		<div class="cart_icon">
			<a href="" title="header=[Checkout] body=[&nbsp;] fade=[on]"><img
				src="images/shoppingcart.png" alt="" width="48" height="48"
				border="0" /></a>
		</div>
	</div>
	<div class="title_box">Whats new</div>
	<div class="border_box">
		<div class="product_title">
			<a href="details.html">Motorola 156 MX-VL</a>
		</div>
		<div class="product_img">
			<a href="details.html"><img src="images/p2.gif" alt="" border="0" /></a>
		</div>
		<div class="prod_price">
			<span class="reduce">350$</span> <span class="price">270$</span>
		</div>
	</div>
	<div class="title_box">Manufacturers</div>
	<ul class="left_menu">
		<li class="odd"><a href="">Sony</a></li>
		<li class="even"><a href="">Samsung</a></li>
		<li class="odd"><a href="">Daewoo</a></li>
		<li class="even"><a href="">LG</a></li>
		<li class="odd"><a href="">Fujitsu Siemens</a></li>
		<li class="even"><a href="">Motorola</a></li>
		<li class="odd"><a href="">Phillips</a></li>
		<li class="even"><a href="">Beko</a></li>
	</ul>
	<div class="banner_adds">
		<a href=""><img src="images/bann1.jpg" alt="" border="0" /></a>
	</div>
</div>
