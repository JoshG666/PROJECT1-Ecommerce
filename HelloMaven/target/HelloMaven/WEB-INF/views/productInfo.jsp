<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="en">

<head>
<%@include file="/WEB-INF/views/header.jsp"%>

</head>

<body>
	<div id="all">
		<div id="heading-breadcrumbs">
			<div class="container">
				<div class="row">
					<div class="col-md-7">
						<h1>Product details</h1>
					</div>
					<div class="col-md-5">
						<ul class="breadcrumb">
							<li><a href="<c:url value="/"/>">Home</a></li>
							<li>${selectedProduct.product_name}</li>
						</ul>

					</div>
				</div>
			</div>
		</div>
		<c:if test="${!empty selectedProduct.product_name}">
			<section class="bar background-gray no-mb padding-big text-center-sm">

				<div class="container">
					<div class="row">
						<div class="col-md-4">
							<h2 class="text-uppercase">Product details</h2>
							<p>
								<br>${selectedProduct.product_id} <br>${selectedProduct.product_name}
								<br>${selectedProduct.product_description} <br>Rs.${selectedProduct.product_price}
								<br>${selectedProduct.category.category_name} <br>${selectedProduct.supplier.supplier_name}

								<c:if
									test="${pageContext.request.userPrincipal.name != 'Admin'}">
									<p>
										<%-- <a href="<c:url value="${url}" />" class="btn btn-primary">Back</a> --%>
										<c:if
											test="${pageContext.request.userPrincipal.name  != 'Admin'}">
											<a href="<c:url value="/usercart/cart/addItem/${selectedProduct.product_id}"/>" class="btn btn-primary"><span
												class="glyphicon glyphicon-shopping-cart"></span>Add to cart
											</a>

											<a href="<spring:url value="/user/cart"/>"
												class="btn btn-primary"><span
												class="glyphicon glyphicon-hand-right"></span>View Cart</a>
										</c:if>
									</p>
								</c:if>
								<c:if test="${pageContext.request.userPrincipal.name == 'Admin'}">
								<p>
										<a href="<c:url value="/product/edit/${selectedProduct.product_id}"/>" 
										class="btn btn-primary">Edit product
											</a>
											</p>			
								</c:if>
								<br>
								<br>
							
								<br>
							</p>
						</div>
						<div class="col-md-8 text-center">
							<img alt=""
								src="<c:url value="/resources/img/productImages/${selectedProduct.product_id}.jpg"/>" />
						</div>
					</div>
				</div>
			</section>
		</c:if>

		<%@include file="/WEB-INF/views/footer.jsp"%>

	</div>
	<!-- /#all -->




	<%-- <!-- #### JAVASCRIPT FILES ### -->
	<%@include file="/WEB-INF/views/scriptfiles.jsp"%> --%>
</body>
</html>
