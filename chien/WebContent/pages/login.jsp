<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";

	pageContext.setAttribute("basePath", basePath);
%>

<base href="<%=basePath%>">
<link type="text/css" rel="stylesheet" href="static/css/style.css">
<script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function() {
		$("#sub_btn")
				.click(
						function() {
							var usernameText = $("#username").val();
							var usernamePatt = /^\w{5,12}$/;
							if (!usernamePatt.test(usernameText)) {
								$("span.errorMsg")
										.text(
												"Username needs to be between 5 to 12 characters");
								return false;
							}

							var passwordText = $("#password").val();
							var passwordPatt = /^\w{5,12}$/;
							if (!passwordPatt.test(passwordText)) {
								$("span.errorMsg")
										.text(
												"Please enter password 5 to 12 characters");
								return false;
							}

							var repwdText = $("#repwd").val();
							if (repwdText != passwordText) {
								$("span.errorMsg").text(
										"Confirm password is not the same");
								return false;
							}

						});
	});
</script>

<link type="text/css" rel="stylesheet" href="static/css/style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

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
								<h1>Wouf member</h1>
								<a href="pages/regist.jsp">Regist now!</a>
							</div>
							<div class="msg_cont">
								<span class="errorMsg"> ${ empty requestScope.msg ? "Please enter username & password":requestScope.msg }
								</span>
							</div>
							<div class="form">
								<form action="UserServlet" method="post">
									<input type="hidden" name="action" value="login" /> <label>Username:
									</label> <input class="itxt" type="text" placeholder="Username"
										autocomplete="off" tabindex="1" name="username"
										value="${requestScope.username}" /> <br /> <br /> <label>Password:
									</label> <input class="itxt" type="password" placeholder="Password"
										autocomplete="off" tabindex="1" name="password" /> <br /> <br />
									<input type="submit" value="login" id="sub_btn" /> <br /> <br />
									<a href="pages/regist.jsp">Back to home</a>
								</form>
							</div>
						</div>
					</div>
				</div>
				<div class="col-sm-4"></div>
			</div>
		</div>
</body>

</html>