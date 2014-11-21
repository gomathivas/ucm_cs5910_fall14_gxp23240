<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="true"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page import="edu.ucmo.ase.ecomm.sc.model.SessionModel"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="center_content">
<h2>Product Manager</h2>
 
<h3>Add new product</h3>
<form:form method="post" action="/EcommSC/saveProduct" commandName="productModel" enctype="multipart/form-data">
    <form:errors path="*" cssClass="error"/>
    <table>
    <tr>
        <td><form:label path="productShortDes">Product Name</form:label></td>
        <td><form:input path="productShortDes" /></td>
    </tr>
    <tr>
        <td><form:label path="productLongDes">Product Description</form:label></td>
        <td><form:textarea path="productLongDes" /></td>
    </tr>
     <tr>
        <td><form:label path="newPrice">Product Price</form:label></td>
        <td><form:textarea path="newPrice" /></td>
    </tr>
    <tr>
        <td><form:label path="productImage">Product Image</form:label></td>
        <td><input type="file" name="file" id="file"></input></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Add Product"/>
        </td>
    </tr>
</table> 
</form:form>
 
<br/>
<h3>Product List</h3>
<c:if  test="${!empty productModelList}">
<table class="data">
<tr>
    <th>Name</th>
    <th>Description</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${productModelList}" var="productModel">
    <tr>
        <td width="100px">${productModel.productShortDes}</td>
        <td width="250px">${productModel.productLongDes}</td>
        <td width="20px">
            <a href="${pageContext.request.contextPath}/download/${productModel.productId}.html"><img
                src="${pageContext.request.contextPath}/images/save_icon.gif" border="0"
                title="Download this document"/></a>
         
            <a href="${pageContext.request.contextPath}/remove/${productModel.productId}.html"
                onclick="return confirm('Are you sure you want to delete this document?')"><img
                src="${pageContext.request.contextPath}/images/delete_icon.gif" border="0"
                title="Delete this document"/></a>
        </td>
    </tr>
</c:forEach>
</table>
</c:if>

		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>