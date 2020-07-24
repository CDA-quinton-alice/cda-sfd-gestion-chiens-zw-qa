<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<link type="text/css" rel="stylesheet" href="static/css/style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
	integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
	crossorigin="anonymous"></script>
</head>
<body>

	<div class="container-fluid">
		<div class="row">

			<div class="col-sm-12">
				<nav class="navbar navbar-expand-lg navbar-light bg-light">
					<a class="navbar-brand" href="#">Welcome</a>
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#navbarNavAltMarkup"
						aria-controls="navbarNavAltMarkup" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
						<div class="navbar-nav">
							<a class="nav-item nav-link active" href="pages/user/login.jsp">Login
								<span class="sr-only">(current)</span>
							</a> <a class="nav-item nav-link" href="pages/user/regist.jsp">Regist</a>
							<a class="nav-item nav-link" href="pages/cart/cart.jsp">List</a>
							<a class="nav-item nav-link" href="ages/manager/manager.jsp">Gestion</a>
						</div>
					</div>
				</nav>
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-8">
				<div id="carouselExampleIndicators" class="carousel slide"
					data-ride="carousel">
					<ol class="carousel-indicators">
						<li data-target="#carouselExampleIndicators" data-slide-to="0"
							class="active"></li>
						<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
						<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
					</ol>
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img src="default.png" class="d-block w-100" alt="img homepage">
						</div>
						<div class="carousel-item">
							<img src="default.png" class="d-block w-100" alt="img homepage">
						</div>
						<div class="carousel-item">
							<img src="default.png" class="d-block w-100" alt="img homepage">
						</div>
					</div>
					<a class="carousel-control-prev" href="link" role="button"
						data-slide="prev"> <span class="carousel-control-prev-icon"
						aria-hidden="true"></span> <span class="sr-only">Previous</span>
					</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
						role="button" data-slide="next"> <span
						class="carousel-control-next-icon" aria-hidden="true"></span> <span
						class="sr-only">Next</span>
					</a>
				</div>
				<div class="col-sm-2"></div>

			</div>

			<div class="col-sm-2"></div>
		</div>
	</div>

</body>
</html>