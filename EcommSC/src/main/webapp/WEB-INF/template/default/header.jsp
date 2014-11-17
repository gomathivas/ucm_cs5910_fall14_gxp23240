<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page import="edu.ucmo.ase.ecomm.sc.model.SessionModel"%>
<%@page import="edu.ucmo.ase.ecomm.sc.model.HeaderModel"%>

<div class="header">
	<div class="header_ucm_image">
		<h1>Welcome To Gomathi</h1>
	<!-- 	<img class="imgHeaderUCM" src="images/UCM_twolineCE_2color.png" alt=""
			title="" border="0" /> -->
		<img class="imgHeaderUCM" src="<c:url value='/images/UCM_twolineCE_2color.png'/>" alt="" border="0" />
		<%
			HeaderModel headerModel = null;
			String userName = "";
		    SessionModel sessionModel = ((edu.ucmo.ase.ecomm.sc.model.SessionModel)request.getSession().getAttribute("sessionModel"));
  			
		    if(sessionModel != null){
		    	headerModel = sessionModel.getHeaderModel();
		    }
		    
		    if(headerModel != null)	{
		    	userName  = headerModel.getUser();
		    }
			
			out.print("Welcome " + userName); 
		%>


	</div>
</div>

