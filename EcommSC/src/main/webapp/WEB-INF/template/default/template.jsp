<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <link rel="stylesheet" type="text/css" href="css/default.css"> -->
<style type="text/css">
body {
	background: url(images/bg.jpg) no-repeat #fff center top;
	padding: 0;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 11px;
	margin: 0px auto auto auto;
	color: #000;
}

p {
	padding: 2px;
	margin: 0px;
}

#main_container {
	width: 1000px;
	height: auto;
	margin: auto;
	padding: 0px;
}

.top_bar {
	width: 1000px;
	height: 38px;
	background-color: #4a4a4a;
}

.top_search {
	width: 370px;
	height: 32px;
	margin: 0px 20px 0 0;
	_margin: 0px 10px 0 0;
	float: right;
	background: url(images/top_search_bg.gif) no-repeat center;
}

input.search_input {
	width: 182px;
	height: 18px;
	float: left;
	margin: 5px 0 0 0;
	border: 1px solid #dbdbdb;
	border-bottom-color: #ffffff;
	border-right-color: #ffffff;
}

.search_text {
	float: left;
	width: 110px;
	padding: 8px 0 0 15px;
	color: #999999;
}

.search_text a {
	text-decoration: none;
	color: #999999;
}

.search_bt {
	float: left;
	padding: 2px 0 0 15px;
}

.languages {
	float: right;
	width: 150px;
	padding: 8px 0 0 0;
}

.lang_text {
	float: left;
	padding: 0 5px 0 0;
	color: #b3adad;
}

a.lang {
	display: block;
	float: left;
	padding: 0 5px 0 5px;
}

#header {
	width: 1000px;
	height: 173px;
	background: url(images/header_bg.jpg) no-repeat center;
	background-position: 0px 0px;
	margin: auto;
}

#logo {
	float: left;
	padding: 15px;
}
/*------------------------------oferte_content-----------------------*/
.oferte_content {
	width: 600px;
	height: 164px;
	float: left;
	padding: 0 0 0 50px;
}

.top_divider {
	float: left;
	width: 1px;
	height: 164px;
}

.oferta {
	width: 538px;
	float: left;
	padding: 15px 30px 0 30px;
}

.oferta_img {
	float: left;
	padding: 0 0 10px 0;
}

.oferta_title {
	font-size: 15px;
	color: #b72c24;
	font-weight: bold;
}

.oferta_details {
	width: 400px;
	float: left;
	padding: 0 0 0 30px;
}

.oferta_text {
	padding: 5px 0 5px 0;
	font-size: 12px;
	color: #FFFFFF;
	text-align: justify;
	line-height: 15px;
}

a.details {
	width: 83px;
	height: 21px;
	display: block;
	float: right;
	margin: 5px 0 0 0;
	padding-left: 5px;
	background: url(images/details_bt_bg.gif) no-repeat center;
	text-align: center;
	line-height: 21px;
	text-decoration: none;
	color: #000000;
}
/*---------------------oferta_pagination-----------------------------*/
div.oferta_pagination {
	clear: both;
	padding: 10px 0 0 0;
	_padding: 0px 0 0 0;
	margin: 5px;
	text-align: center;
	float: left;
	font-size: 10px;
}

div.oferta_pagination a {
	width: 22px;
	height: 22px;
	display: block;
	float: left;
	margin: 0 0 0 5px;
	_margin: 0 0 0 3px;
	line-height: 23px;
	text-align: center;
	background: url(images/pag_bg.gif) no-repeat center;
	text-decoration: none;
	color: #9d8b8b;
}

div.oferta_pagination a:hover, div.pagination a:active {
	width: 22px;
	height: 22px;
	display: block;
	float: left;
	line-height: 23px;
	text-align: center;
	background: url(images/pag_bg_a.gif) no-repeat center;
	text-decoration: none;
	color: #ad1614;
}

div.oferta_pagination span.current {
	width: 22px;
	height: 22px;
	display: block;
	float: left;
	line-height: 23px;
	text-align: center;
	background: url(images/pag_bg_a.gif) no-repeat center;
	text-decoration: none;
	color: #ad1614;
}

#main_content {
	clear: both;
}
/*---------------- menu tab----------------------*/
#menu_tab {
	width: 1000px;
	height: 50px;
	background-color: #fff;
}

.left_menu_corner {
	width: 9px;
	height: 50px;
	float: left;
	background: url(images/menu_left.gif) no-repeat center;
}

.right_menu_corner {
	width: 9px;
	height: 50px;
	float: left;
	background: url(images/menu_right.gif) no-repeat center;
}

ul.menu {
	list-style-type: none;
	float: left;
	display: block;
	width: 982px;
	margin: 0px;
	padding: 0px;
	background: url(images/menu_bg.gif) repeat-x;
}

ul.menu li {
	display: inline;
	font-size: 11px;
	font-weight: bold;
	line-height: 50px;
}

ul.menu li.divider {
	display: inline;
	width: 2px;
	height: 50px;
	float: left;
	background: url(images/menu_divider.gif) no-repeat center;
}

a.nav1:link, a.nav1:visited {
	display: block;
	float: left;
	padding: 0px 8px 0px 22px;
	margin: 0 14px 0 14px;
	height: 50px;
	text-decoration: none;
	background: url(images/home.png) no-repeat left;
	color: #676d77;
}

a.nav2:link, a.nav2:visited {
	display: block;
	float: left;
	padding: 0px 8px 0px 22px;
	margin: 0 14px 0 14px;
	height: 50px;
	text-decoration: none;
	background: url(images/services.png) no-repeat left;
	color: #676d77;
}

a.nav3:link, a.nav3:visited {
	display: block;
	float: left;
	padding: 0px 8px 0px 22px;
	margin: 0 14px 0 14px;
	height: 50px;
	text-decoration: none;
	background: url(images/favs.png) no-repeat left;
	color: #676d77;
}

a.nav4:link, a.nav4:visited {
	display: block;
	float: left;
	padding: 0px 8px 0px 22px;
	margin: 0 14px 0 14px;
	height: 50px;
	text-decoration: none;
	background: url(images/user_add.png) no-repeat left;
	color: #676d77;
}

a.nav5:link, a.nav5:visited {
	display: block;
	float: left;
	padding: 0px 8px 0px 22px;
	margin: 0 14px 0 14px;
	height: 50px;
	text-decoration: none;
	background: url(images/car.png) no-repeat left;
	color: #676d77;
}

a.nav6:link, a.nav6:visited {
	display: block;
	float: left;
	padding: 0px 8px 0px 22px;
	margin: 0 14px 0 14px;
	height: 50px;
	text-decoration: none;
	background: url(images/contact-new.png) no-repeat left;
	color: #676d77;
}

a.nav1:hover, a.nav2:hover, a.nav3:hover, a.nav4:hover, a.nav5:hover, a.nav6:hover
	{
	color: #333333;
}

li.currencies {
	width: 180px;
	float: left;
	padding: 0 0 0 15px;
	_padding: 12px 0 0 15px;
	color: #676d77;
	font-size: 11px;
	font-weight: bold;
}
/*----------------crumb_navigation-------------*/
.crumb_navigation {
	width: 980px;
	height: 15px;
	padding: 5px 10px 0 20px;
	color: #333333;
	background: url(images/navbullet.png) no-repeat left;
	background-position: 5px 6px;
}

.crumb_navigation a {
	color: #0fa0dd;
	text-decoration: underline;
}

span.current {
	color: #0fa0dd;
}

/*-------------left_content------------------*/
.left_content {
	width: 196px;
	float: left;
}

.title_box {
	width: 196px;
	height: 30px;
	margin: 5px 0 0 0;
	background: url(images/menu_title_bg.gif) no-repeat center;
	text-align: center;
	font-size: 13px;
	font-weight: bold;
	color: #fff;
	line-height: 30px;
}
/*--------left menu---------*/
ul.left_menu {
	width: 196px;
	padding: 0px;
	margin: 0px;
	list-style: none;
}

ul.left_menu li {
	margin: 0px;
	list-style: none;
}

ul.left_menu li.odd a {
	width: 166px;
	height: 25px;
	display: block;
	background: url(images/checked.png) no-repeat left #dad0d0;
	background-position: 5px 5px;
	border-bottom: 1px #FFFFFF solid;
	text-decoration: none;
	color: #504b4b;
	padding: 0 0 0 30px;
	line-height: 25px;
}

ul.left_menu li.even a {
	width: 166px;
	height: 25px;
	display: block;
	background: url(images/checked.png) no-repeat left #eee6e6;
	background-position: 5px 5px;
	border-bottom: 1px #FFFFFF solid;
	text-decoration: none;
	color: #504b4b;
	padding: 0 0 0 30px;
	line-height: 25px;
}

ul.left_menu li.even a:hover, ul.left_menu li.odd a:hover {
	background: url(images/checked.png) no-repeat left #7bbcc7;
	color: #FFFFFF;
	background-position: 5px 5px;
}

.border_box {
	width: 194px;
	height: auto;
	text-align: center;
	border: 1px #6da6b1 solid;
}

.product_title {
	color: #ea2222;
	padding: 5px 0 5px 0;
	font-weight: bold;
}

.product_title a {
	text-decoration: none;
	color: #ea2222;
	padding: 5px 0 5px 0;
	font-weight: bold;
}

.product_title a:hover {
	color: #064E5A;
}

.product_img {
	padding: 5px 0 5px 0;
}

.prod_price {
	padding: 5px 0 5px 0;
}

span.reduce {
	color: #999999;
	text-decoration: line-through;
}

span.price {
	color: #ea2222;
}
/*----------newsletter--------------*/
input.newsletter_input {
	width: 160px;
	height: 16px;
	border: 1px #ddd9d9 solid;
	margin: 10px 0 5px 0;
	font-size: 12px;
	padding: 3px;
	color: #999999;
}

a.join {
	width: 17px;
	display: block;
	margin: 5px 0 5px 140px;
	_margin: 5px 0 5px 130px;
	background: url(images/blue-add.png) no-repeat left;
	padding: 0 0 0 20px;
	text-decoration: none;
	color: #1c4a52;
}

.banner_adds {
	width: 194px;
	text-align: center;
	padding: 10px 0 10px 0;
}

/*center content--------------------------*/
.center_content {
	width: 585px;
	float: left;
	padding: 5px 10px;
}

.center_title_bar {
	width: 520px;
	height: 33px;
	float: left;
	padding: 0 0 0 40px;
	margin: 0 0 0 12px;
	_margin: 0 0 0 6px;
	line-height: 33px;
	font-size: 12px;
	color: #847676;
	font-weight: bold;
	background: url(images/bar_bg.gif) no-repeat center;
}

/*----------------------right content--------------*/
.right_content {
	width: 196px;
	float: left;
	padding: 5px 0 0 0;
}

.shopping_cart {
	width: 195px;
	height: 84px;
	text-align: center;
	background: url(images/cart_bg.gif) no-repeat center;
}

.cart_title {
	font-size: 12px;
	font-size: 12px;
	color: #847676;
	font-weight: bold;
	padding: 8px 0 0 0;
}

.cart_details {
	width: 115px;
	float: left;
	padding: 5px 0 0 15px;
	text-align: left;
}

.cart_icon {
	float: left;
	padding: 5px 0 0 5px;
}

span.border_cart {
	width: 100px;
	height: 1px;
	margin: 3px 0 3px 0;
	display: block;
	border-top: 1px #999999 dashed;
}
/*---------prod_box----------*/
.prod_box {
	width: 173px;
	height: auto;
	float: left;
	padding: 10px 10px 10px 11px;
}

.top_prod_box {
	width: 173px;
	height: 12px;
	background: url(images/product_box_top.gif) no-repeat center bottom;
	float: left;
	padding: 0px;
	margin: 0px;
}

.bottom_prod_box {
	width: 173px;
	height: 10px;
	background: url(images/product_box_bottom.gif) no-repeat center top;
	float: left;
	padding: 0px;
	margin: 0px;
}

.center_prod_box {
	width: 173px;
	height: auto;
	background: url(images/product_box_center.gif) repeat-y;
	float: left;
	text-align: center;
	padding: 0px;
	margin: 0px;
}

.prod_details_tab {
	width: 173px;
	height: 31px;
	float: left;
	background: url(images/products_details_bg.gif) no-repeat center;
	margin: 3px 0 0 0;
}

img.left_bt {
	float: left;
	padding: 6px 0 0 6px;
}

a.prod_details {
	width: 25px;
	display: block;
	float: left;
	background: url(images/square-blue-add.gif) no-repeat left;
	padding: 0 0 0 20px;
	margin: 7px 0 0 38px;
	_margin: 6px 0 0 35px;
	text-decoration: none;
	color: #0fa0dd;
}
/*---------prod_box_big----------*/
.prod_box_big {
	width: 554px;
	height: auto;
	float: left;
	padding: 10px 10px 10px 15px;
}

.top_prod_box_big {
	width: 554px;
	height: 12px;
	background: url(images/details_box_top.gif) no-repeat center bottom;
	float: left;
	padding: 0px;
	margin: 0px;
}

.bottom_prod_box_big {
	width: 554px;
	height: 12px;
	background: url(images/details_box_bottom.gif) no-repeat center top;
	float: left;
	padding: 0px;
	margin: 0px;
}

.center_prod_box_big {
	width: 554px;
	height: auto;
	background: url(images/details_box_center.gif) repeat-y;
	float: left;
	text-align: center;
	padding: 0px;
	margin: 0px;
}

.product_img_big {
	width: 170px;
	padding: 5px 0 5px 10px;
	float: left;
}

.details_big_box {
	width: 345px;
	float: left;
	padding: 0 0 0 15px;
	text-align: left;
}

.product_title_big {
	color: #ea2222;
	padding: 5px 0 5px 0;
	font-weight: bold;
	font-size: 14px;
}

.specifications {
	font-size: 12px;
	font-weight: bold;
	line-height: 18px;
}

.thumbs {
	padding: 8px 5px 8px 5px;
	border: 1px #DFD1D1 solid;
	margin: 3px 0 0 0;
}

.thumbs a {
	padding: 3px;
}

.prod_price_big {
	padding: 5px 0 5px 0;
	font-size: 16px;
}

span.reduce {
	color: #999999;
	text-decoration: line-through;
}

span.price {
	color: #ea2222;
}

a.addtocart {
	width: 76px;
	height: 27px;
	display: block;
	float: left;
	background: url(images/addtocart.gif) no-repeat left;
	padding: 0 0 0 33px;
	text-decoration: none;
	line-height: 27px;
	color: #1c4a52;
}

a.compare {
	width: 76px;
	height: 27px;
	display: block;
	float: left;
	margin: 0 0 0 10px;
	background: url(images/compare.gif) no-repeat left;
	padding: 0 0 0 33px;
	text-decoration: none;
	line-height: 27px;
	color: #1c4a52;
}

span.blue {
	color: #5F9FAB;
}
/*---------------contact_form------------------*/
.contact_form {
	width: 355px;
	float: left;
	padding: 0px 0 0 75px;
}

.form_row {
	width: 335px;
	clear: both;
	padding: 10px 0 10px 0;
	_padding: 5px 0 5px 0;
	color: #a53d17;
}

label.contact {
	width: 75px;
	float: left;
	font-size: 12px;
	text-align: right;
	padding: 4px 5px 0 0;
	color: #333333;
}

input.contact_input {
	width: 253px;
	height: 18px;
	background-color: #fff;
	color: #999999;
	border: 1px #DFDFDF solid;
	float: left;
}

textarea.contact_textarea {
	width: 253px;
	height: 50px;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
	color: #999999;
	background-color: #fff;
	border: 1px #DFDFDF solid;
	float: left;
}

a.contact {
	width: 99px;
	height: 27px;
	display: block;
	float: right;
	margin: 0 0 0 10px;
	background: url(images/contact_bt.gif) no-repeat left;
	padding: 0 0 0 10px;
	text-decoration: none;
	line-height: 27px;
	color: #1c4a52;
}
/*--------------footer----------------*/
.footer {
	width: 1000px;
	clear: both;
	height: 65px;
	background: url(images/footer_bg.gif) repeat-x top;
}

.left_footer {
	float: left;
	width: 300px;
	padding: 5px 0 0 10px;
}

.right_footer {
	float: right;
	padding: 15px 30px 0 0;
}

.right_footer a {
	padding: 0 0 0 7px;
	text-decoration: none;
	color: #666666;
}

.right_footer a:hover {
	text-decoration: underline;
}

.center_footer {
	float: left;
	width: 200px;
	text-align: center;
	color: #666666;
	padding: 10px 0 0 60px;
}
</style>
</head>
<body>
		<div class="page">
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="top-menuTab"/>
		<div class="content">
			<tiles:insertAttribute name="left-menu" />
			<tiles:insertAttribute name="body" />
			<tiles:insertAttribute name="rightPanel" />
		</div>
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>