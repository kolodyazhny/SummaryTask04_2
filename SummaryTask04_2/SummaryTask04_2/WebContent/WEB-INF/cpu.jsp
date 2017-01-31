<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<!-- Tag's -->
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
	<%@ taglib prefix="my" tagdir="/WEB-INF/tags/customtags/"%>

	<!-- Localization -->
	<fmt:setLocale value="${language_page}" />
	<fmt:setBundle basename="ua.nure.kolodiazhny.SummaryTask04_2.localization.text" />

<html>

<head>

<title>E-Shop | <fmt:message key="title.cpu" /></title>
<link rel="shortcut icon" href="/resources/images/site/logo/title.png" type="image/png">

	<!-- CSS styles	 -->
	<link href="/resources/css/font-awesome.css" rel="stylesheet">
	<link href="/resources/css/bootstrap.css" rel="stylesheet">
	<link href="/resources/css/jquery.smartmenus.bootstrap.css" rel="stylesheet">
	<link href="/resources/css/jquery.simpleLens.css" rel="stylesheet" type="text/css">
	<link href="/resources/css/slick.css" rel="stylesheet" type="text/css">
	<link href="/resources/css/nouislider.css" rel="stylesheet" type="text/css">
	<link id="switcher" href="/resources/css/theme-color/lite-blue-theme.css" rel="stylesheet">
	<link href="/resources/css/sequence-theme.modern-slide-in.css" rel="stylesheet" media="all">
	<link href="/resources/css/style.css" rel="stylesheet">
	<link href='https://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>

	<script type="text/javascript">
		var test = '<%= session.getAttribute("error") %>';
		if (test != 'null') {
		    alert(test);
		}
		'<% session.setAttribute("error", null); %>';
	</script>
</head>
<body>

	<!-- Start header section -->
	<div id="aa-header">
		<div class="aa-header-top">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="aa-header-top-area">

							<div class="aa-header-top-left">

								<!-- start language -->
								<my:language />
								<!-- / language -->

								<!-- start cellphone -->
								<div class="cellphone hidden-xs">
									<p>
										<span class="fa fa-phone"></span>099-74-56-999
									</p>
								</div>
								<!-- / cellphone -->

							</div>
							<div class="aa-header-top-right">
								<ul class="aa-head-top-nav-right">
									<c:if test="${user != null}">
										<li class="hidden-xs">
											<fmt:message key="nav_menu.greeting" /> ${user.firstName}
										</li>
									</c:if>
									<li class="hidden-xs"><a href="/views/public/shoppingcart.jsp"><fmt:message key="nav_menu.cart" /></a></li>

									<c:choose>
										<c:when test="${user.role == null}">
											<li><a href="" data-toggle="modal" data-target="#login-modal"><fmt:message key="nav_menu.login" /></a></li>
										</c:when>
										<c:otherwise>
											<c:if test="${user.role == 'ADMIN'}">
											   <li><a href="/admin?param=forward"><fmt:message key="nav_menu.admin" /></a></li>
											</c:if>
											<li><a href="/personalarea"><fmt:message key="nav_menu.personal" /></a></li>
											<li><a href="/exit?param=true"><fmt:message key="nav_menu.exit" /></a></li>
										</c:otherwise>
									</c:choose>

								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="aa-header-bottom">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="aa-header-bottom-area">
							<!-- start logo  -->
							<div class="aa-logo">
								<a href="/">
									<p>
										E-<strong>Shop</strong>
									</p>
								</a>
							</div>
							<!-- end logo  -->

							<!-- cart box -->
							<my:modalcart caption="${backet}" />
							<!-- / cart box -->

						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	<!-- / header section -->

	<!-- menu -->
	<div id="menu">
		<div class="container">
			<div class="menu-area">
				<!-- Navbar -->
				<div class="navbar navbar-default" role="navigation">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target=".navbar-collapse">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
					</div>
					<div class="navbar-collapse collapse">

						<ul class="nav navbar-nav">
							<li><a href="/"><fmt:message key="nav_panel.home" /></a></li>
							<li>
								<a href="#"><fmt:message key="nav_panel.computer" /> <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="/catalog?param=cpu"><fmt:message key="nav_panel.cpu" /></a></li>
									<li><a href="/catalog?param=sound"><fmt:message key="nav_panel.sound" /></a></li>
									<li><a href="/catalog?param=drive"><fmt:message key="nav_panel.hdd" /></a></li>
								</ul>
							</li>
							<li>
								<a href="#"><fmt:message key="nav_panel.photo" /> <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="/catalog?param=camera"><fmt:message key="nav_panel.camera" /></a></li>
									<li><a href="/catalog?param=flash"><fmt:message key="nav_panel.flash" /></a></li>
								</ul>
							</li>
							<li><a href="/views/public/contact.jsp"><fmt:message key="nav_panel.contact" /></a></li>
						</ul>

					</div>

				</div>
			</div>
		</div>
	</div>
	<!-- / menu -->

	<!-- product category -->
	<div id="aa-product-category">
	<div class="container">
		<div class="row">
			<div class="col-lg-9 col-md-9 col-sm-8 col-md-push-3">
				<div class="aa-product-catg-content">

					<div class="aa-product-catg-body">
						<!-- Products section -->
						<my:list caption="${CPU}" />

					</div>

					<div class="aa-product-catg-pagination">
						<nav>
						<ul class="pagination">
							<li><a href="#" aria-label="Previous"> <span aria-hidden="true">&laquo;</span></a></li>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span></a></li>
						</ul>
						</nav>
					</div>
				</div>
			</div>
			<my:sort />
		</div>
	</div>
	</div>
	<!-- / product category -->

	<!-- footer -->
	<div id="aa-footer"> <!-- footer bottom -->
	<div class="aa-footer-top">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="aa-footer-top-area">
						<div class="row">
							<div class="col-md-3 col-sm-6">
								<div class="aa-footer-widget">
									<h3><fmt:message key="footer.header" /></h3>
									<ul class="aa-footer-nav">
										<li><a href="/"><fmt:message key="footer.home" /></a></li>
										<li><a href="/views/public/contact.jsp"><fmt:message key="footer.contact" /></a></li>
										<li><a href="/views/public/shopping.jsp"><fmt:message key="footer.cart" /></a></li>
									</ul>
								</div>
							</div>

							<div class="col-md-3 col-sm-6">
								<div class="aa-footer-widget">
									<div class="aa-footer-widget">
										<h3><fmt:message key="footer.contact" /></h3>
										<address>
											<p>Kolodiazhny Nikolay</p>
											<p>
												<span class="fa fa-phone"></span>099-74-56-999
											</p>
											<p>
												<span class="fa fa-envelope"></span>test@gmail.com
											</p>
										</address>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	<!-- / footer -->

	<!-- start login -->
	<my:login />
	<!-- end login -->

	<!-- jQuery library -->
	<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="/resources/js/bootstrap.js"></script>
	<script src="/resources/js/jquery.smartmenus.js" type="text/javascript"></script>
	<script src="/resources/js/jquery.smartmenus.bootstrap.js" type="text/javascript"></script>
	<script src="/resources/js/sequence.js"></script>
	<script src="/resources/js/sequence-theme.modern-slide-in.js"></script>
	<script src="/resources/js/jquery.simpleGallery.js" type="text/javascript"></script>
	<script src="/resources/js/jquery.simpleLens.js" type="text/javascript"></script>
	<script src="/resources/js/slick.js" type="text/javascript"></script>
	<script src="/resources/js/nouislider.js" type="text/javascript"></script>
	<script src="/resources/js/custom.js"></script>

</body>

</html>