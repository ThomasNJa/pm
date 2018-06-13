<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--LEFT SIDE LIST  -->
<nav class="navbar-default navbar-side" role="navigation">
<div class="sidebar-collapse">
	<ul class="nav" id="main-menu">
	
		<!-- 单层 -->
		<li><a class="active-menu waves-effect waves-dark" href="index.html"><i class="fa fa-dashboard"></i> Dashboard</a></li>
		<li><a href="ui-elements.html" class="waves-effect waves-dark"><i class="fa fa-desktop"></i> UI Elements</a></li>
		<li><a href="chart.html" class="waves-effect waves-dark"><i class="fa fa-bar-chart-o"></i> Charts</a></li>
		<li><a href="tab-panel.html" class="waves-effect waves-dark"><i class="fa fa-qrcode"></i> Tabs & Panels</a></li>
		<li><a href="table.html" class="waves-effect waves-dark"><i class="fa fa-table"></i> Responsive Tables</a></li>
		<li><a href="form.html" class="waves-effect waves-dark"><i class="fa fa-edit"></i> Forms </a></li>

		<!-- 多层 -->
		<li><a href="#" class="waves-effect waves-dark"><i class="fa fa-sitemap"></i> Multi-Level Dropdown<span class="fa arrow"></span></a>
			<ul class="nav nav-second-level">
				<li><a href="#">Second Level Link</a></li>
				<li><a href="#">Second Level Link</a></li>
				<li><a href="#">Second Level Link<span class="fa arrow"></span></a>
					<ul class="nav nav-third-level">
						<li><a href="#">Third Level Link</a></li>
						<li><a href="#">Third Level Link</a></li>
						<li><a href="#">Third Level Link</a></li>
					</ul>
				</li>
			</ul>
		</li>
		
		<li><a href="empty.html" class="waves-effect waves-dark"><i class="fa fa-fw fa-file"></i> Empty Page</a></li>
	</ul>

</div>
</nav>