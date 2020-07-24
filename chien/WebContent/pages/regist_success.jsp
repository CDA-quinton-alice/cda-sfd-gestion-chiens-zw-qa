<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";

	pageContext.setAttribute("basePath", basePath);
%>

<base href="<%=basePath%>">




<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">
	
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
  		<a class="navbar-brand" >Welcome to Wouf!</a>
  		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
   	 	<span class="navbar-toggler-icon"></span>
  		</button>
  		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
   	 	<div class="navbar-nav">
      	<a class="nav-item nav-link" href="../index.jsp">Home </a>
      	<a class="nav-item nav-link" href="../index.jsp">My dog(s)</a>
      	<a class="nav-item nav-link" href="../index.jsp">Log out</a>
    </div>
  </div>
</nav>

<div class="jumbotron">
  <h1 class="display-4">Login success!</h1>
  <hr class="my-4">
  <a class="btn btn-primary btn-lg" href="/index.jsp" role="button">Go back to home</a>
</div>



	</div>
</body>
</html>