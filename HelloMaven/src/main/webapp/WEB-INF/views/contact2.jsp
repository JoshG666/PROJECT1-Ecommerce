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
					
						<h1>Thank you for contacting us</h1>
					</div>
					<div class="col-md-5">
						<ul class="breadcrumb">
						<li><a href="<c:url value="/"/>">Back</a></li>
						<%-- <li><a href="<c:url value="/user/cart"/>">My Cart</a></li>
						<li><a href="<c:url value="/shippingPage"/>">Shipping Details</a></li>
						<li>Thank you</li> --%>
							
						</ul>

					</div>
				</div>
			</div>
		</div>
	<section>
	
	
	
	
	  <div id="content">
	<div class="container">
				<h3 align="center" style="color: #79be25;">We will get back to you shortly.</h3>
				<br><br>
               <%-- <a href="<c:url value="/"/>" class="btn btn-primary center">Continue Shopping</a><br><br>
				<a href="<c:url value="/j_spring_security_logout"/>" class="btn btn-danger btnAction">Log out</a> --%>
	</div> <!-- /.container-->
	</div>
	
	
	</section>




		<%@include file="/WEB-INF/views/footer.jsp"%>

	</div>
	<!-- /#all -->
	<!-- #### JAVASCRIPT FILES ### -->
	<%@include file="/WEB-INF/views/scriptfiles.jsp"%>
</body>
</html>