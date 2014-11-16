<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<div class="header">
	<div class="header_ucm_image">
		<h1>Welcome To SC</h1>
		<img class="imgHeaderUCM" src="images/UCM_twolineCE_2color.png" alt=""
			title="" border="0" />
		<%
  			/* String userName = ((edu.ucmo.ase.ecomm.sc.model.HeaderModel)request.getSession().getAttribute("sessionHeaderModel")).getUser();

			out.print("Welcome, " + userName); */
		%>


	</div>
</div>

