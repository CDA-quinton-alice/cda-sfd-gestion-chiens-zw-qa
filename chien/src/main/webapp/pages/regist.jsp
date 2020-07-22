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
			<div class="col-sm-8">
				<div class="login_banner">

					<div id="l_content">
						<h1 class="login_word">Welcome to register!</h1>
					</div>
				</div>

			</div>
			<div class="col-sm-4">

				<div id="content">
					<div class="login_form">
						<div class="login_box">
							<div class="tit">
								<h1>Sign in</h1>
								<span class="errorMsg"> ${ requestScope.msg } </span>
							</div>
							<div class="form">
								<form>
									<div class="form-group">
										<label for="exampleInputEmail1">Email address</label> <input
											type="email" class="form-control" id="exampleInputEmail1"
											aria-describedby="emailHelp"> <small id="emailHelp"
											class="form-text text-muted">We'll never share your
											email with anyone else.</small>
									</div>
									<div class="form-group">
										<label for="exampleInputPassword1">Password</label> <input
											type="password" class="form-control"
											id="exampleInputPassword1">
									</div>
									<div class="form-group">
										<label for="exampleInputPassword1">Confirm password</label> <input
											type="password" class="form-control"
											id="exampleInputPassword2">
									</div>

									<button type="submit" class="btn btn-primary">Submit</button>
								</form>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>