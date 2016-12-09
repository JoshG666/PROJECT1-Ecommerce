<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


 <jsp:include page="header.jsp"></jsp:include> 

<div class="slider">
	  <div class="callbacks_container">
	     <ul class="rslides" id="slider">
	         <li>
				 <div class="banner1">				  
					  <div class="banner-info">
					  <h3>Track Lighting.</h3>
					  <p>Lighting or illumination is the deliberate use of light to achieve a practical or aesthetic effect.</p>
					  </div>
				 </div>
	         </li>
	         <li>
				 <div class="banner2">
					 <div class="banner-info">
					 <h3>Ceiling Lights</h3>
					 <p>Indoor lighting is usually accomplished using light fixtures, and is a key part of interior design.</p>
					 </div>
				 </div>
			 </li>
	         <li>
	             <div class="banner3">
	        	 <div class="banner-info">
	        	 <h3>Pendant lighting.</h3>
	          	 <p>Lighting fixtures come in a wide variety of styles for various functions</p>
				 </div>
				 </div>
	         </li>
	      </ul>
	  </div>
  </div>
<!---->
<script src="<c:url value="/resources/webjs/bootstrap.js"/>"> </script>
<jsp:include page="code.jsp"></jsp:include>

<!-- <div class="items">
	 <div class="container">
		 <div class="items-sec">
			 <div class="col-md-3 feature-grid">
				 <a href="product.html"><img src="images/img1.jpg" alt=""/>	
					 <div class="arrival-info">
						 <h4>Lighting #1</h4>
						 <p>Rs 12000</p>
						 <span class="pric1"><del>Rs 18000</del></span>
						 <span class="disc">[12% Off]</span>
					 </div>
					 <div class="viw">
						<a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
					 </div>
				  </a>
			 </div>
			 <div class="col-md-3 feature-grid">
				 <a href="product.html"><img src="images/img2.jpg" alt=""/>	
					 <div class="arrival-info">
						 <h4>Lighting #1</h4>
						 <p>Rs 10000</p>
						 <span class="pric1"><del>Rs 14000</del></span>
						 <span class="disc">[14% Off]</span>
					 </div>
					 <div class="viw">
						<a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
					 </div>
				  </a>
			 </div>
			 <div class="col-md-3 feature-grid">
				 <a href="product.html"><img src="images/img3.jpg" alt=""/>	
					 <div class="arrival-info">
						 <h4>Lighting #1</h4>
						 <p>Rs 8500</p>
						 <span class="pric1"><del>Rs 9500</del></span>
						 <span class="disc">[10% Off]</span>
					 </div>
					 <div class="viw">
						<a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
					 </div>
				  </a>
			 </div>
			 <div class="col-md-3 feature-grid">
				 <a href="product.html"><img src="images/img4.jpg" alt=""/>	
					 <div class="arrival-info">
						 <h4>Lighting #1</h4>
						 <p>Rs 12000</p>
						 <span class="pric1"><del>Rs 18000</del></span>
						 <span class="disc">[12% Off]</span>
					 </div>
					 <div class="viw">
						<a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
					 </div>
				  </a>
			 </div>
			 <div class="clearfix"></div>
		 </div>
		 <div class="items-sec btm-sec">
			 <div class="col-md-3 feature-grid">
				 <a href="product.html"><img src="images/img5.jpg" alt=""/>	
					 <div class="arrival-info">
						 <h4>Lighting #1</h4>
						 <p>Rs 500</p>
						 <span class="pric1"><del>Rs 650</del></span>
						 <span class="disc">[8% Off]</span>
					 </div>
					 <div class="viw">
						<a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
					 </div>
				  </a>
			 </div>
			 <div class="col-md-3 feature-grid">
				 <a href="product.html"><img src="images/img8.jpg" alt=""/>	
					 <div class="arrival-info">
						 <h4>Lighting #1</h4>
						 <p>Rs 400</p>
						 <span class="pric1"><del>Rs 750</del></span>
						 <span class="disc">[12% Off]</span>
					 </div>
					 <div class="viw">
						<a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
					 </div>
				  </a>
			 </div>
			 <div class="col-md-3 feature-grid">
				 <a href="product.html"><img src="images/img7.jpg" alt=""/>	
					 <div class="arrival-info">
						 <h4>Lighting #1</h4>
						 <p>Rs 800</p>
						 <span class="pric1"><del>Rs 1200</del></span>
						 <span class="disc">[12% Off]</span>
					 </div>
					 <div class="viw">
						<a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
					 </div>
				  </a>
			 </div>
			 <div class="col-md-3 feature-grid">
				 <a href="product.html"><img src="images/img6.jpg" alt=""/>	
					 <div class="arrival-info">
						 <h4>Lighting #1</h4>
						 <p>Rs 600</p>
						 <span class="pric1"><del>Rs 1200</del></span>
						 <span class="disc">[50% Off]</span>
					 </div>
					 <div class="viw">
						<a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
					 </div>
				  </a>
			 </div>
			 <div class="clearfix"></div>
		 </div>
	 </div>
</div>

<div class="offers">
	 <div class="container">
	 <h3>End of Season Sale</h3>
	 <div class="offer-grids">
		 <div class="col-md-6 grid-left">
			 <a href="#"><div class="offer-grid1">
				 <div class="ofr-pic">
					 <img src="images/ofr2.jpeg" class="img-responsive" alt=""/>
				 </div>
				 <div class="ofr-pic-info">
					 <h4>Emergency Lights <br>& Led Bulds</h4>
					 <span>UP TO 60% OFF</span>
					 <p>Shop Now</p>
				 </div>
				 <div class="clearfix"></div>
			 </div></a>
		 </div>
		 <div class="col-md-6 grid-right">
			 <a href="#"><div class="offer-grid2">				 
				 <div class="ofr-pic-info2">
					 <h4>Flat Discount</h4>
					 <span>UP TO 30% OFF</span>
					 <h5>Outdoor Gate Lights</h5>
					 <p>Shop Now</p>
				 </div>
				 <div class="ofr-pic2">
					 <img src="images/ofr3.jpg" class="img-responsive" alt=""/>
				 </div>
				 <div class="clearfix"></div>
			 </div></a>
		 </div>
		 <div class="clearfix"></div>
	 </div>
	 </div>
</div>

<div class="subscribe">
	 <div class="container">
		 <h3>Newsletter</h3>
		 <form>
			 <input type="text" class="text" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}">
			 <input type="submit" value="Subscribe">
		 </form>
	 </div>
</div>

<div class="footer">
	 <div class="container">
		 <div class="footer-grids">
			 <div class="col-md-3 about-us">
				 <h3>About Us</h3>
				 <p>Maecenas nec auctor sem. Vivamus porttitor tincidunt elementum nisi a, euismod rhoncus urna. Curabitur scelerisque vulputate arcu eu pulvinar. Fusce vel neque diam</p>
			 </div>
			 <div class="col-md-3 ftr-grid">
					<h3>Information</h3>
					<ul class="nav-bottom">
						<li><a href="#">Track Order</a></li>
						<li><a href="#">New Products</a></li>
						<li><a href="#">Location</a></li>
						<li><a href="#">Our Stores</a></li>
						<li><a href="#">Best Sellers</a></li>	
					</ul>					
			 </div>
			 <div class="col-md-3 ftr-grid">
					<h3>More Info</h3>
					<ul class="nav-bottom">
						<li><a href="login.html">Login</a></li>
						<li><a href="#">FAQ</a></li>
						<li><a href="contact.html">Contact</a></li>
						<li><a href="#">Shipping</a></li>
						<li><a href="#">Membership</a></li>	
					</ul>					
			 </div>
			 <div class="col-md-3 ftr-grid">
					<h3>Categories</h3>
					<ul class="nav-bottom">
						<li><a href="#">Car Lights</a></li>
						<li><a href="#">LED Lights</a></li>
						<li><a href="#">Decorates</a></li>
						<li><a href="#">Wall Lights</a></li>
						<li><a href="#">Protectors</a></li>	
					</ul>					
			 </div>
			 <div class="clearfix"></div>
		 </div>
	 </div>
</div>
<div class="copywrite">
	 <div class="container">
		 <div class="copy">
			 <p>© 2015 Lighting. All Rights Reserved | Design by  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
		 </div>
		 <div class="social">							
				<a href="#"><i class="facebook"></i></a>
				<a href="#"><i class="twitter"></i></a>
				<a href="#"><i class="dribble"></i></a>	
				<a href="#"><i class="google"></i></a>	
				<a href="#"><i class="youtube"></i></a>	
		 </div>
		 <div class="clearfix"></div>
	 </div>
</div> -->
<jsp:include page="footer.jsp"></jsp:include>
<!---->
</body>
</html>
