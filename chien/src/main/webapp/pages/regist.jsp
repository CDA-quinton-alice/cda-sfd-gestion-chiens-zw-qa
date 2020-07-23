<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Regist</title>
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
			<div class="col-sm-4"></div>
			<div class="col-sm-4">

				<div id="content">
					<div class="login_form">
						<div class="login_box">
							<div class="tit">
								<h1>Sign in</h1>
								<span class="errorMsg"> ${ requestScope.msg } </span>
							</div>
							<div class="form">
								<form action="RegistServlet" method="post">
									<input type="hidden" name="action" value="regist"> 
									
									<label>Login: </label> 
									<input class="itxt" type="text" placeholder="Login"
										value="${requestScope.username}" autocomplete="off"
										tabindex="1" name="username" id="username" /> <br /> <br />
										
									<label>Password: </label> 
									<input class="itxt" type="password"
										placeholder="Password" autocomplete="off" tabindex="1"
										name="password" id="password" /> <br /> <br /> 
									<label>Confirm password: </label> 
									<input class="itxt" type="password"
										placeholder="Confirm password" autocomplete="off" tabindex="1"
										name="repwd" id="repwd" /> <br /> <br /> 
									<label>Email: </label> 
									<input class="itxt" type="text" placeholder="Email"
										value="${requestScope.email}" autocomplete="off" tabindex="1"
										name="email" id="email" /> <br /> <br /> 
									<input type="submit" value="Regist" id="sub_btn" />
								</form>
							</div>

						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-4"></div>
		</div>
	</div>
</body>
</html>