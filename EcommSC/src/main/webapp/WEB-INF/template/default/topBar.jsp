<%@page import="edu.ucmo.ase.ecomm.sc.model.SearchModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="true"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page import="edu.ucmo.ase.ecomm.sc.model.SessionModel"%>
<%@page import="edu.ucmo.ase.ecomm.sc.model.HeaderModel"%>

<div class="top_bar">
	<div class="top_search">
		<div class="search_text">

			<spring:url value="/search" var="searchUrl" htmlEscape="true" />
			<a href="${searchUrl}"> 
			</a> <a href="${searchUrl}">Search</a>
		</div>
		<!-- searchKey -->

		<%-- <input type="text" class="search_input" name="search" /> 
		<input type="submit" name = "search" src="images/search.gif" class="search_bt" onclick="submitPage('${pageContext.request.contextPath}/search"/>  --%>
		<%-- <a class="search_bt" href="" onclick="submitPage('${pageContext.request.contextPath}/search"> 
								<img src="images/search.gif" alt=""	border="0" /></a>  --%>
	</div>
	<!-- 	<div class="languages">
		<div class="lang_text">Languages:</div>
		<a href=""
			class="lang"><img src="images/en.gif" alt="" border="0" /></a> <a
			href=""
			class="lang"><img src="images/de.gif" alt="" border="0" /></a>
	</div> -->
</div>