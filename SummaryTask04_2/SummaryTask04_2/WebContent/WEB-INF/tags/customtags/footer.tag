<%@ tag language="java" pageEncoding="UTF-8"%>

	<!-- Tag's -->
	<%@ tag body-content="empty" dynamic-attributes="ccc"%>
	<%@ attribute name="caption" type="java.util.Collection"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="my" uri="http://www.tomcat-demo.com/total"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

	<!-- Localization -->
	<fmt:setLocale value="${language_page}" />
	<fmt:setBundle basename="ua.nure.kolodiazhny.SummaryTask04_2.localization.text" />

	<!-- footer -->
	<div id="aa-footer">

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
											<li><a href="/SummaryTask04_2/"><fmt:message key="footer.home" /></a></li>
											<li><a href="/SummaryTask04_2/views/public/contact.jsp"><fmt:message key="footer.contact" /></a></li>
											<li><a href="/SummaryTask04_2/views/public/shoppingcart.jsp"><fmt:message key="footer.cart" /></a></li>
										</ul>
									</div>
								</div>

								<div class="col-md-3 col-sm-6">
									<div class="aa-footer-widget">
										<div class="aa-footer-widget">
											<h3><fmt:message key="footer.contact" /></h3>
											<address>
												<p>Nikolay Kolodiazhny</p>
												<p>
													<span class="fa fa-phone"></span>099-74-56-999
												</p>
												<p>
													<span class="fa fa-envelope"></span>kolyan199410@meta.ua
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