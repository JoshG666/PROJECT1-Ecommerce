<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Lighting A Ecommerce Category Flat Bootstarp Resposive Website Template | Home :: w3layouts</title>
<link href="<c:url value="/resources/web/css/bootstrap.css"/>" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<!--theme style-->
<link href="<c:url value="/resources/web/css/style.css" />"rel="stylesheet" type="text/css" media="all" />	
<script src="<c:url value="/resources/web/js/jquery.min.js"/>"></script>

<!--//theme style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Wedding Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- start menu -->
<script src="<c:url value="/resources/web/js/simpleCart.min.js"/>"> </script>
<!-- start menu -->
<link href="<c:url value="/resources/web/css/memenu.css"/>" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="<c:url value="/resources/web/js/memenu.js"/>"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>	
<!-- /start menu -->
</head>
<body> 
<!--header-->	
<script src="<c:url value="/resources/web/js/responsiveslides.min.js"/>"></script>
<script>  
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: false,
      });
    });
  </script>
  
<div class="header-top">
	 <div class="header-bottom">
	 <c:choose>
<c:when test="${pageContext.request.userPrincipal.name != null}">


<a>Hello, ${pageContext.request.userPrincipal.name}</a>
<a href="<c:url value="/j_spring_security_logout"/>">
<i class="fa fa-sign-out"></i>Sign Out</a>
</c:when>
</c:choose>

<c:choose>
<c:when test="${pageContext.request.userPrincipal.name != null}">
<c:if test="${pageContext.request.userPrincipal.name == 'Admin'}">

<li><a href="<c:url value='/categories'/>">Category</a></li>
<li><a href="<c:url value="/suppliers"/>">Supplier</a></li>
<li><a href="<c:url value="/products"/>">Product</a></li>


</c:if>

<c:if test="${pageContext.request.userPrincipal.name != 'Admin'}">

<li><a href="<c:url value="/user/cart"/>">Cart</a></li>


</c:if>
</c:when>

<c:otherwise>

<li><a href="<c:url value="/loginpage"/>">Register</a></li>
<li><a href="<c:url value="/loginpage"/>">Login</a></li>

</c:otherwise>
</c:choose>
	 			
				<div class="logo">
					<h1><a href="<c:url value="/resources/web/index.html"/>">Lighting</a></h1>					
				</div>
			 <!---->		 
			 <div class="top-nav">
				<ul class="memenu skyblue"><li class="active"><a href="<c:url value="/resources/web/index.html"/>">Home</a></li>
					<li class="grid"><a href="/">Products</a>
						<%-- <div class="mepanel">
							<div class="row">
								<div class="col1 me-one">
									<h4>Shop</h4>
									<ul>
										<li><a href="<c:url value="/resources/web/product.html"/>">New Arrivals</a></li>
										<li><a href="<c:url value="/resources/web/product.html"/>">Home</a></li>
										<li><a href="<c:url value="/resources/web/product.html"/>">Decorates</a></li>
										<li><a href="<c:url value="/resources/web/product.html"/>">Accessories</a></li>
										<li><a href="<c:url value="/resources/web/product.html"/>">Kids</a></li>
										<li><a href="<c:url value="/resources/web/product.html"/>">Login</a></li>
										<li><a href="<c:url value="/resources/web/product.html"/>">Brands</a></li>
										<li><a href="<c:url value="/resources/web/product.html"/>">My Shopping Bag</a></li>
									</ul>
								</div>
								<div class="col1 me-one">
									<h4>Type</h4>
									<ul>
										<li><a href="product.html">Diwali Lights</a></li>
										<li><a href="product.html">Tube Lights</a></li>
										<li><a href="product.html">Bulbs</a></li>
										<li><a href="product.html">Ceiling Lights</a></li>
										<li><a href="product.html">Accessories</a></li>
										<li><a href="product.html">Lanterns</a></li>
									</ul>	
								</div>
								<div class="col1 me-one">
									<h4>Popular Brands</h4>
									<ul>
										<li><a href="product.html">Everyday</a></li>
										<li><a href="product.html">Philips</a></li>
										<li><a href="product.html">Havells</a></li>
										<li><a href="product.html">Wipro</a></li>
										<li><a href="product.html">Jaguar</a></li>
										<li><a href="product.html">Ave</a></li>
										<li><a href="product.html">Gold Medal</a></li>
										<li><a href="product.html">Anchor</a></li>
									</ul>	
								</div>
							</div>
						</div>
					</li> --%>
					<li class="grid"><a href="#">Categories</a>
						<div class="mepanel">
							<div class="row">
								<div class="col1 me-one">
									<!-- <h4>Shop</h4> -->
									<ul>
									<c:forEach items="${categoryList}" var="category">
										
										<li><a href="user/cart">${category.category_name}</a></li>
										<!-- <li><a href="product.html">Decorates</a></li>
										<li><a href="product.html">Accessories</a></li>
										<li><a href="product.html">Kids</a></li>
										<li><a href="product.html">Login</a></li>
										<li><a href="product.html">Brands</a></li>
										<li><a href="product.html">My Shopping Bag</a></li> -->
										</c:forEach>
									</ul>
								</div>
								<%-- <div class="col1 me-one">
									<h4>Type</h4>
									<ul>
										<li><a href="product.html">Diwali Lights</a></li>
										<li><a href="product.html">Tube Lights</a></li>
										<li><a href="product.html">Bulbs</a></li>
										<li><a href="product.html">Ceiling Lights</a></li>
										<li><a href="product.html">Accessories</a></li>
										<li><a href="product.html">Lanterns</a></li>
									</ul>	
								</div>
								<div class="col1 me-one">
									<h4>Popular Brands</h4>
									<ul>
										<li><a href="product.html">Everyday</a></li>
										<li><a href="product.html">Philips</a></li>
										<li><a href="product.html">Havells</a></li>
										<li><a href="product.html">Wipro</a></li>
										<li><a href="product.html">Jaguar</a></li>
										<li><a href="product.html">Ave</a></li>
										<li><a href="product.html">Gold Medal</a></li>
										<li><a href="product.html">Anchor</a></li>										
									</ul>	
								</div>
							</div>
						</div>
					</li>
					<li class="grid"><a href="<c:url value="/resources/web/typo.html"/>">Typo</a></li> --%>
					<li class="grid"><a href="contact">Contact</a></li>					
				</ul>				
			 </div>
			 <!---->
			 <div class="cart box_1">
				 <a href="checkout.html">
					<div class="total">
					<span class="simpleCart_total"></span> (<span id="simpleCart_quantity" class="simpleCart_quantity"></span>)</div>
					<span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>
				</a>
				<p><a href="cart" class="simpleCart_empty"> Cart</a></p>
			 	<div class="clearfix"> </div>
			 </div>
			 <div class="clearfix"> </div>
			 <!---->			 
			 </div>
			<div class="clearfix"> </div>
</div>
<!---->	