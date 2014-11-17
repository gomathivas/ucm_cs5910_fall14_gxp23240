<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page import="edu.ucmo.ase.ecomm.sc.model.SessionModel"%>
<%@page import="edu.ucmo.ase.ecomm.sc.model.HeaderModel"%>

<div id="menu_tab">
	<div class="left_menu_corner"></div>
	<ul class="menu">
		<li>
			<!-- <a href="" class="nav1"> Home</a> --> <spring:url value="/home"
				var="homeUrl" htmlEscape="true" /> <a class="nav1"
			href="${homeUrl}">Home</a>

		</li>
		<li class="divider"></li>
		<li><a href="" class="nav2">Products</a></li>
		<li class="divider"></li>
		<li><a href="" class="nav3">Specials</a></li>


		<li class="divider"></li>
		<li>
			<!-- <a href="" class="nav4">My account</a> --> <spring:url
				value="/login" var="loginUrl" htmlEscape="true" /> <a class="nav4"
			href="${loginUrl}">My account</a>
		</li>


		<li class="divider"></li>
		<li>
		
		<%
			SessionModel sesModel = null;
		    SessionModel sessionModel = ((edu.ucmo.ase.ecomm.sc.model.SessionModel)request.getSession().getAttribute("sessionModel"));
  			
		    if(sessionModel == null){
		    	request.setAttribute("userLoggedIn", false);
		    	
		    }
		    else 	{
		    	request.setAttribute("userLoggedIn", sessionModel.getUserLoggedIn());
		    }
		    
			
		%>

				<c:if test="${not userLoggedIn}">
					<!-- <a href="" class="nav4">Sign Up</a> --> <spring:url
					value="/login" var="loginUrl" htmlEscape="true" /> <a class="nav4"
					href="${loginUrl}">login</a>
				</c:if>
				<c:if test="${userLoggedIn}">
					<!-- <a href="" class="nav4">Sign Up</a> --> <spring:url
					value="/logout" var="logoutUrl" htmlEscape="true" /> <a class="nav4"
					href="${logoutUrl}">logout</a>
				</c:if>

			
		</li>

		<li class="divider"></li>
		<li>
			<!-- <a href="" class="nav4">Sign Up</a> --> <spring:url
				value="/registerNewUser" var="registerNewUserUrl" htmlEscape="true" />
			<a class="nav4" href="${registerNewUserUrl}">Sign Up</a>
		</li>



		<li class="divider"></li>
		<li><a href="" class="nav5">Shipping</a></li>
		<li class="divider"></li>
		<li><a href="contact.html" class="nav6">Contact Us</a></li>

		<!-- <li class="divider"></li>
		<li class="currencies">Currencies <select>
				<option>US Dollar</option>
				<option>Euro</option>
		</select>
		</li> -->
	</ul>
	<div class="right_menu_corner"></div>
</div>
<!-- end of menu tab -->
